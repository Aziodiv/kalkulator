package com.kalkulator;

import static com.kalkulator.Calc.CNC_PRICE;

public class Material {


    public static double m2InPlate(double a, double b) {
        double c = a * b;
        //     System.out.println("m2 in plate: " + c + " m2");
        return c;
    }

    public static double m2Product(double a, double b) {
        double c = a * b;
        //  System.out.println("m2 in product: " + c + " m2");
        System.out.println("--------------------------------");
        return c;
    }

    public static double productPriceM2(double c, double d, double e) {
        double x = c * d / e;
        return x;
    }

    public static double materialPriceM2(double c, double d, double e) {
        double x = c * d / e;
        return x;
    }


    public static double cncCost(double a) {
        double x = a * 0.58;
        return x;
    }

    public static double workPrice(double b) {
        double a = CNC_PRICE * b;
        System.out.println("------------------------");
        System.out.println("CNC work time :" + b + " min");
        System.out.println("CNC work price :" + a + " eur");
        System.out.println("--------------------------");
        return a;

    }

    public static double totalCost(double a, double b) {
        double c = a + b;
        return c;
    }

    final static double TAX = 0.2;
    final static double CNC_PRICE = 0.58;
}
