/*
 * Treasure Chandler
 * cs 16000-01 - 02/03 Fall Semester 2024
 * Lab 3
 * 
 */

// problem 1:
import java.util.Scanner; // required for the Scanner class
import javax.swing.JDialog; // required for the JOptionPane class
import javax.swing.JOptionPane; // required for the JOptionPane class

public class IO_Practice {
    /**
     * 
     * @param args      entered values
     */
    public static void main(String[] args) {
        // problem 2:
        // variables declaration
        int numberOfBooks, titleLength, yearPublished, thisYear;
        double unitPrice, totalCost;
        String authorName, bookTitle, publisher, edition,
        firstName, middleName, lastName, cFirstName, cMiddleName,
        cLastName, streetAddress, cityName, stateName, zipCode;
        char middleInitial;

        // problem 3:
        // the consoleReader will read input data from the console
        Scanner consoleReader = new Scanner(System.in);

        /*
         * the number of books and the unit price for all
         * books purchased
         */
        // problem 4:
        System.out.println("How many book(s) did you order?");
        numberOfBooks = consoleReader.nextInt();
        // problem 5:
        System.out.println("How much did the book(s) cost?");
        unitPrice = consoleReader.nextDouble();

        // problem 6:
        // the total cost of all of the books the user inputs
        totalCost = numberOfBooks * unitPrice;

        // problem 7:
        /*
         * the customer's name, the customer's street address,
         * and the customer's city, state, and zip code
         */
        System.out.println("Enter the customer's first name:");
        cFirstName = consoleReader.next();
        System.out.println("Enter the customer's middle name:\n" +
                           "Note: If there is more than " +
                           "one word for the middle name, put " +
                           "a hyphen \"-\" to join them.");
        cMiddleName = consoleReader.next();
        consoleReader.nextLine();
        System.out.println("Enter the customer's last name:");
        cLastName = consoleReader.nextLine().toUpperCase();

        System.out.println("Enter the customer's street " +
                           "address (i.e., nos. and street):");
        streetAddress = consoleReader.nextLine();
        /*
         * note: some of these immediate calls of
         * "consoleReader.nextLine()" is to prevent the
         * program from skipping inputs after the user5
         * presses enter
         */
        // consoleReader.nextLine();

        System.out.println("Enter the city name:");
        cityName = consoleReader.nextLine();
        System.out.println("Enter the state:");
        stateName = consoleReader.nextLine();
        System.out.println("Enter the zip code:");
        zipCode = consoleReader.next();
        consoleReader.nextLine();

        // problem 8:
        /*
         * the first name, middle name, and the last name of the
         * customer's favorite author
         */
        System.out.println("Enter the customer's favorite author's " +
                           "first name, middle name, and last name:\n" +
                           "Remember to press enter after " +
                           "entering the first, middle, and " +
                           "last name!\n" +
                           "Note: If there is more than " +
                           "one word for the middle name, put " +
                           "a hyphen \"-\" to join them.");
        firstName = consoleReader.next();
        middleName = consoleReader.next();
        lastName = consoleReader.next();

        // problems 9-11:
        /*
         * gets the first letter from the author's middle
         * name as the initial
         */
        middleInitial = middleName.charAt(0);
        // simply makes the author's last name all UPPERCASE
        lastName = lastName.toUpperCase();
        /*
         * reformats the author's name to have the last name,
         * first name, and middle initial
         */
        authorName = lastName + ", " + firstName + " " +
                     middleInitial + ".";

        // problems 12-13:
        // the title of the customer's favorite book
        System.out.println("Enter the title of the customer's" +
                           " favorite book:");
        bookTitle = consoleReader.next();
        consoleReader.nextLine();

        // problem 14:
        /*
         * reassigning bookTitle to display it in all UPPERCASE,
         * along with getting the length of the book's title
         */
        bookTitle = bookTitle.toUpperCase();
        titleLength = bookTitle.length();

        // problem 15:
        /*
         * the book's publisher, edition, the year the book was
         * published, and the current year
         */
        System.out.println("Enter the book's publisher:");
        publisher = consoleReader.nextLine();
        System.out.println("Enter the book's edition\n" +
                           "(e.g. 1st, 2nd, 3rd, etc.):");
        edition = consoleReader.next();
        System.out.println("Enter the year the book was published:");
        consoleReader.nextLine();
        yearPublished = consoleReader.nextInt();
        System.out.println("Enter the current year (ex: 2024):");
        thisYear = consoleReader.nextInt();

        // problem 16:
        /*
         * printing all of the information about the customer and the
         * customer's favorite book to the console
         */
        System.out.println("Information about the customer's " +
                           "favorite book:\n" +
                           "The customer's favorite author is:\n" +
                           "\t" + authorName + "\n" +
                           "The customer's favorite book from " +
                           firstName + " is:\n" +
                           "\t" + bookTitle + ",\n" + "\t" + publisher +
                           ", " + edition + " Edition, " + yearPublished + 
                           "." + "\nThe length of the title is: " +
                           titleLength + ".\n" + "It is a book that is " +
                           (thisYear - yearPublished) + " year(s) old." +
                           "\n");

        // problem 17:
        /*
         * printing the results of the order of the book(s) to the
         * console
         */
        System.out.printf("The total cost of " + numberOfBooks + 
                          " books of unit price $%,.2f is $%,.2f" +
                          " from the " + publisher, unitPrice, totalCost);
        System.out.println("\n\nThis is the end of that invoice.\n");

        consoleReader.close();

        // problem 18:
        /*
         * due to the JOptionPane dialogue boxes sometimes appearing behind
         * all of your windows, you will need to declare a JDialog and
         * setAlwaysOnTop to true
         */
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        /*
         * displays a JOptionPane dialog window to prompt the user whether
         * they want to reorder any books
         */
        int wantToReorder = JOptionPane.showConfirmDialog(dialog,
                                                          "Do you want to reorder"
                                                          + " any books?" + 
                                                          "\nYes or No",
                                                          "Reorder?",
                                                          JOptionPane.YES_NO_OPTION);
        /*
         * the below "if-else-if" statement will check the user's choice and
         * display a corresponding message
         */
        if (wantToReorder == JOptionPane.YES_OPTION) {
            /*
            * if the user clicks "Yes", another JOptionPane dislog window is opened
            * prompting the user to enter how many books they want to order along with
            * the unit price of the books ordered
            */
            numberOfBooks = Integer.parseInt(JOptionPane.showInputDialog("How many" +
                                             " book(s) do you want to order?"));
            unitPrice = Double.parseDouble(JOptionPane.showInputDialog("How much " +
                                           " did the book(s) cost?"));
            // this fake "sysout" makes a new line in the console, as printf can't do so
            System.out.println("");
            System.out.printf("The total cost of " + numberOfBooks + 
                              " books of unit price $%,.2f is $%,.2f" +
                              " from " + publisher, unitPrice, totalCost);
            System.out.println("\n\nThis is the end of that invoice.");
        } else if (wantToReorder == JOptionPane.NO_OPTION) {
            /*
             * however, if the user clicks "No", there will be a single statement
             * printed to the console that states there has not been any books
             * reordered
             */
            System.out.println("There have been no reorders of any books.\n");
        }

        // problem 19:
        /*
         * prints information about the customer to the console along with the
         * customer's "invoice"
         */
        System.out.println("Information about the customer:\n" +
                           "Name:\t" + cFirstName + " " + cMiddleName + 
                           " " + cLastName + "\n" +
                           "Street Address:\t" + streetAddress + "\n" +
                           "City:\t" + cityName + "\n" +
                           "State:\t" + stateName + "\n" +
                           "Zip code:\t" + zipCode + "\n");
        System.out.printf("The total cost of " + numberOfBooks + 
                          " books of unit price $%,.2f is $%,.2f" +
                          " from the " + publisher, unitPrice, totalCost);
        System.out.println("\n\nThis is the end of that invoice.");

        // problem 1:
        System.exit(0); // required for the JOptionPane class

    } // end of main()

} // end of IO_Practice