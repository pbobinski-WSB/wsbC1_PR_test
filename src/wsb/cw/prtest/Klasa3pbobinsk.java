package wsb.cw.prtest;

import java.util.Objects;

public class Klasa3pbobinsk {

    private String pole = "Pole";

    public String getPole() {
        return pole;
    }

    public Klasa3pbobinsk(String pole) {
        this.pole = pole;
    }

    public void setPole(String pole) {
        this.pole = pole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klasa3pbobinsk that = (Klasa3pbobinsk) o;
        return Objects.equals(pole, that.pole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pole);
    }

    @Override
    public String toString() {
        return "Klasa3pbobinsk{" +
                "pole='" + pole + '\'' +
                '}';
    }
}
