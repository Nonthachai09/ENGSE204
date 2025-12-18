package LAP4;

import java.util.*;

final class AuditRecord {
    private final String user;
    private final String[] logs;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] src) {
        this.user = user;
        int len = Math.min(src.length, maxMessages);
        this.logs = new String[len];
        int start = src.length - len;
        for (int i = 0; i < len; i++) {
            logs[i] = src[start + i];
        }
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Invalid policy.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord add(String msg) {
        if (logs.length >= maxMessages) {
            System.out.println("Log is full.");
            return this;
        }
        String[] n = Arrays.copyOf(logs, logs.length + 1);
        n[n.length - 1] = msg;
        System.out.println(msg + " added.");
        return new AuditRecord(user, n);
    }

    public void display() {
        System.out.print("User: " + user + ", Logs: " + logs.length + " [");
        for (int i = 0; i < logs.length; i++) {
            System.out.print(logs[i]);
            if (i < logs.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

public class LAP4_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = sc.next();
        AuditRecord ar = new AuditRecord(user);

        while (sc.hasNext()) {
            String cmd = sc.next();
            if (cmd.equals("SET")) {
                sc.next();
                int v = sc.nextInt();
                AuditRecord.setPolicy(v);
            } else if (cmd.matches("-?\\d+")) {
                AuditRecord.setPolicy(Integer.parseInt(cmd));
            } else {
                ar = ar.add(cmd);
            }
        }
        ar.display();
    }
}