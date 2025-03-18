import main.Solution;

public class test {

	public static void main(String[] args) {
		Solution a=new Solution();
		System.out.println(a.solution(5500));

	}

}

class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
        
        answer[0]=money/5500;
        answer[1]=money%5500;
        
        
        return answer;
        
    }
}