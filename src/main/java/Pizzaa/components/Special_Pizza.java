/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzaa.components;

 import java.text.DecimalFormat;


public class Special_Pizza {
    private int option;
    private int total; 
    private DecimalFormat thisDecimal= new DecimalFormat("#,###");


    public Special_Pizza(){
        this.total = 0;
    }
    public void  processThis(int optionTextFeild){
        option = optionTextFeild * 250;
        total += option;   
    }
    
    public int getTotal(){
        return total;
    }
    
    public String Formatted(){
        return "₱ " + thisDecimal.format(total);
    }
}