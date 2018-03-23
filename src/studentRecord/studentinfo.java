/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentRecord;

/**
 *
 * @author nadeem.bukhari
 */
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Scanner;



public class studentinfo {
    //MAIN CLASS
     public static void main(String[] args) {
   
         int i=1;
         Scanner input = new Scanner(System.in);
            
            while(i==1) {
            //USER INPUT
            String selection = "";
            System.out.println();             
            System.out.println("What would you like to do? Choose one of the following options.");
            System.out.println("1. Display all the records");
            System.out.println("2. Search a specific record");        
            System.out.println("3. Delete a specific record");               

            System.out.println();  

            Scanner user_option_selection = new Scanner(System.in);

            selection = user_option_selection.next();

         //DISPLAY RECORDS
         if(selection.equalsIgnoreCase("1"))
          {
         try{
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/university","root","");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from student");
         
         
                System.out.println("ID   RegNo     Name       Class     Section     Contact     Address");
                System.out.println("------------------------------------------------------------------------------");

                
         while(rs.next())
         {
             
             System.out.println(rs.getString(1) + "    " + rs.getString(2) + "     " +rs.getString(3)+ "    " + rs.getString(4)+
                    "       " + rs.getString(5)+ "     " + rs.getString(6)+ "      " + rs.getString(7));
             System.out.println("-------------------------------------------------------------------------------");
         }
         
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    } 
  


            
            //SEARCH A RECORD
            else if(selection.equalsIgnoreCase("2"))
            {
                //code for search
                
            Scanner scan = new Scanner(System.in);            

            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/university","root","");
                //System.out.println("Connection success");  
                Statement stm =conn.createStatement();
                
                System.out.println("Enter a name: ");
                String x = scan.next();
                
                String query = "SELECT * FROM student WHERE name='" + x + "'";                                              
            
                ResultSet rs= stm.executeQuery(query);               

                 if(!rs.next()){
                System.out.println("\n-------------------------------\nentry not present\n-------------------------------");
                }                 
                   
                    System.out.println(rs.getString(1) + "    " + rs.getString(2) + " " +rs.getString(3)+ " " + rs.getString(4)+
                    "    " + rs.getString(5)+ " " + rs.getString(6)+ " " + rs.getString(7));
                    System.out.println("-------------------------------");
                        
            }
            catch (Exception e) {
                System.err.println(e);
                //System.out.println("****entry not present****\n-------------------------------");
            }
        }

           
                
            
            //DELETE A RECORD
     
            else if(selection.equalsIgnoreCase("3"))
            {
                //code for delete
       
            Connection con = null;
            
            String driver = "com.mysql.jdbc.Driver";          
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an ID: ");
            String x = scan.next();
            try{
            Class.forName(driver);
            con = DriverManager.getConnection("jdbc:mysql://localhost/university","root","");
            try{
            Statement st = con.createStatement();
            String sql = "DELETE FROM student WHERE ID='" + x + "'";
            int delete = st.executeUpdate(sql);
            if(delete == 1){
            System.out.println("\n-------------------------------\n"
                    + "Row is deleted.\n-------------------------------");
            }
            else{
            System.out.println("-------------------------------\n"
                    + "Row is not deleted due to wrong input."
                    + "\n-------------------------------");
          
            }
            }
            catch (SQLException s){
            System.out.println("SQL statement is not executed!");
            }
            }
            catch (Exception e){
            e.printStackTrace();
            }
           

            }
            //NONE OF THE OPTIONS ABOVE
            else
            {
                System.out.println("\n------------------------------------\n"
                        + "Incorrect option entered. Please try again."
                        + "\n------------------------------------");   
            }
         
            System.out.println("\n****press 1 to continue, any other numeric key to exit****\n");            
            i=input.nextInt();
            
           }
     }
     

}
     
        
        
        

     
 


