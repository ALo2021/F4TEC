/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author 55199
 */
public class Vendedor extends Pessoa{
    private float salario, comissao;
    private float vendeu;

    public float getComissao() {
        return comissao;
    }

    public float getVendeu() {
        return vendeu;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public void setVendeu(int vendeu) {
        this.vendeu = vendeu;
    }

    public void salLiq(float qteComissao, int qteVendeu){
        salario = (qteComissao * qteVendeu);
    }
    
    public void hollerith(){
        print();
        System.out.printf("Total de vendas : %.2f\nComissao : %.1f\n Salario liquido : %.2f", vendeu, comissao, salario);
    }
}
