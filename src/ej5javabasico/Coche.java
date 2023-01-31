
package ej5javabasico;

public class Coche {
    
    String marca;
    String modelo;
    float cilindrada;
    int cantPuertas;

    public Coche() {
    }

    public Coche(String marca, String modelo, float cilindrada, int cantPuertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", cantPuertas=" + cantPuertas + '}';
    }
           
}
