package inicial;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class StringseDatas {

    public static void main(String[]args){
    //Olá {nome}, hoje é {dia-da-semana}, bom dia.

    String nome = "Jessé";
    /*
    System.out.println(nome.toUpperCase()); //maiuscula
    System.out.println(nome.toLowerCase()); //minuscula
    System.out.println(nome.length()); //verificar tamanho, quantos caracteres
*/
       // String nomeOutro = "Jessé";
        //System.out.println(nome.equals(nomeOutro));

        LocalDate hoje = LocalDate.now(); //representa uma data com as informações locais, de regionalização e tudo mais
        //System.out.println(hoje);
        //System.out.println(hoje.getDayOfWeek()); //exibe dia da semana
        Locale brasil = new Locale("pt", "BR");
        //Locale brasil = new Locale("pt", "BR"); linguagem e país pra poder fazer a tradução do dia da semana
        // System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil ));//tradução
        String diaSemana = (hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil ));
        String saudacao;
        LocalDateTime agora = LocalDateTime.now(); //obter que horas são atualmente
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        }else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite";
        } else {
            saudacao = "";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase()); //%s para string e %n para quebra de linha
    }
}
