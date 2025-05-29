// package Mock_Dated_26_05_25;

// // 1. this 
// class Student{
//     String name;
//     int age;

//     Student(){
//        this("harshal", 23); 
//     }
//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//     void getStdDetails(){
//         System.out.println("naem : " + name + " age : " + age);
//     }
// }

// // 2. super
// class Parent{
//     int age = 12;
//     void display(String name){
//         System.out.println(" name : " + name);
//     }
// }
// class Child extends Parent{
//     void getDEtails(){
//         System.out.println("fetched");
//         super.display("harshal");
//     }
// }
// public class this_super {
//     public static void main(String[] args) {
//         // Student s = new Student();
//         // s.getStdDetails();

//         Child p = new Child();
//         p.getDEtails();
//     }
// }
