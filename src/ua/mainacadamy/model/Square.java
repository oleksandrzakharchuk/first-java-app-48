package ua.mainacadamy.model;

public class Square extends AbstractFinger {
    private double sideA;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

}

