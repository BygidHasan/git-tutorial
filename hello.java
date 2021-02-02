public class hello {
    public static void main(String[] args) {
        System.out.println("Hello world from vs code ;)");

        greetings("git");
    }

    public static void greetings(String name) {
        System.out.println("bye bye " + name);
    }

    public static int sqr(int x) {
        return x*x;
    }
}