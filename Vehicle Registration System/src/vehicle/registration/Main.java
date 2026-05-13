package vehicle.registration;

import vehicle.registration.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Vehicle V1 = new Car("aAB-123","Youssef","Car",2021,"Active", 4);
     Vehicle V11 = new Car("AAB-123","Joe","Car",2021,"Active", 4);
     Vehicle V2 = new Motorcycle("CAB-781","Anton","MotorCycle",2022,"Active", "Manaul");
     Vehicle V3 = new Truck("JUk-363","Mona","Truck",2019,"Active", 40);

        System.out.println(V1);
        System.out.println(V2);
        System.out.println(V3);
        System.out.println('\n');
        System.out.println(V1.getRegistrationLabel());
        System.out.println(V2.getRegistrationLabel());
        System.out.println(V3.getRegistrationLabel());




        if(V1.equals(V11)){
            System.out.println(V1.getPlateNumber() + " and " + V11.getPlateNumber() + " are the same Car ");
        }else{
            System.out.println("Different Cars...");
        }

        //System.out.println(V1.getPlateNumber());
    }
}