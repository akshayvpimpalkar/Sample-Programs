//Case 1: 2 threads sharing same object of only one class (here Th1) which has synchronized method 'run'

class Th1 implements Runnable{

	@Override
	 synchronized public void run() {

		for(int i = 0; i <= 50; i++){
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Th2 implements Runnable{

	@Override
	 synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i = 50; i >= 0; i--){
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
public class Main {

	public static void main(String[] args) {

		Th1 th1 = new Th1();

		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th1);

		t1.start();
		t2.start();
	}

}

/*
o/p:The 2 threads working in sync (i.e one after the other)

0 1 2 3 4 5 6... 48 49 50 0 1 2 3 4 ......4 45 46 47 48 49 50
*/


/*
case 2:
  2 threads acquiring lock on 2 different objects of the same class (here Th1) with synchronized method 'run'
*/

class Th1 implements Runnable{

	@Override
	 synchronized public void run() {


		for(int i = 0; i <= 50; i++){
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class Th2 implements Runnable{

	@Override
	 synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i = 50; i >= 0; i--){
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
public class Main {

	public static void main(String[] args) {

    Th1 th1 = new Th1();
		Th1 temp = new Th1();

		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(temp);

		t1.start();
		t2.start();
	}

}


/*
o/p: the 2 threads working simultaneously even if we have synchronized method 'run'
     because single object has to be shared among threads

0 0 1 1 2 2 3 3 4 4 5 5 .......47 47 48 48 49 49 50 50
*/




/*
  case 3:
    the 2 threads acquiring lock on 2 different objects of two different classes
     (i.e one thread on one object of one class) (here class Th1 and Th2), then here
     they are not sharing 1 object, so they can work simultaneously even when both the
     classes have their 'run' method synchronized
*/

class Th1 implements Runnable{

	@Override
	 synchronized public void run() {
		for(int i = 0; i <= 50; i++){
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Th2 implements Runnable{

	@Override
	 synchronized public void run() {
		for(int i = 50; i >= 0; i--){
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
public class Main {

	public static void main(String[] args) {

		Th1 th1 = new Th1();
		Th2 th2 = new Th2();

		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);

		t1.start();
		t2.start();
	}

}


/*
o/p: Here one thread printing 0 to 50 and other prints 50 to 0 simultaneously

50 0 1 49 2 48 47 3 46 4 45 5 44 6 43 7 ...39 10 40 9 41 42 8 43 7 44 6 45 5 46 4 47 3 2 48 49 1 50 0
*/
