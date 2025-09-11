package Atividade1;

public class Main {
    public static void main(String[] args) {

        // Instância de Computador
        Computador meuComputador = new Computador(16, 500, 4, 2.5); // 16GB RAM, 500GB SSD, 4 núcleos, 2.5 op/s

        // Instância de SistemaOperacional
        SistemaOperacional meuSO = new SistemaOperacional(meuComputador);

        // Instância de Programas para os cenários
        Programa programa1 = new Programa("Editor de Texto", 2, 5, 1000); // Execução com sucesso
        Programa programa2 = new Programa("Jogo Pesado", 18, 50, 5000); // Erro na execução (RAM)
        Programa programa3 = new Programa("Banco de Dados", 4, 600, 2000); // Erro na instalação (SSD)

        System.out.println("--- Teste de Cenários de Programas ---");

        // CENÁRIO 1: Programa executado com sucesso
        meuSO.executarPrograma(programa1);

        System.out.println("\n--- Fim do primeiro cenário ---");

        // CENÁRIO 2: Erro na execução do programa (memória RAM)
        meuSO.executarPrograma(programa2);

        System.out.println("\n--- Fim do segundo cenário ---");

        // CENÁRIO 3: Erro na instalação do programa (SSD)
        meuSO.executarPrograma(programa3);
    }
}