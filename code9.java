class Demo{ 


	int x = 10;  // Non-static variable x cannot be refered from a static context
		     // instance variable (HEAP) 

	public static void main(String[] args){

		int y = 100;
		System.out.println(x);
		System.out.println(y);
		}
}

