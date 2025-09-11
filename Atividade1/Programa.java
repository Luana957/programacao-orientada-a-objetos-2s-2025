package Atividade1;

public class Programa {

    private String nome;
    private Integer memoriaRAMAlocada;
    private Integer SSDOcupado;
    private Integer quantidadeOperacoes;

    public Programa(String nome, Integer memoriaRAMAlocada, Integer SSDOcupado, Integer quantidadeOperacoes) {
        this.nome = nome;
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMemoriaRAMAlocada() {
        return memoriaRAMAlocada;
    }

    public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public Integer getSSDOcupado() {
        return SSDOcupado;
    }

    public void setSSDOcupado(Integer SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getQuantidadeOperacoes() {
        return quantidadeOperacoes;
    }

    public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
}