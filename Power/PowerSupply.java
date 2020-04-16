package com.xebia.training.RoboAssignment.Power;

public class PowerSupply implements Supply {
    @Override
    public int batteryStatus(double Battery) {
        if(Battery<0)Battery=0;
        System.out.println("Battery Left "+((double)Math.round(Battery*100)/100)+" %");
        if (Battery <= 15) {
            System.out.println("Low Battery");
            return -1;
        }
        return 1;
    }
}