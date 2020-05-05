package chapter8;
// シリアライズの継承例1
// インターフェースを継承した際に何が呼ばれるかがわかるコード
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Foo2 implements Serializable{
	Foo2() { System.out.println("Foo()"); }
}

class Bar2 extends Foo2 {
	Bar2() { System.out.println("Bar()"); }
}

public class Sample8_9 {
	public static void main(String[] args){
		Bar2 obj = new Bar2();
		System.out.println("-----インスタンス化完了");
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("ren/8_9.txt"));
				ObjectInputStream ois = new ObjectInputStream( new FileInputStream("ren/8_9.txt"))
		){
			oos.writeObject(obj);
			System.out.println("-----シリアライズ完了");
			Bar2 readObj = (Bar2)ois.readObject(); // ファイルからデータを読み込んでオブジェクトの
			// 復元をおこなっているため、コンストラクタを読んでいない
			System.out.println("-----デシリアライズ完了");
		} catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
