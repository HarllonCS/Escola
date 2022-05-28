package escola;

import java.util.Scanner;

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
    
    Scanner input = new Scanner(System.in);
    
    // Método construtor
    public Pessoa() {
        this.matriculado = false;
    }
    
    // Verificar a idade do usuário
    private boolean verifIdade() {
        
        System.out.print("\nInsira sua idade: ");
        setIdade(input.nextByte());
        
        System.out.println("\nIdade inserida: " + getIdade());
        
        if (getIdade() < 0) {
            
            System.out.println("\nIdade inserida: " + getIdade() + "\nIdade invalida!");
           
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
        
        return "\nNome: " + getNome().toUpperCase() + "\nIdade: " +
                getIdade() + "\nSexo: " + getSexo();
    }
}
