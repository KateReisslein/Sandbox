package org.example.inheritance;

public interface Animal {

    void eat();
    void reproduce();
    void breathe();

    public default String walk(){
        return "I'm walking";
    }
}
