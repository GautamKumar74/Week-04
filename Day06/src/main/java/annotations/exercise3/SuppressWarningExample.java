package annotations.exercise3;

import java.util.ArrayList;

public class SuppressWarningExample {

    @SuppressWarnings("unchecked") // Suppresses unchecked type warnings
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // No generics used (raw type)

        list.add("Hello");
        list.add(123); // Mixed types

        System.out.println(list); // Output: [Hello, 123]
    }
}

