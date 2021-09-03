package atividade01;

import java.util.Scanner;

public class mediaSalarial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd = 2;
        double salario;
        double maior=0;
        double menor=0;
        double total=0;
        double media =0;
        for(int i = 1; i<=qtd; i++ ){
            System.out.println("Digite o salario do " + i +"º funcionario");
            salario = input.nextDouble();
            if(salario >= maior){
                maior = salario;
            };
            if(salario <= menor){
                menor = salario;
            };
            total += salario;
        };
        media = total/qtd;
        System.out.println("O maior salario foi : " + maior);
        System.out.println("O menor salario foi : " + menor);
        System.out.println("A média de salarios é : " + media);

    }

}
