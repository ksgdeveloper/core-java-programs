package com.shree.flowcontrol;

public class SwitchStringDemo 
{
    public static void main(String[] args)
    {	
    	//pre check the string null check during switch case expression
        String str = "two";
        switch(str)
        {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }
    }
}