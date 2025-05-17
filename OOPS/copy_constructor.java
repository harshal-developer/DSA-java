package OOPS;

class Parent{
    String name;
    String relation;
    Parent(String name, String relation){
        this.name = name;
        this.relation = relation;
    }
    Parent(Parent p){
        name = p.name;
        relation = p.relation;
    }

    void displayParent(){
        System.out.println("Name of the parent is " + name + " and relation with the studnet is " + relation);
    }
}

public class copy_constructor {
    public static void main(String[] args){
        Parent p1 = new Parent("Harshal", "Father");
        Parent p2 = new Parent(p1);

        p2.displayParent(); //p1.display or p2.display generate the same output
    }
}
