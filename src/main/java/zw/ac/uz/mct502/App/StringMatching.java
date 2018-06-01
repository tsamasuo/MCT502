package zw.ac.uz.mct502.App;

/**
 * Created by tsamasuo on 31/05/2018.
 */

import zw.ac.uz.mct502.algorithms.BoyerMoore;
import zw.ac.uz.mct502.algorithms.KnuthMorris;
import zw.ac.uz.mct502.algorithms.Naive;
import zw.ac.uz.mct502.Utils.ReadText;
import zw.ac.uz.mct502.Utils.AppendFile;
import zw.ac.uz.mct502.algorithms.RabinKarp;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;


public class StringMatching {



   // public String getFilePath(){ return this.filePath;}

    public static void main(String[] args) throws IOException{
        String filePath = null;

        String pattern = "Princess Mary";
        Naive naive = new Naive();
        KnuthMorris knuthMorris = new KnuthMorris();
        BoyerMoore boyerMoore = new BoyerMoore(pattern);
        RabinKarp rabinKarp = new RabinKarp();
        AppendFile appendFile = new AppendFile();

        File results = new File("C:/MSc/StringMatching/results.txt");

        int prime = 7;

        String test = ReadText.readAll("C:/MSc/StringMatching/animal.txt");

        //Rabin Karp Test

        long startTime4 = System.currentTimeMillis();
        Runtime runtime4 = Runtime.getRuntime();
        long usedMemoryBefore4 = runtime4.totalMemory() - runtime4.freeMemory();
        rabinKarp.search(pattern, test, prime);
        //System.out.println("\nUsed Memory before " + usedMemoryBefore2);
        long usedMemoryAfter4 = runtime4.totalMemory() - runtime4.freeMemory();
        //System.out.println("Used Memory after : " + usedMemoryAfter2);
        //System.out.println("\nMemory increased : " + (usedMemoryAfter2- usedMemoryBefore2));
        long endTime4 = System.currentTimeMillis();
        //System.out.println("\nTime taken : " + (endTime2 - startTime2) + " milliseconds\n");


        //Naive Algorithim test
        long startTime = System.currentTimeMillis();
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        naive.search(test, pattern);
        System.out.println("\nUsed Memory before " + usedMemoryBefore);
        appendFile.writeFile(results,"\nUsed Memory before " + usedMemoryBefore);
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        //System.out.println("Used Memory after : " + usedMemoryAfter);
        //System.out.println("\nMemory increased : " + (usedMemoryAfter- usedMemoryBefore));
        long endTime = System.currentTimeMillis();
        //System.out.println("\nTime taken : " + (endTime - startTime) + " milliseconds\n");


        //KMP Algorithim test
        long startTime2 = System.currentTimeMillis();
        Runtime runtime2 = Runtime.getRuntime();
        long usedMemoryBefore2 = runtime2.totalMemory() - runtime2.freeMemory();
        knuthMorris.KMPSearch(test, pattern);
        //System.out.println("\nUsed Memory before " + usedMemoryBefore2);
        long usedMemoryAfter2 = runtime2.totalMemory() - runtime2.freeMemory();
        //System.out.println("Used Memory after : " + usedMemoryAfter2);
        //System.out.println("\nMemory increased : " + (usedMemoryAfter2- usedMemoryBefore2));
        long endTime2 = System.currentTimeMillis();
        //System.out.println("\nTime taken : " + (endTime2 - startTime2) + " milliseconds\n");

        //Boyer Moore Algorithim test
        long startTime3 = System.currentTimeMillis();
        Runtime runtime3 = Runtime.getRuntime();
        long usedMemoryBefore3 = runtime3.totalMemory() - runtime3.freeMemory();
        //boyerMoore.search(test);

        ArrayList<Integer> offset = boyerMoore.search(test);
        // print results
        System.out.println("Offset: "+ offset);
        //System.out.println("\nUsed Memory before " + usedMemoryBefore3);
        long usedMemoryAfter3 = runtime3.totalMemory() - runtime3.freeMemory();
        //System.out.println("Used Memory after : " + usedMemoryAfter3);
        //System.out.println("\nMemory increased : " + (usedMemoryAfter3- usedMemoryBefore3));
        long endTime3 = System.currentTimeMillis();
        //System.out.println("\nTime taken : " + (endTime3 - startTime3) + " milliseconds\n");




        System.out.println("Results of Test\n");
        System.out.println("Naive");
        appendFile.writeFile(results,"Naive");
        System.out.println("Used Memory before " + usedMemoryBefore + "Used Memory after : " + usedMemoryAfter + " Memory increased : " + (usedMemoryAfter-usedMemoryBefore) );
        appendFile.writeFile(results,"Used Memory before " + usedMemoryBefore + "Used Memory after : " + usedMemoryAfter + " Memory increased : " + (usedMemoryAfter-usedMemoryBefore) );
        System.out.println("Time taken : " + (endTime - startTime) + " milliseconds\n");
        appendFile.writeFile(results,"Time taken : " + (endTime - startTime) + " milliseconds\n");

        System.out.println("KMP");
        appendFile.writeFile(results,"KMP");
        System.out.println("Used Memory before " + usedMemoryBefore2 + "Used Memory after : " + usedMemoryAfter2 + " Memory increased : " + (usedMemoryAfter2-usedMemoryBefore2) );
        appendFile.writeFile(results,"Used Memory before " + usedMemoryBefore2 + "Used Memory after : " + usedMemoryAfter2 + " Memory increased : " + (usedMemoryAfter2-usedMemoryBefore2) );
        System.out.println("Time taken : " + (endTime2 - startTime2) + " milliseconds\n");
        appendFile.writeFile(results,"Time taken : " + (endTime2 - startTime2) + " milliseconds\n");

        System.out.println("Boyer Moore");
        appendFile.writeFile(results,"Boyer Moore");
        System.out.println("Used Memory before " + usedMemoryBefore3 + "Used Memory after : " + usedMemoryAfter3 + " Memory increased : " + (usedMemoryAfter3-usedMemoryBefore3) );
        appendFile.writeFile(results,"Used Memory before " + usedMemoryBefore3 + "Used Memory after : " + usedMemoryAfter3 + " Memory increased : " + (usedMemoryAfter3-usedMemoryBefore3) );
        System.out.println("Time taken : " + (endTime3 - startTime3) + " milliseconds\n");
        appendFile.writeFile(results,"Time taken : " + (endTime3 - startTime3) + " milliseconds\n");


        System.out.println("Rabin Karp\n");
        appendFile.writeFile(results, "Rabin Karp");
        System.out.println("Used Memory before " + usedMemoryBefore4 + "Used Memory after : " + usedMemoryAfter4 + " Memory increased : " + (usedMemoryAfter4 - usedMemoryBefore4) );
        appendFile.writeFile(results, "Used Memory before " + usedMemoryBefore4 + "Used Memory after : " + usedMemoryAfter4 + " Memory increased : " + (usedMemoryAfter4 - usedMemoryBefore4));
        System.out.println("Time taken : " + (endTime4 - startTime4) + " milliseconds\n");
        appendFile.writeFile(results, "Time taken : " + (endTime4 - startTime4) + " milliseconds\n");
;

    }

}
