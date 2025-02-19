package assign.to.us;

class Product {
	 int id=78;
	 String name="Amul";
	
	
}


	 class A extends Product{
		 int count=50;
		String category="butter";
		
		/*public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public void display(int count,String category) {
			System.out.print(count+category);
		}*/
	}
	 
	 
	 class B extends Product{
		 int count=90;
		 String category="Milk";
		
	}
	 
	 
	 class C extends Product{
		 int count=56;
		 String category="choco";
		
	}
	 
	 
	class SubA extends A{
		 int price=100 ;
		 int total_price=price*count;
		
		
		
		public void display() {
			
			System.out.println("id"+ id);
			System.out.println("name "+ name);
			System.out.println("total_price" + total_price);
			
		}
		
		
	}
	
	public class Demo{
	public static void main(String[] args) {
		SubA a=new SubA();
		a.display();
		
	}

}
