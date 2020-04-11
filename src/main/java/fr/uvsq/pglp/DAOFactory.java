package fr.uvsq.pglp;
import java.sql.Connection;

public class DAOFactory {
    public static DAO<Personnels> PersonnelsDAO(Connection conn){
        return new PersonnelsDAO();
    }

    public static DAO<CompositePerso> getCompositePerso(Connection conn){
        return new CompositePersoDAO();
    }
}
