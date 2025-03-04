package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value = "Data not available";

    public JobField(){
        id= nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        if (value.isEmpty()) {
            this.value = "Data not available";
        } else {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
