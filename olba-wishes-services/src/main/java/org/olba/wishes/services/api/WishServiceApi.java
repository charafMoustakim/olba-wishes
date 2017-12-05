package org.olba.wishes.services.api;

import java.util.Set;
import org.olba.wishes.fondation.Wish;


/**
 * This is a crud interface for Wishes
 *
 * @author Charaf MOUSTAKIM
 */

public interface WishServiceApi {

    
    Set<Wish> readAll();

}
