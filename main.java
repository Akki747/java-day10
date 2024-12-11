import java.util.*;
class Constructor {
    int c;
    String b;

    // Correct the constructor name to match the class name
    Constructor() {
        this.c = 345; // Use 'this' in lowercase
        this.b = "Akshaya";
    }

    void display() {
        System.out.println(b + " " + c);
    }
}

public class main {
    public static void main(String[] args) {
        Constructor s = new Constructor();
        s.display();
    }
}
