/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado;

/**
 *
 * @author 55199
 */
public class Funcionario extends Pessoa {
    private int faltas;
    
    public void setFaltas(int faltou){
        this.faltas = faltou;
    }

    public int getFaltas() {
        return faltas;
    }
    
    
    
    public Funcionario(String nome, String rg, double salario, int qteFilhos){
        super(nome,rg,salario,qteFilhos);
        faltas = 0;
    }
    
    @Override
    public double calSalario(){
        return getSalario() - ((getSalario()/20) * faltas);
    }
    
    
    
    @Override
    public void zerarMes(){
        faltas = 0;
    }

    
    
}
