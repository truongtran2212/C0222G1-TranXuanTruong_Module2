package Training.exercise1.controller;

import Training.exercise1.service.MovieService;

import java.util.Scanner;

public class MovieController {
    static Scanner scanner = new Scanner(System.in);
    public static void mainMenuDisplay(){
        MovieService movieService = new MovieService();

        int choose;
        while (true){
            System.out.println("1. Toàn bộ xuất chiếu của rạp");
            System.out.println("2. Thêm mới một suất chiếu");
            System.out.println("3. Xóa xuất chiếu bất kì");
            System.out.println("4. Thoát");
           choose  = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    movieService.displayMovie();
                    break;
                case 2:
                    movieService.addMovie();
                    break;
                case 3:
                    movieService.deleteMovie();
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }
    }
}
