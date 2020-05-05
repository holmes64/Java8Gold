package chapter12;

import java.util.ListResourceBundle;

public class MyResources extends ListResourceBundle{
	protected Object[][] getContents(){
		Object[][] contents = {{"sent", "送信"},
				{"cancel", "取消"}};
		return contents;
	}
}
