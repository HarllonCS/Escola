package escola;

/**
 *
 * @author Harllon Cícero
 */
public class Aluno extends Pessoa {

    public Aluno(String nome, int anoNasc, String sexo) {
        setNome(nome);
        setAnoNasc(anoNasc);
        setSexo(sexo);
    }
    
    public void pagarMensal() {
        System.out.println("\nMensalidade paga...");
    }
}
