package de.kartellamt.db.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




/**
 * The persistent class for the Unternehmen database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Unternehmen.findAll", query="SELECT u FROM Unternehmen u"), @NamedQuery(name="find.through.id",query="SELECT u FROM Unternehmen u where u.id = :id"),
@NamedQuery(name="unternehmen.autocomplate.unternehmen.id", query="SELECT distinct u.id from Unternehmen u where CAST(u.id AS string) LIKE :idunternehmen")
}) 
public class Unternehmen implements Serializable, Comparable<Unternehmen>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	//private int artID;

//	@Lob
//	@Column(nullable = true)
//	private String bemerkung;
	@Column(nullable = true)
	private String farbe;

	private Integer geocoderQualitaetID;

//	@Column(name = "Geometrie", nullable = true)
//	@Type(type = "org.hibernatespatial.mysql.MySQLGeometryUserType")
//	private Point geometrie;
//	@Column(nullable = true)
//	@Temporal(TemporalType.DATE)
//	private Date gueltigBis;

	private String hausNr;

	private String hausNrZus;

//	@Lob
//	@Column(nullable = true)
//	private String kontakt;
	
	@Column(nullable = true)
	private int konzernID;
	
//	@Column(nullable = true)
//	private Integer landID;

	private String name;

	private String ort;

	private String plz;
	
//	@Column(nullable = true)
//	private Integer registerAGID;
//	
//	@Column(nullable = true)
//	private Integer registerArtID;
//	
//	@Column(nullable = true)
//	private String registerNr;
//	
//	private String sitz;

	private String strasse;

	private String symbol;

	//bi-directional many-to-one association to Faelle
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FallID")
	private Faelle faelle;

	public Unternehmen() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public int getArtID() {
//		return this.artID;
//	}
//
//	public void setArtID(int artID) {
//		this.artID = artID;
//	}

//	public String getBemerkung() {
//		return this.bemerkung;
//	}
//
//	public void setBemerkung(String bemerkung) {
//		this.bemerkung = bemerkung;
//	}

	public String getFarbe() {
		return this.farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getGeocoderQualitaetID() {
		return this.geocoderQualitaetID;
	}

	public void setGeocoderQualitaetID(int geocoderQualitaetID) {
		this.geocoderQualitaetID = geocoderQualitaetID;
	}

//	public Geometry getGeometrie() {
//		return this.geometrie;
//	}
//
//	public void setGeometrie(Point geometrie) {
//		this.geometrie = geometrie;
//	}

//	public Date getGueltigBis() {
//		return this.gueltigBis;
//	}
//
//	public void setGueltigBis(Date gueltigBis) {
//		this.gueltigBis = gueltigBis;
//	}

	public String getHausNr() {
		return this.hausNr;
	}

	public void setHausNr(String hausNr) {
		this.hausNr = hausNr;
	}

	public String getHausNrZus() {
		return this.hausNrZus;
	}

	public void setHausNrZus(String hausNrZus) {
		this.hausNrZus = hausNrZus;
	}

//	public String getKontakt() {
//		return this.kontakt;
//	}
//
//	public void setKontakt(String kontakt) {
//		this.kontakt = kontakt;
//	}

	public int getKonzernID() {
		return this.konzernID;
	}

	public void setKonzernID(int konzernID) {
		this.konzernID = konzernID;
	}

//	public int getLandID() {
//		return this.landID;
//	}
//
//	public void setLandID(int landID) {
//		this.landID = landID;
//	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrt() {
		return this.ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getPlz() {
		return this.plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

//	public int getRegisterAGID() {
//		return this.registerAGID;
//	}
//
//	public void setRegisterAGID(int registerAGID) {
//		this.registerAGID = registerAGID;
//	}
//
//	public int getRegisterArtID() {
//		return this.registerArtID;
//	}
//
//	public void setRegisterArtID(int registerArtID) {
//		this.registerArtID = registerArtID;
//	}
//
//	public String getRegisterNr() {
//		return this.registerNr;
//	}
//
//	public void setRegisterNr(String registerNr) {
//		this.registerNr = registerNr;
//	}
//
//	public String getSitz() {
//		return this.sitz;
//	}
//
//	public void setSitz(String sitz) {
//		this.sitz = sitz;
//	}

	public String getStrasse() {
		return this.strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Faelle getFaelle() {
		return this.faelle;
	}

	public void setFaelle(Faelle faelle) {
		this.faelle = faelle;
	}



	@Override
	public int compareTo(Unternehmen o) {
		// TODO Auto-generated method stub
		return 0;
	}
}