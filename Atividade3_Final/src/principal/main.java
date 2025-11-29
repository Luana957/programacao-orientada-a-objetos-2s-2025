package Atividade3_Final.src.principal;

import Atividade3_Final.src.principal.dao.GerenciadorHospital;
import Atividade3_Final.src.principal.modelo.Medico;
import Atividade3_Final.src.principal.modelo.Paciente;
import Atividade3_Final.src.principal.modelo.Pessoa;

public class main {
    
    public static void main (String[] args) {
        
        System.out.println("--- INICIANDO SISTEMA HOSPITALAR ---");
        
        // 1. Cria a instância da classe de Gerenciamento
        GerenciadorHospital gerenciador = new GerenciadorHospital();
        
        // Inicializa o DB: cria as tabelas PACIENTES e MEDICOS (se não existirem)
        gerenciador.inicializarDB(); 
        
        // --- 2. DEMONSTRAÇÃO DE CADASTRO ---
        System.out.println("\n--- TESTE DE CADASTRO (Persistência no DB) ---");
        
        // Cria e cadastra um Paciente
        Paciente p1 = new Paciente(1, "Ana Silva", "111.111.111-11", "Premium", "Alergia a amendoim");
        gerenciador.cadastrarPessoa(p1); 
        
        // Cria e cadastra um Médico
        Medico m1 = new Medico(2, "Dr. João Neto", "222.222.222-22", "MAT123", 15000.0, "CRM/SP 54321", "Cardiologia");
        gerenciador.cadastrarPessoa(m1);
        
        // --- 3. DEMONSTRAÇÃO DE CONSULTA (0.75 pts) ---
        System.out.println("\n--- TESTE DE CONSULTA (Recuperação do DB) ---");
        
        // Consulta o Paciente pelo ID 1
        Pessoa consultaPessoa1 = gerenciador.consultarPessoa(1); 
        if (consultaPessoa1 != null) {
            System.out.println("\nResultado da Consulta (ID 1 - Paciente):");
            // Polimorfismo: Chama o método exibirDetalhes() específico do Paciente
            System.out.println(consultaPessoa1.exibirDetalhes());
        }
        
        // Consulta o Médico pelo ID 2
        Pessoa consultaPessoa2 = gerenciador.consultarPessoa(2); 
        if (consultaPessoa2 != null) {
            System.out.println("\nResultado da Consulta (ID 2 - Médico):");
            // Polimorfismo: Chama o método exibirDetalhes() específico do Médico
            System.out.println(consultaPessoa2.exibirDetalhes());
        }
        
        System.out.println("\n--- EXECUÇÃO FINALIZADA ---");
    }
}