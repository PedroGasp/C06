public class CampoMinado {
    int campo[][] = new int [2][2];
    Bomba bomba;
    void mostrarCampo(){
        for (int i = 0; i < campo.length; i++){
            for (int j = 0; j < campo.length; j++){
                System.out.print(campo[i][j] + " ");
            }
            System.out.println();
        }
    }

    void checarPosicao(){
        for (int i = 0; i < campo.length; i++){
            for (int j = 0; j < campo.length; j++){
                if (campo[i][j] == 1){
                    System.out.println("Voce pisou na bomba!");
                }
                else {
                    System.out.println("A posicao " + i + " " + j + " e segura!");
                }
            }
        }
    }
}
