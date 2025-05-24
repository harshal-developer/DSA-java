package Hashing.Common_problems;

import java.util.HashSet;

public class Intersection{
    public static void main(String[] args){
        int[] num1 = {1,2,24,343,3,2,4};
        int[] num2 = {2,1,23,2,23,45,24};
        // prints common elements between two arrays 

        HashSet<Integer> set1 = new HashSet<>();

        for(int num : num1){
            set1.add(num);
        }

        HashSet<Integer> solution = new HashSet<>();
        for(int num : num2){
            if(set1.contains(num)){
                solution.add(num);
            }
        }
        System.out.println(solution);
    }
}