package models;

public class Carro {
    private int numeroDePortas, numeroDoChassi, anoDeFabricacao;
    private String cor = "não informado", combustivel = "não informado";


    public int getNumeroDePortas() {
        return this.numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDoChassi() {
        return this.numeroDoChassi;
    }

    public void setNumeroDoChassi(int numeroDoChassi) {
        this.numeroDoChassi = numeroDoChassi;
    }

    public int getAnoDeFabricacao() {
        return this.anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
        
    }

    public String getCombustivel() {
        return this.combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

}
