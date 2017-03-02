package friendsofmine.controllers;

import friendsofmine.Bootstrap;
import friendsofmine.domain.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by 21301646 on 01/03/2017.
 */
@Controller
public class UtilisateurController {
    @Autowired
    private Bootstrap bootstrap;

    @RequestMapping(value = "/utilisateurs", method = GET)
    public String list(Model model) {
        model.addAttribute("utilisateurs", bootstrap.getUtilisateurs());
        return "utilisateurs";
    }
}
