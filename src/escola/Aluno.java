package escola;

/**
 *
 * @author Harllon Cícero
 */
public class Aluno extends Pessoa {
    
    public Aluno (String nome, int anoNasc, char sexo) {
        setNome(nome);
        setAnoNasc(anoNasc);
        setSexo(sexo);
        
        verifDados();
    }
    
    // Outros métodos
    public void matricular() {
        
        System.out.println("============| matricula |============".toUpperCase());
        
        
    }
}
