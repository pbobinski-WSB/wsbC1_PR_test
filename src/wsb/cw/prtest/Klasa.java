package wsb.cw.prtest;

public class Klasa {

    private int pole = 1;

    public Klasa(int pole) {
        this.pole = pole;
    }

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "pole=" + pole +
                '}';
    }
}
