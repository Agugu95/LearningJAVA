package 컬렉션프레임워크;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("dataBase.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		System.out.println("dirver: " + driver + "\n" + "url: " + url + "\n" + "username: " + username + "\n"
				+ "password" + password);
	}

}
