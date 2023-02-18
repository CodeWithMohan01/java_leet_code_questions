package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        // initiliation
        for(int i=0; i<5; i++){
            List.add(new ArrayList<>());
        }
        for(int i=0; i<10; i++){
            List.get(i).add(in.nextInt());
        }
        for(int i=0; i<10; i++){
                System.out.println(List.get(i));
                
        }
    }
}
