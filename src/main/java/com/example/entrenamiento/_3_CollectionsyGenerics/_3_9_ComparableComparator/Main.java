package com.example.entrenamiento._3_CollectionsyGenerics._3_9_ComparableComparator;

import org.apache.logging.log4j.util.PropertySource;
import org.apache.logging.log4j.util.Supplier;

import java.util.*;

class Empresa implements Comparator<Empresa>,Comparable<Empresa> {
    String name;
    int ingresos;
    Integer empleados;

    public Empresa(String name, Integer ingresos, int empleados) {
        this.name = name;
        this.ingresos = ingresos;
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "name='" + name + '\'' +
                ", ingresos=" + ingresos +
                ", empleados=" + empleados +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getIngresos() {
        return ingresos;
    }

    public Integer getEmpleados() {
        return empleados;
    }

    @Override
    public int compare(Empresa o1, Empresa o2) {
        return o2.getIngresos()-o1.getIngresos();
    }

    @Override
    public int compareTo(Empresa o) {
        return ingresos - o.getIngresos();
    }


}
public class Main {
    public static void main(String[] args) {
        List<Empresa> empresaList = new ArrayList<>();
        empresaList.add(new Empresa("Audi",4242,101));
        empresaList.add(new Empresa("Ford",123,1121));
        empresaList.add(new Empresa("Nike",4242,78151));
        empresaList.add(new Empresa("Apple",1223,341051));
        empresaList.add(new Empresa("Google",5813,80051));
        empresaList.add(new Empresa("Samsung",4242,9151));
        empresaList.add(new Empresa("Adidas",9813,71001));
        empresaList.add(new Empresa("Nokia",12313,6151));
        Comparator comparator = new Comparator<Empresa>() {
            @Override
            public int compare(Empresa o1, Empresa o2) {
                return o1.getEmpleados().compareTo(o2.getEmpleados());
            }
        };

        Collections.sort(empresaList);
        empresaList.stream().forEach(x-> System.out.println(x.toString()));
        System.out.println("Ordenada con 2 condiciones");
        empresaList.stream().sorted(Comparator.comparing(Empresa::getIngresos).thenComparing(Empresa::getEmpleados)).forEach(x-> System.out.println(x.toString()));
        List<Integer> list = new Vector<>();

        Vector<String> vector = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(Collections.binarySearch(list,6));

    }

    public static class Compar implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    }

}
