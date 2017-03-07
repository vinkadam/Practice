package com.example.structural.proxy;

public class ProxyPatternTest {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("John", "wick@1");
		try {
			executor.runCommand("java -version");
			executor.runCommand("cmd");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
		System.out.println("\n*********************\n");
		
		CommandExecutor executor1 = new CommandExecutorProxy("John", "wick@2");
		try {
			executor1.runCommand("java -version");
			executor1.runCommand("cmd");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}