package chapter1;
// final修飾子を使用したメソッドの定義
public class Sample1_3 {
	class SuperA {}
	final class SuperB {}
	class SuperC { void print() {} }
	class SuperD {final void print() {} }
	
	class subA extends SuperA{}
//	class SubB extends SuperB {} // finalクラスを継承しようとしているためNG
	class SubC extends SuperC { void print(){} }
//	class SubD extends SuperD { void print(){} } // final修飾子を着けて定義下メソッドをオーバーライドしようとしているため、
	
}
