package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.Mention;

public interface IMentionMetier {

public Mention save(Mention mention);
	
	public List<Mention> list();
	
	public String remove(Long id);
	
	public Mention search(Long id);
	
	public String update(Long id,Mention mention);
}
