package computador;

public class Hardwirebasico {
    private String nome;
    private float capacidade;

    public Hardwirebasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }
}
