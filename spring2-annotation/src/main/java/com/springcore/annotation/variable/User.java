package com.springcore.annotation.variable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="myUser")
public class User {
	@Value(value="100")
int id;
	@Value(value="Amisha")
String name;

public void print() {
	System.out.println(id);
	System.out.println(name);
}

}
