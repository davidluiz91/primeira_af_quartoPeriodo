package atividade01;

import java.util.Scanner;

public class calculeIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd = 0;
        int idade =0;
        int maiorIdade=0;
        int menorIdade=0;
        double media = 0;
        int todasAsIdades= 0;
        System.out.println("Quantidade de pessoas no grupo?");
        qtd = input.nextInt();

        for(int i = 1; i <= qtd; i++ ){
            System.out.println("Qual a idade da " + i + " pessoa do grupo");
            idade = input.nextInt();
            if(idade >= maiorIdade){
                maiorIdade = idade;
            };
            if(idade <= menorIdade){
                menorIdade = idade;
            }
            todasAsIdades += idade;
        };
        media = todasAsIdades/qtd;
        System.out.println("maior Idade foi : " + maiorIdade );
        System.out.println("menor Idade foi : " + menorIdade);
        System.out.println("média das idades é :" + media);
    }
}
