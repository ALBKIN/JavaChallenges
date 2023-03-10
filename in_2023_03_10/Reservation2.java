// LEARN JAVA / CONDITIONALS OPERATORS / Logical NOT: !

package in_2023_03_10;

public class Reservation2 {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    // constructor method
    public Reservation2(int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
            isConfirmed = false;
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    // confirmation method (którą musiałem poprawić, bo potwierdzała rezerwacje gości poniżej 1 i powyżej 8...)
    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen && guestCount >= 1 && guestCount <= 8 ) {
                System.out.println("Reservation confirmed");
                isConfirmed = true;
            } else {
                System.out.println("Reservation denied");
                isConfirmed = false;
            }
    }

    // inform user method
    public void informUser() {
        // Write conditional here
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }
    // main method
    public static void main(String[] args) {
        Reservation2 partyOfThree = new Reservation2(3, 12, true);
        Reservation2 partyOfFour = new Reservation2(4, 3, true);
        Reservation2 partyOfNine = new Reservation2(9, 100, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
        partyOfNine.confirmReservation();
        partyOfNine.informUser();
    }
}

