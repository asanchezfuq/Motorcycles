/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListEstudiantes;
import java.util.*;
import LinearDataStructures.List;
import LinearDataStructures.Node;

/**
 *
 * @author Andrés Felipe
 */
public class Main {
    
    public static void main (String[] args){
        List Estudiantes = new List();
        
        Estudiantes.insertAtBegin(new Estudiantes("\n Lucia","123456",12));
        Estudiantes.insertAtBegin(new Estudiantes("\n Rubí","858665",47));
        Estudiantes.insertAtBegin(new Estudiantes("\n Hector","484760",32));
        Estudiantes.insertAtBegin(new Estudiantes("\n Nuvia","864654",17));
        Estudiantes.insertAtBegin(new Estudiantes("\n Alejandro","758852",21));
        
        
        int op,edad,delete;
        String nombre,id,correo,telefono;
        Scanner leer =new Scanner (System.in); 
        do
        {
            System.out.print("\n Actions: \n");
            System.out.println("Menu \n 1. Print List \n 2. Insert Begin \n 3. Insert End \n"
                    + " 4. Insert Index \n 5. Delete Begin \n 6. Delete End\n 7. Delete Index \n"
                    + " 8. Update First \n 9. Update All \n 10. LinealSearch \n 11. Search All \n "
                    + "12. BinarySearch \n 13. Out \n\n Choose an Option");
            op=leer.nextInt();
            switch(op)
            {
                case 1: Estudiantes.printList();
                break;
                case 2: System.out.print("New information:\n"
                        + "Name:");
                        nombre=leer.next();
                        System.out.print("\n ID:");
                        id=leer.next();
                        System.out.print("\n Age:");
                        edad=leer.nextInt();
                        Estudiantes.insertAtBegin(new Estudiantes(nombre,id,edad));
                        Estudiantes.printList();
                break;
                case 3: System.out.print("New information:\n"
                        + "Name:");
                        nombre=leer.next();
                        System.out.print("\n ID:");
                        id=leer.next();
                        System.out.print("\n Age:");
                        edad=leer.nextInt();
                        Estudiantes.insertAtBegin(new Estudiantes(nombre,id,edad));
                        Estudiantes.printList();
                break;
                case 4: System.out.print("New information:\n"
                        + "Name:");
                        nombre=leer.next();
                        System.out.print("\n ID:");
                        id=leer.next();
                        System.out.print("\n Age:");
                        edad=leer.nextInt();
                        Estudiantes.insertAtBegin(new Estudiantes(nombre,id,edad));
                        Estudiantes.printList();
                break;
                case 5: Estudiantes.deleteAtBegin();
                        Estudiantes.printList();
                break;
                case 6: Estudiantes.deleteAtEnd();
                        Estudiantes.printList();
                break;
                case 7: System.out.print("Node to Delete\n");
                        delete=leer.nextInt();
                        Estudiantes.deleteAtIndex(delete);
                        Estudiantes.printList();
                break;
                case 8: Estudiantes.updateFirst(Node.next, Node.next);
                        Estudiantes.printList();
                break;
                case 9: Estudiantes.updateAll(Node.next, Node.next);
                        Estudiantes.printList();
                break;
                case 10: Estudiantes.linealSearch(Node.next);
                         Estudiantes.printList();
                break;
                case 11: Estudiantes.searchAll(Node.next);
                         Estudiantes.printList();
                break;
                case 12: Estudiantes.binarySearch(Node.next);
                         Estudiantes.printList();
                break;
                default: System.out.print("Incorrect\n");

                break;
            }
        }while(op!=13);
        
    }
    
}
