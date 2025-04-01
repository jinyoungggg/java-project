package edu;


public class IPinfo {



	private String ip;

	private String user;

	

	public IPinfo() {}

	

	



	public String getIp() {

		return ip;

	}



	public void setIp(String ip) {

		this.ip = ip;

	}



	public String getUser() {

		return user;

	}



	public void setUser(String user) {

		this.user = user;

	}

	

	public IPinfo( String ip, String user ) {

		

		this.ip = ip;

		this.user = user; // 수정 1.Test1 클래스에서 파라미터 형식 ipinfoList.add(new IPinfo("", ""));에 잘들어갈수있도록 만들어주기

		

		

	}

	public IPinfo(String ip) {

		this.ip = ip; // 수정 2. 파라미터가 ip하나로만 되어있는 것도 있으니 이것도 생성

	}

	

	@Override

	public String toString() {

		return ip +  " / " + "user ";

	}

	



	



	



}
