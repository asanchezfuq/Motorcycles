/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import Trees.BinaryTree;
import Trees.BinaryTreeNode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/**
 *
 * @author BOG-A408-E-005
 */



/**
 *
 * @author Andrés Felipe
 */
public class Main { 
   
    
    public static void main(String[]args) throws IOException
    {
        BinaryTree BinaryNodeExample = new BinaryTree ();
        //Motorcycles List
        BinaryNodeExample.insert(new BinaryNodeExample("Patricia Lopez","56789456","Yamaha","9876","00123","10-01-17","15-02-17"));
        BinaryNodeExample.insert(new BinaryNodeExample("Juan Ruiz","65748390","Honda","0765","00234","10-01-18","15-02-18"));
        BinaryNodeExample.insert(new BinaryNodeExample("Ximena Martínez","23456459","Ducati","4567","00345","15-01-17","15-02-17"));
        BinaryNodeExample.insert(new BinaryNodeExample("Nancy Rodriguez","23498756","Kawasaki","1234","00456","10-01-18","15-02-18"));
        BinaryNodeExample.insert(new BinaryNodeExample("Alfonso Lopez","80976542","Harley Davidson","564759","00567","10-01-17","15-02-17"));
        BinaryNodeExample.insert(new BinaryNodeExample("María Castañeda","54637890","BMW","3478","00678","10-01-17","15-02-17"));
        BinaryNodeExample.insert(new BinaryNodeExample("Maritza Daza","76545698","Suzuki","3847679","00789","10-01-17","15-02-17"));
        BinaryNodeExample.insert(new BinaryNodeExample("Yasmin Gomez","12309812","Aprilia","865974","00891","10-01-18","15-02-18"));
        BinaryNodeExample.insert(new BinaryNodeExample("Karen Fuentes","65747626","Triumph","75675","00911","10-01-17","15-02-17"));
        BinaryNodeExample.insert(new BinaryNodeExample("Marina Gutierrez","23409876","Hyosung","84573","00112","10-01-18","15-02-18"));
        BinaryNodeExample.insert(new BinaryNodeExample("Gonzalo Jimenez","657483549","Hero","09875","00113","10-01-17","15-02-17"));
        BinaryNodeExample.insert(new BinaryNodeExample("Carlos Barrero","76980923","Norton","12670","00114","10-01-17","15-02-17"));
       
        //Purchased Spares List
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
        BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
        
        
        //Defined Variables
        int op=0, Price = 0, posicion=0, delete=0, Existence=0, i =0;
        String Brand=null, License=null, Spare=null, Name=null, Owner=null, InD=null, OutD=null;
        
        do
        {
            //Options Menu
            bw.write("\nMenu\n"
                    + "1. Insert New Motorcycle for Fixing \n2. Delete Motorcycle By Owner's Id Document \n"
                    + "3. Search Motorcycle By Owner's Id Document \n"
                    + "4. Out \n");
            bw.flush();
            op = Integer.parseInt(br.readLine());
            switch(op)
            {
                //Each Option of The Menu with it's Functions Option 1(InsertAtBegin)
                case 1: bw.write("\nNew information:\n"
                        +"Name_Owner:");
                        bw.flush();
                        Name=br.readLine();
                        bw.write("Dct_Owner:");
                        bw.flush();
                        Owner=br.readLine();
                        bw.write("Motorcycle_Brand:");
                        bw.flush();
                        Brand=br.readLine();
                        bw.write("License_Number:");
                        bw.flush();
                        License=br.readLine();
                        bw.write("Type of Spare Required:");
                        bw.flush();
                        Spare=br.readLine();
                        BinaryNodeExample.insert((BinaryTreeNode) new BinaryNodeExample(Name, Owner, Brand, License, Spare, InD, OutD));
                        BinaryNodeExample.inorder(BinaryNodeExample.root);
                break;
                    //Option 2(Delete)
                case 2: bw.write("Owner's Id Document:");
                        bw.flush();
                        Owner=br.readLine();
                       BinaryNodeExample.delete((BinaryTreeNode) new BinaryNodeExample(null,Owner,null,null,null,null,null));
                break;
                //Option 4(Search)
                case 3: bw.write("Owner's Id Document:");
                        bw.flush();
                        Owner=br.readLine();
                        BinaryNodeExample.search((BinaryTreeNode) new BinaryNodeExample(null,Owner,null,null,null,null,null));
                break;
                    //Option 9(Get Out)
                case 4:  bw.write("Thanks For Visit Us\n");
                         bw.flush();
                break;
                default: bw.write("Incorrect");
                         bw.flush();
                break;
                
            }
        }while(op!=4);
    }
    
}
