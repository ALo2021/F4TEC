/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa2;

/**
 *
 * @author 040069
 */
public class Vendedor extends Pessoa
{
    private double comissao, vendas;

    // Construtor
    //
    public Vendedor(String nome, String cpf, double comissao) 
    {
        super(nome, cpf);
        setComissao(comissao);
        vendas= 0;
    }

    // Setter
    //
    public final void setComissao(double comissao) 
    {
        if(comissao <= 0)
            System.out.println("Comissão inválida.");
        else
            this.comissao = comissao;
    }
    
    // Getters
    //
    public double getComissao() 
    {
        return comissao;
    }

    public double getVendas() 
    {
        return vendas;
    }
    
    // Outros métodos
    //
    public void vendeu(double valor)
    {
        vendas += valor;
    }
    
    public double salarioLiquido()
    {
        return vendas * comissao/100;
    }
    
    @Override
    public void hollerith()
    {
        print();
        System.out.printf("Total de vendas: %.2f\nComissão: %.1f%%\nSalario líquido: %.2f\n", vendas, comissao, salarioLiquido());
    }
}
