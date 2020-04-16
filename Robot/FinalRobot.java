package com.xebia.training.RoboAssignment.Robot;

import com.xebia.training.RoboAssignment.HandleObject.Weight;
import com.xebia.training.RoboAssignment.HandleObject.WeightMeasure;
import com.xebia.training.RoboAssignment.Power.PowerSupply;
import com.xebia.training.RoboAssignment.Power.Supply;
import com.xebia.training.RoboAssignment.Scanner.BarCodeScanner;
import com.xebia.training.RoboAssignment.Scanner.BarScanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FinalRobot {
    private static double Battery=100;
    private final static double MAXINSTANCES =5.0;
    public static void main(String[] args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Supply ob1=new PowerSupply();
        Weight ob2=new WeightMeasure();
        BarScanner ob3=new BarCodeScanner();
        System.out.println("Enter the Weight ");
        double weight = Double.parseDouble(br.readLine());
        if(ob2.ObjectWeight(weight)==1)
        {
            System.out.println("Enter the Distance ");
            double distance = Double.parseDouble(br.readLine());
            System.out.println("Distance to be travelled "+ distance +" km");
            Battery=Battery- distance / MAXINSTANCES *100-Battery*0.02* weight;
            if(ob1.batteryStatus(Battery)==-1)
            {
                System.out.println("----LED ON----");
            }
            else
            {
                System.out.println("----LED OFF----");
                System.out.println("Show the bar code ");
                String code = br.readLine();
                ob3.display(code);
            }
        }

    }
}
