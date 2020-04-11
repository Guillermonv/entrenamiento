package com.example.entrenamiento._3_CollectionsyGenerics._1_ArrayList;

import java.util.ArrayList;
import java.util.List;

class abuelo{

}

class padre extends abuelo{

}
class hijo extends padre{

}
public class Main {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Valor");
        list.add(1);
        list.add(new Object());
        list.add(1, "String");
        list.remove(1);

        //   list.stream().forEach(x-> System.out.println((int)(x)));

        List<String> list1 = new ArrayList<>();
        list.add("String");

        List<? super padre> list2 = new ArrayList<>();
        list.add(new abuelo());
        list.add(new padre());
        list.add(new hijo());

        Main.valor<String> strings = new Main.valor<>();
        strings.setValor("String");


        Main.valor<Integer> ints = new Main.valor<>();
        ints.setValor(1);
        List<Integer> list3 = new ArrayList<>();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(3);
        integerList.add(2);
        System.out.println(integerList.set(3,1)); // en el indice 3 agrega el uno y retorna 3
        integerList.add(1,4);// es un metodo void

    }

   static class valor<T>{
       T valor;

       public void setValor(T valor) {
           this.valor = valor;
       }
       public static <T> T  setValorstatic(T valor) {
           return valor;
       }

       public T getValor() {
            return valor;
        }
    }
}
