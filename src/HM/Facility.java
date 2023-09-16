package HM;

import java.util.Scanner;

public class Facility implements facilityInterface {
    String fac_Name;
    public void add_facility(){
        Scanner input = new Scanner(System.in);
        System.out.println("Facility:-");
        fac_Name = input.nextLine();

    }
    public void show_facility(){
        System.out.println(fac_Name);
    }
}

