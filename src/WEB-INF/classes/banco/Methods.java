package banco;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class Methods
{
    private static ResultSet rs;
    private static PreparedStatement ps;
    private static Statement st;

    //cmd.inserir("Class", new String[]{"default","'Cavaleiro'","default"});
    //cmd.inserir("Character", new String[]{"default","'Oslavo'","1", "1"});
    //cmd.alterar("Character", "level", "2", "where name='Oslavo'");
    
    public static Connection getCon(){
    	return DataBase.getCon();
    }
    
    public static void inserir(String frase_sql)
    {
        try
    	{
            DataBase.conectar();
            //System.out.println(null, sql);
    		ps = DataBase.prepareStatement(frase_sql);
    		ps.execute();
    		ps.close();
    	}catch(Exception erro)
    	{
    		System.out.println(null,"Erro!!\n" +erro.getMessage());
    	}
    	finally
    	{
    		DataBase.desconectar();
    	}
    }
    public static void inserir(String tabela, String[] valores)
    {
        try
    	{
            DataBase.conectar();
            String aux = valores[0];
            for(int i = 1; i < valores.length; i++)
                aux += ", " + valores[i];
            String frase_sql = "insert into " + tabela + " values(" + aux + ")";
            //System.out.println(null, frase_sql);
    		ps = DataBase.prepareStatement(frase_sql);
    		ps.execute();
    		ps.close();
    	}catch(Exception erro)
    	{
            System.out.println(null,"Erro!!\n"+erro.getMessage());
        }
    	finally
    	{
            DataBase.desconectar();
    	}
    }
    public static void alterar(String frase_sql)
    {
        try
    	{
            DataBase.conectar();
            //System.out.println(null, frase_sql);
    		ps = DataBase.prepareStatement(frase_sql);
    		ps.execute();
    		ps.close();
    	}catch(Exception erro)
    	{
    		System.out.println(null,"Erro!!\n"+erro.getMessage());
    	}
    	finally
    	{
    		DataBase.desconectar();
    	}
    }
    public static void alterar(String tabela, String campo, String valor, String condicao)
    {
        try
    	{
            DataBase.conectar();
            String frase_sql = "update " + tabela + " set " + campo + " = " + valor + " " + condicao;
            //System.out.println(null, frase_sql);
    		ps = DataBase.prepareStatement(frase_sql);
    		ps.execute();
    		ps.close();
    	}catch(Exception erro)
    	{
    		System.out.println(null,"Erro!!\n"+erro.getMessage());
    	}
    	finally
    	{
    		DataBase.desconectar();
    	}
    }
    public static void deletar(String frase_sql)
    {
        return;
    }
    public static void deletar(String tabela, String[] id)
    {
		try
    	{
                DataBase.conectar();
                String frase_sql = "delete from " + tabela + " where id=";
                int i;
                for(i = 0; i < id.length -1; i++){
                        frase_sql += id[i];
                }
                frase_sql += id[i];
                //System.out.println(null, frase_sql);
    		ps = DataBase.prepareStatement(frase_sql);
    		ps.execute();
    		ps.close();
    	}catch(Exception erro)
    	{
    		System.out.println(null,"Erro!!\n"+erro.getMessage());
    	}
    	finally
    	{
    		DataBase.desconectar();
    	}
    }
    
    public static ArrayList consultar(String frase_sql, String[] campos)
    {
        ArrayList<String> dados = new ArrayList<String>();
    	try
    	{
            DataBase.conectar();
            ps = DataBase.prepareStatement(frase_sql);
            //System.out.println(null, frase_sql);
            rs = ps.executeQuery();
            while(rs.next())//achou
            {
                for(int i = 0; i < campos.length; i++)
                    try{
                        dados.add(rs.getString(campos[i]));
                    }catch(Exception e){
                        dados.add(rs.getString(i+1));
                    }
            }
            //System.out.println(null, dados);
            ps.close();
            rs.close();
            DataBase.desconectar();
            return dados;
    	}catch(Exception erro)
    	{
            System.out.println(null,"Erro para consultar!!\n"+erro.getMessage());
            return dados;    
    	}
    }
}
