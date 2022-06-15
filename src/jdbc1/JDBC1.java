/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author QUSAI
 */
public class JDBC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hamza",
                    "root","Boss@123");
            System.out.println("Connection created");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
