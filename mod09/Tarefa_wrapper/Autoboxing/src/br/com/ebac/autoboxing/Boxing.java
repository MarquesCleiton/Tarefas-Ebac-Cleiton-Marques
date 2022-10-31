package br.com.ebac.autoboxing;

import java.util.Scanner;

public class Boxing {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma valor int: ");
        int intPrimitivo = teclado.nextInt();

        System.out.println("Digite uma valor byte");
        byte bytePrimitivo = teclado.nextByte();

        System.out.println("Digite uma valor short");
        short shortPrimitivo = teclado.nextShort();

        System.out.println("Digite uma valor boolean");
        boolean booleanPrimitivo = teclado.nextBoolean();

        System.out.println("Digite uma valor long");
        long longPrimitivo = teclado.nextLong();

        System.out.println("Digite uma valor float");
        float floatPrimitivo = teclado.nextFloat();

        System.out.println("Digite uma valor double");
        double doublePrimitivo = teclado.nextDouble();

        Integer intWrappers  = intPrimitivo;
        Byte byteWrappers = bytePrimitivo;
        Short shortWrappers = shortPrimitivo;
        Boolean booleanWrappers = booleanPrimitivo;
        Long longWrappers = longPrimitivo;
        Float floatWrappers = floatPrimitivo;
        Double doubleWrappers = doublePrimitivo;

        System.out.println();
        System.out.println("Boxing de int       para      Integer   :" + intWrappers);
        System.out.println("Boxing de byte      para      Byte      :" + byteWrappers);
        System.out.println("Boxing de short     para      Short     :" + shortWrappers);
        System.out.println("Boxing de boolean   para      Integer   :" + booleanWrappers);
        System.out.println("Boxing de long      para      Long      :" + longWrappers);
        System.out.println("Boxing de float     para      Float     :" + floatWrappers);
        System.out.println("Boxing de double    para      Double    :" + doubleWrappers);


    }
}
