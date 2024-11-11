package slideexamples;

import java.io.*;

public class ByteOutputStream {
    public static void demonstrateByteOutput() throws IOException {
        String str = "Jack and Jill went up the hill";
        byte[] b = str.getBytes();
        ByteArrayOutputStream b1 = new ByteArrayOutputStream();
        b1.write(b);
        System.out.println("Writing the contents of a ByteArrayOutputStream");
        System.out.println(b1.toString());
    }
}
