package test;

import java.rmi.RemoteException;
import java.util.List;

import ws.BanqueServiceProxy;
import ws.Compte;

public class ClientWS {

	public static void main(String[] args) throws RemoteException {
		
		BanqueServiceProxy proxy = new BanqueServiceProxy();
		System.out.println(proxy.conversionEuroToDH(32));
		Compte cp = proxy.getCompte(2L);
		
		System.out.println("-------- Compte 2 ------");
		System.out.println("Code = "+cp.getCode());
		System.out.println("Solde = "+cp.getSolde());
		
		Compte[] cptes = proxy.listComptes();
		
		for(Compte cps:cptes){
		System.out.println("--------------");
		System.out.println("Code = "+cps.getCode());
		System.out.println("Solde = "+cps.getSolde());
		}
	}
}
