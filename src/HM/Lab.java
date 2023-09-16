package HM;

import java.util.Scanner;

public class Lab implements labInterface{
    String facility;
    int lab_cost;
    public void new_faci(){
        Scanner input = new Scanner(System.in);
        facility = input.nextLine();
        System.out.println("cost:-");
        lab_cost = input.nextInt();
    }
    public void faci_list(){
        System.out.println(facility+ "\t\t"+ lab_cost);
    }
}

