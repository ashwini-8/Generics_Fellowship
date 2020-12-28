package com.bridgelabz;

public class FindMaxGenerics {
            public static void main(String[] args) {
                Integer[] numbers = {10, 20, 30};
                Double [] b ={1.1,1.2,1.3};
                String [] c = {"ashwini","rajkuamr","patil"};
            }

    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0]; //sets the first value in the array as the current maximum
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) //if value in list[i] is greater than max and is positive(greater than 0), the max value is replaced by list[i] {
                max = list[i];
        }
        return max;
    }
       public static int testMaximum(Integer x, Integer y, Integer z) {
            Integer max = x;
            if (y.compareTo(max) > 0) {
                max = y;
            }
            if (z.compareTo(max) > 0) {
                max = z;
            }
            return max;
        }
    public static double testMaximumDouble(Double x, Double y, Double z) {
       Double max1 = x;
        if (y.compareTo(max1) > 0) {
            max1 = y;
        }
        if (z.compareTo(max1) > 0) {
            max1 = z;
        }
        return max1;
    }
    public String testMaximumString(String firstLetter, String secondLetter, String thirdLetter) {
        int max = firstLetter.length();
        String letter = firstLetter;
        if (secondLetter.length() > max) {
            max = secondLetter.length();
            letter = secondLetter;
        }
        if (thirdLetter.length() > max) {
            max = thirdLetter.length();
            letter = thirdLetter;
        }
        printMax(letter);
        return letter;
    }

    private void printMax(String letter) {
        System.out.println("Maximum letter is : " + letter);
    }

    private static void printMax(Integer max) {
        System.out.println(" Maximum number is : " + max);
    }

    private static void printMax(double max) {
            System.out.println(" Maximum number is : " + max);
        }
    }
