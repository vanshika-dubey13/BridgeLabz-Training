package com.collections.reflection.customloggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


class LoggingInvocationHandler implements InvocationHandler {

	//attributes
	private final Object target;

	//constructor
	public LoggingInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// Log method call
		System.out.println("[LOG] Method called: " + method.getName());
		
		// Execute the actual method
		return method.invoke(target, args);
	}
}
