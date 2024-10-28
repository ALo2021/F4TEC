/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author 55199
 */
public abstract class Pessoa {
    private String nome, rg;
    private int filhos;
    private double salario;
    private final double valorAux = 100;

    // Setters
    
    public final void setNome(String valNome) //setter
    {
        if(!valNome.isBlank())
            nome= valNome;
        else
            System.out.println("O nome não pode estar em branco");
    }

    public final void setRG(String valRG) {
        if(!valRG.isBlank())
            rg= valRG;
        else
            System.out.println("RG inválido.");
    }
    
    public final void setFilhos(int filhos) {
        this.filhos = filhos;
    }

    public final void setSalario(double salario) {
        this.salario = salario;
    }
        
    public Pessoa(String nome, String rg, int filhos, double salario)
    {
        setNome(nome);
        setRG(rg);
        setFilhos(filhos);
        setSalario(salario);
    }

    // getters
    
    public String getNome()  
    {
        return nome;
    }

    public String getRG() {
        return rg;
    }

    public double getSalario() {
        return salario;
    }

    public int getFilhos() {
        return filhos;
    }

    // Outros métodos
    
    public abstract double calcularSalario();
    public abstract void zerarMes();
    
    public double auxFilhos()
    {
        return valorAux * filhos;
    }
    
    public void hollerith()
    {    
        System.out.println("Nome: " + nome + "\n" + 
                           "RG: " + rg + "\n" +
                           "Salario base: " + salario + "\n" + 
                           "Filhos: " + filhos + "\n" + 
                           "Valor auxilio: " + auxFilhos());
    }
    
}
