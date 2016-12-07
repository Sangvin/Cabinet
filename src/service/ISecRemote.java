package service;
import entite.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface ISecRemote extends Remote{

    public RDV creationRdv(Date date, Patient patient, String motif, Medecin medecin) throws RemoteException;
    public boolean annulationRdv(RDV rdv) throws RemoteException;
    public boolean modificationRdv(RDV rdv,Date dateheure) throws  RemoteException;
    public Facture creationFacture(Patient patient, Medecin medecin,String nomCabinet,int montant,Date date,String motif, boolean paye) throws  RemoteException;
    public Fourniture creationFourniture(String fournitures, Medecin medecin, Date date, Fournisseur fournisseur, int quantite)throws  RemoteException;
    public FichePatient creationFichePatient(String nom,String prenom, Date inscription, String adresse, int numTel, String mail, int numSec) throws RemoteException;
    public Fournisseur creationFournisseur(String nom, int tel, String mail, String adresse) throws RemoteException;
    public boolean modificationFacture(Facture facture) throws RemoteException;
}
