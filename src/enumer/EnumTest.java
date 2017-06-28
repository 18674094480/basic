package enumer;
public class EnumTest {

	enum Constants2{
		Constants2_A("我是枚举类型A"),
		Constants2_B("我是枚举类型B");
//		Constants2_C(3);
		String s;
		private Constants2(){
			
		}
		private Constants2(String s){
			this.s = s;
		}
		public String getS(){
			return s;
		}
	}
	public static void main(String[] a){
		for(int i = 0; i<Constants2.values().length; i++){
			System.out.println(Constants2. values()[i]+"调用get方法"+Constants2.values()[i].getS());
		}
	}
}
