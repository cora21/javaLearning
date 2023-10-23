import javax.swing.*;
public class bucles {
    public static void main(String[] args) {
    //todo sobre los bucles:
    //bucles indeterminados while y do while -  no sabes cuantas veces se va a repetir en el transcurso de la ejecucion del programa
    //bucles determinados for - foreach - si sabemos cuantas veces se va a repetir normalmente nosotros elejimos o dependiendo del programa
    
    String clave = "obra";
    String pass = "";
    // en este caso evaluamos que la clave y contrasena sean iguales para que el programa continue su ejecucion, hasta que no se coloque la contraseña correcta no saldremos del bucle while
    while (clave.equals(pass) == false){
        pass = JOptionPane.showInputDialog("Introduce la contraseña: ");
        if (clave.equals(pass)==false){
            System.out.println("La contrasena es incorrecta");
        }
    }
    System.out.println("Contrasena correcta, bienvenido al sistema.");






    
}

}
