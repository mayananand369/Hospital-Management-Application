package HM;

import java.util.Scanner;

public class Patient implements patientInterface{

    String pid, pname, disease, Gender, admit_status;
    int age;
    public void new_patient(){
        Scanner input = new Scanner(System.in);
        System.out.println("id:-");
        pid = input.nextLine();
        System.out.println("name:-");
        pname = input.nextLine();
        System.out.println("disease:-");
        disease = input.nextLine();
        System.out.println("gender:-");
        Gender = input.nextLine();
        System.out.println("admit_status:-");
        admit_status = input.nextLine();
        System.out.println("age:-");
        age = input.nextInt();
    }
    public void patient_info(){
        System.out.println(pid + "\t"+ pname+ "\t"+ disease+ "\t "+Gender+ "\t"+ admit_status+ "\t"+ age);
    }

}

