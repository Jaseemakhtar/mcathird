/**
 *
 * @author jaseem
 */
public class ThreadJoinExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");
        MyThread t3 = new MyThread("t3");
        t1.start();
        
        try {
        //start 2nd thread after waiting for 2 seconds or if it's dead
		  t1.join(2000);
	      t2.start();

	//start 3rd thread only when first thread is dead
		t1.join();
		t3.start();

        //let all threads finish execution before finishing main thread
		t1.join();
		t2.join();
		t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        System.out.println("All threads are dead, exiting main thread");
    }
}

class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	public void run() {
		System.out.println("Thread started: " + Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended: "+Thread.currentThread().getName());
	}
}
