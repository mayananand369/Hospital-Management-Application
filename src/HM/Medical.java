package HM;

import java.util.Scanner;

public class Medical implements medicalInterface{
    String med_Name, med_Comp, exp_Date;
    int med_Cost, count;

    public void new_medi(){
        Scanner input = new Scanner(System.in);
        System.out.println("name:-");
        med_Name = input.nextLine();
        System.out.println("composition:-");
        med_Comp= input.nextLine();
        System.out.println("expire_date:-");
        exp_Date = input.nextLine();
        System.out.println("cost:-");
        med_Cost= input.nextInt();
        System.out.println("no of unit:-");
        count = input.nextInt();
    }
    public void show_medi(){
        System.out.println(med_Name +" \t"+ med_Comp +"\t"+ exp_Date+"\t"+exp_Date +" \t"+ med_Cost );
    }

}
