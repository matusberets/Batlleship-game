package Module4Lesson8Arrays;

/*
    14.06.2021 = trying to use Scanner to read a file content and replicate that printout ...
 */

import java.io.File;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws Exception {
        System.out.println("This is a program to read a text from a file and then print it out.\n");

        // create a file object
        File fileToRead = new File("/home/tamaber/IdeaProjects/MatusLearnJava/src/Module4Lesson8Arrays/text.txt");

        Scanner inputFile = new Scanner(fileToRead).useDelimiter("\n");
        String textFromFile;
        int searchedTextOccurance = 0;
        while (inputFile.hasNext()) {
            textFromFile = inputFile.next();
            if (textFromFile.contains("Matus")) searchedTextOccurance++;
            System.out.println(textFromFile);
        }
        inputFile.close();
        System.out.printf("\nText occurance is %d times.\n", searchedTextOccurance);
    }
}
