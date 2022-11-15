package com.shree.enumdemo;


public class EnumDemo {
	public static void main(String[] args) {
	
		TrafficSignal[] signals = TrafficSignal.values();
		
		for(TrafficSignal ts : signals) {
			System.out.println("Signal : " + ts.name()+", Action : " + ts.getAction());
		}
	}
}

enum TrafficSignal{
	
	RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");
	
	private String action;
	
	public String getAction() {
		
		return this.action;
	}
	
	private TrafficSignal(String action)
    {
        this.action = action;
    }
	
}