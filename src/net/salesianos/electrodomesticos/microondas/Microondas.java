package net.salesianos.electrodomesticos.microondas;

import net.salesianos.electrodomesticos.Electrodomestico;

public class Microondas extends Electrodomestico {

    private boolean puertaAbierta;

    public Microondas(String marca, String modelo, float peso, int potencia, boolean puertaAbierta) {
        super(marca, modelo, peso, potencia);
        this.puertaAbierta = puertaAbierta;
    }

    @Override

    public void encenderElectrodomestico() {
        this.estaEncendida = true;
        System.out.println("Algo huele a quemado");
    }

    public String toString() {
        String posicionPuerta = puertaAbierta ? "Abierta" : "Cerrada";
        String estado = estaEncendida ? "Si" : "No";
        return "\n------------------------------------\n*Tipo de electrodoméstico: Microondas.\n*Marca: " + marca +
                "\n*Modelo: " + modelo +
                "\n*Peso: " + peso + "kg" +
                "\n*Potencia: " + potencia + "kW" +
                "\n*Puerta: " + posicionPuerta +
                "\n*Está encendido: " + estado + "\n------------------------------------";
    }

}
