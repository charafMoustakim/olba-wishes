package org.olba.wishes.services.dao.api;

import java.util.Set;
import org.olba.wishes.fondation.Wish;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


/**
 * This is a crud interface for Wishes
 *
 * @author Charaf MOUSTAKIM
 */

@Repository
  @Qualifier("WishDaoApi")
public interface WishDaoApi {

    /**
     * Read all wishes
     *
     * @return Set of wishes
     */
    public Set<Wish> readAll();

    /**
     * Read select a wish by primary key id
     *
     * @return readed Wish
     */
    public Wish readById();

    /**
     * Add new wish
     *
     * @param newWish wish
     * @return wish identifier
     */
    public long addNew(final Wish newWish);

    /**
     * Update a wish if the wish not exist add as new
     *
     * @param wish Wish
     * @return updated or new wish
     */
    public Wish updateWish(final Wish wish);

    /**
     * Remove wish
     *
     * @param id wish identifier
     * @return true of false
     */
    public boolean removeWish(final long id);

    /**
     * Read wish by author
     *
     * @param author author
     * @return Set of wishes
     */
    public Set<Wish> readByAutor(final String author);
}
