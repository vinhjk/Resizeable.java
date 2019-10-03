public class Square extends Shape implements Resizeable {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", Which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side += this.side * percent;
    }
}
