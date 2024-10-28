/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author 040069
 */
public class Primeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Pessoa p1= new Pessoa();
        Funcionario f1 = new Funcionario();
        Vendedor v1 = new Vendedor();
        
        p1.setNome("José");
        p1.setCPF("123.456-7");
        p1.setEstCivil('C');
        f1.setFaltas(3);
        f1.setSalario(1550);
        f1.salarioLiquido(3, 1550);
        
        p1.print();
        
        
    }
    
}
