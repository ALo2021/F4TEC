/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

import simulado.Professor;

/**
 * @author Augusto Lopes RA 0040482012025
 */
public class Faculdade {
    
    /**
     * @param args the command line arguments
     **/
    public static void main(String[] args){
    
        Funcionario p1 = new Funcionario("Jose","123456",4,1400);
        //p1.registrarAulas(100);
        p1.hollerith();
        
        System.out.println("-------------------------------");
        
        Funcionario f1 = new Funcionario("Laura","123456789",3,1400);
        f1.faltou();
        f1.hollerith();
    }    
}
