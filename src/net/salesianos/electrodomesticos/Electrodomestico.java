package net.salesianos.electrodomesticos;

public class Electrodomestico {
    protected String marca;
    protected String modelo;
    protected float peso;
    protected int potencia;
    protected boolean estaEncendida = false;

    public Electrodomestico(String marca, String modelo, float peso, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void encenderElectrodomestico() {
        this.estaEncendida = true;
    }

    public void apagarElectrodomestico() {
        this.estaEncendida = false;
    }

}
