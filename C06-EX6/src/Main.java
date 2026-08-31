public class Main {

    static void main() {
        Zumbi z1 = new Zumbi();
        z1.nome = "Zumbi Piloto";
        z1.vida = 30;

        Zumbi z2 = new Zumbi();
        z2.nome = "Zumbi Mestre";
        z2.vida = 200;

        z1.trasnfereVida(z2, 20);

        System.out.println("Vida Zumbi Piloto: " + z1.vida);
        System.out.println("Vida Zumbi Mestre: " + z2.vida);
    }
}
