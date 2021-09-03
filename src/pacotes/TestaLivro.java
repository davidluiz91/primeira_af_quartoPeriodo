package pacotes;

import pacotes.Livro;

public class TestaLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "1984";
        livro.descricao = "Distopia";
        livro.isbn = "12121221";
        livro.valor = 28.00;
        livro.mostrar();
    }
}