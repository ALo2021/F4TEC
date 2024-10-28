/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa2;

/**
 *
 * @author 55199
 */
public class Ponto {
    protected double x, y;
    
    public Ponto(){
        x = 0;
        y = 0;
    }
    
    public Ponto(double vX, double vY){
      x = vX;
      y = vY;
   }
    
   public Ponto(Ponto pt){ // copy construct 
      x = pt.x;
      y = pt.y;
   }
   
   // getters e setters 
 
   // Retorna o valor de x
   public double getX(){
      return x;
   }
 
   // Retorna o valor de y
   public double getY(){
      return y;
   }
 
   // Modifica o valor de x
   public void setX(double newX){
      x = newX;
   }
 
   // Modifica o valor de y
   public void setY(double newY){
      y = newY;
   }
 
   // Modifica o valor de x e y
   public void setXY(double newX, double newY){
      x = newX;
      y = newY;
   }
 
   // Copia os atributos de pt
   public void assign(Ponto pt){
      x = pt.x;
      y = pt.y;
   }
   
   // Calculos
   // Retorna o delta x em relação a vX
   public double deltaX(double vX){
      return vX - x;
   }
 
   // Retorna o delta y em relação a vY
   public double deltaY(double vY){
      return vY - y;
   }
 
   // Retorna a distancia do ponto até as coordenadas informadas
   public double distance(double posX, double posY){
      double dx = deltaX(posX);
      double dy = deltaY(posY);
      return Math.sqrt(dx*dx + dy*dy);                  // Soma dos catetos
   }
   

}


