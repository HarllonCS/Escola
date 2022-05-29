package escola;

import java.util.Calendar;

/**
 *
 * @author Harllon Cícero
 */

public class Aluno {
    
    // Variáveis
    private String nome, sexo;
    private int anoNasc;
    
    private final int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
    
    // Métodos especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getAnoNasc() {
        return anoNasc;
    }
    public void setIdade(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    // Método construtor
    public Aluno(String nome, int anoNasc, String sexo) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        
        int idade = anoAtual - anoNasc;
        
        return "\nNome: " + nome.toUpperCase() + "\nIdade: " + idade +
                "\nSexo: " + sexo.toUpperCase();
    }
}
