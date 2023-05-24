
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		calculator c1 = new calculator();
		
		int res =c1.add(12, 8);
		System.out.println("Addition  "  +  res);
		int res1 =c1.sub(12, 8);
		System.out.println("Substraction  " + res1);
		int finalres = c1.mul(res,res1);
		System.out.println("Multiplication  " + finalres);
	}

}
