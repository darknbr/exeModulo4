package models;

public class Carro {
    private int numeroDePortas, numeroDoChassi, anoDeFabricacao;
    private String cor = "não informado", combustivel = "não informado";

    public Carro(int numeroDePortas, int numeroDoChassi, int anoDeFabricacao)
    {
        this.numeroDePortas = numeroDePortas;
        this.numeroDoChassi = numeroDoChassi;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getNumeroDePortas() {
        return this.numeroDePortas;
    }
    
    public int getNumeroDoChassi() {
        return this.numeroDoChassi;
    }

    public int getAnoDeFabricacao() {
        return this.anoDeFabricacao;
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
