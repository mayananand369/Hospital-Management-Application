package HM;

import java.util.Scanner;
class Doctortemp{
    String did, dname, specialist, appoint, doc_qual;
    int droom;
    void new_doctor(){
        Scanner input = new Scanner(System.in);
        System.out.println("id:-");
        did = input.nextLine();
        System.out.println("name:-");
        dname = input.nextLine();
        System.out.println("specialization:-");
        specialist = input.nextLine();
        System.out.println("work time");
        appoint = input.nextLine();
        System.out.println("qualification:-");
        doc_qual = input.nextLine();
        System.out.println("room no:-");
        droom = input.nextInt();
    }
    void doc_info(){
        System.out.println(did +"\t"+ dname + "\t"+ specialist + "\t"+ appoint+ "\t"+ doc_qual+ "\t"+ droom);
    }
}

public class Doc extends Doctortemp{
    void dynamic(){
        System.out.println("This statement can't be accessible.");
    }
}

