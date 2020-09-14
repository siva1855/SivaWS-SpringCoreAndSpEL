package siva.spring.core.beans;

public abstract class SingletonClass {

	public abstract PrototypeClass getInstanceMethod();

	public SingletonClass() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("SingletonClass Constructor");
	}

	public void receive() {
		System.out.println("receive()......");
		getInstanceMethod().store();
	}

}
