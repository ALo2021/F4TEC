/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author 040069
 */
public class Pessoa 
{
    private String nome;
    private String cpf;
    private char estCivil; // S-Solteiro   C-Casado    D-Divorciado   V-Viúvo

    // Setters
    
    public void setNome(String valNome) //setter
    {
        if(!valNome.isBlank())
            nome= valNome;
        else
            System.out.println("O nome não pode estar em branco");
    }
    
    public void setEstCivil(char valEstCivil) 
    {
        switch(valEstCivil)
        {
            case 'C':
            case 'S':
            case 'V':
            case 'D':
                estCivil= valEstCivil;
                break;
            default:  
                System.out.println("Estado civil inválido.");
        }
    }

    public void setCPF(String valCPF) {
        if(!valCPF.isBlank())
            cpf= valCPF;
        else
            System.out.println("CPF inválido.");
    }

    // getters
    
    public String getNome()  //getter
    {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    public char getEstCivil() {
        return estCivil;
    }

    // Outros métodos
    
    public void print()
    {
        System.out.println("Nome: " + nome + 
                           "\nRG: " + cpf + 
                           "\nEst. Civil: " + estCivil);
    }
    
} //////////////////////  Classe Pessoa

