import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld{
	public HelloWorldImpl() throws RemoteException{
		
	}
	
	public String hello() {
		return "----- Hello World, wtf? -----";
	}
}
