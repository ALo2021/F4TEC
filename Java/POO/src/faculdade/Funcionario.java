/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author 55199
 */
public class Funcionario extends Pessoa {
    private int faltas;
    private final double valCox= 42;

    public Funcionario(String nome, String rg, int filhos, double salario) {
        super(nome, rg, filhos, salario);
        faltas=0;
    }
    
    public void faltou(){
        faltas ++;
    }
    
    @Override
    public double calcularSalario(){
        return getSalario() + valCox + auxFilhos() - (getSalario()/20)*faltas;
    }
    
    @Override
    public void zerarMes(){
        faltas = 0;
    }
}
