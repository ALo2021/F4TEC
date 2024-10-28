/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Administracao a1= new Administracao("João", "12346787-5", 10000);
        
        a1.registrarFalta();
        a1.registrarFalta();
        a1.hollerith();
        
        System.out.println("----------------------------------");
        
        Producao p1= new Producao("Maria", "675327654-2", 100);
        
        p1.registrarHorasDiurnas(100);
        p1.registrarHorasNoturnas(100);
        p1.hollerith();
        
        System.out.println("-------------------------------");
        
        Vendas v1= new Vendas("Joca", "87378634-2", 1000);
        
        v1.registrarVenda(100000);
        
        v1.hollerith();
    }
    
}
