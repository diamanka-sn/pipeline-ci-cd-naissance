package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.Registre;


public interface IRegistreMetier {
public Registre save(Registre registre);
	
	public List<Registre> list();
	
	public String remove(Long id);
	
	public Registre search(Long id);
	
	public String update(Long id,Registre registre);
}
