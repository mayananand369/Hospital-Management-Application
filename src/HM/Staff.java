package HM;



import java.util.Scanner;

class staffTemp{
    public String sid, sname, desg, Gender;
    public int salary;
    public void new_staff(){
        Scanner input = new Scanner(System.in);
        System.out.println("id:- ");
        sid = input.nextLine();
        System.out.println("sname:-");
        sname = input.nextLine();
        System.out.println("designation:-");
        desg = input.nextLine();
        System.out.println("Gender:-");
        Gender = input.nextLine();
        System.out.println("salary:-");
        salary = input.nextInt();

    }
}
public class Staff extends staffTemp implements staffInterface {
    public void staff_info(){
        System.out.println(sid+"\t"+ sname+"\t"+ Gender+ "\t"+salary);
    }
}

