package Animais;

public class Cachorro {

    //private String nome; //private só ele mesmo consegue acessar, da mesma classe
    //protected String nome;
//    public String nome;
//    public String cor;
//    public int altura;
//    public double peso;
//    public int tamanhoDoRabo;
//    public String estadoDeEspirito;

    //atributos
    static int numeroDeCachorros;

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    public void comer() {}

    public void latir() {
        System.out.println("AU AU");
    }

    public String pegar() {
        return "bolinha";
    }

    //construtores, ctrl shift para selecionar todos
    //construtor vai facilitar a criação de um objeto
    // Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito){
    //      this.nome = nome; //botao direito, generate, constroi automatico

    //get e set servem para proteger o objeto
//    public String getNome() { //get serve para mexer e criar a regra que desejo, posso mostrar o que quero
//        return nome;
//    }
//
//    public void setNome(String nome) { //void não existe retorno
//        if
//        this.nome = nome; //quando utilizo this, eu digo para o java que quero o atributo dessa classe, e então ele identifica que o outro nome é daquele
    //botao direito, dps em generate, constroi automatico

    //construtor padrão
    public Cachorro(){}

    //construtores adicionais
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++; //++ como se eu aumentasse um
    }


    //métodos

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() { //private permite que qualquer lugar que acessar esse atributo é permitido, por isso que não deu problema no switch
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
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
    //botao direito e toString, faz e gera automatico os metodos toString, igual dos getter e setters

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

//    public void setNome(String nome) { //void não existe retorno
//        if
//        this.nome = nome; //quando utilizo this, eu digo para o java que quero o atributo dessa classe, e então ele identifica que o outro nome é daquele
 //botao direito, dps em generate, constroi automatico

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
//    } /

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


