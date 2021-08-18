/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_pkg;

/**
 *
 * @author Diego Corrales
 */
public class DataDB {
    private int idOwner;
    private String owner;
    private int idHospital;
    private String hospital;

    public DataDB() {
        this.idOwner = 0;
        this.owner = "";
        this.idHospital = 0;
        this.hospital = "";
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    
    
}
