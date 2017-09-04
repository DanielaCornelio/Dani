
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class S09ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
    
    System.out.print("Ingrese la distancia entre el centro del pentagono a uno de sus vertices : ");
    double r=input.nextDouble();
    
    double s =(2* r) * Math.sin(Math.PI / 5);
    double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
    
    System.out.println("el area del pentagono es: " +  area);
        // TODO code application logic here
    }
    
}
