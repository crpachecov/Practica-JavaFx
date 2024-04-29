package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {

    String bd = "spa_unad";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "Root:@X5RH9R";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection con;

    public Connection conectar() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url + bd, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

