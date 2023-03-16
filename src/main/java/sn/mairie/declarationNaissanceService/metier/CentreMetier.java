package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.mairie.declarationNaissanceService.entities.Centre;
import sn.mairie.declarationNaissanceService.repositories.CentreRepository;
import sn.mairie.declarationNaissanceService.repositories.DeclarantRepository;


@Service
@Data
public class CentreMetier implements ICentreMetier {
	@Autowired
	CentreRepository centreRepository;
	
	@Override
	public Centre save(Centre centre) {
		// TODO Auto-generated method stub
		return centreRepository.save(centre);
	}

	@Override
	public List<Centre> list() {
		// TODO Auto-generated method stub
		return centreRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		centreRepository.deleteById(id);
		return "Suppression réussie";
	}

	@Override
	public Centre search(Long id) {
		// TODO Auto-generated method stub
		return centreRepository.findById(id).get();
	}

	@Override
	public String update(Long id, Centre centre) {
		// TODO Auto-generated method stub
		Centre existe = centreRepository.findById(id).get();
		
		if(existe != null) {
			if(centre.getCode() != null) existe.setCode(centre.getCode());
			if(centre.getCollectiviteLocale() != null) existe.setCollectiviteLocale(centre.getCollectiviteLocale());
			if(centre.getDepartement() != null) existe.setDepartement(centre.getDepartement());
			if(centre.getLibele() != null) existe.setLibele(centre.getLibele());
			if(centre.getRegion() != null) existe.setRegion(centre.getRegion());
			
			centreRepository.save(existe);
			return "Modification reussie";
		}
		return "Modification bloquée";
	}

}
