package Trees;

import Trees.BinaryTree;
import Trees.BinaryTreeNode;
import Trees.BinaryNodeExample;
/*
# Binary Tree Node.
#
# Created by Msc. Carlos Andres Sierra on April 2018.
# Copyright (c) 2018  Msc. Carlos Andres Sierra. Research Group on Artificial Life - ALIFE. All rights reserved.
#
# This file is part of DataStructuresTemplates.
#
# DataStructuresTemplates is free software: you can redistribute it and/or modify it under the terms of the
# GNU General Public License as published by the Free Software Foundation, version 3.
*/

/**
 * This class represents the behavior of Binary Tree Node
 * @author MSc. Carlos Andres Sierra, PhD. student
 */
public class Motorshop implements BinaryTreeNode {
    
        String Name_Owner = null;
        String Dct_Owner = null;
        String Motorcycle_Brand = null;
        String License_Number = null;
        String Type_Spare = null;
        String In_Date = null;
        String Out_Date = null;

	
	public Motorshop left;
	public Motorshop right;
	
	public  Motorshop(String Name, String Owner, String Brand, String License, String Spare, String InD, String OutD)
	{
            this.Name_Owner = Name;
            this.Dct_Owner = Owner;
            this.Motorcycle_Brand = Brand;
            this.License_Number = License;
            this.Type_Spare= Spare;
            this.In_Date = InD;
            this.Out_Date = OutD;
	}
	
	
	
	public void setLeft(BinaryTreeNode node) 
	{
		left = (Motorshop)node;
	}

	
	
	public BinaryTreeNode getLeft() 
	{
		return left;
	}

	
	
	public void setRight(BinaryTreeNode node)
	{
		right = (Motorshop)node;
	}

	
	
	public BinaryTreeNode getRight() 
	{
		return right;
	}

	
	
	public BinaryTreeNode clone()
	{
		return new Motorshop(Name_Owner, Dct_Owner, Motorcycle_Brand, License_Number, Type_Spare, In_Date, Out_Date);
	}

	
	
	public boolean isEqual(BinaryTreeNode node) 
	{
            Motorshop temp = (Motorshop)node;
        if(this.License_Number.equals(temp.License_Number))
            return true;
        
        if(this.Dct_Owner.equals(temp.Dct_Owner))
            return true;
        
        return false;
	}

	
	public boolean isLessThan(BinaryTreeNode node)
	{
           return false;
        }
	public String toString()
	{
		return this.Name_Owner +", Id Document Owner:"+Dct_Owner+", Motorcycle Brand:"+Motorcycle_Brand +", Licence:" + License_Number +", Type of Spare Needed: "+Type_Spare +
                ", In Date:"+In_Date+", Out Date:"+Out_Date+"\n";
	}
}