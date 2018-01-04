package com.accolite.miniau;
class EvenOddThread
{
    boolean flag;

    public EvenOddThread(boolean flag)
    {
        this.flag = flag;
    }
    
    public void printEven()
    {
        for( int i = 2; i <= 100; i+=2 )
        {
            synchronized (this)
            {
                try
                {
                    while( !flag )
                        wait();
                    System.out.println("Even : " + i);
                    flag = false;
                    notify();
                }
                catch (InterruptedException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
    }
    public void printOdd()
    {
        for( int i = 1; i < 100; i+=2 )
        {
            synchronized (this)
            {
                try
                {
                    while(flag )
                        wait();
                    System.out.println("Odd : " + i);
                    flag = true;
                    notify();
                }
                catch(InterruptedException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
    }
}

public class MultiThread {
    public static void main(String [] args)
    {
        EvenOddThread t = new EvenOddThread(false);
        Thread t1 = new Thread( new Runnable() {
           public void run()
           {
               t.printOdd();
           }
        });
        Thread t2 = new Thread( new Runnable() {
            public void run()
            {
                t.printEven();
            }
        });
        t1.start();
        t2.start();
    }
}