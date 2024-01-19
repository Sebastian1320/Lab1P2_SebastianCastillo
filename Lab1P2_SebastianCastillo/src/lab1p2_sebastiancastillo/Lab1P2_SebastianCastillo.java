/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_sebastiancastillo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Asus
 */
public class Lab1P2_SebastianCastillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerc = new Scanner(System.in);
        System.out.println("***** M E N U *****");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Listar Todo");
        System.out.println("3. Listar por Dominio");
        System.out.println("4. Salir");
        int op = leer.nextInt();
        Date nacimiento;
        ArrayList<Lista> Lista=new ArrayList<>();
        
        while (op != 4) {
            switch (op) {
                case 1:
                    System.out.println("Ingrese su fecha de nacimiento en el formato de MM/dd/yyyy");
                    nacimiento =new Date(leer.next());                  
                    int año=nacimiento.getYear();
                    if(año>111){
                        System.out.println("No puede crear la cuenta");
                        break;
                    }
                    System.out.println("Ingrese el correo"); 
                    String correo=leerc.next();
                    System.out.println("Ingrese La contraseña"); 
                    String contra=leerc.next();
                    Lista listado=new Lista(contra,correo,nacimiento);
                    Lista.add(listado);
                    break;
                case 2:
                    for (int i = 0; i < Lista.size(); i++) {
                        Lista.get(i).toString();
                        System.out.println(i+". "+Lista.get(i).toString());
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Outlook");
                    System.out.println("Gmail");
                    System.out.println("Yahoo");
                    System.out.println("iCloud");
                    System.out.println("ProtonMail");
                    System.out.println("FastMail");
                    break;
                default:
                    System.out.println("Eliga un opcion valida");
                    break;
            }
            System.out.println("***** M E N U *****");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Listar Todo");
            System.out.println("3. Listar por Dominio");
            System.out.println("4. Salir");
            op = leer.nextInt();
        }
    }

}
