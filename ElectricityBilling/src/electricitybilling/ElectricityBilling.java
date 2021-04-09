/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitybilling;
import java.util.*;  
/**
 *
 * @author Sam
 */

class consumer{
    private String id;
    private int units;
    private String name;
    private String contact;
    protected int connection;
    private int rate;
    
    //constructor
    consumer(){
        this.connection = 0;
        this.contact = new String();
        this.id = new String();
        this.name = new String();
        this.rate = 4;
        this.units = 0;
    }
    
    //For new connection new connect method
    void newconnect (){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the Name of the consumer");
        this.name = sc.nextLine();
        System.out.println("Please Enter the contact of the consumer");
        this.contact = sc.nextLine();
        this.connection = 1;
        this.units = 0;
        this.id = getID(4);
    }
    
    void updateconnection(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the consumer ID");
        String str = sc.nextLine();
    }
    //method for generating consumer ID
    String getID(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
  
        for (int i = 0; i < n; i++) {
            int index= (int)(AlphaNumericString.length()* Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
  
        return sb.toString();
    }
}

public class ElectricityBilling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
