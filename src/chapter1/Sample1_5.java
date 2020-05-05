package chapter1;
/*
 * クラス内で定義したインスタンスメンバは、クラス内で定義したsﾀﾁcメンバに直接アクセス可能
 * クラス内で定義したstaticメンバは、クラス内で定義したインスタンスメンバに直接
 * 　アクセスできない。アクセスする場合はインスタンス化してからアクセスする。
 */
public class Sample1_5 {
	int instanceVal; // インスタンス変数
	static int staticVal; // static変数
	
	int methodA() { return instanceVal; } //OK
	int methodB() { return staticVal; } // OK
//	static int methodC() { return instanceVal; } // インスタンス変数なのでNG
	static int methodD() { return staticVal; } // OK
	static int methodE() { // OK
		Sample1_5 obj = new Sample1_5();
		return obj.instanceVal;
	}
}
