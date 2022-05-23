class Notify
{
    synchronized void waitMethod()
    {
        Thread t = Thread.currentThread();
         
        System.out.println(t.getName()+" is releasing the lock and going to wait");
         
        try
        {
            wait();
        }
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
         
        System.out.println(t.getName()+" has been notified and acquired the lock back");
    }
     
    synchronized void notifyOneThread()
    {
        Thread t = Thread.currentThread();
         
        notify();
         
        System.out.println(t.getName()+" has notified one thread waiting for this object lock");
    }
}
 
