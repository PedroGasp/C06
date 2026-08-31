public class Main {
    public static void main(){
        CampoMinado campo[][] = new CampoMinado[2][2];
        Bomba bomba1 = new Bomba();
        Bomba bomba2 = new Bomba();
        campo[bomba1.colocarBomba()][bomba2.colocarBomba()];
    }
}
