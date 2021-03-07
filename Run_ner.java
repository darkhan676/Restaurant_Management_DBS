package com.company;
import java.lang.*;
import java.util.*;


public class Run_ner {  // our class Run_ner
    private final Purchaser_possibilities show; // private final variables show
    private final Scanner scan_ner;

    public Run_ner(Purchaser_possibilities show){   // Constructor of Run_ner
        this.show = show;
        scan_ner = new Scanner(System.in);
    }

    public static boolean NameValidator(String na_me){  // NameValidator method. It helps to validate a correct name
        return na_me.matches( "[A-Z][a-z]*"); // regular expression which is returning true or false
    }
    public static boolean Gen_der_Validator(String gen_der){ // Gen_der_Validator method. It helps to validate a correct gender
        return gen_der.matches("M|F|O");    // regular expression which is returning true or false
    }
    public static boolean da_te_Validator(String da_te){    // da_te_Validator method. It helps to validate a correct date(dd/mm/yyyy).
      return da_te.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$");  // regular expression which is returning true or false
    }
    public void ready_go(){ // main app which is presenting for purchaser
        while (true){ // while true ---
            System.out.println();
            System.out.println("Hello! This is the Vista Restaurant & Bar");
            System.out.println("Select option: ");
            System.out.println("1. Leave information about yourself to make a reservation in the future.");
            System.out.println("2. Basic information about restaurant!");
            System.out.println("3. Check our price");
            System.out.println("4. Make a reservation");
            System.out.println("5. Delete specific order.");
            System.out.println("6. Delete specific client's information");
            System.out.println("0. Exit");
            System.out.println();

            try{
                System.out.println("Select option (1-6): ");
                int cho_ice = scan_ner.nextInt(); // purchaser writing his choice
                if(cho_ice == 1){   // if choice is equal to one
                    add_purchaser_show(); // we are calling add_purchaser_show() function
                }
                else if(cho_ice == 2){      // if choice is equal to two
                    info_res();             // we are calling info_res() function
                }
                else if(cho_ice == 3){      // if choice is equal to three
                    price();                // we are calling price() function
                }
                else if(cho_ice == 4){      // if choice is equal to four
                    order();                // we are calling order() function
                }
                else if(cho_ice == 5){      // if choice is equal to five
                    order_delete_client_show(); // we are calling order_delete_client_show() function
                }
                else if(cho_ice == 6){      // if choice is equal to six
                    delete_client_show();   // we are calling delete_client_show() function
                }
                else {                      // if choice is equal to another random number
                    break;                  // just exit program
                }
            }catch (InputMismatchException d){  // catching InputMismatchException exception
                System.out.println("Input must be integer");    // printing warning
                scan_ner.nextLine();
            }
            catch(Exception d){
                System.out.println(d.getMessage());
            }
        }
    }

    public void add_purchaser_show(){
        System.out.println("Please,enter your id!");
        int id = scan_ner.nextInt();        // entering id
        System.out.println("Please,enter your name!");
        String name = scan_ner.next();      // entering name
        if(NameValidator(name) == false){   // checking for real name
            System.out.println("Please,enter a real name."); // if not printing this warning
            System.exit(1);     // stopping program
        }
        System.out.println("Please,enter your gender: M(male),F(female) or O(others)");
        String gender = scan_ner.next(); // entering gender
        if(Gen_der_Validator(gender) == false){ // checking for real gender
            System.out.println("Please, enter correct gender expression. M , F , O ");  // if not printing this warning
            System.exit(1);     // stopping program
        }
        else {

        }
        System.out.println("Please,enter your address!");
        String address = scan_ner.next(); // entering address
        System.out.println("Please,enter your age!");
        int age = scan_ner.nextInt(); // entering age
        String cover = show.purchaser_add(id,name,gender,address,age); // calling purchaser_add function
        System.out.println(cover); // printing the result
    }
    public void order_delete_client_show(){
        System.out.println("Enter order id");
        int order_id = scan_ner.nextInt();      // entering id
        System.out.println("Enter order date.(dd/mm/yyyy)");
        String date = scan_ner.next();      // entering date
        if(da_te_Validator(date) == false){     // checking for real date
            System.out.println("Enter correct date: dd/mm/yyyy");  // if not printing this warning
            System.exit(1);     // stopping program
        }
        System.out.println("Enter number of sits(no more than 300).");
        int sits = scan_ner.nextInt(); // entering number of sits
        if(sits > 300){         // if number of sits is more than 300
            System.out.println("Your number of seats exceeds the limit of our restaurant. PLease,change it!");  // if not printing this warning
            System.exit(1); // stopping program
        }
        System.out.println("Enter purchaser id");
        int purchaser = scan_ner.nextInt();  // entering purchaser id

        String cover = show.order_delete(order_id,date,sits,purchaser); // calling order_delete function
        System.out.println(cover);      // printing the result
    }
        public void delete_client_show(){
            System.out.println("Please,enter your id!");
            int id = scan_ner.nextInt();            // entering id
            System.out.println("Please,enter your name!");
            String name = scan_ner.next();       // entering name
            if(NameValidator(name) == false){       // checking for real name
                System.out.println("Please,enter a real name.");    // if not printing this warning
                System.exit(1);     // stopping program
            }
            System.out.println("Please,enter your gender: M(male),F(female) or O(others)"); // if not printing this warning
            String gender = scan_ner.next();    // entering gender
            if(Gen_der_Validator(gender) == false){     // checking for real gender
                System.out.println("Please, enter correct gender expression. M , F , O ");  // if not printing this warning
                System.exit(1);     // stopping program
            }
            System.out.println("Please,enter your address!");
            String add_ress = scan_ner.next();       // entering address
            System.out.println("Please,enter your age!");
            int a_ge = scan_ner.nextInt();  // entering age
            String cover = show.purchaser_delete(id,name,gender,add_ress,a_ge); // calling purchaser_delete function
            System.out.println(cover); // printing the result
        }
        public void order(){
            System.out.println("Enter order id");
            int order_id = scan_ner.nextInt();  // entering order id
            System.out.println("Enter order date.(dd/mm/yyyy)");
            String date = scan_ner.next();  // entering date
            if(da_te_Validator(date) == false){      // checking for real date
                System.out.println("Enter correct date: dd/mm/yyyy");   // if not printing this warning
                System.exit(1);     // stopping program
            }
            System.out.println("Enter number of sits(no more than 300)");
            int sits = scan_ner.nextInt();  // entering number of sits
            if(sits > 300){         // if number of sits is more than 300
                System.out.println("Your number of seats exceeds the limit of our restaurant. PLease,change it!");  // if not printing this warning
                System.exit(1);         // stopping program
            }
            System.out.println("Enter purchaser id");
            int purchaser_id = scan_ner.nextInt(); // entering purchaser id

            String cover = show.order_add(order_id,date,sits,purchaser_id); // calling function order_add
            System.out.println(cover);  // printing the result
        }
    public void info_res(){
        System.out.println("Welcome to our Vista Restaurant & Bar. Basic information about restaurant:");
        Vista_bar restau_rant = new Vista_bar(); // creating new restaurant
        System.out.println(restau_rant); // printing toString method if Vista_bar
    }
    public void price(){
        System.out.println("Please choose a cuisine from one of the countries represented for your event:");
        System.out.println("1.Kazakhstan");
        System.out.println("2.Russia");
        System.out.println("3.Japan");
        System.out.println("4.Italy");
        try {
            System.out.println("Select option:(1-5)");
            int choice = scan_ner.nextInt(); // entering a choice of purchaser
            if (choice == 1) {
                System.out.println("Choose number of sits:");
                System.out.println("1.0-50");
                System.out.println("2.50-100");
                System.out.println("3.100-200");
                System.out.println("4.200-300");
                int number = scan_ner.nextInt();
                if (number == 1) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 900$");
                    } else {
                        System.out.println("Your price is: 500$");
                    }
                } else if (number == 2) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1100$");
                    } else {
                        System.out.println("Your price is: 700$");
                    }
                } else if (number == 3) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1300$");
                    } else {
                        System.out.println("Your price is:900$");
                    }
                } else if (number == 4) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1500$");
                    } else {
                        System.out.println("Your price is: 1100$");
                    }
                }
            } else if (choice == 2) {
                System.out.println("Choose number of sits:");
                System.out.println("1.0-50");
                System.out.println("2.50-100");
                System.out.println("3.100-200");
                System.out.println("4.200-300");
                int number = scan_ner.nextInt();
                if (number == 1) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 100$");
                    } else {
                        System.out.println("Your price is: 600$");
                    }
                } else if (number == 2) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1200$");
                    } else {
                        System.out.println("Your price is: 800$");
                    }
                } else if (number == 3) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1400$");
                    } else {
                        System.out.println("Your price is:1000$");
                    }
                } else if (number == 4) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1600$");
                    } else {
                        System.out.println("Your price is: 1200$");
                    }
                }
            } else if (choice == 3) {
                System.out.println("Choose number of sits:");
                System.out.println("1.0-50");
                System.out.println("2.50-100");
                System.out.println("3.100-200");
                System.out.println("4.200-300");
                int number = scan_ner.nextInt();
                if (number == 1) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1100$");
                    } else {
                        System.out.println("Your price is: 700$");
                    }
                } else if (number == 2) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1300$");
                    } else {
                        System.out.println("Your price is: 900$");
                    }
                } else if (number == 3) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1500$");
                    } else {
                        System.out.println("Your price is:1100$");
                    }
                } else if (number == 4) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1700$");
                    } else {
                        System.out.println("Your price is: 1300$");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Choose number of sits:");
                System.out.println("1.0-50");
                System.out.println("2.50-100");
                System.out.println("3.100-200");
                System.out.println("4.200-300");
                int number = scan_ner.nextInt();
                if (number == 1) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 900$");
                    } else {
                        System.out.println("Your price is: 500$");
                    }
                } else if (number == 2) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1100$");
                    } else {
                        System.out.println("Your price is: 700$");
                    }
                } else if (number == 3) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1300$");
                    } else {
                        System.out.println("Your price is:900$");
                    }
                } else if (number == 4) {
                    System.out.println("Do you need a presenter? Price with presenter: +400$");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int presenter = scan_ner.nextInt();
                    if (presenter == 1) {
                        System.out.println("Your price is: 1500$");
                    } else {
                        System.out.println("Your price is: 1100$");
                    }
                }
            }
            else{
                System.exit(1);
            }
        }catch (InputMismatchException c){
            System.out.println("Input must be integer");
            scan_ner.nextLine();
        }catch(Exception d){
            System.out.println(d.getMessage());
        }
    }
}
