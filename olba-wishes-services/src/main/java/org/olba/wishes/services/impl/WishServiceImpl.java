package org.olba.wishes.services.impl;

import java.util.Set;
import org.olba.wishes.fondation.Wish;
import org.olba.wishes.services.api.WishServiceApi;
import org.olba.wishes.services.dao.api.WishDaoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Service Rest implementation
 * @author G508368
 */
@Controller
@RequestMapping("/wishesapp")
public class WishServiceImpl implements WishServiceApi {

    @Autowired
    private WishDaoApi wishDaoApi;

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public  @ResponseBody Set<Wish> readAll() {
    return wishDaoApi.readAll();
    }

}
