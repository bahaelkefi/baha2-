package service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import modele.Reclamation;
import repositories.ReclamationRepository;

@Service
public class ReclamationServiceImp implements ReclamationService {
	
    @Autowired
  
	ReclamationRepository reclamationRepository;

	@Override
	public Reclamation addreclamation(Reclamation rec) {
		// TODO Auto-generated method stub
		return reclamationRepository.save(rec);
	}

	@Override
	public List<Reclamation> listReclamation() {
		// TODO Auto-generated method stub
		return reclamationRepository.findAll();
	}

}
