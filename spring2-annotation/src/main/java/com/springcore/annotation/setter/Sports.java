package com.springcore.annotation.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "sport")
public class Sports {
String name;

public String getName() {
	return name;
}
@Value(value="cricket")
public void setName(String name) {
	this.name = name;
}

}
