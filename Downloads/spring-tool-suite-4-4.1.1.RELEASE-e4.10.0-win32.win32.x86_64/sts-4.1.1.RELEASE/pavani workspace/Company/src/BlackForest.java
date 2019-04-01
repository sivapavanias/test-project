public class BlackForest implements Cake {

		public void mixflour()
		{
			System.out.println("bake with sugar and milk");
		}
    public int bake()
    {
    	return 15;
    	
    }
    public void applycream()
    {
    	System.out.println("apply blackforest cream");
    }
    public static void main(String[] args)
    {
		// TODO Auto-generated method stub
    	BlackForest blf=new BlackForest();
    	blf.applycream();
    	System.out.println(blf.bake());
    	blf.mixflour();
    	
	}
}

