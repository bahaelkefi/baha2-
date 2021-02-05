package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modele.Reclamation;

@Repository
public interface ReclamationRepository extends  JpaRepository<Reclamation, Long> {

	
	
}
