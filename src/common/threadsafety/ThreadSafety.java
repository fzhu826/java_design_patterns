/**
 * 
 */
package common.threadsafety;

/**
 * @author Administrator
 * you will notice that count value is varying between 6,7,8. This is happening 
 * because even if count++ seems to be an atomic operation, its NOT and causing data corruption.
 */
public class ThreadSafety {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ProcessingThread pt = new ProcessingThread();
		Thread t1 = new Thread(pt, "t1");
	
		t1.start();
		Thread t2 = new Thread(pt, "t2");
		t2.start();
		
		//
		t1.join();
		t2.join();
		 System.out.println("Processing count="+pt.getCount());
 		
	}

	
}
class ProcessingThread implements Runnable {
	private int count;

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			processSth(i);
			count++;
			System.out.println(count+"----");
		}
	}

	public int getCount() {
		return count;
	}

	private void processSth(int i) {
		// processing
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}