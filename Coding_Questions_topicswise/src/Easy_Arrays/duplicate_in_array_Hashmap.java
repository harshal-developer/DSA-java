package Easy_Arrays;
import java.util.HashMap;
public class duplicate_in_array_Hashmap {
    public static boolean foundDuplicate(int[] nums){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(nums)){
                return true;
            }
            map.put(num, true);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,1};
        boolean isDuplicate = foundDuplicate(nums);
        if(!isDuplicate){
            System.out.println("Duplicate not found");
        }else{
            System.out.println("Duplicate found");
        }
    }
}
