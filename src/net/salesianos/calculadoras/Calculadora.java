package net.salesianos.calculadoras;

public class Calculadora {

    public static int sumarCuadradosN(int numero) {
        int resultado = 0;
        for (int i = 1; i <= numero; i++) {
            resultado += i * i;
        }
        return resultado;
    }

    public static float calcularNotaMedia(final int[] NOTAS) {
        float resultado = 0;
        for (int i = 0; i < NOTAS.length; i++) {
            resultado += NOTAS[i];
        }
        resultado = resultado / NOTAS.length;
        return resultado;
    }
}
