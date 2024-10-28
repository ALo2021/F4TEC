/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa2;

/**
 *
 * @author 55199
 */
public class ex_Abstract_Main {
    
    public static void main(String[] args){
        
        ex_Abstract2 cachorro = new ex_Abstract2();
        ex_Abstract3 gato     = new ex_Abstract3();
        
        cachorro.somDoAnimal();
        gato.somDoAnimal();
        
        cachorro.animalComFome();
    }
}
