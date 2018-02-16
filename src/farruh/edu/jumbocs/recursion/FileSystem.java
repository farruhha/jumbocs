package farruh.edu.jumbocs.recursion;

import java.io.File;

public class FileSystem {

    public static long diskUsage(File root) {
        long total = root.length();

        if (root.isDirectory()) {
            for (String pathName : root.list()) {
                File child = new File(root, pathName);
                total += diskUsage(child);
            }
        }
        System.out.println(total + "\t" + root);
        return total;
    }

    public static void main(String[] args) {
        System.out.println(diskUsage(new File("src/farruh/edu/jumbocs")));
    }
}
