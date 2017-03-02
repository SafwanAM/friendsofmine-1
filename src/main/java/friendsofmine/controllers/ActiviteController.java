package friendsofmine.controllers;

import friendsofmine.Bootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by 21305507 on 02/03/2017.
 */
@Controller
public class ActiviteController {
    @Autowired
    private Bootstrap bootstrap;

    @RequestMapping(value = "/activites", method = GET)
    public String list(Model model) {
        model.addAttribute("activites", bootstrap.getActivites());
        return "activites";
    }
}