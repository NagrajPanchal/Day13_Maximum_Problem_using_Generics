//Given 3 Floats find the maximum

package com.bridgelabz;

public class FindMaximum
{
    Float firstNumber = 20.2F;
    Float secondNumber = 5.5F;
    Float threedNumber = 12.1F;


    Float test1(){

        Float max1 = Float.valueOf(firstNumber.compareTo(secondNumber));//1
        Float max2 = Float.valueOf(firstNumber.compareTo(threedNumber));//1
        Float res1 = max1+max2;
        return res1;//2
    }
    Float test2(){
        Float max1 = Float.valueOf(secondNumber.compareTo(firstNumber));//-1
        Float max2 = Float.valueOf(secondNumber.compareTo(threedNumber));//1
        Float res2 = max1+max2;
        return res2;
    }
    Float test3(){
        Float max1 = Float.valueOf(threedNumber.compareTo(firstNumber));//-1
        Float max2 = Float.valueOf(threedNumber.compareTo(secondNumber));//-1
        Float res3 = max1+max2;
        return res3;
    }


    public static void main(String[] args)
    {
        FindMaximum max = new FindMaximum();
        Float one = max.test1();
        Float two = max.test2();
        Float three = max.test3();
        if (one == 2)
            System.out.println("first greatest number : "+max.firstNumber);
        else if (one == -2)
            System.out.println("third greatest number : "+max.firstNumber);
        else
            System.out.println("second greatest number : "+max.firstNumber);

        if (two == 2)
            System.out.println("first greatest number : "+max.secondNumber);
        else if (two == -2)
            System.out.println("third greatest number : "+max.secondNumber);
        else
            System.out.println("second greatest number : "+max.secondNumber);

        if (three == 2)
            System.out.println("first greatest number : "+max.threedNumber);
         else if (three == -2)
            System.out.println("third greatest number : "+max.threedNumber);
        else
            System.out.println("second greatest number : "+max.threedNumber);

    }

}