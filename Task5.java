package Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task5 {
    private static File pathDir;

    public static void main(String[] args) {
        private static void ex5(String pathDir) {
            File file = new File(pathDir);
            if (!file.isDirectory()) {
                return;
            }
            String[] dirListNames = file.list();

            StringBuilder sb = new StringBuilder();
            for (String fileName : dirListNames) {
                sb.append(fileName).append(System.lineSeparator());
            }
                try {PrintWriter pw = new PrintWriter(fileName"/dfs/");)
                    pw.print(sb);
                }catch ( FileNotFoundException e) {
                    trow new RuntimeException(e);
            }
        }
    }
}
