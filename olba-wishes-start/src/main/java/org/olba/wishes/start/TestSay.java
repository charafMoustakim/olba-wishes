/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.olba.wishes.start;

import java.util.HashSet;
import java.util.Set;
import org.olba.wishes.fondation.Wish;
import org.olba.wishes.services.dao.api.WishDaoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author G508368
 */
@Controller
@RequestMapping("/call")
public class TestSay {
    @Autowired
     @Qualifier("WishDaoApi")
    private WishDaoApi wishDaoApi;
    
     @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Set<Wish> callForSay() {
        wishDaoApi.readAll();
        return new HashSet<Wish>();
    }
}
