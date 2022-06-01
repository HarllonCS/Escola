package escola;

/**
 *
 * @author Harllon Cícero
 */
public class Principal {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Fulano", 2008, "M");
        Aluno a2 = new Aluno("Beutrana", 2002, "F");
        Aluno a3 = new Aluno("Canecuco", 1992, "M");
        Aluno a4 = new Aluno("Cabecuda", 1994, "F");
        Aluno a5 = new Aluno("Ze Vaqueira", 1990, "F");
        
        Professor p1 = new Professor("Adernaldo", 1985, "M");
        Professor p2 = new Professor("Adailson", 1999, "M");
        Professor p3 = new Professor("Adamilsa", 2000, "F");
        Professor p4 = new Professor("Alana", 1980, "F");
        
        Prova pr1 = new Prova("Matematica", 3.5f);
        Prova pr2 = new Prova("Fisica", 4.8f);
        Prova pr3 = new Prova("Portugues", 2.1f);
        Prova pr4 = new Prova("Geografia", 3.2f);
        Prova pr5 = new Prova("Biologia", 5.4f);
        Prova pr6 = new Prova("Filosofia", 1.2f);
        Prova pr7 = new Prova("Sociologia", 2.3f);
        
        p2.apliProva(a3, pr7);
        p1.apliProva(a1, pr5);
        p4.apliProva(a2, pr3);
        p3.apliProva(a5, pr1);
        
        /*
        ----------- ÁREA DE TESTES ----------- 
        
       Random rdNum = new Random();
       Random rdOp = new Random();
        
       float num = Math.round(rdNum.nextFloat(0.0f, 10.0f));
       int op = rdOp.nextInt(2);
        
       if (op == 0) {
            num += .5f;
        }
       if (num > 10.0f) {
           num = 10.0f;
        }
        
        System.out.println(num);
        */
    }
}
