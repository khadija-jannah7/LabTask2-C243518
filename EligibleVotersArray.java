import java.util.Scanner;

public class EligibleVotersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total number of people
        System.out.print("Enter number of people: ");
        int N = sc.nextInt();

        // Input minimum age required
        System.out.print("Enter minimum age to vote: ");
        int X = sc.nextInt();

        int[] ages = new int[N];
        int count = 0;

        System.out.println("Enter ages of people:");
        for (int i = 0; i < N; i++) {
            ages[i] = sc.nextInt();
            if (ages[i] >= X) {
                count++;
            }
        }

        System.out.println("Number of eligible voters: " + count);
    }
}


