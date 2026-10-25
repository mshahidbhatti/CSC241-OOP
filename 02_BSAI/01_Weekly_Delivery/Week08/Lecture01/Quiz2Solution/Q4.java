
class Report {
    int[][] scores = {{2, 4}, {5}, {1, 3, 5}};

    int update() {
        int total = 0;

        for (int r = 0; r < scores.length; r++) {
            for (int c = 0; c < scores[r].length; c++) {
                scores[r][c] += r;
                total += scores[r][c];
            }
        }

        return total;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Report report = new Report();

        System.out.println(report.update());
        System.out.println(report.scores[1][0] + " "
                + report.scores[2][2]);
        System.out.println(report.scores.length + " "
                + report.scores[0].length);
    }
}
