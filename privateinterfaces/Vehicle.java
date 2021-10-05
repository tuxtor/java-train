public interface Vehicle{
	public default void makeNoise(){
        System.out.println("Making noise!");
        createNoise();
	}
	
	private void createNoise(){
		System.out.println("Run run");
	} 
}