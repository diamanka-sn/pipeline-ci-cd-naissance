package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.mairie.declarationNaissanceService.entities.Centre;
import sn.mairie.declarationNaissanceService.entities.Jugement;
import sn.mairie.declarationNaissanceService.repositories.CentreRepository;
import sn.mairie.declarationNaissanceService.repositories.JugementRepository;


@Service
@Data
public class JugementMetier implements IJugementMetier{
	@Autowired
	JugementRepository jugementRepository;
	
	@Override
	public Jugement save(Jugement jugement) {
		// TODO Auto-generated method stub
		return jugementRepository.save(jugement);
	}

	@Override
	public List<Jugement> list() {
		// TODO Auto-generated method stub
		return jugementRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		jugementRepository.deleteById(id);
		return "Suppression réussie";
	}

	@Override
	public Jugement search(Long id) {
		// TODO Auto-generated method stub
		return jugementRepository.findById(id).get();
	}

	@Override
	public String update(Long id, Jugement jugement) {
		// TODO Auto-generated method stub
		
		Jugement existe = jugementRepository.findById(id).get();
		if(existe != null) {
			if(jugement.getDate() != null) existe.setDate(jugement.getDate());
			if((jugement.getLieu() != null)) existe.setLieu(jugement.getLieu());
			if(jugement.getNumero() != null) existe.setNumero(jugement.getNumero());
			
			jugementRepository.save(existe);
			return "Modification reussie";
		}
		return "Modification echouée";
	}

}
