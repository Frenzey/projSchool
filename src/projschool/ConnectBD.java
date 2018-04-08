    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projschool;

/**
 *
 * @author frenzey
 */


import com.mysql.jdbc.Statement;
import java.sql.*;

public class ConnectBD {
 
    private static String url = "jdbc:mysql://localhost:3306/";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "";
    private static Connection con = null;
   
   private ConnectBD() throws ClassNotFoundException, SQLException{
		
		System.out.println("ConnexionBD::Connect()");

		
		try{
	
		//Chargement du pilote	
		Class.forName(driverName);
		System.out.println("Acces Granted"); 
		//Ouverture de la connexion
		con  = DriverManager.getConnection(url, username, password);
		}
		
		catch(SQLException e){
			e.printStackTrace();
                        System.out.println("Acces Denied"); 
		}
	}
    
    
    
    
    
    
   /**
	 * Une Instance de connexion unique
	 * @return the connexion
	 */
	public static Connection getConnexion() {
		System.out.println("ConnexionBD::getConnexion()");
		
		if(con == null){
			 try {
				new ConnectBD();
			} 
			 
			 catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			 
			 catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
        
        	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		new ConnectBD();

	}

    
}
