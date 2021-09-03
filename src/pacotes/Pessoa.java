package pacotes;

public class Pessoa {
    String nome;
    double peso;
    double altura;
    void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome
                + ", tenho " + this.altura +
                "m de altura e peso "
                + peso + " kg");
    }
}