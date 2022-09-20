package Model;

public class Golfinho extends Animal{
    private int quantidadeDeBarbatanas;
    private String alimentacao;


    public Golfinho(String nome, String especie, String cor, String velocidade, int quantidadeDeBarbatanas, String alimentacao) {
        super(nome, especie, cor, velocidade);
        this.quantidadeDeBarbatanas = quantidadeDeBarbatanas;
        this.alimentacao = alimentacao;
    }

        public int getQuantidadeDeBarbatanas() {
        return quantidadeDeBarbatanas;
    }

    public void setQuantidadeDeBarbatanas(int quantidadeDeBarbatanas) {
        this.quantidadeDeBarbatanas = quantidadeDeBarbatanas;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    }
