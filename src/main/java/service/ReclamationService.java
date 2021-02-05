package service;

import java.util.ArrayList;
import java.util.List;

import modele.Reclamation;

public interface ReclamationService {
	
	public Reclamation addreclamation(Reclamation rec);
	public List<Reclamation> listReclamation();

}
