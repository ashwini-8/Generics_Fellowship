package com.bridgelabz;

public class FindMaxGenerics {
        public static void main(String[] args) {
            printMax(testMaximum(123, 234, 124));
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

        private static void printMax(Integer max) {
            System.out.println(" Maximum number is : " + max);
        }
    }
