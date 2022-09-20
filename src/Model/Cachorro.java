package Model;

public class Cachorro extends Animal{
    private String formatoDaBoca;
    private boolean temPelo;
    private boolean temRabo;



    public Cachorro(String nome, String especie, String cor, String velocidade, String formatoDaBoca, boolean temPelo, boolean temRabo) {
        super(nome, especie, cor, velocidade);
        this.formatoDaBoca = formatoDaBoca;
        this.temPelo = temPelo;
        this.temRabo = temRabo;
    }


    public String getFormatoDaBoca() {
        return formatoDaBoca;
    }

    public void setFormatoDaBoca(String formatoDaBoca) {
        this.formatoDaBoca = formatoDaBoca;
    }

    public boolean isTemPelo() {
        return temPelo;
    }

    public void setTemPelo(boolean temPelo) {
        this.temPelo = temPelo;
    }

    public boolean isTemRabo() {
        return temRabo;
    }

    public void setTemRabo(boolean temRabo) {
        this.temRabo = temRabo;
    }
}
