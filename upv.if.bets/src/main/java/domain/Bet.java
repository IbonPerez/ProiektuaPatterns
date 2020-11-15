package domain;

import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@Entity
public class Bet {
	@Id 
	@GeneratedValue
	private Integer BetId;
	private Double zenbatDiru;
	private Integer kuotaId;
	private Integer originala;
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	private Vector<Integer> ApustuAnitza;
	
	
	public Integer getOriginala() {
		return originala;
	}


	public void setOriginala(Integer or) {
		originala = or;
	}


	public Integer getKuotaId() {
		return kuotaId;
	}


	public void setKuotaId(Integer kuotaId) {
		this.kuotaId = kuotaId;
	}


	public Integer getBetId() {
		return BetId;
	}
//	public void setBetId(Integer betId) {
//		BetId = betId;
//	}
	
	
	public Double getZenbatDiru() {
		return zenbatDiru;
	}
	public void setZenbatDiru(Double zenbat) {
		this.zenbatDiru = zenbat;
	}
	public Bet() {
		super();
	}
	
	public Bet( Double zenbat,Integer id) {
		super();
		this.zenbatDiru = zenbat;
		this.kuotaId=id;
	}
	
	public Bet( Double zenbat,Integer id, Integer betId) {
		super();
		this.zenbatDiru = zenbat;
		this.kuotaId=id;
		this.originala=betId;
	}
	
	public Bet( Double zenbat,Integer id, Vector<Integer> besteApustu) {
		super();
		this.zenbatDiru = zenbat;
		this.kuotaId=id;
		this.ApustuAnitza=besteApustu;
	}
	
	
	
	public Vector<Integer> getApustuAnitza() {
		return ApustuAnitza;
	}


	public void setApustuAnitza(Vector<Integer> apustuAnitza) {
		ApustuAnitza = apustuAnitza;
	}


	public Bet( Double zenbat,Integer id, Integer betId, Vector<Integer> besteApustu) {
		super();
		this.zenbatDiru = zenbat;
		this.kuotaId=id;
		this.originala=betId;
		this.ApustuAnitza=besteApustu;
	}
	
	public Bet( Integer id, Double zenbat,Integer id1, Integer betId, Vector<Integer> besteApustu) {
		this.BetId=id;
		this.zenbatDiru = zenbat;
		this.kuotaId=id1;
		this.originala=betId;
		this.ApustuAnitza=besteApustu;
	}
	
	public void setBetId (Integer i) {
		this.BetId=i+1;
	}
	
	public String toString() {
		return "ID:"+this.BetId +" apustua";
		
	}
}
