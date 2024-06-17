package POOs;

public class Cachorro {

    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoDeEspirito;

    public void comer() {}

    public void latir() {
        System.out.println("AU AU");
    }

    public String pegar() {
        return "bolinha";
    }

    //construtor
//    Cachorro(String nome, String cor, int altura, double peso){
//this.nome = nome; //botao direito, generate, constroi automatico
//    }

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public int getTamanhoDoRabo() {
//        return tamanhoDoRabo;
//    }
//
//    public void setTamanhoDoRabo(int tamanhoDoRabo) {
//        this.tamanhoDoRabo = tamanhoDoRabo;
//    }
    //public Cachorro(){}
    Cachorro(String nome, String cor, int altura, double peso) {
        this.nome = nome; //botao direito, generate, constroi automatico
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;
    }
}


//        if (acao.equals("carinho")){
//          this.estadoDeEspirito = "feliz";
//    } else if (acao.equals("vai dormir")){
//        this.estadoDeEspirito = "bravo";
//    } else if (acao.equals("pisar na patinha")){
//            this.estadoDeEspirito = "triste";
//        }
//        else{
//            this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;
//    }

//+--------------+----------------------+---------------------------------------+
//        |   Nível      | Dentro da mesma      | Fora do pacote, mas em subclasses    |
//        |   de Acesso  | classe               | ou mesmo pacote                      |
//        +--------------+----------------------+---------------------------------------+
//        |   public     | Sim                  | Sim                                   |
//        +--------------+----------------------+---------------------------------------+
//        |   protected  | Sim                  | Sim                                   |
//        +--------------+----------------------+---------------------------------------+
//        |   default    | Sim                  | Não                                   |
//        +--------------+----------------------+---------------------------------------+
//        |   private    | Sim                  | Não                                   |
//        +--------------+----------------------+---------------------------------------+


