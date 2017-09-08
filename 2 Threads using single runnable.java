class Th1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char i = 'A'; i <= 'J'; i++){
			System.out.println(i+" ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
public class Main {

	public static void main(String[] args) {

		Th1 t1 = new Th1();
		Thread t = new Thread(t1);
		Thread t2 = new Thread(t1);
		t.start();
		t2.start();
	}

}


/*
o/p:The two threads work simultaneously

A A B B C C D D E E F F G G H H I I J J
*/
