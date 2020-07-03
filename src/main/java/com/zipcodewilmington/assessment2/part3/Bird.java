package com.zipcodewilmington.assessment2.part3;

abstract class Bird implements Animal {
    public String move() {
        return "fly";
    }

    public int getSpeed(){
        return 0;
    }

    @Override
    public String color() {
        return "";
    }

    public void setMigrationMonth(String expected) {

    }

    public String getMigrationMonth() {
        return null;
    }
}
