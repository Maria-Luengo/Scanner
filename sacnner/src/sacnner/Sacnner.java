/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacnner;

import java.util.Scanner;

/**
 *
 * @author Maria333
 */
public class Sacnner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sn.nextLine();
        System.out.println("Introduce tu apellido: ");
        String apellido = sn.nextLine();
        System.out.println("Bienvenid@ " + nombre + " " + apellido);
    }
    
}
