/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorcycles;

import LinearDataStructures.Node;

/**
 *
 * @author Andrés Felipe
 */
public class Spares_Shop implements Node{
    String Type_Spare =null;
    int Spare_Existence =0;
    String Motorcycle_Brand = null;
   
    Spares_Shop next = null;
    
    public Spares_Shop(String Spare,int Existence, String Brand)
   {
       this.Type_Spare = Spare;
       this.Spare_Existence = Existence;
       this.Motorcycle_Brand = Brand;
   }


    public void setNext(Node node) 
    {
        next =(Spares_Shop)node;    
    }
    
    public Spares_Shop getNext() {
        return next;
    }

    @Override
    public Spares_Shop clone() {
        Spares_Shop clone = new Spares_Shop(Type_Spare, Spare_Existence, Motorcycle_Brand);
        return clone;    
    }

    public boolean isEqual(Node node) {
        Spares_Shop temp = (Spares_Shop)node;
        if(this.Type_Spare.equals(temp.Type_Spare))
            return true;
        
        return false;
    }
    
    

   
    public boolean isLessThan(Node node) {
    
        
        return false;    
    }
    
    public String toString()
    {
        return this.Type_Spare+", Required Quantity:"+Spare_Existence+", Type of Motorcycle:"+Motorcycle_Brand+"\n";
    }
}


