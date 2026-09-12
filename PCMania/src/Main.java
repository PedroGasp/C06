import computador.Computador;
import computador.Hardwirebasico;
import computador.MemoriaUSB;
import computador.SistemaOperacional;
import usuario.Cliente;
import util.ProcessarPedido;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro", "70832600020");

        Hardwirebasico h0 = new Hardwirebasico(" Mhz Pentium Core i5", 2200);
        Hardwirebasico h1 = new Hardwirebasico(" Gb de memoria RAM", 8);
        Hardwirebasico h2 = new Hardwirebasico(" Gb de HD", 500);

        Hardwirebasico h3 = new Hardwirebasico(" Mhz Pentium Core i7", 3370);
        Hardwirebasico h4 = new Hardwirebasico(" GB de memoria RAM", 16);
        Hardwirebasico h5 = new Hardwirebasico(" Tb de HD", 1);

        Hardwirebasico h6 = new Hardwirebasico(" Mhz Pentium Core i7", 4500);
        Hardwirebasico h7 = new Hardwirebasico(" Gb de memoria RAM", 32);
        Hardwirebasico h8 = new Hardwirebasico(" Tb de HD", 2);

        Hardwirebasico[] hwPC1 = { h0, h1, h2 };
        Hardwirebasico[] hwPC2 = { h3, h4, h5 };
        Hardwirebasico[] hwPC3 = { h6, h7, h8 };

        SistemaOperacional sis1 = new SistemaOperacional("MacOS Sequoia", 64);
        SistemaOperacional sis2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional sis3 = new SistemaOperacional("Windows 10", 64);

        MemoriaUSB musb1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB musb2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB musb3 = new MemoriaUSB("HD Externo", 1);

        Computador[] computadores = new Computador[3];

        computadores[0] = new Computador("Apple", 655, hwPC1, sis1);
        computadores[0].addMemoriaUSB(musb1);

        computadores[1] = new Computador("Samsung", 656, hwPC2, sis2);
        computadores[1].addMemoriaUSB(musb2);

        computadores[2] = new Computador("Dell", 657, hwPC3, sis3);
        computadores[2].addMemoriaUSB(musb3);

        System.out.println("+-+-+-+ Bem vindo a PCMania " + cliente.getNome() + "!" + "+-+-+-+-+");
        System.out.println();
        System.out.println("Estamos com 3 promocoes disponiveis! Aproveite!");
        System.out.println("OBS: (Voce deve comprar no minimo 2 dos nossos computadores disponiveis para ter acesso a promocao!)");
        System.out.println();

        for (Computador pc : computadores) {
            if (pc != null) {
                pc.mostraPCconfig();
            }
        }

        System.out.println("Essa sao nossas opcoes! Lembre-se que pode escolher o mesmo computador mais de um vez!");
        int resp = 4;
        while(resp != 0){
            System.out.print("Escolha entre entre as 3 opcoes, caso queira finalizar a compra digite 0: ");
            Scanner opcao = new Scanner(System.in);
            switch (resp = opcao.nextInt()){
                case 0:
                    
                    break;
                case 1:
                    cliente.comprarComputador(computadores[0]);
                    break;

                case 2:
                    cliente.comprarComputador(computadores[1]);
                    break;

                case 3:
                    cliente.comprarComputador(computadores[2]);
                    break;

                default:
                    System.out.println("Opcao Invalida!");
            }
        }

        System.out.println("+-+-+-+-+-RESUMO DO PEDIDO+-+-+-+-+-");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Quantidade de PCs comprados: " + cliente.getQuantComputadores());
        Computador[] PCs = cliente.getComputadores();
        for (int i = 0; i < cliente.getQuantComputadores(); i++) {
            PCs[i].mostraPCconfig();
        }
        System.out.println("Total a pagar: " + cliente.calculaTotalCompra());
        ProcessarPedido.processar(cliente.getComputadores());

    }
}