import java.util.Scanner;

public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        System.out.println("\nTower of Hanoi solution for " + n + " disks:\n");
        solveHanoi(n, 'A', 'B', 'C'); // A=source, B=auxiliary, C=destination

        scanner.close();
    }
}
