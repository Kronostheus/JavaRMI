package ttt;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Application{

	public static final int registryPort = 1099;
	
	public static void main(String args[]){

		try{
			TTT ttt = new TTT();
			
			final Registry reg = LocateRegistry.createRegistry(registryPort);
			reg.rebind("gameRegistry",ttt);
			
			System.err.println("Server up");
			
	        System.in.read();
			
		}
		catch (IOException e){ e.printStackTrace();	} 
	}
}
