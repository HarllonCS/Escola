package escola;

import java.util.Scanner;

/**
 *
 * @author Harllon Cícero
 */
public class Pessoa {
    
    // Variáveis
    private String nome;
    private char sexo;
    private byte idade;
    private boolean matri;
    
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
    
    public boolean isMatri() {
        return matri;
    }
    public void setMatri(boolean matri) {
        this.matri = matri;
    }
    
    // Método construtor
    public Pessoa() {
        this.matri = false;
    }
    
    Scanner input = new Scanner(System.in);
    
    // Outros métodos
    public void matricular() {
        
        System.out.println("============| matricula |============".toUpperCase());
        
        System.out.print("\nInsira seu nome: ");
        setNome(input.nextLine());
        
        // Verificar a os valores inseridos e fazer comparação
        if (verifIdade() && verifSexo()) {
            
            setMatri(true);
            
            System.out.println(toString());
            
            /*
                if (getSexo() == 'M') {
                    System.out.println(getNome().toUpperCase() + " agora está matriculado.");
                } else {
                    System.out.println(getNome().toUpperCase() + " agora está matriculada.");
                }
            */
            System.out.println(getSexo() == 'M' ? "\nMatriculado com sucesso!" :
                    "\nMatriculada com sucesso!");
            
        } else {
            System.out.println("\n" + getNome().toUpperCase() + " nao atende os requisitos de matricula.");
        }
    }
    
    // Verificar a idade do usuário
    private boolean verifIdade() {
        
        System.out.print("\nInsira sua idade: ");
        setIdade(input.nextByte());
        
        System.out.println("\nIdade inserida: " + getIdade());
        
        if (getIdade() < 0) {
           
            System.out.println("\nIdade invalida.".toUpperCase());
           
            return false;
           
        } else if (getIdade() < 12) {
           
            System.out.println("\nVoce ainda nao tem idade necessaria para se matricular aqui!");
     
            return false;
           
        } else {
            return true;
       }
    }
    
    // Verificar o sexo do usuário
    private boolean verifSexo() {
        
        System.out.println("\nInsira seu sexo".toUpperCase());
        
        System.out.println("\n1 - Masculino\n2 - Feminino");
        System.out.print("\nDigite aqui: ");
        byte esc = input.nextByte();
        
        switch (esc) {
            case 1:
                setSexo('M');
            return true;
            
            case 2:
                setSexo('F');
            return true;
        }
        
        System.out.println(esc + " e uma opcao invalida!");
        
        return false;
    }

    @Override
    public String toString() {
        
        /*
            if (isMatri()) {
                return "\nNome: " + getNome().toUpperCase() + "\nIdade: " + getIdade() +
                    "\nSexo: " + getSexo();
            } else {
                return "\nPerfil incompleto!".toUpperCase();
            }
        */
        return isMatri() ? "\nNome: " + getNome().toUpperCase() + "\nIdade: " +
                getIdade() + "\nSexo: " + getSexo() : "\nPerfil incompleto!";
    }
}
