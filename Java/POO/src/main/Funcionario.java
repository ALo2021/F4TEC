/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author 55199
 */
public class Funcionario extends Pessoa{
    public float salario;
    public int faltas;

    public float getSalario() {
        return salario;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public double salarioLiquido(int qteFaltas, float qteSal){
        
        salario = qteSal - ((qteSal/(1/20))* qteFaltas);
        
        return salario;
    }
    
}
