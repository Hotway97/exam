package Bilet24;

public class Number {
    enum numType{
        COMPLEX,
        RATIONAL
    }

    int real, imaginary;

    public static void main(String[] args) {
        numFabric fabric = new numFabric();

        Number num1 = fabric.createNumber(numType.COMPLEX);
        Number num2 = fabric.createNumber(numType.RATIONAL);
        System.out.println(num1.real + "," + num1.imaginary);
        System.out.println(num2.real + "," + num2.imaginary);



    }
}
