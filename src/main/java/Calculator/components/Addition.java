/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator.components;

/**
 *
 * @author john clarence
 */
public class Addition {
    private double num0;
    private double num1;
    
   public Addition(){
     num0 = 0;
     num1 = 0;
   }
   public Addition(double num0, double num1){  
        this.num0 = num0;
        this.num1 = num1;
   }
   
   public double getnum0(){
       return num0;
   }
   public double getNum1(){
       return num1;
   }
   
   public double setnum0(double num0){
       return num0;
   }
   
   public double setNum1(double num1){
       return num1;  
   }
   public double result(){
       return num0 + num1;
   }
   
}


