package escola;

import java.util.Scanner;

/**
 *
 * @author Harllon Cícero
 */

public class Pessoa {
    
    // Variáveis
    private String nome, sexo;
    private byte idade;
    private boolean matri;
    
    // Variáveis apenas para esta classe
    private final boolean masc = getSexo() == "M" || getSexo() == "m";
    private final boolean fem = getSexo() == "F" || getSexo() == "f";
    
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
    
    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    
    public boolean getMatri() {
        return matri;
    }
    public void setMatri(boolean matri) {
        this.matri = matri;
    }
    
    // Métodos das variáveis finais
    private boolean getMasc() {
        return masc;
    }
    private boolean getFem() {
        return fem;
    }

    // Método construtor
    public Pessoa() {
        this.matri = false;
    }
    
    
    // Outros métodos
    public void matricular() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("============ | matrícula | ============".toUpperCase());
        
        System.out.println("Insira seu nome: ");
        setNome(input.nextLine());
        
        System.out.println("Insira sua idade: ");
        setIdade(input.nextByte());
        
        System.out.println("Insira seu sexo: "); // .nextLine() pula uma linha
        setSexo(input.nextLine());
        
        verifIdade();
        verifSexo();
        
        if (verifIdade() && verifSexo()) {
            
            setMatri(true);
            
            /*
                if (masc) {
                    System.out.println(getNome().toUpperCase() + " agora está matriculado.");
                } else {
                    System.out.println(getNome().toUpperCase() + " agora está matriculada.");
                }
            
            */
            
            System.out.println(getMasc() ? "Matriculado com sucesso!" :
                    "Matriculada com sucesso!");
            
        } else {
            System.out.println(getNome().toUpperCase() + " não atende os requisitos da matrícula.");
        }
    }
    
    private boolean verifIdade() {
        
        System.out.println("Idade inserida: " + getIdade());
        
       if (getIdade() < 0) {
           
           System.out.println("Idade inválida.".toUpperCase());
           
           return false;
           
       } else if (getIdade() < 12) {
           
           System.out.println("Você ainda não tem idade necessária para se matricular aqui!");
     
           return false;
       }
           
       return true;
    }
    
    private boolean verifSexo() {
        
        if (getMasc() || getFem()) {
            
            return true;
        }
        
        System.out.println("Sexo " + getSexo() + " é invalido!");
        
        return false;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome().toUpperCase() + "\nIdade: " + getIdade() +
                "\nSexo: " + getSexo().toUpperCase();
    }
}
