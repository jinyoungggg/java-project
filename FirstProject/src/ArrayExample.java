import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		String[] str = new String[3];// 개수
		str[0] = "1";
		str[1] = "2";
		str[2] = "3";		
		
		// Arrays.asList => 이미 존재하는 문자열을 ArrayList로 만든다.
		ArrayList<String> strList = new ArrayList<>(Arrays.asList("1","2","3"));
		String result = String.join(",", strList);
		
		System.out.println(result); // 1,2,3
		
		
	/*    System.out.println(strList);

		// "1,2,3,"
        
	    String result = "";
	    
	    
	    
	    
	    
	    
for(int i = 0; i < strList.size(); i++) {
	    	
	    	result += strList.get(i);
	    	result += ",";
	    	}
	    result = result.substring(0, result.length()-1);
        
	    System.out.println(result );
	
	    
	    
	    
	    
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("1");
		numbers.add("333");
		numbers.add("4567");
		
		
		
		
		
		
		*/
		
		
	}
	}


