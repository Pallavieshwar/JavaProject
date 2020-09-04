package com.assesment.solution;

public class JavaExptresson {

	public static void main(String[] args) {
		System.out.println("successfully comleted");
	}

	public class A extends B {
		public void method() {
			A a = new A();
			a.b.c = c.b.a;

		}
	}

	public class B extends C {
		public B b;
		public C c;
	}

	public class C {
		public B b;
		public A a;
	}

}
