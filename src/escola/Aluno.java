package escola;

/**
 *
 * @author Harllon Cícero
 */
public class Aluno extends Pessoa {
    
    public Aluno (String nome, byte idade, char sexo) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }
    
    // Outros métodos
    public void matricular() {
        
        System.out.println("============| matricula |============".toUpperCase());
        
        
    }
}
