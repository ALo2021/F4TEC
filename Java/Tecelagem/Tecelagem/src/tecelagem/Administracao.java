/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class Administracao extends Funcionario
{
    private int faltas;

    public Administracao(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        faltas= 0;
    }

    public int getFaltas() 
    {
        return faltas;
    }
    
    public void registrarFalta( )
    {
        faltas++;
    }
    
    public double descontoFaltas()
    {
        return (getSalBase()/30) * faltas;
    }
    
    @Override
    public double salarioLiquido()
    {
        return getSalBase() - descontoFaltas();
    }
    
    @Override
    public void novoMes()
    {
        faltas= 0;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.printf("Faltas: %d\nDesconto por faltas: %.2f\n", faltas, descontoFaltas());
    }
    
}
