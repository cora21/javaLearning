//TIPOS PRIMITIVOS
//los tipos de datos en java son 8 en total
// int es usado hasta 2 millones: short hasta 32000: y por ultimo es 5000M; el byte es hasta 127 todos en negativos
//los numeros decimales son float debe llevar el sufijo F; y el double puedes tener muchos decimales hasta 15
// char representa los caracteres
//datos logicos true and false

public class Tipo{
    public static void main(String args[]){
        byte edad;
        edad = 21;
        byte edad2 = 25;
        System.out.println(edad + " "+ edad2);
        edad = 35;
        System.out.println(edad);
        int a, b, c;
        a = 10;
        b = 5;
        c = a+b;
        System.out.println(c);
        c++;
        System.out.println(c);
        c+=4;
        System.out.println(c);
        c-=10;
        System.out.println(c);
        //para declarar varibles constante se declara normalmente pero son la palabra final asi se hacen las constante
        final int r = 18;
        System.out.println(r);

        //ejercicio de conversion
        final double apulgadas = 2.54;
        double cm = 6;
        double resultado;
        resultado = apulgadas * cm;
        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
        

    }
    


}
