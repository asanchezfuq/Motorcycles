
package Motorcycles;

import LinearDataStructures.List;
import LinearDataStructures.Node;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 *
 * @author Andrés Felipe
 */
public class Motorcycle_Repair { 
   
    
    public static void main(String[]args) throws IOException
    {
        List Motorcycle_Workshop = new List();
        //Motorcycles List
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Yamaha","9876","00123"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Honda","0765","00234"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Ducati","4567","00345"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Kawasaki","1234","00456"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Harley Davidson","564759","00567"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("BMW","3478","00678"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Suzuki","3847679","00789"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Aprilia","865974","00891"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Triumph","75675","00911"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Hyosung","84573","00112"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Hero","09875","00113"));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Norton","12670","00114"));
        
        List Spares = new List();
        //Spares List
        Spares.insertAtBegin(new Spares ("00123",230,120000));
        Spares.insertAtBegin(new Spares ("00234",245,110000));
        Spares.insertAtBegin(new Spares ("00345",250,160000));
        Spares.insertAtBegin(new Spares ("00456",120,170000));
        Spares.insertAtBegin(new Spares ("00567",34,200000));
        Spares.insertAtBegin(new Spares ("00678",234,154000));
        Spares.insertAtBegin(new Spares ("00789",23,15000));
        Spares.insertAtBegin(new Spares ("00891",237,154000));
        Spares.insertAtBegin(new Spares ("00911",234,154000));
        Spares.insertAtBegin(new Spares ("00112",234,154000));
        Spares.insertAtBegin(new Spares ("00113",234,154000));
        Spares.insertAtBegin(new Spares ("00114",234,154000));
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
        BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
        
        //Defined Variables
        int op=0, Price = 0, posicion=0, delete=0, Existence=0;
        String Brand=null, License=null, Spare=null;
        
        do
        {
            //Options Menu
            bw.write("Menu\n"
                    + "1. Insert New Motorcycle for Fixing \n2. Delete Old Motorcycle (Index) \n"
                    + "3. Search Motorcycle By License \n"
                    + "4. Search Spares By Reference \n5. Motorcycles Record \n"
                    + "6. Spares Record \n7. Insert New Type of Spare \n8. Out \n");
            bw.flush();
            op = Integer.parseInt(br.readLine());
            switch(op)
            {
                //Each Option of The Menu with it's Functions Option 1(InsertAtBegin)
                case 1: bw.write("\nNew information:\n"
                        + "Motorcycle_Brand:");
                        bw.flush();
                        Brand=br.readLine();
                        bw.write("License_Number:");
                        bw.flush();
                        License=br.readLine();
                        bw.write("Type of Spare Required:");
                        bw.flush();
                        Spare=br.readLine();
                        Motorcycle_Workshop.insertAtBegin((Node) new Motorcycle_Workshop(Brand, License, Spare));
                        Motorcycle_Workshop.printList();
                break;
                    //Option 2(DeleteAtIndex)
                case 2: bw.write("Motorcycle Record to Delete:");
                        bw.flush();
                        delete= Integer.parseInt(br.readLine());
                        Motorcycle_Workshop.deleteAtIndex(delete);
                        Motorcycle_Workshop.printList();
                break;
                    //Option 3(LinealSearch)
                case 3: bw.write("License:");
                        bw.flush();
                        License=br.readLine();
                        Motorcycle_Workshop.linealSearch((Node) new Motorcycle_Workshop(null,License,null));
                break;
                    //Option 4(LinealSearch)
                case 4: bw.write("Spare Reference:");
                        bw.flush();
                        Spare=br.readLine();
                        Spares.linealSearch((Node) new Spares(Spare,0,0));
                break;
                    //Option 5(PrintList)
                case 5: bw.write("Motorcycles Record:\n");
                        bw.flush();
                        Motorcycle_Workshop.printList();
                break;
                    //Option 6(PrintList)
                case 6: bw.write("Spares Record:\n");
                        bw.flush();
                        Spares.printList();
                break;
                    //Option 7(InsertAtBegin)
                case 7: bw.write("\nNew information:\n"
                        + "Reference of Spare:");
                        bw.flush();
                        Spare=br.readLine();
                        bw.write("Spare_Existence:");
                        bw.flush();
                        Existence=Integer.parseInt(br.readLine());
                        bw.write("Price:");
                        bw.flush();
                        Price=Integer.parseInt(br.readLine());
                        Spares.insertAtBegin((Node) new Spares(Spare, Existence, Price));
                        Spares.printList();
                break;
                    //Option 7(Get Out)
                case 8: bw.write("Thanks For Visit Us\n");
                        bw.flush();
                break;
                default: bw.write("Incorrect");
                         bw.flush();
                break;
                
            }
        }while(op!=8);
    }
    
}
