//Refactor2 Generic Class to take in 3 variables of Generic Type

package com.bridgelabz;

public class FindMaximum<T extends Comparable<T>>
{
    T first,second,third;

    public FindMaximum(T first, T second, T third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "FindMaximum{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    private static <T extends Comparable<T>> T maximum(T first, T second, T third)
    {
        T max = first;
        if(second.compareTo(max)>0)
            max= second;
        if(third.compareTo(max)>0)
            max = third;
        return max;
    }
    private static <T> void printmax(T max) {

        System.out.println("Maximum value is :" + max);
    }
    public static void main(String[] args)
    {
        Integer intFirst = 14, intSecond = 21, intThird = 12;
        Float floatFirst = 1.2f, floatSecond = 12.1f, floatThird = 23.5f;
        String stringFirst = "Apple", stringSecond = "Peach", stringThird = "Banana";
        System.out.println("Maximum value is : "+maximum(intFirst,intSecond,intThird));
        printmax(maximum(12.1f,13.3f,14.2f));
        Float floatArray = maximum(floatFirst,floatSecond,floatThird);
        printmax(floatArray);
        printmax(maximum(stringFirst,stringSecond,stringThird));
    }
}