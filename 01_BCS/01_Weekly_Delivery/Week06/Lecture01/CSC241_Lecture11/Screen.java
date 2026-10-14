/**
 * A cinema auditorium (for example "Screen 1").
 * Composition: each Screen creates its Seat objects in a ragged 2D array.
 */
public class Screen {
    private final int screenNumber;
    private final ScreenType type;
    private final Seat[][] seats;

    /** seatsPerRow={4,6,8,5} creates A1-A4, B1-B6, C1-C8, D1-D5. */
    public Screen(int screenNumber, ScreenType type, int[] seatsPerRow) {
        if (screenNumber < 1 || type == null || seatsPerRow == null
                || seatsPerRow.length < 1 || seatsPerRow.length > 26) {
            throw new IllegalArgumentException("Invalid screen or row layout");
        }
        this.screenNumber = screenNumber;
        this.type = type;
        this.seats = new Seat[seatsPerRow.length][];

        // DIFFERENT rows may have DIFFERENT numbers of seats.
        for (int row = 0; row < seatsPerRow.length; row++) {
            int seatCount = seatsPerRow[row];
            if (seatCount < 1) {
                throw new IllegalArgumentException("Every row needs at least one seat");
            }
            seats[row] = new Seat[seatCount];
            char letter = (char) ('A' + row);

            // Classroom defaults: last row VIP, row before it PREMIUM.
            SeatType category = SeatType.STANDARD;
            double price = 800.0;
            if (row == seatsPerRow.length - 1) {
                category = SeatType.VIP;
                price = 1500.0;
            } else if (row == seatsPerRow.length - 2) {
                category = SeatType.PREMIUM;
                price = 1100.0;
            }

            for (int col = 0; col < seatCount; col++) {
                seats[row][col] = new Seat(letter, col + 1,
                                           category, price, false);
            }
        }
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public ScreenType getType() {
        return type;
    }

    public int getRowCount() {
        return seats.length;
    }

    public int getSeatCountInRow(char rowLetter) {
        int row = Character.toUpperCase(rowLetter) - 'A';
        if (row < 0 || row >= seats.length) {
            return 0;
        }
        return seats[row].length;
    }

    /** Return null if that seat does not exist. Seat numbers start from 1. */
    public Seat findSeat(char rowLetter, int seatNumber) {
        int row = Character.toUpperCase(rowLetter) - 'A';
        int col = seatNumber - 1;
        if (row < 0 || row >= seats.length
                || col < 0 || col >= seats[row].length) {
            return null;
        }
        return seats[row][col];
    }

    public boolean configureSeat(char rowLetter, int seatNumber,
                                 SeatType type, double basePrice,
                                 boolean wheelchairAccessible) {
        Seat found = findSeat(rowLetter, seatNumber);
        if (found == null) {
            return false;
        }
        found.configure(type, basePrice, wheelchairAccessible);
        return true;
    }

    public boolean setSeatOutOfService(char rowLetter, int seatNumber,
                                       boolean outOfService) {
        Seat found = findSeat(rowLetter, seatNumber);
        if (found == null) {
            return false;
        }
        found.setOutOfService(outOfService);
        return true;
    }

    public int countAllSeats() {
        int total = 0;
        for (Seat[] row : seats) {
            total += row.length;
        }
        return total;
    }

    public void printSeatMap() {
        System.out.println("\n======== Screen " + screenNumber + " [" + type + "] ========");
        System.out.println("               MOVIE SCREEN (front)");
        for (int row = 0; row < seats.length; row++) {
            System.out.print("Row " + (char) ('A' + row) + " | ");
            for (int col = 0; col < seats[row].length; col++) {
                System.out.printf("[%-6s] ", seats[row][col].mapLabel());
            }
            System.out.println();
        }
        System.out.println("Total: " + countAllSeats() + " seats; "
                + "S=Standard P=Premium V=VIP X=out of service *=accessible");
    }
}
