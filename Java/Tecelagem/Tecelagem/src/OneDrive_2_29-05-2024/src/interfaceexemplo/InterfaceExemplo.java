/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexemplo;

import lib.*;

/**
 *
 * @author Usuario
 */
public class InterfaceExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        TotalizableList tl= new TotalizableList(10);
        
        Produto p1= new Produto("Roda", 500);
        
        tl.add(p1);
        tl.add(new Produto("Calota", 30));
        tl.add(new Produto("Carburador", 500));
        
//        System.out.println(p1 instanceof Produto);
//        System.out.println(p1 instanceof TotalizableItem);
        
        tl.printAll();
        
    }
    
}
