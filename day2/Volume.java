package week1.day2;

public class Volume {

	public static int boxVolume(int length, int breadth, int height) {
		int vol = length*breadth*height;
		return(vol);
	}
	
	
	public static void main(String[] args) {
		//int vol = boxVolume (10,20,30);
		System.out.println(boxVolume(10,20,30));

	}

}
