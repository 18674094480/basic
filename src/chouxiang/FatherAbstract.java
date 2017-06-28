package chouxiang;

public abstract class FatherAbstract {

	abstract int getFather();
	public void proceedData(){
		int a = getFather();
		System.out.println(a);
	}
}
