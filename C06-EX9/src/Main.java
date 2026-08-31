public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();

        cantina.nome = "Cantina do INATEL";
        Salgado S1 = new Salgado();
        S1.nome = "Esfirra";
        cantina.addSalgado(S1);
        Salgado S2 = new Salgado();
        S2.nome = "Pastel";
        cantina.addSalgado(S2);
        Salgado S3 = new Salgado();
        S3.nome = "Cochinha";
        cantina.addSalgado(S3);

        cantina.mostraInfo();
    }
}
