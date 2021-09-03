package pacotes;

public class Livro {
    String titulo;
    String descricao;
    String isbn;
    double valor;
    void mostrar() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Valor: " + this.valor);
    }
}
