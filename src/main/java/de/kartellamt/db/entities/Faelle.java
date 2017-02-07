package de.kartellamt.db.entities;

import java.io.Serializable;
import javax.persistence.*;


import java.util.List;


/**
 * The persistent class for the Faelle database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Faelle.findAll", query="SELECT f FROM Faelle f"),
@NamedQuery(name="Faelle.find.by.bezeichnung", query="SELECT f FROM Faelle f where f.bezeichnung like :bezeichnung"),
@NamedQuery(name="Faelle.find.by.aktenzeichen", query="SELECT f FROM Faelle f where f.aktenzeichen like :aktenzeichen"),
@NamedQuery(name="fall.autocomplate.bezeichnung", query="SELECT distinct f.bezeichnung from Faelle f where f.bezeichnung like :searchedBezeichnung"),
@NamedQuery(name="fall.autocomplate.aktenzeichen", query="SELECT distinct f.aktenzeichen from Faelle f where f.aktenzeichen like :searchedAktenzeichen")
})

public class Faelle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String aktenzeichen;

	private String bezeichnung;

	private int offsetUnternehmenID;
	
	
	
//	@Column(name = "vdbid", nullable = true)
//	private int vdbid;

	//bi-directional many-to-one association to Unternehmen
	@OneToMany
	@JoinColumn(referencedColumnName="ID", name="FallID")
	private List<Unternehmen> unternehmens;

	public Faelle() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAktenzeichen() {
		return this.aktenzeichen;
	}

	public void setAktenzeichen(String aktenzeichen) {
		this.aktenzeichen = aktenzeichen;
	}

	public String getBezeichnung() {
		return this.bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public int getOffsetUnternehmenID() {
		return this.offsetUnternehmenID;
	}

	public void setOffsetUnternehmenID(int offsetUnternehmenID) {
		this.offsetUnternehmenID = offsetUnternehmenID;
	}

//	public int getVdbid() {
//		return this.vdbid;
//	}
//
//	public void setVdbid(int vdbid) {
//		this.vdbid = vdbid;
//	}

	public List<Unternehmen> getUnternehmens() {
		return this.unternehmens;
	}

	public void setUnternehmens(List<Unternehmen> unternehmens) {
		this.unternehmens = unternehmens;
	}

	public Unternehmen addUnternehmen(Unternehmen unternehmen) {
		getUnternehmens().add(unternehmen);
		unternehmen.setFaelle(this);

		return unternehmen;
	}

	public Unternehmen removeUnternehmen(Unternehmen unternehmen) {
		getUnternehmens().remove(unternehmen);
		unternehmen.setFaelle(null);

		return unternehmen;
	}
}