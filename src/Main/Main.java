package Main;
import Model.*;

public class Main {
    public static void main(String[] args) {

        Ambiente ambiente = new Ambiente(10);

        Pato patoEider = new Pato(
                "Pato",
                "Pato eider",
                "Branco e preto",
                "100 km",
                2,
                "Pontudo");

        Cachorro pastorAlemao = new Cachorro(
                "Cachorro",
                "Pastor Alemão",
                "Marrom",
                "100 km",
                "Achatado",
                true,
                true);

        Golfinho golfinhoListrado = new Golfinho(
                "Golfinho",
                "golfinho-listrado",
                "Cinza",
                "50 km",
                5,
                "Peixe lula e povo");

        ambiente.setListaDeAnimais(0, patoEider);
        ambiente.setListaDeAnimais(1, pastorAlemao);
        ambiente.setListaDeAnimais(2, golfinhoListrado);

        Zoologico rio = new Zoologico("Zoológico do Rio",ambiente);
        System.out.println(rio);

        ambiente.getListaDeAnimais();


    }
}
