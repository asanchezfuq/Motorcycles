/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TreeExercises;

import Trees.BinaryNodeExample;
import Trees.BinaryTree;
import static Trees.BinaryTree.root;
import Trees.BinaryTreeNode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



/**
 *
 * @author BOG-A401-E-001
 */
public class Level_Order_Tree_Traversal 
{
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    
    public static void main(String[]args) 
    {
        try
        {
            BinaryTree n = new BinaryTree();
            int cas, cant;
            
            cas = Integer.parseInt(br.readLine());
            
            for (int i =0; i<cas;i++)
            {             
                cant = Integer.parseInt(br.readLine());
                
                String[] numbers = br.readLine().split(",");
                for(int j = 0; j < numbers.length; j++)
                    n.insert( new BinaryNodeExample(Integer.parseInt(numbers[i])));
                
            }
            n.nivel(n.root);
        }catch(Exception ex) {}
    }

}
