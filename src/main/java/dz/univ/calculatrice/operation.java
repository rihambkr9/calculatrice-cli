package dz.univ.calculatrice;

public interface Operation {

    double execute(double a, double b);

    String getSymbol();
}