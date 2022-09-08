/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author ILP
 */
public class DatosCliente {
     Connection p;
   PreparedStatement z;
   
   public DatosCliente() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            p=DriverManager.getConnection("jdbc:mysql://localhost:3306/empresas", "root", "");
            System.out.println("Se conecto correctamente la base de datos");
        } catch (Exception e) {
            
            System.out.println("Error no se conecto a la base de datos"+e);
        }
    }
   
   
    public int registraCliente(String dni,String nom,String apepat,String apemat){
       int f=0;
          try {
           z=p.prepareStatement("insert into cliente values(?,?,?,?)");
           z.setString(1, dni);
           z.setString(2, nom);
           z.setString(3, apepat);
           z.setString(4, apemat);
           
           f=z.executeUpdate();
           
              System.out.println("Registro Correcto");
           
       } catch (Exception e) {
              System.out.println("Error no se registro"+e);
       }
         
       return f;
   }
    
    
     public int editarCliente(String dni,String nom,String apepat,String apemat){
       int f=0;
          try {
           z=p.prepareStatement("update cliente set nombre='?" + "',ape_pat='?" +"',ape_mat='?"+ "'where dni=?");
           z.setString(1, nom);
           z.setString(2, apepat);
           z.setString(3, apemat);
           z.setString(4, dni);
           
           f=z.executeUpdate();
           
              System.out.println("Registro Correcto");
           
       } catch (Exception e) {
              System.out.println("Error no se registro"+e);
       }
         
       return f;
   }
    
    
    public int eliminar(String dni) {
    int g=0;
    try {
           z=p.prepareStatement("delete from cliente where dni=?");         
           z.setString(1, dni);
           g=z.executeUpdate();
          
           
              System.out.println("Registro Correcto");
           
       } catch (Exception e) {
              System.out.println("Error no se registro"+e);
       }
         
       return g;
        
    }
    
}
