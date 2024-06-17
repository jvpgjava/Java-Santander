package POOs;

public class Main {
    public static void main(String[]args){

        Cachorro cachorro1 = new Cachorro ();

        cachorro1.nome = "Duke" ;
        cachorro1.cor = "Marrom";
        cachorro1.altura = 25 ;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5 ;

//        cachorro1.latir();
//        System.out.println("O cachorro pegou uma " + cachorro1.pegar()); //concatenando Strings

        System.out.println("O cachorro está " + cachorro1.interagir("carinho")); //cachorro fica feliz
        System.out.println("O cachorro está " + cachorro1.interagir("nada")); //cachorro fica neutro
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir")); //cachorro fica bravo
        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha")); //cachorro fica triste

    }
}
