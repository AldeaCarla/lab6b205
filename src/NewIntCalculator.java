

public class NewIntCalculator extends ACalculator {

    @Override
    public NewIntCalculator init(Object value) {
        if (value instanceof Integer) {
            this.state = value;
        } else {
            throw new IllegalArgumentException("Valoarea trebuie sa fie Integer.");
        }
        return this;
    }

    public NewIntCalculator add(int value) {
        this.state = (Integer) this.state + value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        this.state = (Integer) this.state - value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        this.state = (Integer) this.state * value;
        return this;
    }
}
