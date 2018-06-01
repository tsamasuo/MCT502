package zw.ac.uz.mct502.Utils;

/**
 * Created by tsamasuo on 01/06/2018.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadText {

    public static String readAll(String filePath) {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

}
