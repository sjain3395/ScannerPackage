import java.util.Scanner;

class Testscanner {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String userName;
        //Enter username and press Enter

        System.out.println("Enter Username");
        userName = myObj.nextLine();

        System.out.println("Username is : "+ userName);


    }
}
