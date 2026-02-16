package com.cursojavaadvanced.app.services;

import com.cursojavaadvanced.domain.registros.Punto;

public class PuntoService {

    public void usePunto() {
        Punto punto = new Punto(10.0,20.0);
        System.out.println("X: " + punto.x());
        System.out.println("Y: " + punto.y());
    }

}
