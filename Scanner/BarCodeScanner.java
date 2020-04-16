package com.xebia.training.RoboAssignment.Scanner;

public class BarCodeScanner implements BarScanner {
    public void display(String object) {
        if(object.charAt(0)>='0'&&object.charAt(0)<='9')
        {
            System.out.println("Unable to Scan Bar Code!!!");
        }
        else
        {
            System.out.println("Price of item "+object);
        }
    }
}
