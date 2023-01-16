import java.util.Arrays;
import java.util.Scanner;

public class Studio {

    class studio {
        private String name;
        private int[][] movies = new int[4][2];
        private int totalAttendance = 0;

        public studio(String name) {
            this.name = name;
        }

        public void addAttendance(int movieIndex, int attendance) {
            movies[movieIndex][0] = movieIndex + 1;
            movies[movieIndex][1] += attendance;
            totalAttendance += attendance;
        }

        public int getTotalAttendance() {
            return totalAttendance;
        }

        public int[][] getMovies() {
            return movies;
        }
    }

    class MovieTheater {
        private studio studio1;
        private studio studio2;

        public MovieTheater() {
            studio1 = new studio("Studio 1");
            studio2 = new studio("Studio 2");
        }

        public void registerAttendance(int studioIndex, int movieIndex, int attendance) {
            if (studioIndex == 1) {
                studio1.addAttendance(movieIndex, attendance);
            } else if (studioIndex == 2) {
                studio2.addAttendance(movieIndex, attendance);
            }
        }

        public int getStudioAttendance(int studioIndex) {
            if (studioIndex == 1) {
                return studio1.getTotalAttendance();
            } else if (studioIndex == 2) {
                return studio2.getTotalAttendance();
            }
            return 0;
        }

        public int[][] getStudioMovies(int studioIndex) {
            if (studioIndex == 1) {
                return studio1.getMovies();
            } else if (studioIndex == 2) {
                return studio2.getMovies();
            }
            return null;

        }
    }

}