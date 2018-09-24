package model;

public class Person {
    private String navn;

    public Person(String navn) {
        setNavn(navn);
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return navn;
    }
}
