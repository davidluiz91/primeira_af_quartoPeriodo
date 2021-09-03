package atividade01;

import java.util.Scanner;

public class testecalculeidade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd = 0;
        int idade =0;
        int maior=0;
        int menor=0;
        double media = 0;
        int totalidade= 0;
        System.out.println("Quantidade de pessoas no grupo?");
        qtd = input.nextInt();

        for(int i = 1; i <= qtd; i++ ){
            System.out.println("Qual a idade da " + i + " pessoa do grupo");
            idade = input.nextInt();
            if(idade  >= maior) {
                maior = idade;
            }
            if(idade  <= menor) {
                menor = idade;
            }
            totalidade += idade;
        };
        media = totalidade / qtd;
        System.out.println("maior idade foi : " + maior );
        System.out.println("menor idade foi : " + menor);
        System.out.println("média das idades é :" + media);
    }
}
