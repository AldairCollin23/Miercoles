

package modelo;

import java.sql.*;
public class Datos {
   Connection p;
   PreparedStatement z;

    public Datos() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            p=DriverManager.getConnection("jdbc:mysql://localhost:3306/empresas", "root", "");
            System.out.println("Se conecto correctamente la base de datos");
        } catch (Exception e) {
            
            System.out.println("Error no se conecto a la base de datos"+e);
        }
    }
    
   public int registraPro(String a,String b,String c){
       int f=0;
          try {
           z=p.prepareStatement("insert into producto values(?,?,?)");
           z.setString(1, a);
           z.setString(2, b);
           z.setString(3, c);
           
           f=z.executeUpdate();
           
              System.out.println("Registro Correcto");
           
       } catch (Exception e) {
              System.out.println("Error no se registro"+e);
       }
         
       return f;
   }
   
   
   
   
    
    
}
