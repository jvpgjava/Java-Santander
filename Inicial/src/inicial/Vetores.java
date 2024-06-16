package inicial;

import java.util.Arrays;

public class Vetores {
    public static void main(String[]args){
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;

        /*
        int[] numeros = new int[5];
        //[0] [1] [2] [3] [4] indíces
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        //System.out.println(numeros);
        //com o que foi feito acima, mostra o endereço armazenado em nosso array e não os números, mas com o faça:
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
            */
        /*
        String[] letras = new String[5];
        //[0] [1] [2] [3] [4] indíces
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";
        //System.out.println(numeros);
        //com o que foi feito acima, mostra o endereço armazenado em nosso array e não os números, mas com o faça:
        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
            */
        //Outra forma de exibir vetor abaixo:
        String [] letras = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(letras))
        }
    }

