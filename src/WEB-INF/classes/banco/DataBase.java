package banco;
import java.sql.*;
import javax.swing.*;
import java.util.*; 

public class DataBase{
	private static Connection con;
    private static String drive,url,usuario,senha;
    
    public DataBase() 
    {
    	drive = "org.postgresql.Driver";
    	usuario = "postgres";
        senha = "postgres";
    	url = "jdbc:postgresql://localhost:5432/CelularJava";
    }

    public static void conectar()
    {
        try {
            con = DriverManager.getConnection(url,usuario,senha);
            Class.forName(drive);
        } 
        catch (Exception ex) {
            System.out.println(null,"Erro para conectar\n" + ex.getMessage());
        }
    }
    protected static void desconectar()
    {
        try{
            con.close();
        }
        catch(Exception ex){
            System.out.println(null,"Erro para desconectar\n" + ex.getMessage());
        }        
    }
    
    protected static Connection getCon(){
    	return con;
    }

    protected static PreparedStatement prepareStatement(String frase_sql){
        try{
            return con.prepareStatement(frase_sql);
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
}
