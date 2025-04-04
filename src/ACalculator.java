

public abstract class ACalculator {
    protected Object state;

    public Object result() {
        return state;
    }

    public ACalculator clear() {
        this.state = null;
        return this;
    }

    public abstract ACalculator init(Object value);
}
