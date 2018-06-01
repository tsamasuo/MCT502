package zw.ac.uz.mct502.Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by tsamasuo on 01/06/2018.
 */
public class AppendFile {

    public void writeFile(File file, String text) throws IOException {
        try {

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            //This will add a new line to the file content
            pw.println("");
            pw.println(text);
            pw.close();

        } catch (IOException e) {

        }
    }
}
