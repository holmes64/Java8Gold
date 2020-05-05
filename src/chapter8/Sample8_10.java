package chapter8;
// シリアライズの継承例2

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Foo3 {
	Foo3() { System.out.println("Foo3()"); }
}

class Bar3 extends Foo3 implements Serializable {
	Bar3() { System.out.println("Bar3()"); }
}

public class Sample8_10 {
	public static void main(String[] args){
		Bar3 obj = new Bar3();
		System.out.println("-----インスタンス化完了");
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("ren/8_9.txt"));
				ObjectInputStream ois = new ObjectInputStream( new FileInputStream("ren/8_9.txt"))
		){
			oos.writeObject(obj);
			System.out.println("-----シリアライズ完了");
			Bar3 readObj = (Bar3)ois.readObject(); // ファイルからデータを読み込んでオブジェクトの
			// 復元をおこなっているため、コンストラクタを読んでいない
			System.out.println("-----デシリアライズ完了");
		} catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
