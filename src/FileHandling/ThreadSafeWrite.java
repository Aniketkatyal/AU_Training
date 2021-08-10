package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class ThreadSafeWrite {
    static int count = 0;
    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=1000;i++)
                {
                    increment();
                    writeFile(String.valueOf(count));
                }

            }
        });

        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=1000;i++)
                {
                    increment();
                    writeFile(String.valueOf(count));
                }

            }
        });
        Thread t3 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=1000;i++)
                {
                    increment();
                    writeFile(String.valueOf(count));
                }

            }
        });

        Thread t4 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=1000;i++)
                {
                    increment();
                    writeFile(String.valueOf(count));
                }

            }
        });

        Thread t5 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=1000;i++)
                {
                    increment();
                    writeFile(String.valueOf(count));
                }

            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        readFile();

    }

    public synchronized static void writeFile(String data) {

        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("threadSafeFile.txt");

            // Writes string to the file
            output.write(data);

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
            FileReader input = new FileReader("threadSafeFile.txt");

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

    public static void increment()
    {
        count++;
    }

}