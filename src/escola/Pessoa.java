package escola;

/**
 *
 * @author Harllon Cícero
 */
public abstract class Pessoa {
    
    // Variáveis
    private String nome;
    private char sexo;
    private byte idade;
    private boolean matriculado;
    
    // Métodos especiais
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
    
    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    
    public boolean isMatriculado() {
        return matriculado;
    }
    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
    
    // Método construtor
    public Pessoa() {
        this.matriculado = false;
    }
    
    // Verificar todos os dados do usuário
    protected void verifDados(){
        
        if (verifIdade() && verifSexo()) {
            
            System.out.println("\nDados verificados!");
        
        } else {
            System.out.println("\nDados incorretos!");
            
            setNome("");
            setIdade((byte)0);
            setSexo(' ');
        }
    }
    
    // Verificar a idade do usuário
    private boolean verifIdade() {
        
        System.out.println("\nIdade inserida: " + getIdade());
        
        if (getIdade() <= 0) {
            
            System.out.println("\nIdade invalida!");
           
            return false;
           
        } else {
            return true;
       }
    }
    
    // Verificar o sexo do usuário
    private boolean verifSexo() {
        
        boolean masc = getSexo() == 'M' || getSexo() == 'm';
        boolean fem = getSexo() == 'F' || getSexo() == 'f';
        
        System.out.println("Sexo inserido: " + getSexo());
        
        return masc || fem;
    }

    @Override
    public String toString() {
        
        return "\nNome: " + getNome().toUpperCase() + "\nIdade: " +
                getIdade() + "\nSexo: " + getSexo() + "\nMatriculado(a): " + isMatriculado();
    }
}
