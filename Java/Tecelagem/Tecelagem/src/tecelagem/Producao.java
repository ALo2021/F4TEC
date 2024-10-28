/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class Producao extends Funcionario
{
    private int hrDia, hrNoite;

    public Producao(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        hrDia= 0;
        hrNoite= 0;
    }

    public int getHrDia() 
    {
        return hrDia;
    }

    public int getHrNoite() 
    {
        return hrNoite;
    }
    
    public void registrarHorasDiurnas(int horas) 
    {
        hrDia+= horas;
    }
    
    public void registrarHorasNoturnas(int horas)
    {
        hrNoite+= horas;
    }
    
    public double calcDiurnas()
    {
        return getSalBase() * hrDia;
    }
    
    public double calcNoturnas()
    {
        return getSalBase() * hrNoite * 1.3;
    }
    
    @Override
    public double salarioLiquido()
    {
        return calcDiurnas() + calcNoturnas();
    }
    
    @Override
    public void novoMes()
    {
        hrDia= 0;
        hrNoite= 0;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Horas diurnas: " + hrDia + "\n" +
                "Horas noturnas: " + hrNoite + "\n" +
                "Valor diurno: " + calcDiurnas() + "\n" +
                "Valor noturno: " + calcNoturnas());
    }
    
    
}
