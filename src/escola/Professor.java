package escola;

/**
 *
 * @author Harllon Cícero
 */
public class Professor extends Pessoa {
    
    public Professor(String nome, int anoNasc, String sexo) {
        setNome(nome);
        setAnoNasc(anoNasc);
        setSexo(sexo);
    }
    
    public void apliProva(Aluno a, Prova p) {
        
        boolean alunoMasc = a.getSexo().equals("M");
        boolean alunoFem = a.getSexo().equals("F");
        boolean profMasc = getSexo().equals("M");
        boolean profFem = getSexo().equals("F");
        
        if (alunoMasc && profMasc) {
            
            System.out.println("\nO professor " + getNome().toUpperCase() + " aplicou prova de "
                    + p.getTipoProva() + " para o aluno " + a.getNome().toUpperCase() + "!");
        
        } else if (alunoFem && profFem) {
            
            System.out.println("\nA professora " + getNome().toUpperCase() + " aplicou prova de "
                    + p.getTipoProva() + " para a aluna " + a.getNome().toUpperCase() + "!");
            
        } else if (alunoMasc && profFem) {
            
            System.out.println("\nO professor " + getNome().toUpperCase() + " aplicou prova de "
                    + p.getTipoProva() + " para a aluna " + a.getNome().toUpperCase() + "!");
            
        } else {
            
            System.out.println("\nA professora " + getNome().toUpperCase() + " aplicou prova de "
                    + p.getTipoProva() + " para o aluno " + a.getNome().toUpperCase() + "!");
        }
        
        System.out.println(a.getNome().toUpperCase() + " tem " + p.getTempoProva()
        + "h para fazer a prova.");
    }
}
