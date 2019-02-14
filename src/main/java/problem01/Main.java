package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
	
		int cnt = 0;
		int tmpNumber = 0;
		String str = String.valueOf(number);
		for(int i = 0; i<str.length(); i++) {
			tmpNumber = Integer.parseInt(str.charAt(i)+"");
			
			//System.out.println(tmpNumber);
			
			if(tmpNumber == 3) {
				cnt++;
			}
			if(tmpNumber == 6) {
				cnt++;
			}
			if(tmpNumber == 9) {
				cnt++;
			}
		}
			
		return cnt;
	}
}