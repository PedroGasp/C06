public class Zumbi {
    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    Boolean trasnfereVida(Zumbi zumbiAlvo, double quantia){
        if (vida < quantia){
            System.out.println("Transferencia impossivel");
            return false;
        }
        else {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
    }
}
