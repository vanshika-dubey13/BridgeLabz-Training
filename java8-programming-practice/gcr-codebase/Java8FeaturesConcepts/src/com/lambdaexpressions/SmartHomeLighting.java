package com.lambdaexpressions;

//creating a functional interface to invoke lambda expressions
@FunctionalInterface
interface LightAction{
	void activate();
}

public class SmartHomeLighting {

    public static void main(String[] args) {

        // Motion detected
        LightAction motionTrigger = () ->
                System.out.println("Motion detected: Lights turned ON at full brightness");

        // Night time
        LightAction nightTimeTrigger = () ->
                System.out.println("Night time: Lights set to dim mode");

        // Voice command
        LightAction voiceCommandTrigger = () ->
                System.out.println("Voice command received: Lights set to blue ambience");

        // Executing different lighting behaviors
        motionTrigger.activate();
        nightTimeTrigger.activate();
        voiceCommandTrigger.activate();
    }
}

