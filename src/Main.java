import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Welcome to the AITU Library");
            System.out.println("Enter 1 to add student");
            System.out.println("Enter 2 to add child");
            System.out.println("Enter 3 to add teacher");
            System.out.println("Enter 4 to sign in");
            System.out.println("Enter 5 to get a book");
            System.out.println("Enter 6 to return book");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter age");
                    int age = sc.nextInt();
                    if (age < 16) System.out.println("Not enough for student");
                    else System.out.println("Cool bruh");
                    // we need to check age of person that added, if he/she is from 16 to 20
                    // if it's less then 16, output "It isn't student" and go to main page
                    //there will be methods to add student and compare with already added students

                    break;
                case 2:
                    // we need to check age of person that added, if he/she is from 5 to 16
                    // if it's less then 5, output "He/she is too small" and go to main page
                    //there will be methods to add child and compare with already added children
                    break;
                case 3:
                    // we need to check age of person that added, if he/she is older then 20
                    // if it's less then 20, output "He/she isn't a teacher" and go to main page
                    //there will be methods to add teacher and compare with already added teachers
                    break;
                case 4:
                    // we check the outputted book with our library book, if it doesn't exist we enter "Sorry, now we haven't this book"
                    // if there is age restriction, output "Your age isn't enough" and go to main page
                    // if everything is ok, we record it to the person
                    break;
                case 5:
                    //here you have to call method in order to print info about all books in library
                    break;
                case 6:
                    //here you have to call method in order to print info about all students in library
                    break;

            }
        }
        public interface Book{

        }
    }
}
