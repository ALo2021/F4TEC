/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado;

import faculdade.Pessoa;

/**
 *
 * @author 55199
 */
public class Professor extends Pessoa 
{
    private int qteAulas;

    public Professor(int qteAulas, String nome, String rg, double salario, int filhos) {
        super(nome, rg, filhos, salario);
        this.qteAulas = qteAulas;
    }

    
    public void registrarAulas(int qte){
        qteAulas+= qte;
    }
    
    @Override
    public void zerarMes(){
        qteAulas = 0;
    }
    
    @Override
    public double calcularSalario(){
        return getSalario()*qteAulas+auxFilhos();
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
    }
}
