import java.util.Scanner;
public class StudentDinamic {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Student s1;
        s1 = new Student();
       
        System.out.print("Enter student name: ");
        s1.studentName = input.nextLine();
        System.out.print("Enter student grade: ");
        s1.studentGrade = input.nextDouble();

          //-----------------------------------------------------------//
       
        Student s2;
        s2 = new Student();
       
        System.out.print("Enter student name: ");
        s2.studentName = input.nextLine();
        input.nextLine();
        System.out.print("Enter student grade: ");
        s2.studentGrade = input.nextDouble();

            
            


        //-----------------------------------------------------------//
        Student s3;
        s3 = new Student();
       
        System.out.print("Enter student name: ");
        s3.studentName = input.nextLine();
        input.nextLine();
        System.out.print("Enter student grade: ");
        s3.studentGrade = input.nextDouble();

       

        //-----------------------------------------------------------//
        
        Student s4;
        s4 = new Student();
       
        System.out.print("Enter student name: ");
        s4.studentName = input.nextLine();
        input.nextLine();
        System.out.print("Enter student grade: ");
        s4.studentGrade = input.nextDouble();

      

        //-----------------------------------------------------------//

        Student s5;
        s5 = new Student();
       
        System.out.print("Enter student name: ");
        s5.studentName = input.nextLine();
        input.nextLine();
        System.out.print("Enter student grade: ");
        s5.studentGrade = input.nextDouble();

     
        //-----------------------------------------------------------//

        Student s6;
        s6 = new Student();
       
        System.out.print("Enter student name: ");
        s6.studentName = input.nextLine();
        input.nextLine();
        System.out.print("Enter student grade: ");
        s6.studentGrade = input.nextDouble();

       

        //-----------------------------------------------------------//

        Student s7;
        s7 = new Student();
       
        System.out.print("Enter student name: ");
        s7.studentName = input.nextLine();
        input.nextLine();
        System.out.print("Enter student grade: ");
        s7.studentGrade = input.nextDouble();

        System.out.println(s1.studentName + " " + s1.studentGrade);
        System.out.println(s2.studentName + " " + s2.studentGrade);
        System.out.println(s3.studentName + " " + s3.studentGrade);
        System.out.println(s4.studentName + " " + s4.studentGrade);
        System.out.println(s5.studentName + " " + s5.studentGrade);
        System.out.println(s6.studentName + " " + s6.studentGrade);
        System.out.println(s7.studentName + " " + s7.studentGrade);
            
       







        }
}

class Student{
    String studentName;
    double studentGrade;

}