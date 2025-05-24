

public class searchInStrings {
    public static void main(String[] args) {
        String text = "Harshal is a good boy";
        String target = "good";
        boolean check = searchHere(text.toLowerCase(),target);
        if (check){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
    static boolean searchHere(String text, String target){
//        int index = text.indexOf(target);
//        System.out.println(index);

        String[] arr = text.split("\\W+");

//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            String element = arr[i];
            if(element.equals(target)){
//                System.out.println("found");
                return true;
            }
        }
        return false;
    }
}
