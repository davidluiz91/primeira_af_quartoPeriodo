package primeiraAF;
public class testaAtletas {
    public static void main(String[] args) {
        atletas atletaUm = new atletas("David Luiz", "M", "28/10/1991", 1.85, 105, 200,  "1:30:00");
        atletaUm.IMC();
        atletaUm.apresentar();
        atletas atletaDois = new atletas();
        atletaDois.setNome("David Luiz");
        atletaDois.setSexo("M");
        atletaDois.setDataNasc("28/10/1991");
        atletaDois.setAltura(1.85);
        atletaDois.setPeso(105);
        atletaDois.setModalidade(200);
        atletaDois.setRecorde("1:30:00");
        atletaDois.IMC();
        atletaDois.apresentar();
    }
}