// Noah Pohl
// 3-11-20
// Cat.java

// inherits from the Pet class
public class Cat extends Pet {
    
    // Constructor for Cat class
    public Cat(String petType, String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue) {
        super(petType, petName, petAge, dogSpace, catSpace, daysStay, amountDue);
    
    }

    // catSpaceNbr method
    public void catSpaceNbr() {

        getCatSpace();
        catSpaceNbr();
    }

    public static void main(String[] args) {
        Pet myCuteCat = new Pet(null, null, 0, 0, 0, 0, 0);
        myCuteCat.checkIn();
    }

   

}
