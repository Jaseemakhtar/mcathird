/**
 *
 *@author jaseem
 */

public class ThreadsDemo{
	public static void main(String[] args) throws InterruptedException{
		ThreadOne th1 = new ThreadOne();
		ThreadTwo th2 = new ThreadTwo();
		ThreadThree th3 = new ThreadThree();

		th1.start();
		th2.start();
		th3.start();
		
	}
}

class ThreadOne extends Thread{
	public void run(){

		while(true){
			try{
				Thread.sleep(1000);
				System.out.println("Good Morning");
			}catch(InterruptedException e){
				System.out.println(e);
			}

		}
	}
}

class ThreadTwo extends Thread{
	public void run(){
		while(true){
			try{
				Thread.sleep(5000);
				System.out.println("Hello");
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}

class ThreadThree extends Thread{
	public void run(){
		while(true){
			try{
				Thread.sleep(10000);
				System.out.println("Welcome");
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}

