package org.iesvdm.ejercicio4.model;

import lombok.NonNull;

public class Worker {

    private String name;

    public void setName(@NonNull Person p){
        this.name=p.getName();
    }

    public String getName(){
        return name;
    }

}

