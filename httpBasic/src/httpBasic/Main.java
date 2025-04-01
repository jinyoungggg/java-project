package httpBasic;
 

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.net.HttpURLConnection;

import java.net.URL;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

 

import org.json.JSONArray;

import org.json.JSONObject;

import vo.PostVo;

 



 

public class Main extends PostVo {

 

	public static void main(String[] args) {

		// 요청할 URL 

		String targetUrl = "https://jsonplaceholder.typicode.com/posts";

 

		try {

			// 1. URL 객체 생성

			@SuppressWarnings("deprecation")

			URL url = new URL(targetUrl);

 

			// 2. HttpURLConnection 객체 생성 및 설정

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("GET");

			// 추가 옵션이 필요할 경우 아래와 같다.

			conn.setRequestProperty("User-Agent", "Mozilla/5.0");

 

			// 3. 응답 코드 확인

			int responseCode = conn.getResponseCode();

			System.out.println(responseCode);

			/**

			 * HTTP 응답 코드 목록 (3자리 숫자 구성)

			 * 1xx, 2xx, 3xx, 4xx, 5xx

			 * 1xx : 100, 101, 102 >>>> 처리중이니 응답을 기다려라

			 * 2xx : 200, 201, 202, 204, 205, 206 >>>> 200 요청이 성공적으로 처리 되었다.

			 * 3xx : 300 ~ 308 >>>> 클라이언트가 요청한 리소스가 다른 위치로 이동됨을 나타낸다.

			 * 4xx : 400 ~ 417 >>>> 

			 * 401 Unauthorized : 인증이 필요한 페이지인데 인증을 안받았다.

			 * 403 Forbidden : 리소스에 대한 권한 부족일때

			 * 404 Not Found : 요청한 리소스를 서버에서 찾을 수 없을때

			 * 405 Method Not Allowed : 메서드를 잘못 표기했을때

			 * 406 Not Acceptable : 클라이언트가 요청한 콘텐츠 유형을 서버가 제공할 수 없을때

			 * 408 Request Timeout : 클라이언트가 요청 후 시간이 오래 걸린때

			 * 409 Conflict : 서버의 현재 상태와 충돌일때 >> EX : 데이터베이스에 중복된 데이터를 삽입하려 할때

			 * 

			 * 5xx -----> 서버 오류

			 * 500 ~ 505

			 * 500 Internal Server Error : 서버에 예기치 않은 오류가 발생했다.

			 * 503 Service Unavailable : 서버가 죽었다... 또는 서버가 안돌아간다.

			 */

 

			/**

			 * 4. 응답이 성공이면 데이터 읽기

			 * 아래 두가지 모두 작동하는 코드

			 */

			// if (responseCode == 200) {}

			if (responseCode == HttpURLConnection.HTTP_OK) {

				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

				String inputLine;

				StringBuilder response = new StringBuilder();

 

				while ( (inputLine = in.readLine()) != null ) {

					response.append(inputLine);

				}

				in.close(); // 스트림 닫기

				// 5. 응답 출력

				// System.out.println(response.toString());

 

				// Json 문자열을 Object로 변환

				String responseStr = response.toString();

				// System.out.println(responseStr);

				// [] {}

 

				JSONArray jsonArray = new JSONArray(responseStr);

 

				List<PostVo> postList = new ArrayList<>();

				List<HashMap<String, Object>> mapList = new ArrayList<>();

 

				List<HashMap<String, Object>> fileredMap = new ArrayList<HashMap<String,Object>>();

				HashMap<String, Object> resultMap = new HashMap<>();

 

				for (int i = 0; i < jsonArray.length(); i++) {

					JSONObject obj = jsonArray.getJSONObject(i);

 

					// vo에 값 넣기

					PostVo vo = new PostVo();

					vo.setId(obj.getInt("id"));

					vo.setUserId(obj.getInt("userId"));

					vo.setTitle(obj.getString("title"));

					vo.setBody(obj.getString("body"));

 

					postList.add(vo);

 

					// hashMap에 값 넣기

					HashMap<String, Object> map = new HashMap<>();

					map.put("id", obj.getInt("id"));

					map.put("userId", obj.getInt("userId"));

					map.put("title", obj.getString("title"));

					map.put("body", obj.getString("body"));

 

					mapList.add(map);

 

					String body = obj.getString("body") != null ? obj.getString("body") : "";

					if (body.contains("officiis")) {

						fileredMap.add(map);

					}

 

				}

				resultMap.put("list", fileredMap);

				resultMap.put("count", fileredMap.size());

 

				System.out.println(resultMap.toString());

 

//				JSONObject jsonObject = new JSONObject(responseStr);

//				System.out.println(jsonObject.toString());

//				

//				String title = jsonObject.getString("title");

//				String body = jsonObject.getString("body");

//				int id = jsonObject.getInt("id");

//				int userId = jsonObject.getInt("userId");

//				

//				// PostVO

//				PostVO postVO = new PostVO();

//				postVO.setId(id);

//				postVO.setUserId(userId);

//				postVO.setTitle(title);

//				postVO.setBody(body);

//				System.out.println(postVO.getBody());

//				

//				HashMap<String, Object> map = new HashMap<>();

//				map.put("id", id);

//				map.put("userId", userId);

//				map.put("body", body);

//				map.put("title", title);

//				String a = (String) map.get("title");

//				int i = (int) map.get("id");

 

			} else {

				System.out.println("오류 발생");

			}

			// 6. 연결 종료

			conn.disconnect();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

 

}

 


