package Package2;

public class JoinExample extends Thread  	{    
    public void run()  
    {    
        for(int i=1; i<=4; i++) //t1---> i=2, t2--->i=1, t3--->i=1
        {    
            try  
            {    
               Thread.sleep(1000);    
                    
            }catch(Exception e){
                    System.out.println(e);
                }    
            System.out.println(Thread.currentThread()+" "+i); 
                
            }   
            
    }    
    public static void main(String args[])  
    {   
  
        JoinExample t1 = new JoinExample();    
        JoinExample t2 = new JoinExample();    
        JoinExample t3 = new JoinExample();    
     
            t1.setName("ONE");
            t2.setName("TWO");
            t3.setName("THREE");
                           
        t1.start();
            
              
        try  
        {    
                //t1.interrupt();
            //t1.join();  
                //t1.yield();
        }catch(Exception e){
                System.out.println(e);
            }    
            
           System.out.println("main method");
        //System.out.println(t1.isInterrupted());
            
             t2.start();
        t3.start();   
} 
}
