package PJ;

import java.util.Scanner;

class SystemLogger {
    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        switch(level) {
            case 1: return "INFO";
            case 2: return "DEBUG";
            case 3: return "ERROR";
            default: return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if(newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }

    public static void log(int messageLevel, String message) {
        if(messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
        }
    }
}

public class LAP3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++) {
            String command = sc.next();
            if(command.equalsIgnoreCase("SET")) {
                int newLevel = sc.nextInt();
                SystemLogger.setLogLevel(newLevel);
            } else if(command.equalsIgnoreCase("LOG")) {
                int msgLevel = sc.nextInt();
                sc.nextLine();
                String message = sc.nextLine();
                SystemLogger.log(msgLevel, message);
            }
        }
        sc.close();
    }
}
