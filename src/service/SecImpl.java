package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

import entite.Facture;
import entite.FichePatient;
import entite.Fournisseur;
import entite.Fourniture;
import entite.Medecin;
import entite.Patient;
import entite.RDV;

public class SecImpl extends UnicastRemoteObject implements ISecRemote {

	public SecImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean creationRdv(Date date, Patient patient, String motif,
			Medecin medecin) throws RemoteException {
		// TODO Ajout de rdv dans la bdd
		return false;
	}

	@Override
	public boolean annulationRdv(RDV rdv) throws RemoteException {
		// TODO suppression de rdv de la bdd 
		return false;
	}

	@Override
	public boolean modificationRdv(RDV rdv, Date dateheure)
			throws RemoteException {
		// TODO modification d'un rdv de la bdd
		return false;
	}

	@Override
	public boolean creationFacture(Patient patient, Medecin medecin,
			String nomCabinet, int montant, Date date, String motif,
			boolean paye) throws RemoteException {
		// TODO Ajout de facture a la bdd
		return false;
	}

	@Override
	public boolean creationFourniture(String fournitures, Medecin medecin,
			Date date, Fournisseur fournisseur, int quantite)
			throws RemoteException {
		// TODO ajout de facture a la bdd
		return false;
	}

	@Override
	public boolean creationFichePatient(String nom, String prenom,
			Date inscription, String adresse, int numTel, String mail,
			int numSec) throws RemoteException {
		// TODO ajout de fichiepatient a la bdd
		return false;
	}

	@Override
	public boolean creationFournisseur(String nom, int tel, String mail,
			String adresse) throws RemoteException {
		// TODO ajout de fournisseur dans la bdd
		return false;
	}

	@Override
	public boolean modificationFacture(Facture facture) throws RemoteException {
		// TODO modifier facture de la bdd
		return false;
	}
	
}
