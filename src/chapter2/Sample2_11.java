package chapter2;
// extendsとimplementsの同時利用

interface MyInter11 { void methodA(); }
class Super2 { void methodB() {} }

class MyClass2 extends Super2 implements MyInter11 {
	@Override
	public void methodA() {}
}