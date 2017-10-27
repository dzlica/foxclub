package com.example.dzlica.foxclub.Controller;

import com.example.dzlica.foxclub.Model.FoxApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    FoxApp myfox;


    @RequestMapping({"", "/"})
    public String createfox(Model model) {

        model.addAttribute("name", myfox.getName());
        model.addAttribute("trick", myfox.getTricks());
        model.addAttribute("food", myfox.getFood());
        model.addAttribute("drink", myfox.getDrink());
        return "index";
    }

}

