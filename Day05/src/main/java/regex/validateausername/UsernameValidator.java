package regex.validateausername;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName= sc.nextLine();

        if(isValidUserName(userName)){
            System.out.println("Valid username.");
        }
        else{
            System.out.println("Invalid username.");
        }
        sc.close();
    }

    public static boolean isValidUserName(String userName){
        return userName.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }
}
