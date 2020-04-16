package com.xebia.training.RoboAssignment.HandleObject;

public class WeightMeasure implements Weight {
    @Override
    public int ObjectWeight(double weight) {
        if(weight>10)
        {
            System.out.println("Overweight Robot can't handle");
            return -1;
        }
        else
        {
            System.out.println("Weight picked by Robot "+weight+" kg");
            return 1;
        }
    }
}
