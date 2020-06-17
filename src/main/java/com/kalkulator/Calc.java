package com.kalkulator;


public class Calc extends Material {
    public static void main(String[] args) {

///CENA ZA LIST MATERIJALA
        double e = 12;
///RAZMER LISTA
        double c = m2InPlate(2000, 1000) / 1000000;
///RAZMER DETALI
        double d = m2Product(1250, 400) / 1000000;


        double p = productPriceM2(d, e, c);
        double o = materialPriceM2(1, e, c);
        //+ KM 20%
        double k = TAX * p;
        double k1 = TAX * o;
        double p1 = p + k;
        double o1 = o + k1;
        double x = workPrice(10.01);
        double y = totalCost(x, p);

        System.out.println("m2 in plate: " + c + " m2");
        System.out.println("m2 in product: " + d + " m2");
        System.out.println("------------------------------");
        System.out.println("material price m2: " + o + ".- EUR");
        System.out.println("material price m2 + KM : " + o1 + ".- EUR");
        System.out.println("------------------------------");
        System.out.println("produc price: " + p + ".- EUR");
        System.out.println("produc price + KM: " + p1 + ".- EUR");
        System.out.println("---------------------------------");
        System.out.println("TOTAL PRICE det+work: "+y+".- EUR");




    }


}


