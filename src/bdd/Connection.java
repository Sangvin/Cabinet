package bdd;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

	private String url = "jdbc:mysql://localhost/cabinet";
	//Nom du user
	private String user = "root";
	//Mot de passe de l'utilisateur
	private String passwd = "";
	//Objet Connection
	private static java.sql.Connection connect;

	//Constructeur privé
	private Connection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url, user, passwd);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	//Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
	public static java.sql.Connection getInstance(){
		if(connect == null){
			new Connection();
		}
		return connect;
	}
}
