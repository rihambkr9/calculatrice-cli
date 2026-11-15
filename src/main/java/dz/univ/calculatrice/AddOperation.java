package dz.univ.calculatrice;

public class AddOperation implements Operation {

    @Override
    public double execute(final double a, final double b) {
        return a + b;
    }

    @Override
    public String getSymbol() {
        return "+";
    }
}