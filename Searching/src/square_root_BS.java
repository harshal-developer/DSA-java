import java.util.Scanner;

public class square_root_BS {
    public static int findRootUsingBS(int no){
        int low = 0;
        int high = no;
        int nearestroot = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(no == (long)mid*mid){
                return mid;
            }else if(no > (long)mid*mid){
                nearestroot = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return nearestroot;
    }
    public static void main(String[] args){
//        sqroot using binary search
        System.out.println("Enter any no you want to find root : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("FINDING ROOT ..........");
        int sqroot = findRootUsingBS(number);
        System.out.println("root of " + number + " is " + sqroot);

    }
}
