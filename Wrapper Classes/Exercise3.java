import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Exercise3 {

	public static void main(String[] args)throws IOException{
                InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		int input = Integer.parseInt(br.readLine());
		
		String output = String.format("%8s", Integer.toBinaryString(input)).replace(' ', '0');
		System.out.println(output);
		
		
		

	}

}