
package Model;

public class Veiculo {
    
    private int peso;
    private float velocMax;
    private float preco;

    public Veiculo() {
    }

    public Veiculo(int peso, float velocMax, float preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public int getPeso() {
        peso = 100;
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getVelocMax() {
        velocMax = 110;
        return velocMax;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public float getPreco() {
        preco = 10000;
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
        
    
    
    }

