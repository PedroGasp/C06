import java.util.Random;

public class Bomba {
    Random rand = new Random();
    int colocarBomba(){
        int x = rand.nextInt(2);
        return x;
    }
}
