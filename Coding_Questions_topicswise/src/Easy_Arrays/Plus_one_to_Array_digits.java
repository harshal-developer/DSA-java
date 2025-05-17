package Easy_Arrays;

import java.math.BigInteger;

public class Plus_one_to_Array_digits {
    public static BigInteger getNumAfterPlusOne(int[] nums){
        StringBuilder number = new StringBuilder();
        for(int num : nums){
            number.append(num);
        }

        BigInteger addOne = new BigInteger(number.toString());
        return addOne.add(BigInteger.ONE);
    }
    public static void main(String[] args) {
        int[] nums = {9,9,9};
        BigInteger num = getNumAfterPlusOne(nums);
        System.out.println(num);
    }
}
