package task.src;

public class Main
{
    public static void main(String... args) {
        String literal1 = "This is Java Lab by string literal";
        String literal2 = "This is Java Lab by string literal";
        String literal3 = "This is Java Lab by string literal";
        String literal4 = "This is Java Lab by string literal" + "Java String is immutable";

        String object1 = new String("This is Java Lab by new invocations");
        String object2 = new String("This is Java Lab by new invocations");

        char[] myCharArray = {'h', 'e', 'l', 'l', 'o', ' ', 'c', 'h' , 'a', 'r'};

        String literalInside = "This is computer science";
        String objectInside = new String("This is computer science");

        System.out.println(literal1);
        System.out.println(object1);
        System.out.println(myCharArray);

        // stored in common Pool
        // String interning
        System.out.println(literal1.intern() == literal2.intern());

        if (literal1 == literal2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (literal1 == literal4) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // COMMON POOL recheck
        if (literal1 == literal2 && literal2 == literal3 && literal3 == literal1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(object1.intern() == object2.intern());

        // stored in Heap
        if (object1 == object2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(literalInside.intern() == objectInside.intern());

        if (literal1.compareTo(literal2) == 0) {
            System.out.println("same string");
        } else {
            System.out.println("Not same string");
        }

        System.out.println(literal1.charAt(5));

        String versity = "AIUBffB";
        System.out.println(versity.indexOf('B'));
        System.out.println(versity.lastIndexOf('B'));

        String lookup = "AIUB FSIT department";
        System.out.println(lookup.substring(4, 9).trim());
        System.out.println(lookup.indexOf(' '));
    }
}
