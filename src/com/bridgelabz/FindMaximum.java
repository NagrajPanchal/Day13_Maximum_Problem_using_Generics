//Refactor1 3 to One Generic Method and find the maximum

package com.bridgelabz;

public class FindMaximum
{
public static <T extends Comparable<T>> void toFindMaximum(T... array)
{
    T max = array[0];
    for(int i=0; i<array.length; i++)
    {
        if(array[i].compareTo(max)>0)
            max = array[i];
    }
    System.out.println("The maximum value is : " + max);
}
    public static void main(String[] args)
    {
        toFindMaximum(12,22,14);
        toFindMaximum(12.1F,13.2F,34.4F);
        toFindMaximum("Apple", "Peach", "Banana");
    }
}