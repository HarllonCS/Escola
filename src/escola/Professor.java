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
            System.out.printf("\nO professor %S aplicou prova de %s para o aluno %S!",
                    getNome(), p.getTipoProva(), a.getNome());
            
        } else if (alunoFem && profFem) {
            System.out.printf("\nA professor %S aplicou prova de %s para a aluna %S!",
                    getNome(), p.getTipoProva(), a.getNome());
            
        } else if (alunoMasc && profFem) {
            System.out.printf("\nO professor %S aplicou prova de %s para a aluna %S!",
                    getNome(), p.getTipoProva(), a.getNome());
            
        } else {
            System.out.printf("\nA professora %S aplicou prova de %s para o aluno %S!",
                    getNome(), p.getTipoProva(), a.getNome());
        }
        
        System.out.printf("\n%S tem %.1fh pra fazer a prova de %s.\n",
                a.getNome(), p.getTempoProva(), p.getTipoProva());
        
        p.resultProva(a);
    }
}
