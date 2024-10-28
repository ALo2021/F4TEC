/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado;

/**
 *
 * @author 55199
 */
public abstract class Pessoa {
    private String nome, rg;
    private double salario;
    private int qteFilhos;
    private final double auxFilhos = 100;
    
    //setters

    final public void setNome(String nome) {
        this.nome = nome;
    }

    final public void setRg(String rg) {
        this.rg = rg;
    }

    final public void setSalario(double salario) {
        this.salario = salario;
    }

    final public void setQteFilhos(int qteFilhos) {
        this.qteFilhos = qteFilhos;
    }

    public Pessoa(String nome, String rg, double salario, int qteFilhos) {
        setNome(nome);
        setRg(rg);
        setSalario(salario);
        setQteFilhos(qteFilhos);
    }
    
    //getters

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public double getSalario() {
        return salario;
    }

    public int getQteFilhos() {
        return qteFilhos;
    }
    
    
    
    public abstract double calSalario();
    public abstract void zerarMes();
    
    public void hollerith(){
        System.out.println("Nome : " + nome + "\n" +
                            "Rg : " + rg + "");
    }
    
    
    
}
