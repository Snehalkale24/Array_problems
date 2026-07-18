import java.util.*;

public class App {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        Team t = new Team();

        System.out.println("Enter Team id:");
        t.teamId = s.nextInt();

        // s.nextLine();

        System.out.println("Enter Team Name:");
        t.teamName = s.nextInt();

        for (int i = 0; i < 11; i++) {

            System.out.println("Enter Player Name:");
            t.players[i] = s.nextInt();

            System.out.println("Enter Runs:");
            t.runs[i] = s.nextInt();

            // s.nextLine();
        }

        System.out.println("\nTeam Id : " + t.teamId);
        System.out.println("Team Name : " + t.teamName);

        System.out.println("\nPlayer Name\tRuns");

        for (int i = 0; i < 11; i++) {
            System.out.println(t.players[i] + "\t\t" + t.runs[i]);
        }

        s.close();
    }
}