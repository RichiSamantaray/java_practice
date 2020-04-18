class Mark{
	public void add(int num1,int num2){
		int result1=num1+num2;
		System.out.println("Result of parent class method is "+result1);
	}
}

class Method{
		public void add(int num1,int	num2){
			int result2=num1-num2;
			System.out.println("Result of overridden method is "+result2);
	}
}

class Main{
	public static void main(String[] args){
	Mark obj1= new Mark();
	obj1.add(7,5);
	Method obj2=new Method();
	obj2.add(7,5);
	}
}