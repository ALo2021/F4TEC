/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class Vendas extends Funcionario
{
    private double totVendas;
    private final double percent;

    public Vendas(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        totVendas= 0;
        percent= 3;
    }

    public double getTotVendas() 
    {
        return totVendas;
    }
    
    public void registrarVenda(double valor)
    {
        totVendas+= valor;
    }
    
    public double comissao()
    {
        return totVendas * percent / 100;
    }
    
    @Override
    public double salarioLiquido()
    {
        return getSalBase() + comissao();
    }
    
    @Override
    public void novoMes()
    {
        totVendas= 0;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.printf("Total de vendas: %.2f\nComissão: %.2f", totVendas, comissao());
    }
    
}
