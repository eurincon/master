//Crea un hilo implementando Runnable.
//El tiempo dormido es aleatorio entre 0 y 400 milisegundos
//Los objetos de MiHilo se pueden ejecutar en sus propios hilos
// porque MiHilo implementa Runnable.
//
 class MiHilo2 implements Runnable {
    String nombreHilo;

    MiHilo2(String nombre){
        nombreHilo=nombre;
    }
    //Punto de entrada del hilo
    //Los hilos comienzan a ejecutarse aquí
    public void run(){
        System.out.println("Comenzando "+nombreHilo);
        try {
            for (int contar=0; contar<10; contar++){
                Thread.sleep((int)(400*Math.random()));
                System.out.println("En "+nombreHilo+", el recuento "+contar);
            }
        }catch (InterruptedException exc){
            System.out.println(nombreHilo + "Interrumpido.");
        }
        System.out.println("Terminando "+nombreHilo);
    }
}