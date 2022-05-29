package escola;

import java.util.Calendar;

/**
 *
 * @author Harllon Cícero
 */
public abstract class Pessoa {
    
    // Variáveis
    private String nome;
    private char sexo;
    private int anoNasc;
    private boolean matriculado;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public int getAnoNasc() {
        return anoNasc;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    public boolean isMatriculado() {
        return matriculado;
    }
    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
    
    private final int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
    
    // Método construtor
    public Pessoa() {
        this.matriculado = false;
    }
    
    // Verificar todos os dados do usuário
    public void verifDados(){
        
        if (verifIdade() && verifSexo()) {
            
            System.out.println("Dados verificados!");
            System.out.println(toString());
        
        } else {
            System.out.println("\nDados incorretos!");
            
            nome = "";
            anoNasc = 0;
            sexo = ' ';
            
            System.out.println(toString());
        }
    }
    
    // Verificar a idade do usuário
    private boolean verifIdade() {
        
        int idade = anoAtual - anoNasc;
        
        if (idade > 200) {
            System.out.println("\nAno de nascimento inserido: " + anoNasc);
            
            System.out.println("Idade calculada: " + idade);
            
            System.out.println("Idade invalida!");
           
            return false;
        } else {
            return true;
       }
    }
    
    // Verificar o sexo do usuário
    private boolean verifSexo() {
        
        boolean masc = sexo == 'M' || sexo == 'm';
        boolean fem = sexo == 'F' || sexo == 'f';
        
        if (masc || fem) {
            return true;
        } else {
            System.out.println("Sexo inserido: " + sexo);
            return false;
        }
    }

    @Override
    public String toString() {
        
        int idade = anoAtual - anoNasc;
        
        return "\nNome: " + nome.toUpperCase() + "\nIdade: " +
                idade + "\nSexo: " + sexo + "\nMatriculado(a): " + matriculado;
    }
}
