package ClientServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import service.DoctorImpl;
import service.SecImpl;

public class Server {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		LocateRegistry.createRegistry(1099);
		DoctorImpl od = new DoctorImpl();
		Naming.rebind("rmi://localhost:1099/DR", od);
		SecImpl se = new SecImpl();
		Naming.rebind("rmi://localhost:1099/SE", se);
		System.err.println("Server waiting ...");
	}

}
