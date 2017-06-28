package chouxiang;

public class OneSon extends FatherAbstract{

	@Override
	public int getFather() {
		// TODO Auto-generated method stub
		return 1;
	}

	public static void main(String[] args){
		OneSon son = new OneSon();
		son.proceedData();
	}
}
