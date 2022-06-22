package com.company.L019;

import java.util.stream.Stream;

public class StringExample {

    private static String str(){
        return "Welcome to FoodTech School";
    }

    private static void runContentEquals(){
        System.out.println("runContentEquals");
        String str1 = "Добро пожаловать на FoodTech School";
        String str2 = "Сайт для изучения java";

        StringBuffer str3 = new StringBuffer("Добро пожаловать на FoodTech School");
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("str1 == syt2" + result);
        result = str2.contentEquals(str3);
        System.out.println("str2 == str3:" + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4:" + result);
    }
    private static void runEqualsIgnoreCase(){
        System.out.println("runEqualsIgnoreCase");
        String str1 = "Добро пожаловать на FoodTech School";
        String str2 = str1;
        String str3 = "Сайт для изучения java";
        String str4 = "ДОБРО ПОЖАЛОВАТЬ НА FOODTECH SCHOOL";

        System.out.println("str1 == str2:" + str1.equalsIgnoreCase(str2));
        System.out.println("str1 == str3:" + str1.equalsIgnoreCase(str3));
        System.out.println("str1 == str4:" + str1.equalsIgnoreCase(str4));
    }

    private static void runCompareTo(){
        System.out.println("runCompareTo");

        String str1 = "I'm calling the method";
        String str2 = "I'm calling the method";
        String str3 = "I'm calling a class";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));
    }

    private static void runCompareToIgnoreCase(){
        System.out.println("runCompareToIgnoreCase");

        String str1 = "I'm calling the method";
        String str2 = "I'm Calling The Method";
        String str3 = "I'm calling a class";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));
    }

    private static void runToLoveCase(){
        System.out.println("runToLoveCase");

        String str1 = "I'm Calling The Method";

        System.out.println(str1.toLowerCase());
    }

    private static void runToUpperCase(){
        System.out.println("runToUpperCase");

        String str1 = "I'm Calling The Method";

        System.out.println(str1.toUpperCase());
    }

    private static void runContact(){
        System.out.println("runContact");

        String str1 = "I'm calling the method";

        str1 = str1.concat(" and i call the class");

        str1 = str1 + " String";

        System.out.println(str1);
    }

    private static void runMatches(){
        System.out.println("runMatches");

        String str1 = "Welcome to FoodTech School";

        System.out.println(str1.matches("(.*)FoodTech(.*)"));
        System.out.println(str1.matches("FoodTech"));
        System.out.println(str1.matches("Welcome(.*)"));
    }

    private static void runContains(){
        System.out.println("runContains");

        String str1 = "I'm calling the method";

        System.out.println(str1.contains("method"));
    }

    private static void runRegionMatches(){
        System.out.println("runRegionMatches");

        String str1 = "Welcome to FoodTech School";
        String str2 = "JAVA";
        String str3 = "class";

        System.out.println(str1.regionMatches(20, str2, 0, 8));
    }

    private static void runStartWith(){
        System.out.println("runStartWith");

        String str1 = "Welcome to FoodTech School";
        String str2 = "Welcome";
        String str3 = "class";

        System.out.println(str1.startsWith(str2));
    }

    private static void runEndWith(){
        System.out.println("runEndWith");

        String str1 = "Welcome to FoodTech School";
        String str2 = "Welcome";
        String str3 = "School";

        System.out.println(str1.startsWith(str3));
    }

    private static void runLines(){
        System.out.println("runLines");

        String str1 = "fbfbsdv\n" + "vrfdfvfd\n" + "vdfvddf\n";


        System.out.println(str1);

        Stream<String> lines = str1.lines();
        lines.forEach(System.out::print);
        System.out.println(lines);

    }

    private static void runToCharArray(){
        System.out.println("runToCharArray");

        String str1 = "Welcome to FoodTech School";

        System.out.println(str1.toCharArray()[4]);
    }

    private static void runFormat(){
        System.out.println("runFormat");

        float floatVar = 1.2f;
        int intVar = 12;
        String stringVar = "String";

        String fs = String.format("float = %.1f, int = %d, string = %s ", floatVar, intVar, stringVar);
        System.out.println(fs);
    }

    private static void runValueOf(){
        System.out.println("runValueOf");

        double d = 12.3;
        boolean b = true;
        long l = 111l;
        char[] c = {'d', 'k'};
        System.out.println(String.valueOf(d));
    }

    private static void runRepeat(){
        System.out.println("runRepeat");

        String stringVar = "String";
        String repeat = stringVar.repeat(10);
        System.out.println(repeat);
    }

    private static void runIndexOf(){
        System.out.println("runIndexOf");

        String stringVar = str();
        String sub1 = "Food";
        String sub2 = "Tech";

        System.out.println(stringVar.indexOf(sub1));
        System.out.println(stringVar.indexOf(sub2));
        System.out.println(stringVar.indexOf("fds"));
    }

    private static void runLastIndexOf(){
        System.out.println("runLastIndexOf");

        String stringVar = str();
        String sub1 = "Food";
        String sub2 = "Tech";

        System.out.println(stringVar.lastIndexOf(sub1));
        System.out.println(stringVar.lastIndexOf(sub2));

    }

    private static void runSubStribg(){
        System.out.println("runSubString");

        String stringVar = str();

        System.out.println(stringVar.substring(11, 15));

    }

    private static void runSubSequence(){
        System.out.println("runSubSequence");

        String stringVar = str();

        System.out.println(stringVar.subSequence(11, 15));

    }

    private static void runSplit(){
        System.out.println("runSplit");

        String stringVar = str();

        for (String s:stringVar.split(" "))
             System.out.println(s);

    }

    private static void runJoin(){
        System.out.println("runJoin");

        String join = String.join(" ", "1", "2", "3");

    }
    private static void runTrim(){
        String s = "    String";
        System.out.println(s.trim());
    }
    private static void runReplace(){
        String stringVar = str();

        System.out.println(stringVar.replace("o", "-"));
        System.out.println(stringVar.replaceFirst("o", "-"));
        System.out.println(stringVar.replaceAll("o", "-"));

    }

    public static void run(){
        runContentEquals();
        runEqualsIgnoreCase();
        runCompareTo();
        runCompareToIgnoreCase();
        runToLoveCase();
        runToUpperCase();
        runContact();
        runMatches();
        runContains();
        runRegionMatches();
        runStartWith();
        runEndWith();
        runLines();
        runToCharArray();
        runFormat();
        runValueOf();
        runRepeat();
        runIndexOf();
        runLastIndexOf();
        runSubStribg();
        runSubSequence();
        runSplit();
        runJoin();
        runTrim();
        runReplace();
    }
}
