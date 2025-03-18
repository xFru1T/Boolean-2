import java.util.Scanner;
class Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = false;
        System.out.print("Print false/true: ");
        x = scanner.nextBoolean();
        x = !x;
        System.out.println("opposite value: " + x);
    }
}