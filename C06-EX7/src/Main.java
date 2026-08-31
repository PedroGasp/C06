public class Main {
    public static void main(String[] args){
        Personagem persogame1 = new Personagem();
        Arma arma = new Arma();

        persogame1.pontos = 10;
        persogame1.tomarDano();
        System.out.println(persogame1.pontos);
        
        arma.resistencia = 5;

        persogame1.arma = arma;
        persogame1.usarArma();

        System.out.println(arma.resistencia);
        System.out.println(persogame1.arma.resistencia);
    }
}
