package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileOperations {
    public static void main(String[] args)
    {
        createFile();
        writeFile("Training sample data");
        readFile();
//        deleteFile();

    }

    public static void createFile() {
        File file = new File("newFile.txt");

        try {

            // trying to create a file based on the object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("The new file is created.");
            }
            else {
                System.out.println("The file already exists.");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }

    public static void writeFile(String data) {

        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("newFile.txt");

            // Writes string to the file
            output.write(data);
            output.append(" abcd");
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void readFile() {
        char[] array = new char[100];
        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader("newFile.txt");

            // Reads characters
            input.read(array);
            System.out.println("Data in the file:");
            System.out.println(array);

            // Closes the reader
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }

    public static void deleteFile() {
        // creates a file object
        File file = new File("newFile.txt");

        // deletes the file
        boolean value = file.delete();
        if(value) {
            System.out.println("The File is deleted.");
        }
        else {
            System.out.println("The File is not deleted.");
        }
    }


}
