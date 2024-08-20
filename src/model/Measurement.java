package model;

public class Measurement {
    public double value;
    static String SIunit = "meter";

    public Measurement(double value) {
        this.value = value;
    }
    double getCM(){
        return value*100;
    }
    double getKm(){
        return value / 1000;
    }
    double getMm(){
        return value * 1000;
    }
    double getDm(){
        return value * 10;
    }
}

