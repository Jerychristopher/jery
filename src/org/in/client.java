package org.in;

public class client extends data{
	
	public void clientid() {
System.out.println("client ID");
	}
public void clientname() {

	System.out.println("clientname");
}

public static void main(String[] args) {
	
	client c = new client();
	c.clientid();
	c.clientname();
	c.dataID();
	c.dataname();
	
}
}
