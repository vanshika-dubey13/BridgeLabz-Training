package com.collections.reflection.customloggingproxy;

//Implementing the interface
class GreetingImpl implements Greeting {

	//overriding methods of interface
	@Override
	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!");
	}

	@Override
	public void sayGoodbye(String name) {
		System.out.println("Goodbye, " + name + "!");
	}
}
