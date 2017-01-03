package bdd;

import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
import java.awt.event.*;
 
public class  Connexion implements Runnable  {
 
public Connexion() throws ClassNotFoundException, SQLException{
      String username="root";
      String password="";
      String nombase="jdbc:mysql://localhost/cabinet";
       
     new Thread(this).start();
       
       
      //@SuppressWarnings("unused")
    // con = null;
      try{
          //CHARGEMENT DU DRIVER
          Class.forName("com.mysql.jdbc.Driver");
          //CONNECTION A LA BASE DE DONNEES
          Connection  con = DriverManager.getConnection(nombase,username,password);
          System.err.println("Driver  chargé !");
      }//fin try
       
     //ON VERIFIE QUE LE CHARGEMENT SE SOIT BIEN DEROULE
      catch(ClassNotFoundException e){
          System.err.println("Driver non chargé !");
      }//fin catch
       
}
 
public static void main(String[] args){
     
      try{
          Connexion co = new Connexion();
      }
       
      catch(Exception ex)
      {
          System.out.println("***Exeption\n" + ex);
          ex.printStackTrace();
      }
  }
 

 
public void run() {
     
}
}//FIN CLASSE