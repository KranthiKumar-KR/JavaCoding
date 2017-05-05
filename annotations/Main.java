package annotations;

@Schedule(name="krantz", age=24,height=6, weight=70)
public class Main {
	 int a;
	 int b;
	public Main(int i, int j){
		this.a = i;
		this.b = j;
		dif();
		sum();
	}
	@SuppressWarnings("deprecation")
	@EnhancementRequest(id="kkkk", sysnopsis="jjjj",engineer= "lll", date="gggg")
	public  void sum(){
		int c = a+b;
		System.out.println("value of summation: " +c);
	}
	public  void dif(){
		int c = a-b;
		System.out.println("value of difference: " +c);
	}

}
