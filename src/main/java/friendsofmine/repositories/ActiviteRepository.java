package friendsofmine.repositories;

import friendsofmine.domain.Activite;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Moi on 09/03/2017.
 */
public interface ActiviteRepository extends PagingAndSortingRepository<Activite, Long> {

}