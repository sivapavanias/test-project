public class Hindi implements Greeting{

	@Override
	public void morning() {
		// TODO Auto-generated method stub
		System.out.println("subhodhaya");
		
	}

	@Override
	public void evening() {
		// TODO Auto-generated method stub
		System.out.println("subhsandhya");
		
	}

	@Override
	public void night() {
		// TODO Auto-generated method stub
		System.out.println("subhrathtri");
		
	}
	
}
class English implements Greeting {
	@Override
	public void morning() {
		// TODO Auto-generated method stub
		System.out.println("good morning");
		
	}

	@Override
	public void evening() {
		// TODO Auto-generated method stub
		System.out.println("evening.......");
	}

	@Override
	public void night() {
		// TODO Auto-generated method stub
		System.out.println("good night...");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hindi h = new Hindi();
		h.evening();
		h.morning();
		h.night();
		English e=new English();
		e.evening();
		e.morning();
		e.night();
		
		

	}
	

}
