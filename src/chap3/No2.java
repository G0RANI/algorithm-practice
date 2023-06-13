package chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aInput = in.nextInt();

        int[] aTargets = new int[aInput];
        for(int i = 0; i <aInput; i++) {
            aTargets[i] = in.nextInt();
        }

        int bInput = in.nextInt();
        int[] bTargets = new int[bInput];
        for(int i = 0; i <bInput; i++) {
            bTargets[i] = in.nextInt();
        }
        for(int result : solution(aInput, aTargets, bInput, bTargets)) System.out.printf(result + " ");;

    }

    private static ArrayList<Integer> solution(int aInput,
                                 int[] aTargets,
                                 int bInput,
                                 int[] bTargets) {
        ArrayList<Integer> results = new ArrayList<>();
        Arrays.sort(aTargets);
        Arrays.sort(bTargets);
        int aPoint = 0, bPoint = 0;

        while(aPoint < aInput && bPoint < bInput) {
            if(aTargets[aPoint] == bTargets[bPoint]) {
                results.add(aTargets[aPoint++]);
                bPoint++;
            } else if(aTargets[aPoint] < bTargets[bPoint]){
                aPoint++;
            } else {
                bPoint++;
            }
        }

        return results;
    }

}
