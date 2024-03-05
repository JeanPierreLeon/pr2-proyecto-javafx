package co.edu.uniquindio.moto.motoapp.model;

public class Moto {
    private String marca;
    private String modelo;
    private String color;
    private int cilindrada;

    public Moto() {
    }

    public Moto(String marca,
                String modelo,
                String color,
                int cilindrada){
        this.marca = marca;
        this.modelo = marca;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    // public static MotoBuilder builder(){ return  new MotoBuilder();}

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }
}
