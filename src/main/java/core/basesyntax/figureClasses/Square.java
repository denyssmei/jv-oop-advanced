package core.basesyntax.figureClasses;

import core.basesyntax.colors.Color;

import java.util.Random;

public class Square extends Figure {
    private double side;

    public Square(String colorOfFigure, double side) {
        super(colorOfFigure);
        this.side = side;
    }

    public Square(String colorOfFigure, Random random) {
        this(colorOfFigure, random.nextDouble() * 10);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double obtainTheArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + obtainTheArea()
                + " sq.units, side: " + getSide() + " units, color: " + getColorOfFigure());
    }
}
