package pacotes;

import pacotes.Pessoa;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa sandney = new Pessoa();
        sandney.nome = "David Luiz dos Santos";
        sandney.peso = 100;
        sandney.altura = 1.84;
        sandney.apresentar();
    }
}