package de.kartellamt.db.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Konzerne database table.
 * 
 */
@Entity
@NamedQuery(name="Konzerne.findAll", query="SELECT k FROM Konzerne k")
public class Konzerne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String farbe;

	@Temporal(TemporalType.DATE)
	private Date gueltigBis;

	private String name;

	private String symbol;

	//bi-directional many-to-one association to Faelle
//	@OneToMany(mappedBy="konzerne")
//	private List<Faelle> faelles;

	public Konzerne() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFarbe() {
		return this.farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public Date getGueltigBis() {
		return this.gueltigBis;
	}

	public void setGueltigBis(Date gueltigBis) {
		this.gueltigBis = gueltigBis;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

//	public List<Faelle> getFaelles() {
//		return this.faelles;
//	}
//
//	public void setFaelles(List<Faelle> faelles) {
//		this.faelles = faelles;
//	}
	
	@Override
	public String toString () {
		return this.name;
	}


}
