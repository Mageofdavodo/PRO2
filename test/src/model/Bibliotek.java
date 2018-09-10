package model;



public class Bibliotek {
    public Bibliotek() {
    }

    /*
     * * Returnerer størrelsen af bøden beregnet i henhold til skemaet * ovenfor
     * * krav: beregnetDato < faktiskDato * (beregnetDato er forventet
     * afleveringsdato og * faktiskDato er den dag bogen blev afleveret; voksen
     * er * sand, hvis det er en voksen og falsk ellers)
     */
    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {

        if (beregnetDato.isAfter(faktiskDato)) {
            throw new RuntimeException();
        }
        return 0;
    }
}
