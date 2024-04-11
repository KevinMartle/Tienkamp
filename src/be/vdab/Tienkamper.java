package be.vdab;

import java.util.Objects;

public class Tienkamper implements Comparable<Tienkamper> {
    private String naam;
    private int punten;

    public Tienkamper(String naam, int punten){
        setNaam(naam);
        setPunten(punten);

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if(naam!=null) {
            this.naam = naam;
        }

    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        if(punten>= 0) {
            this.punten = punten;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tienkamper that)) return false;
        return punten == that.punten && Objects.equals(naam, that.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(naam);
    }

    @Override public String toString(){
        return getNaam() +" "+ getPunten();
    }

    @Override
    public int compareTo(Tienkamper o) {
        return naam.compareTo(o.getNaam());
    }


}
