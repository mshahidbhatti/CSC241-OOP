/** Run this file's main method after compiling all seven Java files. */
public class CinemaCityDemo {
    public static void main(String[] args) {
        // STEP 1: Create independent Cinema objects.
        Cinema lahore = new Cinema("Central Cinema", "Lahore", 2);
        Cinema islamabad = new Cinema("Capital Cinema", "Islamabad", 1);

        // STEP 2: Cinema creates Screens, each Screen creates its Seats.
        // Row A has 4 seats, B has 6, C has 8, D has 5.
        Screen lahoreScreen1 = lahore.addScreen(1, ScreenType.IMAX,
                                                new int[] {4, 6, 8, 5});
        lahore.addScreen(2, ScreenType.REGULAR, new int[] {3, 5, 7});
        islamabad.addScreen(1, ScreenType.THREE_D, new int[] {5, 7, 5});

        // STEP 3: Configure existing seats; their A1/B6 labels DO NOT change.
        lahoreScreen1.configureSeat('A', 1, SeatType.STANDARD, 800, true);
        lahoreScreen1.configureSeat('B', 6, SeatType.PREMIUM, 1100, false);
        lahoreScreen1.setSeatOutOfService('C', 3, true);

        // STEP 4: CinemaCity aggregates (lists) existing Cinema objects.
        CinemaCity directory = new CinemaCity("CinemaCity Directory", 5);
        directory.addCinema(lahore);
        directory.addCinema(islamabad);
        directory.printDirectory();

        // STEP 5: Ragged 2D array and seat lookup.
        lahoreScreen1.printSeatMap();
        System.out.println("\nRow A seat count: " + lahoreScreen1.getSeatCountInRow('A'));
        System.out.println("Row C seat count: " + lahoreScreen1.getSeatCountInRow('C'));
        System.out.println("Total seats: " + lahoreScreen1.countAllSeats());
        System.out.println("Seat B6: " + lahoreScreen1.findSeat('B', 6));
        System.out.println("Seat A6 exists? " + (lahoreScreen1.findSeat('A', 6) != null));

        // STEP 6: Both references point to the SAME seat object.
        Seat first = lahoreScreen1.findSeat('C', 3);
        Seat second = lahoreScreen1.findSeat('C', 3);
        System.out.println("\nfirst == second? " + (first == second));
        System.out.println("C3 available for physical use? " + second.isAvailableForUse());

        // STEP 7: Same cinema exists independently and in the directory.
        System.out.println("Directory references original Lahore cinema? "
                + (directory.getCinema(0) == lahore));
        System.out.println("Enum category of B6: "
                + lahoreScreen1.findSeat('B', 6).getType());
        // Booking is deliberately excluded; a seat's booking depends on showtime.
    }
}
