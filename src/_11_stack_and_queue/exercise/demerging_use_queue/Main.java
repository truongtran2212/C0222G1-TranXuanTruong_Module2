package _11_stack_and_queue.exercise.demerging_use_queue;

import com.sun.xml.internal.ws.api.server.LazyMOMProvider;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Queue<Employee> nam = new LinkedList<>();
        Queue<Employee> nu = new LinkedList<>();

        employeeList.add(new Nam("Trường", 1998));
        employeeList.add(new Nu("Hà", 1997));
        employeeList.add(new Nu("Hoa", 2000));
        employeeList.add(new Nam("Khoa", 1999));
        employeeList.add(new Nam("Tùng", 1995));

        Collections.sort(employeeList);
        for (int i = 0; i < employeeList.size(); i++) {
            if ((employeeList.get(i).isGender()) == true){
                nam.add(employeeList.get(i));
            }else {
                nu.add(employeeList.get(i));
            }
        }
        String output = "";
        for (int i = 0; i < employeeList.size(); i++) {
            if(!nu.isEmpty()){
                output += nu.poll();
            }
        }
        for (int i = 0; i < employeeList.size(); i++) {
            if(!nam.isEmpty()){
                output += nam.poll();
            }
        }
        System.out.println(output);
    }
}
