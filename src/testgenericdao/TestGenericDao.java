/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgenericdao;

import com.michael.framework.CriteriaBuilder;
import com.michael.framework.GenericDao;
import com.michael.framework.LogicalOperator;
import com.michael.framework.Pagination;
import com.michael.framework.Restrictions;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author michael
 */
public class TestGenericDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, SQLException, IntrospectionException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, Exception {
        // Chargement de la Base de donnée avec l'id=1
        GenericDao genericDao = new GenericDao("1");
        
        /*
            FIND
        */
        /// ALL
//        CriteriaBuilder criteriaBuilder = genericDao.getCriteriaBuilder(Film.class);
//        List<Film> films = genericDao.select();
//        for (Film film : films) {
//            System.out.println(film);
//        }
        
        /// ID
//        CriteriaBuilder criteriaBuilder = genericDao.getCriteriaBuilder(Film.class);
//        Film film = (Film) genericDao.selectById(1);
//        System.out.println(film);
        

        /// MULTICRITERES
        CriteriaBuilder criteriaBuilder = genericDao.getCriteriaBuilder(Film.class);
        criteriaBuilder.add(Restrictions.eq("Film", "nom", "Naruto"), LogicalOperator.NONE);
        List<Film> films = genericDao.select();
        for (Film film : films) {
            System.out.println(film);
        }
        
        
//        genericDao.registerIntoCache(Film.class);
//        genericDao.getInCache(Film.class);
//        criteriaBuilder.add(Restrictions.eq("Film", "nom", "Les soeurs Du Pd"), LogicalOperator.NONE);
//        criteriaBuilder.setPagination(2, 3);
//        String pattern = "yyyy-MM-dd";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        criteriaBuilder.add(Restrictions.between("ActeurDansFilm", "date_naissance", simpleDateFormat.parse("1997-11-11"), simpleDateFormat.parse("2020-11-11")), LogicalOperator.NONE);
//        System.out.println("===" + film.getNom() + " | id: " + film.getId() + "=== par " + film.getRealisateur().getNom());
        
//        for(Realisateur realisateur : realisateurs) {
//            System.out.println("====="+realisateur.getNom()+"=====");
//            for(Film film: realisateur.getFilms()) {
//                String affichage = film.getNom() +": ";
//                for(ActeurDansFilm acteur: film.getActeurs()) {
//                    affichage += acteur.getNom() + " ";
//                }
//                affichage += " by " + film.getRealisateur().getNom();
//                System.out.println(affichage);
//                
//            }
//        }
//        Film film = (Film) genericDao.selectById(116);
//        genericDao.delete(film);
        
//        System.out.println(film.getNom());
//        film.setNom("Hétéro film");
//        film.getRealisateur().setNom("Tanos");
//        film.getActeurs().forEach((acteur) -> {
//            System.out.println(acteur.getNom());
//        });
//        film.getActeurs().get(0).setNom("Vody");
//        genericDao.update(film);
//        film.getActeurs().forEach((acteur) -> {
//            System.out.println(acteur.getNom());
//        });
//        Film f = new Film();
//        f.setNom("Les soeurs Du Bg");
//        
//        Realisateur r = new Realisateur();
//        r.setId(12);
//        r.setNom("Albert Camus");
//        
//        ActeurDansFilm a1 = new ActeurDansFilm();
//        a1.setNom("Bruce Lee");
//        a1.setFilm(f);
//        ActeurDansFilm a2 = new ActeurDansFilm();
//        a2.setId(16);
//        a2.setFilm(f);
//        
//        List<ActeurDansFilm> af = new ArrayList<ActeurDansFilm>();
//        af.add(a1);
//        af.add(a2);
//        
//        f.setActeurs(af);
//        f.setRealisateur(r);
//        genericDao.insert(f);
    }
}
