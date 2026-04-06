public class CommitCafe {

    private static String barista = "Ajay";
    private static String baristaTitle = "Head Barista";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println(baristaTitle + " " + barista + " brewed a fresh " + drink + "!");
        if (cups % 5 == 0) {
            System.out.println("** Milestone: " + cups + " cups brewed! Keep it going! **");
        }
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + baristaTitle + " " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}