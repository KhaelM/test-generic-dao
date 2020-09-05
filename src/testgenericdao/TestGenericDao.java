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
import java.util.Date;
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
////        criteriaBuilder.setPagination(1, 3); //Pagination
//        List<Film> films = (List<Film>) genericDao.select();
        
        /// ID
//        CriteriaBuilder criteriaBuilder = genericDao.getCriteriaBuilder(Film.class);
//        Film film = (Film) genericDao.selectById(1);
        

        /// MULTICRITERES
//        CriteriaBuilder criteriaBuilder = genericDao.getCriteriaBuilder(Acteur.class);
        
        // Comparaison String
//        criteriaBuilder.add(Restrictions.eq("Film", "nom", "Naruto"), LogicalOperator.NONE);

        // Date
//        String pattern = "yyyy-MM-dd";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        criteriaBuilder.add(Restrictions.between("Acteur", "date_naissance", simpleDateFormat.parse("1969-11-11"), simpleDateFormat.parse("2020-11-11")), LogicalOperator.NONE);

//        List<Acteur> films = (List<Acteur>) genericDao.select();
        
        
        /// CACHE
//        genericDao.registerIntoCache(Film.class);
//        List<Film> films = (List<Film>)genericDao.getInCache(Film.class);

        
        /// DELETE
        // manyToMany relations (acteur_film) are deleted
//        CriteriaBuilder criteriaBuilder = genericDao.getCriteriaBuilder(Film.class);
//        Film film = (Film) genericDao.selectById(2);
//        genericDao.delete(film);
        
        /// UPDATE
//        films.get(0).setNom("Malgache");
//        genericDao.update(films.get(0));
        
        
        /// INSERT
//        Film f = new Film();
//        f.setNom("Le livre de la Jungle");
        
        // non existing realisator
//        Realisateur r = new Realisateur();
//        r.setNom("Momoshiki");
        
        // already exisiting realisator
//        Realisateur r = new Realisateur();
//        r.setId(1);
        

        // ManytoMany insert non existing and existing
//        Acteur a1 = new Acteur();
//        a1.setId(30);
//        a1.setDateNaissance(new Date());
//        a1.setNom("Bruce Lee");
//        Acteur a2 = new Acteur();
//        a2.setId(16);
//        
//        List<Acteur> af = new ArrayList<Acteur>();
//        af.add(a1);
//        af.add(a2);
//        
//        f.setActeurs(af);
//        f.setRealisateur(r);
//        genericDao.insert(f);
    }
}
