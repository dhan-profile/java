package Practice;

//public class ThreadEx1 extends Thread{
//public void run(){
//  for(int i=0;i<=10;i++){
//      System.out.print(i+" ");
//  }
//  //System.out.println();
//}
//
//public static void main(String a[]){
//  ThreadEx1 t1 =new ThreadEx1();
//  ThreadEx1 t2 =new ThreadEx1();
//  ThreadEx1 t3 =new ThreadEx1();
//  
//  //System.out.println(t1.getState());
//  t1.start();
//  t2.start();
//  t3.start();
//  System.out.println("main method");
//  //System.out.println(t1.getState());
//}
//
//}

public class ThreadEx1 implements Runnable{
public void run(){
  for(int i=0;i<=10;i++){
      System.out.print(i+" ");
  }
  //System.out.println();
}

public static void main(String a[]){
  ThreadEx1 t1 =new ThreadEx1();

 // t1.run();
  Thread obj =new Thread(t1);
  Thread obj1 =new Thread(t1);
  Thread obj2 =new Thread(t1);

  obj.start();
  obj2.start();
  obj1.start();
  System.out.println("main method");
  //System.out.println(t1.getState());
}

}
