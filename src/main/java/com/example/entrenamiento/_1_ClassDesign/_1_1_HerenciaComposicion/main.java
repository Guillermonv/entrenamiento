package com.example.entrenamiento._1_ClassDesign._1_1_HerenciaComposicion;

class Persona {
    String name;
}

class Trabajador extends Persona {
    String empresa;

    public void render() {
        System.out.println("Nombre : " + "Trabaja en : " + name);
    }

}

class Skills extends Persona {
    String habilidades = "java";
    Trabajador trabajador = new Trabajador();

    public void render() {
        trabajador.empresa = "Pepsi";
        name = "Guille";
        System.out.println("Nombre : " + name + " empresa : " + trabajador.empresa + " sus hablidades son " + habilidades);
    }
}

public class main {
    public static void main(String[] args) {
        Skills skills = new Skills();
        skills.render();

    }
}
