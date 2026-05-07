package ito.poo;
public class App {
    static Mascota mascota;

    static void run(){
        mascota= new Mascota("satur",2,"perro","chihuahua");
        System.out.println(mascota);
        mascota.cumpleAños();
        System.out.println("Despues de cumplir años:"+mascota);
    }
    public static void main (String[] args){run();}
}
