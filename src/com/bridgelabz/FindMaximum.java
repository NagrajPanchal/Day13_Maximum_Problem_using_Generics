//Given 3 Strings find the maximum

package com.bridgelabz;

public class FindMaximum
{
static String toFindMaximum(String[] stringArray)
{
    String max = stringArray[0];
    for(int i=0; i<stringArray.length; i++)
    {
        if(stringArray[i].compareTo(max)>0)
            max = stringArray[i];
    }
    return max;
}
    public static void main(String[] args)
    {
    String[] stringArray = {"Apple", "Peach", "Banana"};
    String result = toFindMaximum(stringArray);
    System.out.println("Maximum String is : "+result);
    }
}