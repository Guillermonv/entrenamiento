package com.example.entrenamiento._1_ClassDesign._8_NestedClasses;



/* Innter Classes
pueden ser pubilicas protected default o private
pueden extender e implemetar cualquier clase
pueden ser abstract o final
no puede declarar metodos o valores estaticos
puede acceder a atriutos de la clase padre
*/

class Persona {
    private String name = "Juan";

    private class Deporte {
        int a;
        String deporte = "Boxeo ";

        void printNombreyDeporte() {
            System.out.println("La persona  " + name + "practica el deporte " + deporte);
        }
    }

    void getPersonayDeporte() {
        Deporte deporte = new Deporte();
        deporte.printNombreyDeporte();
    }
}

/* Local clases
no tienen modifcadores de acceso
no pueden ser static y no pueden tener atributos static
tienen acceso a todos los abritutos y metodos de la clase padre
no tienen acceso a las variables locales a menos que sean finales
*/

class Outter {
    int valor = 10;

    void operar() {
        int valor2 = 10;
        class mutiplicar {
            void action() {
                System.out.println("El resultado es " + valor2 * valor);
            }
        }
        mutiplicar mutiplicar = new mutiplicar();
        mutiplicar.action();
    }
}

/*Anonimus Inner Class
requieren extender una clase o implementar una interfefaz
pueden estar dentro de una metodo */
class Compras {
    abstract class ofertas {
        void ofertasdePastas() {
            System.out.println("2x1 en pastas la abuela");
        }

        abstract void ofertasDeBebidas();
    }

    ofertas ofertaDelDia = new ofertas() {
        @Override
        void ofertasDeBebidas() {
            System.out.println("% 50 descuento en juegos");
        }
    };
}

/*static neted class
puede tener cualquier modficador de acceso
la clase que contiene esta clase puede acceder a sus metodos o attributos sin hacer una instancia
*/

public class main {
    static class ejemplo {
        String user = "USername";
    }

    public static void main(String[] args) {
        // NESTED CLASES (INNER CLASES)
        Persona personaydeporte = new Persona();
        personaydeporte.getPersonayDeporte();


        //LOCAL INNER CLASES
        Outter outter = new Outter();
        outter.operar();

        //CALSES ANONIMAS
        Compras.ofertas ofertas = new Compras().new ofertas() {
            @Override
            void ofertasDeBebidas() {
                System.out.println("% 10 de descuento en cervezas");
            }
        };
        ofertas.ofertasdePastas();
        ofertas.ofertasDeBebidas();

        //STATIC INNER CLASS
        ejemplo ejemplo = new ejemplo();
        System.out.println("el user es " + ejemplo.user);


    }
}
