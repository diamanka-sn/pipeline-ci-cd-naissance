package sn.mairie.declarationNaissanceService.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="meres")
@Data
@NoArgsConstructor @AllArgsConstructor @ToString

public class Mere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 30, name="nom")
	private String nom;
	private String prenom;
	private String typePiece; 
	@Size(max=16)
	private String numeroPiece;
	private String profession;
	private String adresse;
	@Temporal(TemporalType.DATE)
	private Date dateNaiss;
	private String lieuNaiss;
	@OneToMany(mappedBy = ("mere"))
	private Collection<DeclarationNaissance> declarationNaissance;
}
