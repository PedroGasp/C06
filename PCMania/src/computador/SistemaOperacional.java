package computador;

public class SistemaOperacional {
    private String nome;
    private int capacidade;

    public SistemaOperacional(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
