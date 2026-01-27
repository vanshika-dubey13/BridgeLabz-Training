package com.collections.reflection.diusingreflection;

//Step 3: Class that requires dependencies
class Client {

 @Inject
 private ServiceA serviceA;

 @Inject
 private ServiceB serviceB;

 public void doWork() {
     serviceA.serve();
     serviceB.execute();
 }
}
