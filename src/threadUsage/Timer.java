/*
 * Simple Timer that can periodically print a timeout message.
 * Using Runnable interface to create thread.
 */
package threadUsage;

public class Timer implements Runnable {   

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 * Method which gets picked up by thread scheduler, once after the start() method is invoked
	 * 
	 */
	public void run() {
		for (int init = 0; init <= 10; init++) {//Loop for periodically printing timeout message
			timeOut();//Method to print time out message

			try {
				Thread.sleep(5000);//to make thread to sleep for 5 seconds
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}
	}
/*
 * Method to print a timeout message
 */
	private void timeOut() {
		System.out.println("Time out !");

	}

	public static void main(String[] args) {
		Timer timer = new Timer();  //Creating an object of Timer
		Thread thread = new Thread(timer);//passing object of Timer so that the run method of Timer class gets executed
		thread.start(); // Starting the thread

	}

}
