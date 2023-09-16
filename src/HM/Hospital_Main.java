package HM;

import java.io.IOException;
import java.util.Scanner;

interface medicalInterface {
    void new_medi();
    void show_medi();
}
interface facilityInterface{
    void add_facility();
    void show_facility();
}
interface patientInterface{
    void new_patient();
    void patient_info();
}
interface labInterface{
    void new_faci();
    void faci_list();
}
interface staffInterface{
    void new_staff();
    void staff_info();
}



class AuthenticationException extends Exception{
    public AuthenticationException(String message){
        super(message);
    }
}

public class Hospital_Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String pwd;

        try{
            System.out.println("Enter password:: ");
            pwd = sc2.next();

            if(!pwd.equalsIgnoreCase("Hospital"))
                throw new AuthenticationException("Incorrect Password\n Type correct Password");
            else{
                System.out.println("Welcome User !!!");
                int count1 =0, count2 =0 ,count3 =0, count4 =0, count5 =0, count6 =0;
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                 Welcome to Hospital Management System              ");
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                Doctortemp[] d = new Doc[25];
                Patient[] p = new Patient[100];
                Lab[] l = new Lab[20];
                Facility[] f = new Facility[20];
                Medical[] m = new Medical[100];
                Staff[] s = new Staff[100];

                int i;
                for(i=0;i<25;i++)
                    d[i] = new Doc();
                for(i=0;i<100;i++)
                    p[i] = new Patient();
                for(i=0;i<20;i++)
                    l[i] = new Lab();
                for(i=0;i<20;i++)
                    f[i] = new Facility();
                for(i=0;i<100;i++)
                    m[i] = new Medical();
                for(i = 0;i<100;i++)
                    s[i] = new Staff();

                Scanner input = new Scanner(System.in);
                int choice, j, c1, status =1, s1 =1 , s2=1 , s3=1, s4=1, s5=1, s6 =1;
                while(status ==1) {
                    System.out.println("\nMAIN MENU");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("1. Doctors \n2. Patients \n3. Medicines \n4. Laboratories \n5. Facilites \n6. Staff \n7. Exit");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    choice = input.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("                         DOCTOR SECTION                                           ");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            s1 = 1;
                            while (s1 == 1) {
                                System.out.println("1.Add New Entry \n2. Existing Doctor List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        d[count1].new_doctor();
                                        count1++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("id \n2. Name \n3. Specialist \n4. Timing \n5. Qualification \n6. Room No.");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count1; j++) {
                                            d[j].doc_info();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\n Return to Back Press 1 and for Main Menu, Press 0");
                                s1 = input.nextInt();
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("                         **PATIENT SECTION**                                           ");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            s2 = 1;
                            while (s2 == 1) {
                                System.out.println("1.Add New Entry \t2. Existing Patient List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        p[count2].new_patient();
                                        count2++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("id \t2. Name \t3. Disease \t4. Gender \t5. Admit Status \t6. Age");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                        }
                                        break;

                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s2 = input.nextInt();
                            }
                            break;
                        }
                        case 3: {
                            s3 = 1;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("                         **MEDICINES SECTION**                                           ");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            while (s3 == 1) {
                                System.out.println("1. Add New Entry \n2. Existing Medicines List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        m[count3].new_medi();
                                        count3++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("Name \t2. Company \t3. Expiry Date \n4. Cost");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count3; j++) {
                                            m[j].show_medi();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s3 = input.nextInt();
                            }
                            break;

                        }
                        case 4: {
                            s4 = 1;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("                         **LABORATORY SECTION**                                           ");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                            while (s4 == 1) {
                                System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        l[count4].new_faci();
                                        count4++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("Facilities\t\t Cost");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count4; j++) {
                                            l[j].faci_list();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s4 = input.nextInt();
                            }
                            break;
                        }
                        case 5: {
                            s5 = 1;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("                         HOSPITAL FACILITIES SECTION                                          ");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            while (s5 == 1) {
                                System.out.println("1. Add New Facility \n2. Existing Facilities List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        f[count5].add_facility();
                                        count5++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println(" Hospital Facility Area                                         ");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count5; j++) {
                                            f[j].show_facility();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s5 = input.nextInt();
                            }
                            break;
                        }
                        case 6: {
                            s6 = 1;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("                         STAFF SECTION                                          ");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            while (s6 == 1) {
                                String a = "nurse", b = "worker", c = "security";
                                System.out.println("1. Add New Entry \n2.Existing Nurses List\n3. Existing Workers List \n4. Existing Security List");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        s[count6].new_staff();
                                        count6++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("id \t Name \t Gender \t Salary   ");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count6; j++) {
                                            if (a.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("id \t Name \t Gender \t Salary   ");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count6; j++) {
                                            if (b.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("id \t Name \t Gender \t Salary   ");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (j = 0; j < count6; j++) {
                                            if (c.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s6 = input.nextInt();
                            }
                            break;
                        }
                        case 7: {
                            System.exit(0);
                        }
                        default: {
                            System.out.println("You have entered wrong choice !!!");
                        }
                    }
                    System.out.println("\n Return to MAIN MENU Press 1");
                    status = input.nextInt();

                }
            }
        }
//       catch (IOException e){
//            e.printStackTrace();
//        }
        catch(AuthenticationException a){
            a.printStackTrace();
        }

    }

}
