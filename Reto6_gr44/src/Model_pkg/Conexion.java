/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diego Corrales
 */
public class Conexion {
    Connection connection;
    
    public Conexion(){
    try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto6_g44", "root", "");
       if (connection != null) {
            System.out.println("Conexión Exitosa");
           }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexión Fallida");
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
    

