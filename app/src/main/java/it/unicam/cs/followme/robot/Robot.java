package it.unicam.cs.followme.robot;

import it.unicam.cs.followme.app.Posizione;

public class Robot {

    private Posizione posizione;

    private Posizione destinazione;

    private double velocita;


    public Robot() {
        this.posizione = new Posizione(Math.random(), Math.random());
        this.destinazione = null;
        this.velocita = 0.0;
    }

    public Posizione getPosizione() {
        return posizione;
    }

    public void setPosizione(Posizione posizione) {
        this.posizione = posizione;
    }

    public Posizione getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(Posizione destinazione) {
        this.destinazione = destinazione;
    }

    public double getVelocita() {
        return velocita;
    }

    public void setVelocita(double velocita) {
        this.velocita = velocita;
    }
}
