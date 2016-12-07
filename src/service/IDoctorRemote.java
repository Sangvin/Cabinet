package service;



import entite.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

public interface IDoctorRemote extends Remote {

    public ArrayList<RDV> consultationRdv() throws RemoteException;
    public boolean creationOrdonnance(Medecin medecin, Patient patient, String description, String nomCabinet) throws RemoteException;
    public  ArrayList<Patient> consultationFichePatient() throws  RemoteException;
    public DossierMedical creationDossierMedical(Patient patient, ArrayList<Ordonnance> listOrdonnance, ArrayList<String> vaccin,
                                                 String traitementMedical, Medecin medecin) throws RemoteException;
    public Patient consultationDossierMedical(Patient patient)throws RemoteException;
    public boolean creationCertificat(Patient patient, Medecin medecin, String motif, Date date, String description, String nomCabinet) throws RemoteException;


}
