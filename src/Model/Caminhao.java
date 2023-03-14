package Model;

public class Caminhao extends Veiculo {
    
    private float toneladas;
    private int alturaMaxima;
    private int comprimento;

    public Caminhao() {
    }

    public Caminhao(float toneladas, int alturaMaxima, int comprimento) {
        this.toneladas = toneladas;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public float getToneladas() {
        toneladas = 1;
        return toneladas;
    }

    public void setToneladas(float toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturaMaxima() {
        alturaMaxima = 5;
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getComprimento() {
        comprimento = 50;
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    

 
    
    
    
    
    }

