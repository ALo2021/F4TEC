/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public abstract class Funcionario 
{
    private String nome, rg;
    private double salBase;

    public Funcionario(String nome, String rg, double salBase) 
    {
        setNome(nome);
        setRg(rg);
        setSalBase(salBase);
    }
    
    // setters
    //
    public final void setNome(String nome) 
    {
        if(!nome.isBlank())
            this.nome = nome;
    }

    public final void setRg(String rg) 
    {
        if(!rg.isBlank())
            this.rg = rg;
    }

    public final void setSalBase(double salBase) 
    {
        if(salBase > 0)
            this.salBase = salBase;
    }
    
    // getters

    public String getNome() 
    {
        return nome;
    }

    public String getRg() 
    {
        return rg;
    }

    public double getSalBase() 
    {
        return salBase;
    }
    
    // Outros métodos
    
    public abstract double salarioLiquido();
    public abstract void novoMes();
    
    public void hollerith()
    {
        System.out.printf("Nome: %s\nRg: %s\nSalário base: %.2f\nSalário líquido: %.2f\n", nome, rg, salBase, salarioLiquido());
    }
    
}
