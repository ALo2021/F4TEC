/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author Usuario
 */
public class TotalizableList 
{
    private TotalizableItem list[];
    private int count;
    
    public TotalizableList(int capMax)
    {
        list= new TotalizableItem[capMax];
        count= 0;
    }
    
    public boolean add(TotalizableItem item)
    {
        if(count >= list.length) return false;
        list[count]= item;
        count++;
        return true;
    }
    
    public void printAll()
    {
        double total= 0;
        for(int i= 0; i<count; i++)
        {
            list[i].printItem();
            total += list[i].totalizableValue();
        }
        
        System.out.println("Total: " + total + "\n");
    }
    
}
