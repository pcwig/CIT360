import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadsExecutorsRunnablesHandlers {
    public static final int threadCount = 3 ;
    public static final int start = 1;
    public static final int stop = 1000000;
    public static ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
    
    public static void main(String[] args) {
    	//Create timer just to compare times with different threadcounts
    	long startTime = System.currentTimeMillis(); 
     
        // Declare attributes
        ArrayList<Integer> primes = new ArrayList<>();
        int incrementAmount = stop/threadCount;
        
        // Output starting message
        System.out.println("Spawning threads...");
        
        // Create and Start Threads
        for (int i = 0; i < threadCount; i++) {
            executorService.submit(new PrimeThread((start + (i * incrementAmount)), (start + (i * incrementAmount) + incrementAmount), i + ".txt"));
        }
        
        // Output thread spawn completion message
        System.out.println("Threads spawned...");
        
        // Shutdown the executor service
        executorService.shutdown();
        
        // Wait while all threads complete
        while (!executorService.isTerminated()) { }
        
        // Combine results from each thread into a single ArrayList
        System.out.println("Combining results...");
        for (int i = 0; i < threadCount; i++) {
            File f = new File(i + ".txt");
            try (Scanner scan = new Scanner(new File(i+".txt"))) {
                while (scan.hasNextInt()) {
                    primes.add(scan.nextInt());
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ThreadsExecutorsRunnablesHandlers.class.getName()).log(Level.SEVERE, null, ex);
            }
            f.delete();
        }
        
        // Output the results from the ArrayList to a file
        try (PrintWriter print = new PrintWriter(new File("primes.txt"))) {
            for (Integer prime : primes) {
                print.println(prime);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        
        // State completion
        System.out.println("Task Complete!");
        
        
        // Stop timer and print how many seconds it took.
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime)/1000 + " seconds");
    }
}