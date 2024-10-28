/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class ListaFunc 
{
    private Funcionario lista[];
    private int count;
    
    public ListaFunc(int capMax)
    {
        lista= new Funcionario[capMax];
        count= 0;
    }
    
    public boolean add(Funcionario f)
    {
        if(count >= lista.length) return false;
        lista[count]= f;
        count++;
        return true;
    }
    
    public boolean registrarVenda(int index, double valor)
    {
        if(index >= count) return false;
        if(lista[index] instanceof Vendas)
        {
            Vendas v= (Vendas)lista[index];
            v.registrarVenda(valor);
            return true;
        }
        return false;       
    }
    
    public boolean registrarFalta(int index)
    {
        if(index >= count) return false;
        if(lista[index] instanceof Administracao)
        {
            Administracao a= (Administracao) lista[index];
            a.registrarFalta();
            return true;
        }
        return false;
    }
            
}
