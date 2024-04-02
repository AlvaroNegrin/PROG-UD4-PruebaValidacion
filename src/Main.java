import net.salesianos.calculadoras.Calculadora;
import net.salesianos.electrodomesticos.microondas.Microondas;
import net.salesianos.electrodomesticos.neveras.Nevera;

public class Main {
    public static void main(String[] args) throws Exception {

        // Ejercicio1

        System.out.println(Calculadora.sumarCuadradosN(3));
        System.out.println(Calculadora.sumarCuadradosN(6));
        System.out.println(Calculadora.sumarCuadradosN(73));

        System.out.println(Calculadora.calcularNotaMedia(new int[] { 10, 4, 6, 1, 7 }));
        System.out.println(Calculadora.calcularNotaMedia(new int[] { 4, 7, 9, 2, 3, 7, 8 }));

        // Ejercicio2

        Microondas microondas1 = new Microondas("QuemaComida", "DW2323F", 50, 200, false);
        Nevera nevera1 = new Nevera("CongelaComida", "DED3334F", 300, 800, 5);

        microondas1.encenderElectrodomestico();
        nevera1.encenderElectrodomestico();

        System.out.println(microondas1.toString());
        System.out.println(nevera1.toString());

        microondas1.apagarElectrodomestico();
        nevera1.apagarElectrodomestico();

        System.out.println(microondas1.toString());
        System.out.println(nevera1.toString());
    }
}
