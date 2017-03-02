package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.domain.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by 21301646 on 01/03/2017.
 */
@Service
public class InitialisationService {
    List<Utilisateur> utilisateurs = new ArrayList<>();
    List<Activite> activites = new ArrayList<>();

    public void initDonnees() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date date = cal.getTime();

        utilisateurs.add(new Utilisateur("Paul", "Givel", "paulgivel@gmail.com", "M", date));
        utilisateurs.add(new Utilisateur("Smith", "Morty", "mortysmith@gmail.com", "M", date));
        utilisateurs.add(new Utilisateur("Sanchez", "Rick", "ricksanchez@gmail.com", "M"));
        utilisateurs.add(new Utilisateur("Smith", "Summer", "summersmith@gmail.com", "F", date));
        utilisateurs.add(new Utilisateur("WAYNE", "Bruce", "imbatman@darkknight.com", "M"));

        activites.add(new Activite("Regarder la TV", ""));
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public List<Activite> getActivites() {
        return activites;
    }
}
