package Model;

public class Pato extends Animal {
    private int quantidadeDePatas;
    private String formatoDoBico;
    public String ambiente = "Aquatico";



    public Pato(String nome, String especie, String cor, String velocidade, int quantidadeDePatas, String formatoDoBico) {
        super(nome, especie, cor, velocidade);
        this.quantidadeDePatas = quantidadeDePatas;
        this.formatoDoBico = formatoDoBico;
    }



    public void ambient(){
        System.out.println("Ambiente aquatico");
    }

    public String getAmbiente() {
        return ambiente;
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public String getFormatoDoBico() {
        return formatoDoBico;
    }

    public void setFormatoDoBico(String formatoDoBico) {
        this.formatoDoBico = formatoDoBico;
    }
}
