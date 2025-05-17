public class pattern {
    public static void main(String[] args) {
//    *****
//    *****
//    *****
//    *****
//        for(int i = 1; i < 5; i++){
//            for(int j = 1; j < 5; j++){
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }

//*
//**
//***
//****
//*****
//        for(int i = 1; i <= 5; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//*****
//****
//***
//**
//*
//        for(int i = 1; i <= 5; i++){
//            for(int j = 5; j >= i; j--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//    *
//   ***
//  *****
// *******
//*********
//        for(int i = 1; i<= 5; i++){
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print(" ");
//            }
//            // Print stars
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


//*********
// *******
//  *****
//   ***
//    *
//        for(int i = 5; i >= 1; i--){
//            for(int j = i; j <= 5; j++){
//                System.out.print(" ");
//            }
//            for(int j = i * 2 -1; j >= 1; j--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
        for (int i = 1; i <= 5; i++) {
            System.out.println(" ".repeat(5 - i) + "*".repeat(2 * i - 1));
        }

        for (int i = 5 - 1; i >= 1; i--) {
            System.out.println(" ".repeat(5 - i) + "*".repeat(2 * i - 1));
        }
    }
}
