package com.springcore.annotation.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="myCust")
public class Customer {
int id;
String name;
public Customer(@Value(value ="01")int id,@Value(value="Amisha") String name) {
	super();
	this.id = id;
	this.name = name;
}
public void print() {
	System.out.println(id);
	System.out.println(name);
}

}
