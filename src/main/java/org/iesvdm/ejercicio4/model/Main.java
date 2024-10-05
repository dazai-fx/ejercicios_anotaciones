package org.iesvdm.ejercicio4.model;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();

        p.setName("John");

        Person p2 = Person.builder()
                .name("José")
                .age(25).
                address("ctra de mijas").
                gender("m")
                .build();

        System.out.println(p);
        System.out.println(p2);

        Maths m = new Maths(1,2);

        System.out.println(m.multiply());

        // a efectos practicos lo que hace @Value es similar a @Data pero añadiendo final a la clase

        Worker w = new Worker();

        w.setName(p2);

        System.out.println(p2.getName());
        p2=null;
        // @NonNull sirve para controlar parametros en métodos para evitar introducir null
        // si pones un null salta una excepción
        w.setName(p2);

    }
}
