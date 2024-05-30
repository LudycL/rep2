package org.example;
import java.util.ArrayList;
import java.util.List;

class Camera {
    private int numero;
    private boolean prenotata;

    public Camera(int numero) {
        this.numero = numero;
        this.prenotata = false;
    }

    public boolean isPrenotata() {
        return prenotata;
    }

    public void setPrenotata(boolean prenotata) {
        this.prenotata = prenotata;
    }

    // Metodi getters e setters
}