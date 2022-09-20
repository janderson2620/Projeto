package Model;

import java.util.Arrays;

public class Ambiente{
    Animal[] listaDeAnimais;





    public Ambiente (int quantidadedeDeAnimais) {
        listaDeAnimais = new Animal[quantidadedeDeAnimais];

    }

    public void getListaDeAnimais() {
        for (int i = 0; i < this.listaDeAnimais.length; i++) {

            if( i == 0) {
                System.out.println("Ambiente aquático");
                System.out.println(listaDeAnimais[i]);
            } else if (i==1) {
                System.out.println("Ambiente terrestre");
                System.out.println(listaDeAnimais[i]);
            } else if (i==2) {
                System.out.println("Ambiente aquático");
                System.out.println(listaDeAnimais[i]);
            }

        }
    }

    public void setListaDeAnimais(int posicao, Animal animal) {
        this.listaDeAnimais[posicao] = animal;
    }

    @Override
    public String toString() {
        return "Ambiente{" +
                "listaDeAnimais=" + Arrays.toString(listaDeAnimais) +
                '}';
    }



}

