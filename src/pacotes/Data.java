package pacotes;

public class Data {
    int dia;
    int mes;
    int ano;
    String retornaString() {
        return dia + "/" + mes + "/" + ano;
    }
    int compara(Data data) {
        if (this.dia == data.dia &&
                this.mes == data.mes &&
                this.ano == data.ano) {
            return 1;
        }
        return 0;
    }
}