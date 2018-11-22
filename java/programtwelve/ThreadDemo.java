/**
*
*@author jaseem
*
*/

class ThreadDemo{
	public static void main(String[] args){
		Thread thread = new Thread(new MyThreadDemo());		
		thread.start();		
	}

}

class MyThreadDemo implements Runnable{
	public void run(){
		for(int i = 0; i < 10; i++)
			System.out.println("Thread started running");
	}
}

