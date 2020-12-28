package com.bridgelabz;

public class FindMaxGenerics {
        public static void main(String[] args) {
            printMax(testMaximum(123, 234, 124));
            printMax(testMaximumDouble(10.00,20.00,30.00));
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
