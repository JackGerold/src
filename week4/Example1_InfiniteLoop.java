package week4;

import java.awt.Desktop;
import java.net.URI;

public class Example1_InfiniteLoop {
	public static void main(String[] args) {
		int i = 0;
		//check for logic error
		while (i < 10); {
		try {
				URI uri = new URI("http://localhost:8080/test/index.html");
				Desktop dt = Desktop.getDesktop();
				dt.browse(uri);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println(i);
			i++;
		}
	}
}
