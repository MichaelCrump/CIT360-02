public class ThreadFabric{

    public static void main(String args[]){
       
        //two threads running in parallel.  Print the first thread twice and the second one three times.
        Thread silk = new Thread(new Runnable(){
            public void run(){
                for(int i =0; i<2; i++){
                    System.out.println("This is thread : " + Thread.currentThread().getName());
                }
            }
        }, "Silk");
       
        Thread satin = new Thread(new Runnable(){
            public void run(){
                for(int i =0; i<3; i++){
                    System.out.println("This is thread : " + Thread.currentThread().getName());
                }
            }
        }, "Satin");
       
        //start both threads 
        threadA.start(); 
        threadB.start();
       
    }  

}


