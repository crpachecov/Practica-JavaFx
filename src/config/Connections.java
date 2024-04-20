package config;

//import java.sql.Connection;
import java.sql.DriverManager;

public class Connections {
    Connections con;
    
    public Connections(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //con = DriverManager.getConnection("");
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public Connections getConnection(){
        return con;
    }
    
}
