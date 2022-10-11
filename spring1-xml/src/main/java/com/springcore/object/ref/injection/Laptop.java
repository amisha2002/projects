package com.springcore.object.ref.injection;

public class Laptop {
Usb usb;
public void setUsb(Usb usb) {
	this.usb  = usb;
}
public void getLaptop() {
	System.out.println("in my laptop");
	usb.getUsb();
}
}
