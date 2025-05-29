

// singleton class 
// Only one principle monitoring all students 
// Singleton class - Only one Principal allowed
class Principal {
    private static Principal instance; // static instance

    private Principal() {
        System.out.println("Principal object created");
    }

    public static Principal getInstance() {
        if (instance == null) {
            instance = new Principal();
        }
        return instance;
    }

    public void monitorStudent(String studentName) {
        System.out.println("Principal is monitoring: " + studentName);
    }

      @Override
    public String toString() {
        return "Singleton Principal Instance @ " + Integer.toHexString(hashCode());
    }
}

// Regular Student class - Many students allowed
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public void reportToPrincipal() {
        Principal p = Principal.getInstance();  // all students talk to same principal

        Principal q = Principal.getInstance();
        // Pro tip : here you can see we create new objects but these are not two objects , these are two references pointing towards same object single principal

        // 7a81197d : this is default toString() output of an object, inherited form Object class in java 
        System.out.println(p); // value : 7a81197d
        System.out.println(q); // value : 7a81197d
        // q.monitorStudent(name);
        p.monitorStudent(name);
    }
}

public class Singleton_class {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");    
        // Student s2 = new Student("Anjali");

        s1.reportToPrincipal();
        // s2.reportToPrincipal();
    }
}
