 package Atividade3_Final.src.principal.dao; 

// Importações JDBC
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Atividade3_Final.src.principal.modelo.Medico;
import Atividade3_Final.src.principal.modelo.Paciente;
import Atividade3_Final.src.principal.modelo.Pessoa;



public class GerenciadorHospital {
    
    // URL de conexão para SQLite (cria o arquivo hospital.db)
    private static final String URL_DB = "jdbc:sqlite:hospital.db";
    
    private Connection conectar() throws SQLException {
        // Isso só funciona porque você configurou o settings.json!
        return DriverManager.getConnection(URL_DB);
    }
    
    // Método para criar as tabelas (Rodar uma vez no main)
    public void inicializarDB() {
        try (Connection conn = conectar(); 
             PreparedStatement stmtPaciente = conn.prepareStatement("CREATE TABLE IF NOT EXISTS PACIENTES (id INTEGER PRIMARY KEY, nome TEXT, cpf TEXT, plano_saude TEXT, historico_medico TEXT)");
             PreparedStatement stmtMedico = conn.prepareStatement("CREATE TABLE IF NOT EXISTS MEDICOS (id INTEGER PRIMARY KEY, nome TEXT, cpf TEXT, matricula TEXT, salario REAL, crm TEXT, especialidade TEXT)")) {
             
            stmtPaciente.executeUpdate();
            stmtMedico.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao inicializar o DB: " + e.getMessage());
        }
    }

    // --- CADASTRAR PESSOA (0,75 pts) ---
    public void cadastrarPessoa(Pessoa pessoa) {
        
        try (Connection conn = conectar()) {
            
            if (pessoa instanceof Paciente) {
                // Lógica de INSERT para Paciente
                Paciente p = (Paciente) pessoa;
                String sql = "INSERT INTO PACIENTES (id, nome, cpf, plano_saude, historico_medico) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setInt(1, p.getId());
                    stmt.setString(2, p.getNome());
                    stmt.setString(3, p.getCPF());
                    stmt.setString(4, p.getPlanoSaude());
                    stmt.setString(5, p.getHistoricoMedico());
                    stmt.executeUpdate();
                    System.out.println("✅ Paciente cadastrado: " + p.getNome());
                }
            } else if (pessoa instanceof Medico) {
                // Lógica de INSERT para Médico
                Medico m = (Medico) pessoa;
                String sql = "INSERT INTO MEDICOS (id, nome, cpf, matricula, salario, crm, especialidade) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setInt(1, m.getId());
                    stmt.setString(2, m.getNome());
                    stmt.setString(3, m.getCPF());
                    stmt.setString(4, m.getMatricula());
                    stmt.setDouble(5, m.getSalario());
                    stmt.setString(6, m.getCRM());
                    stmt.setString(7, m.getEspecialidade());
                    stmt.executeUpdate();
                    System.out.println("✅ Médico(a) cadastrado: " + m.getNome());
                }
            }
            
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar pessoa: " + e.getMessage());
        }
    }

    // --- CONSULTAR PESSOA ---
    public Pessoa consultarPessoa(int idConsulta) {
        
        try (Connection conn = conectar()) {
            
            // 1. Tenta consultar MEDICOS
            String sqlMedico = "SELECT * FROM MEDICOS WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sqlMedico)) {
                stmt.setInt(1, idConsulta);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return new Medico(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), 
                                          rs.getString("matricula"), rs.getDouble("salario"), 
                                          rs.getString("crm"), rs.getString("especialidade"));
                    }
                }
            }

            // 2. Tenta consultar PACIENTES
            String sqlPaciente = "SELECT * FROM PACIENTES WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sqlPaciente)) {
                stmt.setInt(1, idConsulta);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return new Paciente(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), 
                                            rs.getString("plano_saude"), rs.getString("historico_medico"));
                    }
                }
            }
            
        } catch (SQLException e) {
            System.err.println("Erro ao consultar o DB: " + e.getMessage());
        }
        
        return null; 
    }
}