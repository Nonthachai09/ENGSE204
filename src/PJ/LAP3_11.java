package PJ;

import java.util.Scanner;

class SystemConfig {
    private static SystemConfig instance;
    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        serverUrl = "default.server.com";
        maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class LAP3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine().trim();

            if (command.equalsIgnoreCase("SET_URL")) {
                String url = sc.nextLine().trim();
                SystemConfig config = SystemConfig.getInstance();
                config.setServerUrl(url);
            } else if (command.equalsIgnoreCase("SET_MAX")) {
                int count = Integer.parseInt(sc.nextLine().trim());
                SystemConfig config = SystemConfig.getInstance();
                config.setMaxConnections(count);
            } else if (command.equalsIgnoreCase("SHOW")) {
                SystemConfig config = SystemConfig.getInstance();
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }

        sc.close();
    }
}
