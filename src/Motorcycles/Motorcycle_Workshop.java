/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorcycles;

import LinearDataStructures.Node;


/**
 *In this class is located the Motorcyles list structure
 * @author Andrés Felipe
 */
public class Motorcycle_Workshop implements Node {
    String Name_Owner=null;
    String Dct_Owner=null;
    String Motorcycle_Brand=null;
    String License_Number=null;
    String Type_Spare =null;
   
    Motorcycle_Workshop next = null;
    
    public Motorcycle_Workshop(String Name, String Owner, String Brand, String License, String Spare)
   {
       this.Name_Owner = Name;
       this.Dct_Owner = Owner;
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
        Motorcycle_Workshop clone = new Motorcycle_Workshop(Name_Owner, Dct_Owner, Motorcycle_Brand, License_Number, Type_Spare);
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
        return this.Name_Owner +", Id Document Owner:"+Dct_Owner+", Motorcycle Brand:"+Motorcycle_Brand +", Licence:" + License_Number +", Type of Spare Needed: "+Type_Spare +"\n";
    }
}
