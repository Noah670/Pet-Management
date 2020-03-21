// Pet.java
// Noah Pohl
// 3-20-20 

import java.util.Scanner;

public class Pet {

    // Instance private Variables
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpace;
    private int catSpace;
    private int daysStay;
    private double amountDue;

    // Default constructor for Pet class
    public Pet(String petType, String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpace = dogSpace;
        this.catSpace = catSpace;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    // checkIn method
    public void checkIn() {

        // initial Cat space
        setCatSpace(12);

        // intial Cat space
        setDogSpace(30);

        System.out.print("Welcome, are you checking in a dog or cat:");

        // input from Scanner class
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();

        // determine if user is checking in a cat or dog
        if (userChoice.equals("cat")) {
            System.out.println("meow meow");
            // check if cat space is available
            if (getCatSpace() >= 1) {
                System.out.println("Cat space availalbe hooray!");
                System.out.println("Is your Cat a 'new' or 'returning' visitor?");
                // check if user cat is a new or returning visitor
                String catVisitor = input.nextLine();
                if (catVisitor.equals("new")) {
                    System.out.println("Hey new visitor");
                    System.out.println("Please allow us to collect some information about your cat:");
                    System.out.println("What is your Cat name?");
                    String newCatName = input.nextLine();
                    setPetName(newCatName);
                    System.out.println("How old is your Cat?");
                    int newCatAge = input.nextInt();
                    setPetAge(newCatAge);
                    
                    System.out.println("How many days will your Cat be staying with us?");
                    int catDays = input.nextInt();
                    // set the amount of days 
                    setDaysStay(catDays);

                    System.out.println("Thank you for the cat information!");
                    // decrease the avaialble slot of cat space by one
                    int currentCatSpace = getCatSpace();
                    setCatSpace(currentCatSpace - 1);

                } else if (catVisitor.equals("returning")) {
                    System.out.println("It is good to see you again!");
                    System.out.println("Please let us update some of your cat information");

                    System.out.println("How many days will your Cata be staying with us?");
                    int catDays = input.nextInt();
                    // set the amount of days for returning cats
                    setDaysStay(catDays);

                    // decrease avaialble cat space
                    int currentCatSpace = getCatSpace();
                    setCatSpace(currentCatSpace - 1);
                    updatePet();

                }

            } else {
                System.out.println("Sorry no room left in Cat space");

            }
        } else if (userChoice.equals("dog")) {
            System.out.println("woof woof");
            // check if dog space is available
            if (getDogSpace() >= 1) {
                System.out.println("Dog space availale hooray!");
                System.out.println("Is your Dog a 'new' or 'returning' visitor?");
                // check is user Dog is a new or returning visitor
                String dogVisitor = input.nextLine();
                if (dogVisitor.equals("new")) {
                    System.out.println("Welcome new visitor!");
                    System.out.println("Please allow us to collect some information about your dog:");
                    System.out.println("What is your dog name?");
                    String newDogName = input.nextLine();
                    setPetName(newDogName);
                    System.out.println("Now how old is your dog?");
                    int newDogAge = input.nextInt();
                    setPetAge(newDogAge);

                    System.out.println("How many days will your dog be staying with us?");
                    int dogDays = input.nextInt();
                    // check if grooming services for dogs are needed
                    if (dogDays >= 2){
                        System.out.println("Grooming services are avaialble for your dog!");
                    } else{
                        System.out.println("Grooming is not availalbe for your dog");
                    }

                    System.out.println("Thank you for the dog information!");

                    // decrease dog space by 1
                    int currentDogSpace = getDogSpace();
                    setDogSpace(currentDogSpace - 1);
                } else if (dogVisitor.equals("returning")) {
                    System.out.println("It is good to see you again!");
                    System.out.println("Please allow us to update some of your dog information");

                    System.out.println("How many days will your dog be staying with us?");
                    int dogDays = input.nextInt();
                    // check if grooming for returning dogs is needed 
                    if(dogDays >= 2){
                        System.out.println("Grooming services are available for your dog!");
                    } else{
                        System.out.println("Grooming is not available for your dog");
                    }

                    // decrease dog space by 1 for returning
                    int currentDogSpace = getDogSpace();
                    setDogSpace(currentDogSpace - 1);
                    updatePet();
                }

            } else {
                System.out.println("Sorry no room left in Dog space");
            }
        } else{
            System.out.println("Invalid choice, please select 'cat or 'dog'");
            checkIn();
        }

        // checkIn();
    }

    // checkOut method
    public void checkOut() {

        checkOut();
    }

    // getPet method
    public void getPet() {
        getPet();
    }

    // createPet method
    public void createPet() {
        createPet();
    }

    // updatePet method
    public void updatePet() {
        //updatePet();
    }

    

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getDogSpace() {
        return dogSpace;
    }

    public void setDogSpace(int dogSpace) {
        this.dogSpace = dogSpace;
    }

    public int getCatSpace() {
        return catSpace;
    }

    public void setCatSpace(int catSpace) {
        this.catSpace = catSpace;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

}
