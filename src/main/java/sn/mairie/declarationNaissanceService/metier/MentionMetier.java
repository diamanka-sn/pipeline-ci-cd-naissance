package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.mairie.declarationNaissanceService.entities.Mention;
import sn.mairie.declarationNaissanceService.repositories.MentionRepository;


@Service
@Data
public class MentionMetier implements IMentionMetier {
	@Autowired
	MentionRepository mentionRepository;

	@Override
	public Mention save(Mention mention) {
		// TODO Auto-generated method stub
		return mentionRepository.save(mention);
	}

	@Override
	public List<Mention> list() {
		// TODO Auto-generated method stub
		return mentionRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		mentionRepository.deleteById(id);
		return "Suprresion reussie";
	}

	@Override
	public Mention search(Long id) {
		// TODO Auto-generated method stub
		return mentionRepository.findById(id).get();
	}

	@Override
	public String update(Long id, Mention mention) {
		// TODO Auto-generated method stub
		Mention existe = mentionRepository.findById(id).get();
		if(existe != null) {
			if(mention.getApposition() != null) existe.setApposition(mention.getApposition());
			if(mention.getLibele() != null) existe.setLibele(mention.getLibele());
			
			mentionRepository.save(existe);
			return "modification reussie";
		}
		return "modification  bloquée";
	}

	
}
