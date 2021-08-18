/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_pkg;
import Views_pkg.FrameHospital;
import java.security.Principal;


/**
 *
 * @author Diego Corrales
 */
public class Reto6_gr44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexion inst_connect = new Conexion();
        DataModelDB inst_data = new DataModelDB();
        FrameHospital inst_hos = new FrameHospital();
        inst_connect.getConnection();
        inst_hos.setVisible(true);
        inst_data.getOwners(1);
        /*
        Principal int_frame = new Principal();
        int_frame.setVisible(true);*/
    }
    
}
