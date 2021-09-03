package atividade01;

import java.util.Scanner;

public class testemediasalarial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd = 30;
        double salario;
        double total=0;
        double media =0;
        for(int i = 1; i<=qtd; i++ ){
            System.out.println("Digite o salario do " + i +"º funcionario");
            salario = input.nextDouble();

            total += salario;
        };
        media = total/qtd;
        System.out.println("A média de salarios é : " + media);

    }

}
