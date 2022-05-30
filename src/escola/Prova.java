package escola;

import java.io.PrintStream;
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
    
    public void resultProva(Aluno a) {
        
        Random rdNum = new Random();
        Random rdOp = new Random();
        
        float num = Math.round(rdNum.nextFloat(.0f, 10.0f));
        int op = rdOp.nextInt(2);
        
        if (op == 0) {
            num += .5f;
        }
        
        if (num > 10.0f) {
           num = 10.0f;
        }
        
        System.out.printf("\n%S tirou %.1f na prova de %s!\n", a.getNome(), num, tipoProva);
    }
}
