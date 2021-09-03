package fixacao01;

import java.time.LocalDate;
public class Jogador {
    private String nome;
    private String posicao;
    private int anoNascimento;
    private String nacionalidade;
    private double peso;
    private double altura;
    private final int IDADE_APOSENTADORIA_DEFESA = 40;
    private final int IDADE_APOSENTADORIA_MEIO_CAMPO = 38;
    private final int IDADE_APOSENTADORIA_ATACANTE = 35;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int calcularIdade() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }
    public void tempoParaAposentadoria() {
        if (this.posicao.toLowerCase() == "defesa"){
            System.out.println("Anos para se aposentar: " + (IDADE_APOSENTADORIA_DEFESA - this.calcularIdade()));
        } else if (this.posicao.toLowerCase() == "meio-campo"){
            System.out.println("Anos para se aposentar: " + (IDADE_APOSENTADORIA_MEIO_CAMPO - this.calcularIdade()));
        } else if (this.posicao.toLowerCase() == "ataque") {
            System.out.println("Anos para se aposentar: " + (IDADE_APOSENTADORIA_ATACANTE - this.calcularIdade()));
        }
    }
    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Posição: " + this.posicao);
        System.out.println("Ano Nascimento: " + this.anoNascimento);
        System.out.println("Idade: " + this.calcularIdade());
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
    }
}