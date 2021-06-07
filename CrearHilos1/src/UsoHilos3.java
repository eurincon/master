
//Uso dos hilos con 
class UsoHilos3{
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");

        //Primero, construye un objeto MiHilo.
        MiHilo2 mh1=new MiHilo2("#1");
        MiHilo2 mh2=new MiHilo2("#2");


        //Luego, construye un hilo de ese objeto.
        Thread hilo1=new Thread(mh1);
        Thread hilo2=new Thread(mh2);
        
    
        //Finalmente, comienza la ejecución del hilo.
        hilo1.start();
        hilo2.start();

        for (int i=0; i<50;i++){
            System.out.print(" .");
        }try{
            Thread.sleep((int)(Math.random()*1000));
        }catch (InterruptedException exc){
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }
}