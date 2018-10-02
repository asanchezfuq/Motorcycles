/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import LinearDataStructures.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Andrés Felipe
 */
public class Going_to_the_Market {
    public static List Fruits =new List();
    public static List Vegetables= new List();
    public static int op=0,cantidad=0,precio=0,Precio=0;
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	
    
    public static void CompraFrutas()
    {
        try
       {
           Fruits.printList();
            bw.write("Cantidad Frutas:\n");
            bw.flush();
            
                
            bw.write("Mamao:");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                Precio+=1000;
            }
            bw.write("Pera:");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                Precio+=3500;
            }
            bw.write("Lulo:");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                Precio+=500;
            }
            bw.write("Uva:");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                Precio+=5400;
            }
            bw.write("Morango:");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                Precio+=2100;
            }
            CompraVegetales();
        }catch(Exception ex) {}
    }
    public static void CompraVegetales()
    {
        try
       {
            Vegetables.printList();
            bw.write("Cantidad Vegetales:\n");
            bw.flush();
            
                
            bw.write("Lechuga:");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                precio+=1500;
            }
            bw.write("Repollo:");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                precio+=2500;
            }
            bw.write("Brocoli:");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                precio+=3200;
            }
            bw.write("Tomate:");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                precio+=4000;
            }
            bw.write("Cebolla:");
            bw.flush();
            cantidad = Integer.parseInt(br.readLine());
            for (int i = 0;i<cantidad;i++)
            {
                precio+=1100;
            }
            
        }catch(Exception ex) {}
    }
    public static void main(String[]args)
    {
        Fruits.insertAtBegin(new Fruits("Morango",2.100));
        Fruits.insertAtBegin(new Fruits("Uva",5.400));
        Fruits.insertAtBegin(new Fruits("Lulo",500));
        Fruits.insertAtBegin(new Fruits("Pera",3.500));
        Fruits.insertAtBegin(new Fruits("Mamao",1.000));
        Vegetables.insertAtBegin(new Vegetables("Cebolla",1.100));
        Vegetables.insertAtBegin(new Vegetables("Tomate",4.000));
        Vegetables.insertAtBegin(new Vegetables("Brocoli",3.200));
        Vegetables.insertAtBegin(new Vegetables("Repollo",2.500));
        Vegetables.insertAtBegin(new Vegetables("Lechuga",1.500));
         
        CompraFrutas();
        try
        {
            bw.write("\n R$"+Precio);
            bw.flush();
            bw.write("\n R$"+precio);
            bw.flush();
        }catch(Exception ex) {}
    }
    
}
