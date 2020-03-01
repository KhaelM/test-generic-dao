/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgenericdao;

import com.michael.framework.Cache;
import com.michael.framework.Id;
import com.michael.framework.JoinColumn;
import com.michael.framework.ManyToOne;
import com.michael.framework.OneToMany;
import java.util.List;

/**
 *
 * @author michael
 */
@Cache
public class Film {
    @Id(autoGenerated=true)
    private int id;
    private String nom;
    
    @ManyToOne
    @JoinColumn(name="id_realisateur")
    private Realisateur realisateur;
    
    @OneToMany(mappedBy="film")
    private List<ActeurDansFilm> acteurs;

    @Override
    public String toString() {
        String display = "\n{\n";
        display += "\tid: "+this.id+"\n";
        display += "\tnom: "+this.nom+"\n";
        display += "\trealisateur: {" + "\n";
        display += "\t\tid: " + getRealisateur().getId()+"\n";
        display += "\t\tnom: " + getRealisateur().getNom()+"\n";
        display += "\t}\n";
        display += "\tacteurs: [" + "\n";
        for(int i = 0; i < this.getActeurs().size(); i++) {
            display += this.getActeurs().get(i).toString();
            if(i != this.getActeurs().size()-1) {
                display += ",\n";
            }
        }
        display += "\n\t]\n";
        display += "}";
        return display;
    }

    public List<ActeurDansFilm> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<ActeurDansFilm> acteurs) {
        this.acteurs = acteurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Realisateur getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }
}