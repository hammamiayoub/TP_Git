package org.kadi.model;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Bateau implements Serializable {

			 /**
	 * 
	 */
	private static final long serialVersionUID = -7473787322913073961L;

	private Long id;
	
	private String nom;
	
	private List<Marin> equipage=new ArrayList<Marin>();

	private Statut statut; 

		
		public Bateau() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Bateau(String nom) {
			super();
			this.nom = nom;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		 public String getNom() {
				return nom;
			}

			public void setNom(String nom) {
				this.nom = nom;
			}
		public List<Marin> getEquipage() {
			return equipage;
		}

		public void setEquipage(List<Marin> equipage) {
			this.equipage = equipage;
		}
	
		public void addMarin(Marin m)
		{
			this.equipage.add(m);
		}
		
		public void removeMarin(Marin m){
			this.equipage.remove(m);
		}

		
		
		public Statut getStatut() {
			return statut;
		}

		public void setStatut(Statut statut) {
			this.statut = statut;
		}

		@Override
		public String toString() {
			return "Bateau [id=" + id + ", nom=" + nom + "]";
		}
	
		
}
