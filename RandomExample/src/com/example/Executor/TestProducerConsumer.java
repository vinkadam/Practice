package com.example.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TestProducerConsumer
{
 
    public static void main(String args[])
    {
        try
        {
            Broker broker = new Broker();
 
            ExecutorService threadPool = Executors.newFixedThreadPool(4);
 
 
            threadPool.execute(new Consumer("1", broker));
            threadPool.execute(new Consumer("2", broker));
            threadPool.execute(new Consumer("3", broker));
            
            threadPool.execute(new Producer(broker));
            /*Future<?> producerStatus = threadPool.submit(new Producer(broker));
 
            // this will wait for the producer to finish its execution.
            producerStatus.get();*/
 
 
            threadPool.shutdown();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
