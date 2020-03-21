
// inherits from the pet class
public class Driver extends Pet {

    // Defualt Constructor

    public Driver(String petType, String petName, int petAge, int dogSpace, int catSpace, int daysStay,
            double amountDue) {
        super(petType, petName, petAge, dogSpace, catSpace, daysStay, amountDue);
    }

    public static void main(String[] args) {
        System.out.println("Verify the Dogs and Cat information collected from check In");

        // create cat object
        Pet myCat = new Pet(null, null, 0, 0, 0, 0, 0);
        myCat.checkIn();
        // create dog object
        Pet myDog = new Pet(null, null, 0, 0, 0, 0, 0);
        myDog.checkIn();

        // verify cat informatin collected

        // verify the cats name collected
        String printCatName = myCat.getPetName();
        System.out.println("Your cat's name is " + printCatName);

        // verify the cats age collected
        int printCatAge = myCat.getPetAge();
        System.out.println(printCatName + " is " + printCatAge + " years old.");

        // verify the cats days stayed
        int printCatDays = myCat.getDaysStay();
        System.out.println(printCatName + " will be staying with us for " + printCatDays + " days.");

        // verify dog information collected

        // verify the dogs name collected
        String printDogName = myDog.getPetName();
        System.out.println("Your dogs's name is " + printDogName);

        // verify the dogs age collected
        int printDogAge = myDog.getPetAge();
        System.out.println(printDogName + " is " + printDogAge + " years old.");

        // verify the dogs days stayed
        int printDogDays = myDog.getDaysStay();
        System.out.println(printDogName + " will be staying with us for " + printDogDays + " days.");

    }

}