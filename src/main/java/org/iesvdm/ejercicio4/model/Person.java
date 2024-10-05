package org.iesvdm.ejercicio4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private int age;
    private String gender;
    private String address;

}