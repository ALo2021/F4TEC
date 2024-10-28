/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa2;

/**
 *
 * @author 040069
 */
public class Funcionario extends Pessoa
{
    private double salario;
    private int faltas;
    
    // Construtor
    //
    public Funcionario(String nome, String cpf, double salario)
    {
        super(nome, cpf);
        
        setSalario(salario);
        faltas= 0;
    }
    
    // Setter
    //
    public final void setSalario(double salario)
    {
        if(salario <= 0)
            System.out.println("Salário inválido.");
        else
            this.salario= salario;
    }

    // Getters
    //
    public double getSalario() 
    {
        return salario;
    }

    public int getFaltas() 
    {
        return faltas;
    }
    
    // Outros métodos
    //
    public void faltou()
    {
        faltas++;
    }
    
    public double salarioLiquido()
    {
        return salario - (salario/20)*faltas;
    }
    
    public void hollerith()
    {
        super.print();
        System.out.printf("\nSalário bruto: %.2f\nFaltas: %d\nSalário líquido: %.2f\n", salario, faltas, salarioLiquido());
    }
    
}
