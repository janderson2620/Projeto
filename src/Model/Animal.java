package Model;

public abstract class Animal {
    protected String nome;
    protected String especie;
    protected String cor;
    protected String velocidade;


    public Animal(String nome, String especie, String cor, String velocidade) {
        this.nome = nome;
        this.especie = especie;
        this.cor = cor;
        this.velocidade = velocidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getVelocidade() {
        return velocidade;
    }


    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }




    @Override
    public String toString() {
        return  "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
