package org.example;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("DESKTOP OBJECT CRAETED");

    }

    @Override
    public void compile(){
        System.out.println("Compiling using laptop");
    }
}
