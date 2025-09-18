package Atividade1;

public class SistemaOperacional {

    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean instalarPrograma(Programa p) {
        System.out.println("\nTentando instalar o programa " + p.getNome() + "...");
        if (p.getSSDOcupado() > this.computador.getSSD()) {
            System.out.println("ERRO NA INSTALACAO: SSD insuficiente. Necessário: " + p.getSSDOcupado() + "GB, Disponível: " + computador.getSSD() + "GB");
            return false;
        }
        if (p.getSSDOcupado() > this.computador.getMemoriaRAM()){
            System.out.println("Erro na EXECUÇÂO do programa");
            return false;
        } 

        double tempoExecucao = p.getQuantidadeOperacoes()/(this.computador.getOperacaoPorSegundo()*this.computador.getNucleos());
        System.out.println("Programa executado com sucesso: "+ tempoExecucao +"s");
        return true;
        //computador.setSSD(computador.getSSD() - p.getSSDOcupado());
       //System.out.println("INSTALACAO CONCLUIDA: O SSD restante é de " + computador.getSSD() + "GB");
       // return true;
    }

    public void executarPrograma(Programa p) {
        System.out.println("\nTentando executar o programa " + p.getNome() + "...");
        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("ERRO NA EXECUCAO: Memória RAM insuficiente. Necessário: " + p.getMemoriaRAMAlocada() + "GB, Disponível: " + computador.getMemoriaRAM() + "GB");
            return;
        }

        // Se a instalação for bem-sucedida, executa o programa
        if (this.instalarPrograma(p)) {
            double tempoExecucao = p.getQuantidadeOperacoes() / (computador.getOperacaoPorSegundo() * computador.getNucleos());
            System.out.println("EXECUCAO BEM-SUCEDIDA: O programa foi executado.");
            System.out.printf("Tempo de execução: %.2f segundos.\n", tempoExecucao);
        } else {
            System.out.println("O programa não pode ser executado devido a falha na instalação.");
        }
    }
}