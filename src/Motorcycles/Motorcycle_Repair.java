
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
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Patricia Lopez","56789456","Yamaha","9876","00123","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Juan Ruiz","65748390","Honda","0765","00234","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Ximena Martínez","23456459","Ducati","4567","00345","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Nancy Rodriguez","23498756","Kawasaki","1234","00456","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Alfonso Lopez","80976542","Harley Davidson","564759","00567","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("María Castañeda","54637890","BMW","3478","00678","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Maritza Daza","76545698","Suzuki","3847679","00789","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Yasmin Gomez","12309812","Aprilia","865974","00891","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Karen Fuentes","65747626","Triumph","75675","00911","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Marina Gutierrez","23409876","Hyosung","84573","00112","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Gonzalo Jimenez","657483549","Hero","09875","00113","",""));
        Motorcycle_Workshop.insertAtBegin(new Motorcycle_Workshop("Carlos Barrero","76980923","Norton","12670","00114","",""));
        
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
        Spares.insertAtBegin(new Spares ("00911",56,124000));
        Spares.insertAtBegin(new Spares ("00112",89,112000));
        Spares.insertAtBegin(new Spares ("00113",70,100000));
        Spares.insertAtBegin(new Spares ("00114",12,189000));
        
        List Spares_Shop = new List();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
        BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
        
        //Defined Variables
        int op=0, Price = 0, posicion=0, delete=0, Existence=0, i =0;
        String Brand=null, License=null, Spare=null, Name=null, Owner=null, InD=null, OutD=null;
        
        do
        {
            //Options Menu
            bw.write("\nMenu\n"
                    + "1. Insert New Motorcycle for Fixing \n2. Delete Old Motorcycle (Index) \n"
                    + "3. Search Motorcycle By License \n4. Search Motorcycle By Owner's Id Document \n"
                    + "5. Search Spares By Reference \n6. Motorcycles Record \n"
                    + "7. Spares Record \n8. Insert New Type of Spare \n9. Order New Spares \n10. Out \n");
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
                        Motorcycle_Workshop.insertAtBegin((Node) new Motorcycle_Workshop(Name, Owner, Brand, License, Spare, InD, OutD));
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
                        Motorcycle_Workshop.linealSearch((Node) new Motorcycle_Workshop(null,null,null,License,null,null,null));
                break;
                //Option 4(LinealSearch)
                case 4: bw.write("Owner's Id Document:");
                        bw.flush();
                        Owner=br.readLine();
                        Motorcycle_Workshop.linealSearch((Node) new Motorcycle_Workshop(null,Owner,null,null,null,null,null));
                break;
                    //Option 5(LinealSearch)
                case 5: bw.write("Spare Reference:");
                        bw.flush();
                        Spare=br.readLine();
                        Spares.linealSearch((Node) new Spares(Spare,0,0));
                break;
                    //Option 6(PrintList)
                case 6: bw.write("Motorcycles Record:\n");
                        bw.flush();
                        Motorcycle_Workshop.printList();
                break;
                    //Option 7(PrintList)
                case 7: bw.write("Spares Record:\n");
                        bw.flush();
                        Spares.printList();
                break;
                    //Option 8(InsertAtBegin)
                case 8: bw.write("\nNew information:\n"
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
                case 9: do{
                            bw.write("1. New Spare \n2. List Of Purchased Spares\n");
                            bw.flush();
                            i = Integer.parseInt(br.readLine());
                            switch (i){
                                    case 1: bw.write("\nNew information:\n"
                                              + "Reference of Spare:");
                                              bw.flush();
                                              Spare=br.readLine();
                                              bw.write("Required Quantity:");
                                              bw.flush();
                                              Existence=Integer.parseInt(br.readLine());
                                              bw.write("Type of Motorcycle:");
                                              bw.flush();
                                              Brand=br.readLine();
                                              bw.write("\n# The order will arrive in 5 days #\n");
                                              bw.flush();
                                              Spares_Shop.insertAtBegin((Node) new Spares_Shop(Spare, Existence, Brand));
                                      break;
                                      case 2: bw.write("Purchased Spares:\n");
                                              bw.flush();
                                              Spares_Shop.printList();
                                      break;
                                }
                        }while(i!=2);
                break;
                    //Option 9(Get Out)
                case 10: bw.write("Thanks For Visit Us\n");
                         bw.flush();
                break;
                default: bw.write("Incorrect");
                         bw.flush();
                break;
                
            }
        }while(op!=10);
    }
    
}