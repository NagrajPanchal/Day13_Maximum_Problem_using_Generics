package com.bridgelabz;

public class FindMaximum
{
    Integer firstNumber = 20;
    Integer secondNumber = 5;
    Integer threedNumber = 12;


    Integer test1(){

        Integer max1 = firstNumber.compareTo(secondNumber);//1
        Integer max2 = firstNumber.compareTo(threedNumber);//1
        Integer res1 = max1+max2;
        return res1;//2
    }
    Integer test2(){
        Integer max1 = secondNumber.compareTo(firstNumber);//-1
        Integer max2 = secondNumber.compareTo(threedNumber);//1
        Integer res2 = max1+max2;
        return res2;
    }
    Integer test3(){
        Integer max1 = threedNumber.compareTo(firstNumber);//-1
        Integer max2 = threedNumber.compareTo(secondNumber);//-1
        Integer res3 = max1+max2;
        return res3;
    }


    public static void main(String[] args)
    {
        FindMaximum max = new FindMaximum();
        int one = max.test1();
        int two = max.test2();
        int three = max.test3();
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