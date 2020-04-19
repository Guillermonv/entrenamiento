package com.example.entrenamiento._4_FunctionalProgramming._3_SteamsTerminalOperations;

import java.util.*;
import java.util.stream.Stream;

class User {
    String name;
    String pass;
    String type;
    Integer age;
    List<String> AllowedPlaces;
    boolean active;

    public User(String name, boolean active, String type, Integer age) {
        this.name = name;
        this.type = type;
        this.active = active;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", AllowedPlaces=" + AllowedPlaces +
                ", active=" + active +
                '}';
    }
}


public class Main {

    public static void main(String[] args) {
        List<User> usersList = Arrays.asList(
                new User("Ana", true, "Normal", 42),
                new User("Maria", false, "Pro", 31),
                new User("Mike", false, "Pro", 16),
                new User("Antonio", true, "Normal", 24),
                new User("Jon".concat(" doe"), true, "Pro", 68));

       /* Optional<User> user1 = usersList.stream().findAny();
        System.out.println("GET CUALQUIER USER : " + user1.toString());
        User user2 = usersList.stream().findFirst().get();
        System.out.println("ENCUENTRO EL USER POR ORDER : " + user2.toString());
        usersList.stream().forEach(x -> System.out.println(x.toString()));*/

/*        System.out.println(usersList.stream().allMatch(x-> x.active));
        System.out.println(usersList.stream().anyMatch(x-> x.active));
        System.out.println(usersList.stream().noneMatch(x-> x.active));
*/
/*
        Optional<User> user3 = usersList.stream().max(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println("ORDER By Age (MAX) Length" + user3.get().toString());
        Optional<User> user4 = usersList.stream().min(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println("ORDER By Age (Min) Length" + user4.get().toString());
        long qty = usersList.stream().count();
        System.out.println("QTY OF USERS " + qty);
*/
/*
        Predicate<User> isActive = x -> x.active;
        Map<Boolean, List<User>> user6 = usersList.stream().collect(Collectors.partitioningBy(x-> x.active));
        System.out.println("List convertida a MAP (PartitionBy) users acitvos y no");
        user6.forEach((y, x) -> System.out.println(y + " " + x.toString()));

        Set<User> userSet = usersList.stream().collect(Collectors.toSet());
        System.out.println("Print List converted to SET");
        userSet.stream().forEach(x -> System.out.println(x.toString()));
*/
           /* Map<String,List<User>> usermap= usersList.stream().collect(Collectors.groupingBy(x->x.type));
            System.out.println("PRINT GROUPD BY TYPE ");
            usermap.forEach((x,y)-> System.out.println(x + "-" +y.toString()));
*/
         /*  System.out.println("MAP DONDE PONGO QUE VA POR KEY Y VALUE");
           usersList.stream().collect(Collectors.toMap(x->x.name,x->x.active)).forEach((x,u)-> System.out.println(x +"-"+ u));

          */
          /*  System.out.println("AGRUPADO POR USARIO ACTIVO Y NO ACTIVO Y TIPO DE USER");
            Map<String,Map<Boolean,List<User>>> usersmap = usersList.stream().collect(Collectors.groupingBy(x->x.type,Collectors.groupingBy(x->x.active)));
            usersmap.forEach((x,y)-> System.out.println( x + " " +y));
*/
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 41, 2, 455);
        Integer valor = integerStream.reduce(10, (x, y) -> x + y);
        System.out.println(valor);
        Stream<String> stringStream = Stream.of("Palabra", "Palabra2", "palabra21", "test", "data");

    }
}


