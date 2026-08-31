public class Main {
    public static void main(String[] args){
        Kart kart1 = new Kart();
        Piloto piloto1 = new Piloto();

        piloto1.nome = "Chris";
        kart1.piloto = piloto1;
        kart1.motor.cilidradas = "150";
        
    }
}
