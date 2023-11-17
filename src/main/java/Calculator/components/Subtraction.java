/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator.components;

/**
 *
 * @author john clarence
 */
public class Subtraction {
    private double num0; 
    private double num1;
    
    public Subtraction (double num0, double num1){
        this.num0 = num0;
        this.num1 = num1;
       
    }
    
    public double setNum0(){
        return num0;
    }
    public double setNum1(){
        return num1;
    }
    
    public double getNum0(){
        return num0;
    }
    public double getNum1(){
        return num1; 
    }
    
    public double result(){
        return num0 - num1; 
    }
}
