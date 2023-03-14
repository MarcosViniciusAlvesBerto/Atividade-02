package main;
import Model.*;

public class Main {

    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo();
        System.out.println("peso");
        System.out.println(veiculo.getPeso());
        System.out.println("preco");
        System.out.println(veiculo.getPreco());
        System.out.println("velocidade Maxima");
        System.out.println(veiculo.getVelocMax());

    
        Caminhao caminhao = new Caminhao();
        
        System.out.println("Altura");
        System.out.println(caminhao.getAlturaMaxima());
        System.out.println("comprimento");
        System.out.println(caminhao.getComprimento());
        System.out.println("Toneladas");
        System.out.println(caminhao.getToneladas());
    
    }

    
}