package Filhantering;

import java.io.*;
import java.util.ArrayList;

public class Filhantering {
    public static void main(String[] args) {
        BufferedReader Text = openTextFileForReading("Text.txt");
        ArrayList<String> fileContent = readAllText(inFile);
        DataOutputStream outFile = openBinaryFileForWriting("info.dat");
        writeTextAsBinary(fileContent);
    }

    private static ArrayList<String> readAllText(BufferedReader inFile) {
        ArrayList<String> text = new ArrayList<>();
    }


    private static BufferedReader openTextFileForReading(String filename) {

    }
    private static DataOutputStream openBinaryFileForWriting(String fileName) {
        DataOutputStream outfile;
        try {
            outfile = new DataOutputStream(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            System.out-println("Unable to open file for writing, using terminal instead");
            outfile = new DataOutputStream(System.out);
            //e.printStackTrace();
        }
    }

}
