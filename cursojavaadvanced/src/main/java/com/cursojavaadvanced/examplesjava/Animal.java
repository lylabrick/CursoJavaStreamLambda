package com.cursojavaadvanced.examplesjava;

class Animal {
    public void hacerSonido() {
        System.out.println("...");
    }
}


class Perro extends Animal {
    //Aca deberia ir @Override, pero no es obligatorio, y si no lo pongo, el compilador no me va a dar error,
    //pero si lo pongo y el metodo no existe en la clase padre, me va a dar error
    public void hacerSonidoo() { // typo en el nombre, pero compila sin error
        System.out.println("guau");
    }
}