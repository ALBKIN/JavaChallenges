// LEARN JAVA / CONDITIONALS OPERATORS / Review

package in_2023_03_10;

public class Reservation3 {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation3(int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    // confirmation method (którą musiałem poprawić, bo potwierdzała rezerwacje gości poniżej 1 i powyżej 8...)
    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen && guestCount >= 1 && guestCount <= 8) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        // Create instances here
        Reservation3 partyOfTen = new Reservation3(10, 20, true);
        Reservation3 partyOfFive = new Reservation3(5, 4, true);
        Reservation3 partyOfNine = new Reservation3(7, 100, false);
        Reservation3 partyOfThree = new Reservation3(3, 50, true);

        partyOfTen.confirmReservation();
        partyOfTen.informUser();
        partyOfFive.confirmReservation();
        partyOfFive.informUser();
        partyOfNine.confirmReservation();
        partyOfNine.informUser();
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
    }
}

