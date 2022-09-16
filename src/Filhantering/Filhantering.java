package Filhantering;

import java.io.*;
import java.util.ArrayList;

public class Filhantering {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader Text = openTextFileForReading("Text.txt");
        ArrayList<String> fileContent = readAllText(Text);
        DataOutputStream outFile = openBinaryFileForWriting("Binary.txt");
        writeTextAsBinary(outFile);
    }



    private static BufferedReader openTextFileForReading(String filename) throws FileNotFoundException {
        String read;
        BufferedReader Text;
        Text = new BufferedReader(new FileReader("Text.txt"));
        read = Text.readLine();

        while (read != null){
            read = Text.readLine();
        }

        return null;
    }

    private static ArrayList<String> readAllText(BufferedReader inFile) {
        ArrayList<String> text = new ArrayList<>();

        return text;
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
        return outfile;
    }
    private static void writeTextAsBinary(DataOutputStream outFile) {
    }

}
