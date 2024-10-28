/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecelagem;

import lib.TotalizableItem;
        
/**
 *
 * @author Usuario
 */
public class Produto implements TotalizableItem
{
    private String desc;
    private double preco;

    public Produto(String desc, double preco) 
    {
        this.desc = desc;
        this.preco = preco;
    }
    
    public void print()
    {
        System.out.println(desc + "\t" + preco);        
    }
    
    // Implementação dos métodos da interface
    
    @Override
    public void printItem()
    {
        print();
    }
    
    // Retorna o valor que será utilizado na totalização
    @Override
    public double totalizableValue()
    {
        return preco;
    }
    
}
