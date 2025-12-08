package PJ;

import java.util.Scanner;

class DatabaseConnection {
    private String connectionString;
    private boolean connected;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    public boolean isConnected() {
        return connected;
    }

    public void connect() {
        if (!connected) {
            connected = true;
            System.out.println("Connected to " + connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    public void disconnect() {
        if (connected) {
            connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class LAP3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String conn = sc.nextLine();

        DatabaseConnection db = new DatabaseConnection(conn);

        db.connect();
        db.disconnect();
        db.disconnect();

        System.out.println(db.isConnected());
    }
}
