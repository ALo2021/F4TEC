/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado;

/**
 *
 * @author 55199
 */
public class ListaFuncionario{
    private Funcionario lista[];
    private int count;
    
    public Funcionario[] getLista() {
        return lista;
    }
    
    
    public ListaFuncionario(int capMax){
        lista = new Funcionario[capMax];
        count = 0;
    }
    
    public boolean add(Funcionario f){
        if(count >= lista.length)
            return false;
        else{
            lista[count] = f;
            count++;
            return true; }
    }
    
    public void listagem(){
        for(int i=0; i < count; i++){
            lista[i].hollerith();
            System.out.println();
        }
    }
    
}
