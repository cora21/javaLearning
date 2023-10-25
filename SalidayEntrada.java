// import java.util.Scanner;
import javax.swing.*; 

public class SalidayEntrada{
    public static void main(String[] args){
        // Scanner entrada=new Scanner(System.in);
        // System.out.println("Introduce tu nombre por favor");
        // String nombre_usuario = entrada.nextLine();
        // System.out.println("Introduce tu edad por favor");
        // int edad = entrada.nextInt();
        // System.out.println("Hola " + nombre_usuario + " tu edad el año que viene sera: " + (edad+1)+ " años ");
        // entrada.close();
        // String nombre_usuario = JOptionPane.showInputDialog("introduce tu nombre por favor: ");
        // String edad = JOptionPane.showInputDialog("introduce tu edad por favor: ");
        // int edad_usuario = Integer.parseInt(edad);
        // System.out.println("hola " + nombre_usuario + " tienes " + edad + " años de edad");
        // System.out.println("hola " + nombre_usuario + " tendras " + (edad_usuario+1) + " años de edad");

        String nombre = JOptionPane.showInputDialog("Por favor introduce un número: ");
        double edad = Double.parseDouble(nombre);
        System.out.print("la raiz cuadrada de " + nombre + " es: " );

        System.out.printf("%1.2f", Math.sqrt(edad));


    }
}