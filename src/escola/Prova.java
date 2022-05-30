package escola;

import java.util.Random;

/**
 *
 * @author Harllon Cícero
 */
public class Prova {
    
    private String tipoProva;
    private float tempoProva;
    
    public String getTipoProva() {
        return tipoProva;
    }
    public void setTipoProva(String tipoProva) {
        this.tipoProva = tipoProva;
    }
    
    public float getTempoProva() {
        return tempoProva;
    }
    public void setTempoProva(float tempoProva) {
        this.tempoProva = tempoProva;
    }
    
    public Prova(String tipoProva, float tempoProva) {
        this.tipoProva = tipoProva;
        this.tempoProva = tempoProva;
    }

    @Override
    public String toString() {
        return "\nTipo da prova: " + tipoProva + "\nTempo da prova: " + tempoProva + "h";
    }
    
    public void resultProva() {
        
        Random rd = new Random();
        
        
    }
}
