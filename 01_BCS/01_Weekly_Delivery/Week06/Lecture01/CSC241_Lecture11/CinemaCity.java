/**
 * A directory that lists independently created Cinema objects.
 * Aggregation: Cinema objects can exist without this directory.
 */
public class CinemaCity {
    private final String name;
    private final Cinema[] cinemas;
    private int cinemaCount;

    public CinemaCity(String name, int maximumCinemas) {
        if (name == null || name.isBlank() || maximumCinemas < 1) {
            throw new IllegalArgumentException("Invalid directory information");
        }
        this.name = name;
        this.cinemas = new Cinema[maximumCinemas];
        this.cinemaCount = 0;
    }

    /** Stores a reference to an EXISTING Cinema; it does not create one. */
    public void addCinema(Cinema cinema) {
        if (cinema == null || cinemaCount >= cinemas.length) {
            throw new IllegalArgumentException("Cinema missing or directory full");
        }
        for (int i = 0; i < cinemaCount; i++) {
            if (cinemas[i] == cinema) {
                throw new IllegalArgumentException("Cinema already listed");
            }
        }
        cinemas[cinemaCount] = cinema;
        cinemaCount++;
    }

    /** Zero-based index into the directory; null when no entry exists. */
    public Cinema getCinema(int index) {
        if (index < 0 || index >= cinemaCount) {
            return null;
        }
        return cinemas[index];
    }

    public void printDirectory() {
        System.out.println("\n========== " + name + " ==========");
        for (int i = 0; i < cinemaCount; i++) {
            cinemas[i].printScreens();
        }
    }
}
