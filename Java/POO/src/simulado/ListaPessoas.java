/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado;

/**
 *
 * @author 55199
 */
public class ListaPessoas{
    private Pessoa lista[];
    private int count;

    public Pessoa[] getLista() {
        return lista;
    }
    
    
    public ListaPessoas(int capMax){
        lista = new Pessoa[capMax];
        count = 0;
    }
    
    public boolean add(Pessoa p){
        if(count >= lista.length)
            return false;
        else{
            lista[count] = p;
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
