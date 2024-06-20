package POOs;


import Animais.Cachorro;

public class Main {
    public static void main(String[]args){

        //construtor
        Cachorro cachorro1 = new Cachorro ("Puppy", "Marrom", 25, 5.5, 5, "nada");
        Cachorro cachorro2 = new Cachorro ("Puppy", "Marrom", 25, 5.5, 5, "nada");

        System.out.println(cachorro1.toString()); //vai ser exibido textos estranhos com numeros aleatorios diferentes nos dois, o que significa que na memoria temos 2 objetos diferentes
        System.out.println(cachorro2.toString());

        //se eu utilizar como variavel de referencia, vão estar no mesmo lugar os objetos:
//        cachorro1 = cachorro2;
        System.out.println("-----------------------");
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

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
