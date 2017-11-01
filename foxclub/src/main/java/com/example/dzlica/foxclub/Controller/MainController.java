package com.example.dzlica.foxclub.Controller;

import com.example.dzlica.foxclub.Model.Drink;
import com.example.dzlica.foxclub.Model.Food;
import com.example.dzlica.foxclub.Model.FoxMaker;
import com.example.dzlica.foxclub.Model.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    FoxMaker myfox;


    @RequestMapping({"", "/", "index"})
    public String createfox(Model model) {

        model.addAttribute("name", myfox.getName());
        model.addAttribute("tricks", myfox.getTricks());
        model.addAttribute("foods", myfox.getFood());
        model.addAttribute("drinks", myfox.getDrink());
        model.addAttribute("tricknum", myfox.getTricks().size());
        return "index";
    }

    @GetMapping("/nutritionstore")
    public String nutrition(Model model) {
        model.addAttribute("name", myfox.getName());
        model.addAttribute("foods", Food.foods);
        model.addAttribute("drinks", Drink.drinks);
        model.addAttribute("tricks", Tricks.tricks);
        return "nutritionstore";
    }

    @PostMapping("/nutritionstore")
    public String getNutrition(@ModelAttribute FoxMaker myfox, Model model) {
        model.addAttribute("name", myfox.getName());
        model.addAttribute("food", myfox.getFood());
        model.addAttribute("drink", myfox.getDrink());
        model.addAttribute("tricks", myfox.getTricks());
        model.addAttribute("tricknum", myfox.getTricks().size());
        return "index";
    }

    @GetMapping("/trickcenter")
    public String Trick(Model model) {
        model.addAttribute("tricks", Tricks.tricks);
        return "trickcenter";
    }

    @PostMapping("/trickcenter")
    public String getTrick(@ModelAttribute FoxMaker myfox, Model model) {
        model.addAttribute("name", myfox.getName());
        model.addAttribute("food", myfox.getFood());
        model.addAttribute("drink", myfox.getDrink());
        model.addAttribute("tricknum", myfox.getTricks().size());
        model.addAttribute("tricks", myfox.getTricks());
        return "index";
    }

}

