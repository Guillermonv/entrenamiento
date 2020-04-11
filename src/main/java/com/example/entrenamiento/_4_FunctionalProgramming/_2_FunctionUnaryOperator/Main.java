package com.example.entrenamiento._4_FunctionalProgramming._2_FunctionUnaryOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

class Persona {
    String name;
    String lasTname;
    int age;
    String empleo;

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lasTname='" + lasTname + '\'' +
                ", age=" + age +
                ", empleo='" + empleo + '\'' +
                '}';
    }

    public Persona(String name, String lasTname, int age, String empleo) {
        this.name = name;
        this.lasTname = lasTname;
        this.age = age;
        this.empleo = empleo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLasTname(String lasTname) {
        this.lasTname = lasTname;
    }

    public String getName() {
        return name;
    }

    public String getLasTname() {
        return lasTname;
    }

    public int getAge() {
        return age;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    public String getEmpleo() {
        return empleo;
    }


}

public class Main {
    public static void main(String[] args) {
        Function<Persona, String> function = x -> x.getName().concat(" ").concat(x.getLasTname());
        System.out.println(function.apply(new Persona("Jhon", "Doe", 34, "Dev")));

        BiFunction<Persona, Persona, String> getNameOfOlderPerson = (x, y) -> {
            if (x.getAge() > y.getAge()) return x.getName();
            else return y.getName();
        };

        String result = getNameOfOlderPerson.apply(new Persona("Mirtha","Legand",81,"Conductura"),
                new Persona("Moria","Casan",68,"Actriz"));

        System.out.println(result);

        UnaryOperator<Persona> promote = x->{ x.setEmpleo(" Sr  Dev");return x;};

        Persona result2 = promote.apply(new Persona("Jhon ","Doe",43,"dev mid level"));

        System.out.println(result2.toString());
    }
}
