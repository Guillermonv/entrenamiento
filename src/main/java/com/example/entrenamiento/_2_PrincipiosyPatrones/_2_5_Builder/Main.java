package com.example.entrenamiento._2_PrincipiosyPatrones._2_5_Builder;

class Auto{
    String color;
    String marca;
    String modelo;
    int kilometros;
    int velocidadmaxima;
    int cantidadCombustible;

    static class Autobuilder{
        String color;
        String marca;
        String modelo;
        int kilometros;
        int velocidadmaxima;
        int cantidadCombustible;

        public Autobuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Autobuilder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Autobuilder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Autobuilder setKilometros(int kilometros) {
            this.kilometros = kilometros;
            return this;
        }

        public Autobuilder setVelocidadmaxima(int velocidadmaxima) {
            this.velocidadmaxima = velocidadmaxima;
            return this;
        }

        public Autobuilder setCantidadCombustible(int cantidadCombustible) {
            this.cantidadCombustible = cantidadCombustible;
            return this;
        }
        Auto build(){
            return new Auto(color,marca,modelo,kilometros,velocidadmaxima,cantidadCombustible);
        }
    }
    public Auto(String color, String marca, String modelo, int kilometros, int velocidadmaxima, int cantidadCombustible) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.velocidadmaxima = velocidadmaxima;
        this.cantidadCombustible = cantidadCombustible;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometros=" + kilometros +
                ", velocidadmaxima=" + velocidadmaxima +
                ", cantidadCombustible=" + cantidadCombustible +
                '}';
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

public class Main {
    public static void main(String[] args) {
        Auto autonumero1 = new Auto.Autobuilder().setCantidadCombustible(100).setColor("Red").build();
        System.out.println(autonumero1.toString());
        autonumero1.setMarca("BMV");
        System.out.println(autonumero1.toString());

    }
}
