package Yang;

/**
 * Created by temp on 2/23/2016.
 */
import java.util.Scanner

public class Console {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Person Tester application");
        System.out.println();
        System.out.println();
        System.out.print("Create customer or employee? (c/e):  ");

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
            String cOrE = sc.nextLine();
        System.out.print(cOrE + "\n");
        if (cOrE.equalsIgnoreCase("c")) {

            // get the customer/employee object
            Customer a = new Customer();
            Sytem.out.print("Enter first name: ";
            String fName = sc.nextLine();
            System.out.print(fName + "\n")
            a.setFirstName(fName);
            Sytem.out.print("Enter last name: ";
            String lName = sc.nextLine();
            System.out.print(lName + "\n")
            a.setLastName(lName);
            Sytem.out.print("Enter email address: ";
            String aEmail = sc.nextLine();
            System.out.print(aEmail + "\n")
            a.setEmail(aEmail);
            sytem.out.print("Customer number: ")
            String cn = sc.nextLine();
            System.out.print(cn + "\n")
            System.out.print(getDisplayText());


        } else if (cOrE.equalsIgnoreCase("c")) {
            Employee e = new Employee();
            Sytem.out.print("Enter first name: ";
            String fName = sc.nextLine();
            System.out.print(fName + "\n")
            e.setFirstName(fName);
            Sytem.out.print("Enter last name: ";
            String lName = sc.nextLine();
            System.out.print(lName + "\n")
            e.setLastName(lName);
            Sytem.out.print("Enter email address: ";
            String aEmail = sc.nextLine();
            System.out.print(aEmail + "\n")
            e.setEmail(aEmail);
            sytem.out.print("Social security number: ")
            String ssn = sc.nextLine();
            System.out.print(ssn + "\n")
            System.out.print(getDisplayText());
        }






        // see if the user wants to continue
        System.out.print("Continue? (y/n): ");
        choice = sc.nextLine();
        System.out.println();
    }

}
