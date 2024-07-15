package POOs;


import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Loja.Petshop;

public class Main {
    public static void main(String[]args){

        //construtor
        Cachorro cachorro1 = new Cachorro ("Marrom", "Rex", 25, 5.5, 5, "nada");

        Gato gato1 = new Gato("Preto", "Felix", 4.5);

        //polimorfirmo
          Animal gato2 = new Gato("Preto", "Felix", 4.5);
       // Gato gato3 = new Animal("Preto", "Felix", 4.5); //não pode, ele vai dar erro no poliformismo
//        Animal gato4 = new Animal("Preto", "Felix", 4.5); //aqui criamos objeto de uma classe abstrata logo vai dar erro, para arrumar é apagar ou tranformar pra uma classe de verdade
          Animal passaro4 = new Passaro("Preto", "Felix", 4.5);

        Passaro passaro1 = new Passaro("Azul", "Frajola", 0.5);

        Petshop petshop = new Petshop();
//
//        petshop.darBanho(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
//
//        petshop.darBanho(gato1);
//        System.out.println(gato1.getEstadoDeEspirito());
//
//        petshop.tosar(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());

      //Abaixo métodos de soar de cachorro, gato e passaro
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        //escritas de variaveis
//        int _$teste$ = 2; //int, long e byte = 0;
//        double ______ = 23.3;
//        String int = "teste"; //não aceita pelo int ser do proprio java, mas se for iNt aceitaria por exemplo
//        int inteiro; //Aqui seria como se int = 0, pois não coloquei nada, ou seja, os tipos sao default(0), exceto double e float
//        float $$; //double e float tem seus valores como 0.0
//        boolean $87; //tem seu valor como false, se ficar em default
//        char ch; //char é vazio, não aparece nada em seu default
//        String teste; //valor de qualquer objeto é null.
//
//
//        double d = 5.00d;
//        float f = 3.00f;
//        float x = f + d; //por serem tipos diferentes, a conta não vai ser feita, para resolver é tranformar a variavel na mesma:
//        float x = f + (float) d;
//        System.out.println(x);
//
//        int a = 23_456_789; //o Java permite que coloquemos underline no lugar dos pontos, para representar um número


//        System.out.println(cachorro1.getNumeroDeCachorros());
//
//        Cachorro cachorro2 = new Cachorro ("Puppy", "Marrom", 25, 5.5, 5, "nada");

//        System.out.println(cachorro2.getNumeroDeCachorros());
//        System.out.println(cachorro1.getNumeroDeCachorros()); //qualquer objeto que eu perguntar responde mesmo valor, ou seja 2

//        System.out.println(cachorro1.toString()); //vai ser exibido textos estranhos com numeros aleatorios diferentes nos dois, o que significa que na memoria temos 2 objetos diferentes
//        System.out.println(cachorro2.toString());
//
//        //se eu utilizar como variavel de referencia, vão estar no mesmo lugar os objetos:
////        cachorro1 = cachorro2;
//        System.out.println("-----------------------");
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());

        //@Override
        //    public String toString() {
        //        return "Cachorro{" +
        //                "nome='" + nome + '\'' +
        //                '}';  Ao rodarmos esse acima que está se referenciando ao cachorro la no arquivo Cachorro percebemos que ele mostra o nome do cachorro

        //é exibido o objeto no mesmo lugar:
//        Animais.Cachorro@6acbcfc0
//        Animais.Cachorro@5f184fc6
//                -----------------------
//                Animais.Cachorro@5f184fc6
//        Animais.Cachorro@5f184fc6

        //

//        System.out.println(cachorro2.getNome());
//        System.out.println(cachorro2.getPeso());

//        cachorro1.nome; = "Duke" ; //momento que coloquei protected na string, não posso acessar por estar em pacote diferente
//        cachorro1.cor = "Marrom";
//        cachorro1.altura = 25 ;
//        cachorro1.peso = 5.5;
//        cachorro1.tamanhoDoRabo = 5 ;

//        cachorro1.setNome("Duke"); //momento que coloquei protected na string, não posso acessar por estar em pacote diferente
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5); ;

//        cachorro1.latir();
//        System.out.println("O cachorro pegou uma " + cachorro1.pegar()); //concatenando Strings

//        System.out.println("O cachorro está " + cachorro1.interagir("carinho")); //cachorro fica feliz
//        System.out.println("O cachorro está " + cachorro1.interagir("nada")); //cachorro fica neutro
//        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir")); //cachorro fica bravo
//        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha")); //cachorro fica triste


    }
}
