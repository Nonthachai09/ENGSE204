package LAP4;

import java.util.Scanner;

class Player {
    private String username;
    private int level;

    public Player() {
        this.username = "Guest";
        this.level = 1;
    }

    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}

public class LAP4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mode = sc.nextInt();
        Player player;

        if (mode == 1) {
            player = new Player();
        } else {
            String username = sc.next();
            int level = sc.nextInt();
            player = new Player(username, level);
        }

        player.displayProfile();
    }
}
