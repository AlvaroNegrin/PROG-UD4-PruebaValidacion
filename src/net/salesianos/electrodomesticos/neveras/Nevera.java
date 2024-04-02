package net.salesianos.electrodomesticos.neveras;

import net.salesianos.electrodomesticos.Electrodomestico;

public class Nevera extends Electrodomestico {

    private int temperatura;

    public Nevera(String marca, String modelo, float peso, int potencia, int temperatura) {
        super(marca, modelo, peso, potencia);
        this.temperatura = temperatura;
    }

    @Override
    public void encenderElectrodomestico() {
        this.estaEncendida = true;
        System.out.println("¡Ños, fuerte pelete!");
    }

    public String toString() {
        String estado = "";
        if (estaEncendida) {
            estado = "Si";
        } else {
            estado = "No";
        }
        return "\n------------------------------------\n*Tipo de electrodoméstico: Nevera.\n*Marca: " + marca +
                "\n*Modelo: " + modelo +
                "\n*Peso: " + peso + "kg" +
                "\n*Potencia: " + potencia + "kW" +
                "\n*Temperatura: " + temperatura + "ºC" +
                "\n*Está encendido: " + estado + "\n------------------------------------";
    }
}
