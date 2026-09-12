package computador;

public class Computador {
    private String marca;
    private float preco;
    private MemoriaUSB memoriaUSB;
    private Hardwirebasico hardwirebasicos[];
    private SistemaOperacional sistemaOperacional;


    public Computador(String marca, float preco, Hardwirebasico[] hardwirebasicos, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.hardwirebasicos = hardwirebasicos;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void mostraPCconfig() {
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: R$ " + this.preco);

        if (this.sistemaOperacional != null) {
            System.out.println("Sistema Operacional: " + this.sistemaOperacional.getNome() + " (" + this.sistemaOperacional.getCapacidade() + " bits)");
        }

        System.out.println("Hardware Básico:");
        if (this.hardwirebasicos != null) {
            for (Hardwirebasico hw : this.hardwirebasicos) {
                if (hw != null) {
                    System.out.println("(" + hw.getCapacidade() + ")" +  " - " + hw.getNome());
                }
            }
        }

        if (this.memoriaUSB != null) {
            if(this.memoriaUSB.getCapacidade() != 1){
                System.out.println("Acompanha: " + this.memoriaUSB.getNome() + " de " + this.memoriaUSB.getCapacidade() + "Gb");
            }
            else {
                System.out.println("Acompanha: " + this.memoriaUSB.getNome() + " de " + this.memoriaUSB.getCapacidade() + "Tb");
            }
        } else {
            System.out.println("Acompanha: Nenhuma memória USB");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }

}
