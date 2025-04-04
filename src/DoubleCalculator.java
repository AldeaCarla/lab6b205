

public class DoubleCalculator extends ACalculator {

    @Override
    public DoubleCalculator init(Object value) {
        if (value instanceof Double) {
            this.state = value;
        } else {
            throw new IllegalArgumentException("Valoarea trebuie sa fie Double.");
        }
        return this;
    }

    public DoubleCalculator add(double value) {
        this.state = (Double) this.state + value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        this.state = (Double) this.state - value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        this.state = (Double) this.state * value;
        return this;
    }
}
