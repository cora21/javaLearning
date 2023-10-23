import javax.swing.*;
public class bucles {
    public static void main(String[] args) {
    //todo sobre los bucles:
    //bucles indeterminados while y do while -  no sabes cuantas veces se va a repetir
    //bucles determinados for - foreach - si sabemos cuantas veces se va a repetir
    
    String clave = "obrayan";
    String pass = "";

    while (clave.equals(pass) == false){
        pass = JOptionPane.showInputDialog("Introduce la contraseña: ");
        if (clave.equals(pass)==false){
            System.out.println("La contrasena es incorrecta");
        }
    }
    System.out.println("Contrasena correcta, bienvenido al sistema.");






    
}

}
