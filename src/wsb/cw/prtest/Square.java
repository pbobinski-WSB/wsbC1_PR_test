package wsb.cw.prtest;

public class Square {
    private double sideSize;

    public Square(int sideSize) {
        this.sideSize = sideSize;
    }

    public double calculateArea() {
        return sideSize * sideSize;
    }

    public double calculateDiagonal() {
        return Math.sqrt(sideSize * calculateArea());
    }

    public double calculatePerimetr() {
        return sideSize * 4;
    }

    public double calculateInscribedCircle() {
        return sideSize / 2;
    }

    public double calculateCircumscribedCircle() {
        return calculateDiagonal() / 2;
    }

}
