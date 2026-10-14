public class Seat {
    private final char rowLetter;
    private final int seatNumber;
    private SeatType type;
    private double basePrice;
    private boolean wheelchairAccessible;
    private boolean outOfService;

    // Seats are constructed by Screen in this classroom design.
    Seat(char rowLetter, int seatNumber, SeatType type,
         double basePrice, boolean wheelchairAccessible) {
        if (rowLetter < 'A' || rowLetter > 'Z' || seatNumber < 1) {
            throw new IllegalArgumentException("Invalid seat position");
        }
        configure(type, basePrice, wheelchairAccessible);
        this.rowLetter = rowLetter;
        this.seatNumber = seatNumber;
        this.outOfService = false;
    }

    public String getLabel() {
        return "" + rowLetter + seatNumber;
    }

    public SeatType getType() {
        return type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isWheelchairAccessible() {
        return wheelchairAccessible;
    }

    public boolean isOutOfService() {
        return outOfService;
    }

    // A cinema administrator may change the classification of an existing seat.
    public void configure(SeatType type, double basePrice,
                          boolean wheelchairAccessible) {
        if (type == null || basePrice < 0) {
            throw new IllegalArgumentException("Invalid seat type or price");
        }
        this.type = type;
        this.basePrice = basePrice;
        this.wheelchairAccessible = wheelchairAccessible;
    }

    public void setOutOfService(boolean value) {
        outOfService = value;
    }

    public boolean isAvailableForUse() {
        return !outOfService;
    }


    public String mapLabel() {
        if (outOfService) {
            return getLabel() + "-X";
        }
        String code;
        if (type == SeatType.VIP) {
            code = "V";
        } else if (type == SeatType.PREMIUM) {
            code = "P";
        } else {
            code = "S";
        }
        return getLabel() + "-" + code + (wheelchairAccessible ? "*" : "");
    }

    @Override
    public String toString() {
        return getLabel() + " [" + type + ", example PKR " + basePrice
                + ", wheelchair accessible=" + wheelchairAccessible
                + ", out of service=" + outOfService + "]";
    }
}
