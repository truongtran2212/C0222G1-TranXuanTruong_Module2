package Training.exercise1.service;

import Training.exercise1.model.MovieTheater;
import Training.exercise1.util.ReadAndWrite;
import Training.exercise1.util.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService implements Movie {
    static final String ID_MOVIE = "^CI-[0-9]{4}$";
    static Scanner scanner = new Scanner(System.in);

    static List<MovieTheater> movieList = new ArrayList<>();
    public static final String MOVIE_FILE = "src\\Training\\exercise1\\data\\movie.csv";
    static List<String[]> list = new ArrayList<>();

    public void displayMovie() {
        list = ReadAndWrite.readFile(MOVIE_FILE);
        movieList.clear();
        MovieTheater movieTheater;

        for (String[] item : list) {
            movieTheater = new MovieTheater(item[0], item[1], item[2], Integer.parseInt(item[3]));
            movieList.add(movieTheater);
        }
        for (MovieTheater item : movieList) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void addMovie() {
        list = ReadAndWrite.readFile(MOVIE_FILE);
        System.out.println("Nhập id phim");
        String idMovie = inputIdMovie();

        boolean flag = true;
        for (int i = 0; i < movieList.size(); i++) {
            if (idMovie.equals(movieList.get(i).getIdMovie())) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println("id này đã bị trùng");
        } else {
            System.out.println("Nhập tên phim");
            String nameMovie = scanner.nextLine();

            System.out.println("Nhập ngày chiếu");
            String showDate = scanner.nextLine();

            System.out.println("Nhập số lượng vé");
            int numberOfTicket;
            while (true) {
                try {
                    numberOfTicket = Integer.parseInt(scanner.nextLine());
                    if (numberOfTicket > 0) {
                        break;
                    } else {
                        System.out.println("Phải nhập số nguyên dương");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("input number");
                }
            }

            movieList.add(new MovieTheater(idMovie, nameMovie, showDate, numberOfTicket));
            String line;

            line = idMovie + "," + nameMovie + "," + showDate + "," + numberOfTicket;

            ReadAndWrite.writeFile(MOVIE_FILE, line);
        }

    }

    public void deleteMovie() {
        list = ReadAndWrite.readFile(MOVIE_FILE);
        displayMovie();
        System.out.println("Nhập id phim");
        String idMovie = inputIdMovie();

        for (int i = 0; i < movieList.size(); i++) {
            if (idMovie.equals(movieList.get(i).getIdMovie())) {
                movieList.remove(i);
                System.out.println("Đã xóa thành công");
                break;
            } else {
                System.out.println("Không có mã chiếu này");
                idMovie = inputIdMovie();
            }
        }
    }

    public static String inputIdMovie() {
        return Regex.regexString(scanner.nextLine(), ID_MOVIE, "Wrong form, form CI-XXXX (XXXX input number)");
    }
}
