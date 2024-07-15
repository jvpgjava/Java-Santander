package Animais;

//public class Animal {
    public abstract class Animal { //transformamos em uma classe abstrata, ou seja, não pode criar objeto a partir dela, mas estender sim



    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito; //toda vez que colocar uma variavel como string, ela começa nula
//    private String nome;
//    private String cor;
//    private int altura;
//    private double peso;
//    private String estadoEspirito;


    public Animal(String cor, String nome, double peso) {
        this.cor = cor;
        this.nome = nome;
        this.peso = peso;
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

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected void comer(){}

    protected void dormir(){}

//    public void soar(){
//        System.out.println("  ");
//    }

    public abstract void soar(); //nenhum método abstrato tem corpo, ou seja, { e }


}
