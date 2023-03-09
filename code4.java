class Demo{
	public static void main(String args[]){
		
		byte var1 = 18;    
		byte var2 = 18;    
	

		System.out.println(var1);
		System.out.println(var2);

		var1 = var1 + var2; 
		//error:incompatiable type:possibal lossy conversion from int to byte
		//size (1>>>4~right,4>>>1~not possibal)

		System.out.println(var1);
		System.out.println(var2);

	}
}
