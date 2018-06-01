package zw.ac.uz.mct502.algorithms;

/**
 * Created by tsamasuo on 31/05/2018.
 */
import zw.ac.uz.mct502.Utils.AppendFile;

import java.io.File;
import java.io.IOException;

public class Naive {

    public static void search(String text, String pat) throws IOException
    {

        text.length();
        int M = pat.length();
        int N = text.length();
/* A loop to slide pat one by one */

        for (int i = 0; i <= N - M; i++) {
            int j;
/* For current index i, check for match */
        for (j = 0; j < M; j++)
            if (text.charAt(i + j) != pat.charAt(j)) break;

        if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            System.out.println("Pattern found at index " + i);

        }
    }
}

