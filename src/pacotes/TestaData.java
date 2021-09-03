package pacotes;

import pacotes.Data;

public class TestaData {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 12;
        data1.mes = 8;
        data1.ano = 2021;
        System.out.println(data1.retornaString());

        Data data2 = new Data();
        data2.dia = 1;
        data2.mes = 8;
        data2.ano = 2021;
        System.out.println(data2.retornaString());

        Data data3 = new Data();
        data3.dia = 12;
        data3.mes = 8;
        data3.ano = 2021;
        System.out.println(data3.retornaString());

        if (data1.compara(data2) == 1) {
            System.out.println(data1.retornaString()
                    + " é igual a " + data2.retornaString());
        } else {
            System.out.println(data1.retornaString()
                    + " é diferente de " + data2.retornaString());
        }
        if (data1.compara(data3) == 1) {
            System.out.println(data1.retornaString()
                    + " é igual a " + data3.retornaString());
        } else {
            System.out.println(data1.retornaString()
                    + " é diferente de " + data3.retornaString());
        }
    }
}