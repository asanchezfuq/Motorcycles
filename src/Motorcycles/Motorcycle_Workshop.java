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
public class Motorcycle_Workshop implements Node {
    String Motorcycle_Brand=null;
    String License_Number=null;
    String Type_Spare =null;
   
    Motorcycle_Workshop next = null;
    
    public Motorcycle_Workshop(String Brand, String License, String Spare)
   {
       this.Motorcycle_Brand = Brand;
       this.License_Number = License;
       this.Type_Spare= Spare;
      
   }


    public void setNext(Node node) 
    {
        next =(Motorcycle_Workshop)node;    
    }
    
    public Motorcycle_Workshop getNext() {
        return next;
    }

    @Override
    public Motorcycle_Workshop clone() {
        Motorcycle_Workshop clone = new Motorcycle_Workshop(Motorcycle_Brand, License_Number, Type_Spare);
        return clone;    
    }

    public boolean isEqual(Node node) {
        Motorcycle_Workshop temp = (Motorcycle_Workshop)node;
        if(this.License_Number.equals(temp.License_Number))
            return true;
        
        return false;
    }

   
    public boolean isLessThan(Node node) {
    
        
        return false;    
    }
    
    public String toString()
    {
        return this.Motorcycle_Brand +", Licence:" + License_Number +", Type of Spare Needed: "+Type_Spare +"\n";
    }
}
