package ejemploMD5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "HolaMundo";
		
		Ejemplo.getMD5("12345");
		
		System.out.println(Ejemplo.getMD5(clave));
		System.out.println(Ejemplo.getMD5("12345"));
		System.out.println(Ejemplo.getMD5(clave));
		System.out.println(Ejemplo.getMD5("12345"));
	}

}
