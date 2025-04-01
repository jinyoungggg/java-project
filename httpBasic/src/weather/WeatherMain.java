package weather;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.jar.JarOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.json.JSONObject;

public class WeatherMain extends JFrame {
	
	// 상수선언
	private static final String API_KEY = "40db93aebe8e4b238afa1e3f1b0ea17d";
	private static final String Base_URL = "https://api.openweathermap.org/data/2.5/weather";
	
	//베이스URL + ?q=seoul +키=내키 <<<<<<
	
	//베이스URL?키= +내키+?q=seoul (틀린거 ?가 두번나옴
	
	//베이스URL키= +?q=서울 +키=내키 (틀린거 
	
	//베이스URL ? (q=서울) & (키=내키) <<<<<<<<
	//베이스URL?키= (내 키) (그냥예시 
	
	//베이스URL ? 키=키=내키 & q=서울 (틀린거 키=키=이 틀림
	//베이스URL ? 키=내키q=서울 (틀린거 키랑 q 사이에 &없음
	
	
	//String urlStr = API_KEY Base_URL + "?q=" + city+ "&units=metric";
	
	
	// 검색 input
	private static JTextField cityTextField;
	private JTextArea weatherTextArea;
	
	public WeatherMain() {
		// 기본 창 설정
		setTitle("날씨 정보");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// 입력 필드 + 검색 버튼
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new FlowLayout());
		
		JLabel cityLabel = new JLabel("도시명:");
		cityTextField = new JTextField(20); // 20글자 쓸수 있는 텍스트필드 생성
		JButton btn = new JButton("확인");
		
		inputPanel.add(cityLabel);
		inputPanel.add(cityTextField);
		inputPanel.add(btn);
		
		// 날씨 정보 출력 영역
		weatherTextArea = new JTextArea();
		weatherTextArea.setEditable(false);//사용자가 글씨써도 안들어감
		JScrollPane scrollPane = new JScrollPane(weatherTextArea);
		
		//JFrame에 컴포넌트를 넣는다.
		add(inputPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
		
		// 버튼 클릭 처리
		btn.addActionListener(e -> {
		//System.out.println("버튼 눌렀다.");
		WeatherVo vo = getWeatherData(cityTextField.getText());
		
		/*온도 : °C \r\n
		 * 습도 : % \r\n
		 * 날씨 : 
		 */
		String str = String.format("온도 : %.1f°C\r\n습도 : %d\r\n날씨 : %s", vo.getTemperature(), vo.getHumidity(), vo.getDescription());
		weatherTextArea.setText(str);
			
		});
		
		
		
		  
	}
	public static WeatherVo getWeatherData(String city) {
		String urlStr = Base_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";
		WeatherVo vo = new WeatherVo();
		try {
			URL url = new URL(urlStr);
			//인터넷주소 url = 새 인터넷 주소("https://www.ddd.ccc")
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			//인터넷연결관리자 conn = (인터넷연결관리자)url
			//이 자바 프로그램이랑 https://www.ddd.ccc 이랑 연결해주세요
			
			conn.setRequestMethod("GET");
			//근데 형태는 GET 이에요
			//GET 방식이
			//url (? 추가요청사항1=ㅇㅇㅇ&추가요청사항2=ㅇㅇㅇ) < 방식
			//
			
			conn.setConnectTimeout(5000); // 연결시간 초과설정
			//근데 저 위에 인터넷 사이트랑 연결을 시도하는데 5 초이상 걸리면 멈춰주세요
			
			
			conn.setReadTimeout(5000); // 읽기시간 초과설정
			//연결이 됬는데 무슨 내용이 있는지 확인하는데 5초이상 걸리면 멈춰주세요
			
			// 응답을 읽기위한 BufferedReader 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			//임시저장소 in = 새 임시저장소( 들어온파일을읽어주는클래스(  인터넷사이트.대답()  )      )
			//in 에는 위에 인터넷사이트에 요청한 내용에 대한 대답이 들어있음 (안에있는 내용이나 형태는 사람이 모름)
			String inputLine;
			StringBuilder response = new StringBuilder();
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			//in 안에있는 내용을 1줄 씩 response에 넣어주세여ㅛ
			
			
			conn.disconnect();
			//인터넷연결끊고
			in.close();
			//임시저장소도 필요없으니까 닫기
			
			// 비동기통신
			// cors 동일한 도메인 내에서만 데이터 통신가능 규약
			// naver.com >>> daum.net
			// 프록시 통해서 비동기통신
			// 백엔드에서 서버로 바로 붙는다
			
			//response "글자" 형태로 된 파일
			//{"나이":10,"키":180} (글자)
			//org.json 안에있는 JSONObject의 기능을 쓰면 저 글자를 json 파일이라고 인식하게 할수있다
			
			System.out.println(response.toString());
			// 응답 > JSON
			JSONObject jsonObject = new JSONObject(response.toString());
			//Jsonobject = 만들어주세요 jsonobject( response의 내용으로  )
			//{"나이":10,"키":180} (json 파일)
			
			// 온도
			double temp = jsonObject.getJSONObject("main").getDouble("temp");
			// 습도
			int humidity = jsonObject.getJSONObject("main").getInt("humidity");
			// 날씨
			String weatherTxt = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description");
			vo.setTemperature(temp);
			vo.setHumidity(humidity);
			vo.setDescription(weatherTxt);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}
		return vo;
	}
	
	//메소드 밥을먹어라(){
	//  밥을먹어라()
	        //{ 밥을먹어라()
				// { 밥을먹어라()   
				//       { 밥을먹어라()}
	//}
	
//	public static WeatherVo getWeatherData(String city) {
//		String urlStr = Base_URL+ "?appid="+API_KEY  + "&q=" + city+ "&units=metric";
//		System.out.println("내주소:"+urlStr);
//		WeatherVo vo = getWeatherData(cityTextField.getText());
//		try{
//			URL url = new URL(urlStr);
//			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//			conn.setRequestMethod("GET");
//			conn.setConnectTimeout(5000); // 연결시간 초과 설정
//			conn.setReadTimeout(5000); // 읽기시간 초과 설정
//			
//			// 응답을 읽기 위한 BufferdeReader 생성
//			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));// 바이트단위로 읽기위해
//			String inputLine;
//			StringBuilder response = new StringBuilder();
//			while((inputLine = in.readLine()) != null) {
//				response.append(inputLine);
//			}
//			conn.disconnect();
//			in.close();
//			
//			// 비동기 통신
//			// cors 동일한 도메인 내에서만 데이터 통신가능 규약
//			// naver.com >>> daum.net
//			// 프록시 통해서 비동기통신 
//			// 백엔드에서 서버로 바로 붙는다
//			
//		
//	
//			System.out.println(response.toString());
//			// 응답 > JSON
//			JSONObject jsonObject = new JSONObject(response.toString());
//			
//			// 온도
//			double temp = jsonObject.getJSONObject("main").getDouble("temp");
//			
//			// 습도
//			int humidity = jsonObject.getJSONObject("main").getInt("humidity");
//			
//			// 날씨
//			String weatherTxt = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description");
//			vo.setTemperature(temp);
//			vo.setHumidity(humidity);
//			vo.setDescription(weatherTxt);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("오류 발생");
//		}
//		
//		 return vo;
//		 
//				
//	}
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		//UI 구성
		// Http 통신
		// 결과를 UI에 삽입
		// Swing UI를 GUI 스레드에서 실행
		
		SwingUtilities.invokeLater(()-> {
		WeatherMain main = new WeatherMain();
		main.setVisible(true);
		});
		
	
		
		
		
		// URL Encoding
		
		String str = "Hello, how a u?";
		System.out.println(str);
		String encodedString = URLEncoder.encode(str, "UTF-8");
		System.out.println("https://www.naver.com/search?keyword="+encodedString); // https://www.naver.com/search?keyword=Hello%2C+how+a+u%3F
		// 서버에서 디코딩
		String decodedStr = URLDecoder.decode(encodedString, "UTF-8");
		System.out.println(decodedStr); // Hello, how a u?
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
