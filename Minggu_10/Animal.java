/*
File    : Animal.java
Nama    : Hanif Herofa
NIM     : 24060122120015
 */

package Minggu_10;

public abstract class Animal {
    
    public abstract void Eat();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}