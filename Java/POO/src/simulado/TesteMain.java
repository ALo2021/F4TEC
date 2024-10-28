/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado;
/**
 *
 * @author 55199
 */
public class TesteMain{
    public static void main(String[] args) {
    
        Funcionario f1 = new Funcionario("Joao","1234560",1400,3);
        Funcionario f2 = new Funcionario("Maria","0040487",2600,7);
        
        ListaPessoas l1 = new ListaPessoas(20);
        ListaFuncionario l2 = new ListaFuncionario(15);
        l1.add(f1);
        l1.add(f2);
        l2.add(f2);
        l2.add(f1);
        l1.listagem();
        
        if(l1.getLista()[0] instanceof Pessoa){
        Pessoa p1 = (Pessoa) l1.getLista()[0]; // se funcionario f1 istanceof pessoa, p3 recebe campo no e rg de f1;
        } 
        if(l2.getLista()[0] instanceof Pessoa){
        
        }
        
        
    }
}
