package com.company.dip;

public class Match {
    private final Kicks kicks;

    public Match(Kicks adidas) {
        this.kicks = adidas;
    }

    public void playMatch(String model) {
        kicks.boot(model);
    }

    public static void main(String[] args) {
        Kicks adidas = new Adidas();
        Match match = new Match(adidas);
        match.playMatch("Nike");
    }
}
