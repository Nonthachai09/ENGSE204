package LAP4;

import java.util.Scanner;

class Resource {
    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Resource " + id + " finalized (destroyed).");
        super.finalize();
    }
}

public class LAP4_7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String id1 = sc.nextLine();
        String id2 = sc.nextLine();
        String id3 = sc.nextLine();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null;
        r2 = null;
        System.gc();
        System.runFinalization();
        Thread.sleep(100);

        r3 = null;
        System.gc();
        System.runFinalization();
        Thread.sleep(100);
    }
}
