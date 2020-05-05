package chapter12;

import java.util.Locale;
// ロケールオブジェクトの使用例
public class Sample12_1 {
	public static void main(String[] args){
		Locale japan = Locale.getDefault(); // 日本
		System.out.println(japan.getDisplayCountry() + " : " + japan.getDisplayLanguage());
		Locale us = new Locale("en", "US"); // 米国
//		Locale us = Locale.US; // 米国
		
		System.out.println(us.getDisplayCountry() + " : " + us.getDisplayLanguage());
		System.out.println(us.getDisplayCountry(us) + " : " + us.getDisplayLanguage(us));
		System.out.println(us.getDisplayCountry() + " : " + us.getDisplayLanguage());
		
		Locale lb = new Locale.Builder().setLanguage("ja").setScript("Jpan").setRegion("JP").build();
		System.out.println(lb.getCountry() + " : " + lb.getLanguage());
	}
}
