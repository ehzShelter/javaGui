import java.io.Console;

public class IntroConsole {
    public static void main(String ... args) {
        Console myConsole = System.console();
        String name = myConsole.readLine("What is your name ?");
        myConsole.printf("Hello %s\n", name);
    }
}
