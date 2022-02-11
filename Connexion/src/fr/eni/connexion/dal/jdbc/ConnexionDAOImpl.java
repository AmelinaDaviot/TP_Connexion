package fr.eni.connexion.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import fr.eni.connexion.bo.Utilisateurs;
import fr.eni.connexion.dal.jdbc.JdbcTools;

public class ConnexionDAOImpl {
	
	private static final String SQL_INSERT = "INSERT INTO UTILISATEURS(no_utilisateur, nom, prenom, email, mot_de_passe)"
			+ "VALUES(?, ?, ?, ?, ?)";
	private static final String SQL_SELECT_ALL = "SELECT no_utilisateur, nom, prenom, email, mot_de_passe";
	private static final String SQL_UPDATE = "UPDATE UTILISATEURS SET no_utilisateur = ?, nom = ?, prenom ?, email = ? mot_de_passe = ?";
	private static final String SQL_DELETE = "DELETE FROM UTILISATEURS WHERE no_utilisateur = ?";
	
	public void insert(Utilisateurs user) {
		Connection uneConnection;
		try {
			uneConnection = JdbcTools.getConnection();
			PreparedStatement pStmt = uneConnection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
			
			pStmt.setString(1, user.getNom());
			pStmt.setString(2, user.getPrenom());
			pStmt.setString(3, user.getEmail());
			pStmt.setString(4, user.getMdp());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
