import java.security.SecureRandom;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class PrintTask implements Runnable
{
    private static final SecureRandom myGenerator = new SecureRandom();
    // random sleep time for thread
    private final int sleepTime;
    private final String taskName;

    // constructor
    public PrintTask(String taskName)
    {
        this.taskName = taskName;

        // pick random sleep time between 0 and 5 seconds
        sleepTime = myGenerator.nextInt(5000);
    }

    // method run contains the code that a thread will execute
    public void run()
    {
        try
        {
            System.out.printf("%s going to sleep for %d milliseconds.%n", taskName, sleepTime);

            Thread.sleep(sleepTime);
        }
        catch (InterruptedException e)
        {
            // stack trace of error
            e.printStackTrace();
            // To ensure that the executing thread receives the InterruptedException, first obtains a reference to the currently executing Thread by calling static method currentThread , then uses that Thread ’s interrupt method to deliver the InterruptedException to the current
            Thread.currentThread().interrupt();
        }

        // print task name
        System.out.printf("%s done sleeping%n", taskName);

    }

}

class TaskExecutor
{
    // main method
    public static void main(String[] args)
    {
        PrintTask task1 = new PrintTask("firstTask");
        PrintTask task2 = new PrintTask("secondTask");
        PrintTask task3 = new PrintTask("thirdTask");

        System.out.println("Starting executor");

        ExecutorService myExecutorService = Executors.newCachedThreadPool();
        myExecutorService.execute(task1);
        myExecutorService.execute(task2);
        myExecutorService.execute(task3);

        myExecutorService.shutdown();
    }

}
