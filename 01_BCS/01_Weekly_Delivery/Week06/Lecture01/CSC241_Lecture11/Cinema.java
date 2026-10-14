/**
 * A physical cinema venue containing auditoriums.
 * Composition: the Cinema creates and owns its Screens.
 */
public class Cinema {
    private final String name;
    private final String city;
    private final Screen[] screens;
    private int screenCount;

    public Cinema(String name, String city, int maximumScreens) {
        if (name == null || name.isBlank() || city == null || city.isBlank()
                || maximumScreens < 1) {
            throw new IllegalArgumentException("Invalid cinema information");
        }
        this.name = name;
        this.city = city;
        this.screens = new Screen[maximumScreens];
        this.screenCount = 0;
    }

    /** Screen is created INSIDE Cinema, illustrating composition. */
    public Screen addScreen(int screenNumber, ScreenType type, int[] layout) {
        if (screenCount == screens.length || getScreen(screenNumber) != null) {
            throw new IllegalStateException("Screen capacity full or number already used");
        }
        Screen screen = new Screen(screenNumber, type, layout);
        screens[screenCount] = screen;
        screenCount++;
        return screen;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getScreenCount() {
        return screenCount;
    }

    /** Find by actual screen NUMBER, not array index. */
    public Screen getScreen(int screenNumber) {
        for (int i = 0; i < screenCount; i++) {
            if (screens[i].getScreenNumber() == screenNumber) {
                return screens[i];
            }
        }
        return null;
    }

    public void printScreens() {
        System.out.println(name + " (" + city + "):");
        for (int i = 0; i < screenCount; i++) {
            Screen screen = screens[i];
            System.out.println("  Screen " + screen.getScreenNumber()
                    + " [" + screen.getType() + "]: "
                    + screen.countAllSeats() + " seats");
        }
    }
}
