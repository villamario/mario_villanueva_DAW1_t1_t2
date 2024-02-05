import model.Carrera;
import model.Coche;

public class Entrada {
    public Entrada() {
    }

    public static void main(String[] args) {
        Coche coche0 = new Coche();
        Coche coche1 = new Coche("ford","focus","1134CYW",2261, 95, 0, 0);
        Coche coche2 = new Coche("Hyundai","i30","5647LYW",1998, 186, 0, 0);
        Carrera carrera = new Carrera();
        System.out.println("coche 1 🚗");
        coche1.mostrarDatos();
        System.out.println();

        System.out.println("coche 2 🚙");
        coche2.mostrarDatos();
        System.out.println();

        System.out.println("Empieza la carrera 🚥");
        carrera.iniciarCarrera(coche1, coche2);
    }
}
