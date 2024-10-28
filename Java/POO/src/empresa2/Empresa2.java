/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa2;

/**
 *
 * @author 040069
 */
public class Empresa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /////////////////////////////////////////////////////////
        copyConstruct obj1 = new copyConstruct();
        obj1.setValor(10);
        
        // Criando uma cópia de obj1 usando o construtor de cópia
        copyConstruct obj2 = new copyConstruct(obj1);

        // Imprimindo os valores
        System.out.println("Valor de obj1: " + obj1.getValor());
        System.out.println("Valor de obj2: " + obj2.getValor());
        
        /////////////////////////////////////////////////////////
        
        Funcionario f1= new Funcionario("Zé", "12345678-9", 10000);
        f1.faltou();
        f1.faltou();
        f1.hollerith();
        System.out.println();
        
        Vendedor v1= new Vendedor("Joca", "123456354-9", 5);
        v1.vendeu(50000);
        v1.vendeu(50000);
        v1.hollerith();
        
        
    }
    
}
