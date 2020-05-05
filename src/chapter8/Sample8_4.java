package chapter8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// DataInputStreamクラスとDataOutputStreamクラスの使用例
public class Sample8_4 {
	public static void main(String[] args){
		try(DataOutputStream dos = new DataOutputStream( new FileOutputStream("ren/8_4.txt"));
				DataInputStream dis = new DataInputStream( new FileInputStream("ren/8_4.txt"))){
			dos.writeInt(100); dos.writeUTF("tanaka"); dos.writeUTF("田中");
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
		}catch(IOException e) { e.printStackTrace(); }
	}
}
