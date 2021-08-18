/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_pkg;

/**
 *
 * @author Diego Corrales
 */
public class ItemHospital {
    private int idHospital;
    private String Hospital;

    public ItemHospital(int idHospital, String Hospital) {
        this.idHospital = idHospital;
        this.Hospital = Hospital;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }
    
    @Override
    public String toString(){
        return getHospital();
    }
}
