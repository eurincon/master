
class Coche {

 private int velocidad;
 private int posicion;
	
	 Coche() {
		velocidad=0;
		posicion=0;
	}
	 Coche (int velocidad, int posicion) {
		this.velocidad=velocidad;
		this.posicion=posicion;
		
	}
	Coche (int posicion) {
			this.posicion=posicion;
			this.velocidad=1;
			
	}
	
	public void avanzar_uno() {
		posicion++;
		
	}
	 public void avanzar_velocidad() {
		posicion+=velocidad;
	}
	 public int verPosicion() {
		 return posicion;
	 }
	 public int verVelocidad() {
		 return velocidad;
	 }
}
