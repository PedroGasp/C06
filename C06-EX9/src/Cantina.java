public class Cantina {
    String nome;

    Salgado salgados[] = new Salgado[10];

    void addSalgado(Salgado novoSalgado){
        for (int i = 0; i < 10; i++){
            if (salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        for(Salgado salgado : salgados){
            if (salgado.nome != null) {
                System.out.println(salgado.nome);
            }
        }
    }
}
