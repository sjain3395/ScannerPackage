import java.util.Scanner;

class Rescanner {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in) ;
        System.out.println("Enter Name, Age And Salary :");
        //String input
        String name = myObj.nextLine();
        //Numeric input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
       // Output input by user
        System.out.println("Name: " +name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
