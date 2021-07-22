package util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieBox {
	
	// request 객체를 이용해서 모든 Cookie객체를 Map에 저장
	// Map<k,v> -> (쿠키이름, 쿠키객체)
	private Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();

	// 생성자를 이용해서 Map저장할 데이터 초기화
	public CookieBox(HttpServletRequest request) {
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies!=null && cookies.length>0) {
			for(int i=0; i<cookies.length; i++) {
				// cookieMap 에 쿠키 정보를 저장
				cookieMap.put(cookies[i].getName(), cookies[i]);
			}
		}
	}
			
			
			
			
			
			
			
			
			
			
			
}



