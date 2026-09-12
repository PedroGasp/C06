package usuario;

import computador.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador computadores[];
    private int quantComputadores;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
        this.quantComputadores = 0;
    }

    public void comprarComputador(Computador pc) {
        if (pc != null && quantComputadores < computadores.length) {
            this.computadores[quantComputadores] = pc;
            quantComputadores++;
            System.out.println("O Computador " + pc.getMarca() + " foi adicionado ao carrinho!");
        } else if (quantComputadores > computadores.length) {
            System.out.println("O Limite foi atingido!");
        }
    }

    public float calculaTotalCompra(){
        float total = 0;
        for (int i = 0; i < quantComputadores; i++) {
            if (computadores[i] != null) {
                total += computadores[i].getPreco();
            }
        }
        return total;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public int getQuantComputadores() {
        return quantComputadores;
    }
}
