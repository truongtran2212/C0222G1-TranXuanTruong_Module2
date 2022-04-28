package _case_study.ultis;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class TryCatch {
    public static int check (){
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        boolean flag = true;
        try{
            while(flag){
                choose = Integer.parseInt(scanner.nextLine());
                flag = false;
            }
        }catch(NumberFormatException e){
            System.out.println("Wrong format. Enter above option's number");
        }
        return choose;
    }
}
