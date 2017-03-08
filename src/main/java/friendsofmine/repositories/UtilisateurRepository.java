package friendsofmine.repositories;

import friendsofmine.domain.Utilisateur;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Moi on 09/03/2017.
 */
public interface UtilisateurRepository extends PagingAndSortingRepository<Utilisateur, Long> {

}