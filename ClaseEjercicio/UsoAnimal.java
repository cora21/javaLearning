package poo2;

public class UsoAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal leon = new Animal("leon", "carni");
		System.out.println("el nombre del animal es : "+ leon.nombre);
		System.out.println("el tipo del animal es : "+ leon.tipo);
		//un segundo objeto o instancia
		Animal perro = new Animal("perro", "terres");
		System.out.println("el nombre del animal es : "+ perro.nombre);
		System.out.println("el tipo del animal es : "+ perro.tipo);
	}

}
