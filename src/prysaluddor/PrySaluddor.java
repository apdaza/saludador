/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prysaluddor;

import java.util.Scanner;
import prysaluddor.logica.Formal;
import prysaluddor.logica.*;
import prysaluddor.logica.Semiformal;

/**
 *
 * @author Estudiantes
 */
public class PrySaluddor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cómo desea ser saludado?");
        System.out.println("1. saludo formal");
        System.out.println("2. saludo semiformal");
        System.out.println("3. saludo informal");
        int opcion = sc.nextInt();
        System.out.print("ingrese su nombre: ");
        String nombre = sc.next();
        Saludo s;
        switch(opcion){
            case 1:
                s = new Formal();
                break;
            case 2:
                s = new Semiformal();
                break;
            default:
                s = new Informal();
                break;
        }
        s.setNombre(nombre);
        s.saludar();
        
    }
    
}
