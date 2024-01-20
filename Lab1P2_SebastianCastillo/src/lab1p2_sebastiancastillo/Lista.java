/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1p2_sebastiancastillo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class Lista {
    private Date nacimiento;
    private String contra;
    private String Correo;
    private SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd");
    
    public Lista(String contra,String Correo,Date nacimiento){
        this.nacimiento=nacimiento;
        this.contra=contra;
        this.Correo=Correo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getContra() {
        return contra;
    }

    public String getCorreo() {
        return Correo;
    }
    

    @Override
    public String toString() {
        return "Fecha: " + sd.format(nacimiento) + ", Contra: " + contra + ", Correo: " + Correo ;
    }
    
}
