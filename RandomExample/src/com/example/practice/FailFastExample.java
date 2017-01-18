package com.example.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastExample {
    
    
    public static void main(String[] args)
    {
    	List<String> premiumPhone = new CopyOnWriteArrayList<String>();
        premiumPhone.add("Apple");
        premiumPhone.add("HTC");
        premiumPhone.add("Samsung");
        
        
        ListIterator<String> iterator = premiumPhone.listIterator();
        
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            premiumPhone.add("Sony");
        }
        
    }
    
}