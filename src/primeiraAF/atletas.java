package primeiraAF;

import java.util.Scanner;

public class atletas {

    private String nome;

    private String sexo;

    private String dataNasc;

    private double altura;

    private double peso;

    private double imc;

    private int modalidade;

    private String recorde;

    private boolean controle = true;

    Scanner input = new Scanner(System.in);

    public atletas(String nome, String sexo, String dataNasc, double altura, double peso, int modalidade, String recorde) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.altura = altura;
        this.peso = peso;
        this.modalidade = modalidade;
        this.recorde = recorde;
        while (this.controle){
            if(this.modalidade != 100 && this.modalidade != 200 && this.modalidade !=400 && this.modalidade != 800 && this.modalidade !=1500 && this.modalidade != 5000){
                System.out.println("ERRO: Digite uma válida: ");
                this.modalidade = input.nextInt();
            } else {
                this.controle = false;
            }
        }
    }
    public atletas(){}

    public void IMC(){

        imc = this.peso / (this.altura * this.altura);
        System.out.printf("\n Seu imc é %.2f \n", imc);
    }
    public void apresentar(){
        System.out.println("\n Nome " + this.nome + " Data nascimento : " + this.dataNasc + " do sexo  " + this.sexo + " meu peso é" + this.peso + " e minha altura:  " + this.altura + " minha modalidade : " + this.modalidade + " Metros e meu recorde é " + this.recorde  );

    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setModalidade(int modalidade) {
        this.controle = true;
        while (this.controle){
            if(modalidade != 100 && modalidade != 200 && modalidade !=400 && modalidade != 800 && modalidade !=1500 && modalidade != 5000){
                System.out.println("ERRO: Digite uma válida: ");
                modalidade = input.nextInt();
            } else {
                controle = false;
            }
        }
        this.modalidade = modalidade;
    }

    public void setRecorde(String recorde) {
        this.recorde = recorde;
    }
}