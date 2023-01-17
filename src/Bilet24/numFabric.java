package Bilet24;

public class numFabric extends Number {


    public Number createNumber(numType type) {
        Number num = null;

        switch (type) {
            case COMPLEX:
                num =  new Complex();
                break;
            case RATIONAL:
                num = new Rational();
                break;
        }

        return num;
    }

}