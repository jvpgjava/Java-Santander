package inicial;

public class lacosNumericos {
    public static void main(String[]agrs){
       //O processo abaixo é uma tabuada
        // 1 2 3 4 5 6 7 8 9 10
    // para uma variável que inicia em um 1 e vai até 10, mudando 1 por 1, faça:
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++){
                System.out.println(j + "x" + i + "=" + j * i);
                //1x1 = 1
                //2x1 = 2
            }
            /* o j faz o papel do processo dos números abaixo e não precisar escrever tudo, fizemos laços acima
            System.out.println(1 * i);
            System.out.println(2 * i);
            System.out.println(3 * i);
            System.out.println(4 * i);
            System.out.println(5 * i);
            System.out.println(6 * i);
            System.out.println(7 * i);
            System.out.println(8 * i);
            System.out.println(9 * i);
            System.out.println(10 * i);
            */

        }
   }
}
