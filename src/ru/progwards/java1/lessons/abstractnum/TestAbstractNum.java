package ru.progwards.java1.lessons.abstractnum;

public class TestAbstractNum {
    public static void main(String[] args) {
        Figure3D fig = new Cube(new IntNumber(3));
        System.out.println(fig.volume());

        fig = new Cube(new DoubleNumber(3));
        System.out.println(fig.volume());

        fig = new Pyramid(new IntNumber(3));
        System.out.println(fig.volume());

        fig = new Pyramid(new DoubleNumber(3));
        System.out.println(fig.volume());

        /*Number in = new IntNumber(3);
        Number in2 = new IntNumber(3);
        Number dn = new DoubleNumber(3);
        System.out.println(Double.parseDouble("3"));
*/
    }
}
