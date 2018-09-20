/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorcycles;

/**
 *
 * @author Andrés Felipe
 */
import LinearDataStructures.Node;


/**
 *
 * @author Andrés Felipe
 */
public class Spares implements Node {
    String Type_Spare =null;
    int Spare_Existence =0;
    int Price =0;
    Spares next = null;
    
    public Spares(String Spare, int Existence, int Price)
   {
       this.Type_Spare= Spare;
       this.Spare_Existence = Existence;
       this.Price = Price;
   }


    public void setNext(Node node) 
    {
        next =(Spares)node;    
    }
    
    public Spares getNext() {
        return next;
    }

    @Override
    public Spares clone() {
        Spares clone = new Spares(Type_Spare, Spare_Existence, Price);
        return clone;    
    }

    public boolean isEqual(Node node) {
        Spares temp = (Spares)node;
        if(this.Type_Spare.equals(temp.Type_Spare))
            return true;
        
        return false;
    }

   
    public boolean isLessThan(Node node) {
    Spares temp = (Spares)node;
        if(this.Price < temp.Price)
            return true;
        
        return false;    
    }
    
    public String toString()
    {
        return this.Type_Spare+" Quantity Available:"+Spare_Existence +", Price of Spare:" + Price +"\n";
    }
}

