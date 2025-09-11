package Atividade1;

public class Computador {

    private Integer memoriaRAM;
    private Integer SSD;
    private Integer nucleos;
    private Double operacaoPorSegundo;

    public Computador(Integer memoriaRAM, Integer SSD, Integer nucleos, Double operacaoPorSegundo) {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacaoPorSegundo = operacaoPorSegundo;
    }

    public Integer getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getSSD() {
        return SSD;
    }

    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    public Integer getNucleos() {
        return nucleos;
    }

    public void setNucleos(Integer nucleos) {
        this.nucleos = nucleos;
    }

    public Double getOperacaoPorSegundo() {
        return operacaoPorSegundo;
    }

    public void setOperacaoPorSegundo(Double operacaoPorSegundo) {
        this.operacaoPorSegundo = operacaoPorSegundo;
    }
}