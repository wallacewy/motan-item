package com.wallace.motan;

public class ItemServiceImpl implements ItemService {
	
	public String hello(String name) {
        System.out.println(name + " invoked item service");
        return "Hello " + name + ", it's greeting from item service (group v2)";
    }
}
