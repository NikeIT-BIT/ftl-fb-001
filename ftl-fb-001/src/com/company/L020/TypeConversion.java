package com.company.L020;

public class TypeConversion {

    private static void runStringToByte(){
        Byte b1 = 10;
        System.out.println(b1);

        String str1 = "111";

        Byte b2 = Byte.valueOf(str1);
        System.out.println(b2);

        byte b3 = 5;
        b3 = Byte.parseByte(str1);
        System.out.println(b3);

        byte[] b4 = str1.getBytes();
        System.out.println(b4);

        String s = new String(b4);
        System.out.println(s);

    }

    private static void runStringToInt(){
        String str = "123";

//        Integer in1 = new Integer(str);
        Integer in2 = Integer.valueOf(str);
        int in3 = Integer.parseInt(str);

    }

    private static void runStringToDouble(){
//        Double d1 = new Double("1.123");
        Double d2 = Double.valueOf("12.7e10");
        double d3 = Double.parseDouble("4.4");
    }

    private static void runStringToBoolean(){
        Boolean b1 = Boolean.valueOf("true");

    }
    public static void run(){
        runStringToByte();
        runStringToInt();
        runStringToDouble();
        runStringToBoolean();
    }
}
