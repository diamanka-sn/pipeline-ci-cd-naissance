package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.Centre;
import sn.mairie.declarationNaissanceService.entities.Jugement;

public interface IJugementMetier {
	

	public Jugement save(Jugement jugement);
	
	public List<Jugement> list();
	
	public String remove(Long id);
	
	public Jugement search(Long id);
	
	public String update(Long id,Jugement jugement);
	
}
