package day8_forwhile;

public class Even {

	public static void main(String[] args) {
		// ==0 짝수
		// !=0 홀수
		int i=0;
		for(i= 1; i<30; i++) {
			if(i %2 !=0)
				System.out.println(i);
		}

	}

}