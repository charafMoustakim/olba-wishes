package org.olba.wishes.services.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.olba.wishes.fondation.Wish;
import org.olba.wishes.services.dao.api.WishDaoApi;

/**
 *
 * @author G508368
 */
public class WishDaoImpl implements WishDaoApi {

    @PersistenceContext
    EntityManager em;

    @Override
    public Set<Wish> readAll() {
        Set<Wish> results= new HashSet<>();
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Wish> q = cb.createQuery(Wish.class);
        Root<Wish> c = q.from(Wish.class);
        q.select(c);
        TypedQuery<Wish> query = em.createQuery(q);
        
        List<Wish> wishes= query.getResultList();
        if(wishes!=null || wishes.isEmpty()==false){
            results.addAll(wishes);
        }
        return results;
    }

    @Override
    public Wish readById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long addNew(Wish newWish) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Wish updateWish(Wish wish) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeWish(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Wish> readByAutor(String author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
