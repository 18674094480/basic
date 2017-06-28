package test;

public class diaoBoRunnable implements Runnable{

	@Override
	public void run(){
		for(int i=0 ; i<10 ; i++){
		i = i+1;
			System.out.println(i++);
		}
	}

	public static void main(String[] args) {
		new Thread(new diaoBoRunnable()).start();
	}
}
