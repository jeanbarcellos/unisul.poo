package br.unisul.aula;

public class Cadeira {

    private String cor;
    private double tamanho;

    public Cadeira(String cor, double tamanho) {
        this.setCor(cor);
        this.setTamanho(tamanho);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

}
