
public class Carrera1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubc1= new Coche ();
		Coche c1 = new Coche((int)(Math.random()*10),(int)(Math.random()*10));
		Coche c2 = new Coche((int)(Math.random()*10),(int)(Math.random()*10));
		System.out.println("c1 Posicicion: " + c1.verPosicion() +" Velocidad: " + c1.verVelocidad());
		System.out.println("c2 Posicicion: " + c2.verPosicion() +" Velocidad: " + c2.verVelocidad());
		for (int i=0;i<10;i++) {	
			c1.avanzar_velocidad();
			c2.avanzar_velocidad();
			System.out.println("Vuelta "+i);
			System.out.println("--------");
			System.out.println(" Posicicion c1: " + c1.verPosicion());
			System.out.println(" Posicicion c2: " + c2.verPosicion());
			if (c1.verPosicion()>c2.verPosicion()) 
				System.out.println("c1 va primero");
			else { 
				if (c1.verPosicion()< c2.verPosicion())
					System.out.println("c2 va primero");
				else System.out.println("Van empatados");
				}
					
			System.out.println("-----------------");
		}
	}

}
