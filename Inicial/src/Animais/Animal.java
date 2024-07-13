package Animais;

public class Animal {


    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;
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

    public Animal() {
    }

    protected void comer(){}

    protected void dormir(){}

    protected void soar(){
        System.out.println("  ");
    }

}
