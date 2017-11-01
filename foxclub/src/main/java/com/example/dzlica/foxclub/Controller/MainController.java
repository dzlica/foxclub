package com.example.dzlica.foxclub.Controller;

import com.example.dzlica.foxclub.Model.Drink;
import com.example.dzlica.foxclub.Model.Food;
import com.example.dzlica.foxclub.Model.FoxMaker;
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
        model.addAttribute("trick", "0");
        model.addAttribute("food", myfox.getFood());
        model.addAttribute("drink", myfox.getDrink());
        return "index";
    }

    @GetMapping("/nutritionstore")
    public String nutrition(Model model) {
        model.addAttribute("name", myfox.getName());
        model.addAttribute("foods", Food.foods);
        model.addAttribute("drinks", Drink.drinks);
        return "nutritionstore";
    }

    @PostMapping("/nutritionstore")
    public String getNutrition(@ModelAttribute FoxMaker myfox, Model model) {
        model.addAttribute("name", myfox.getName());
        model.addAttribute("food", myfox.getFood());
        model.addAttribute("drink", myfox.getDrink());
        model.addAttribute("trick", "0");
        return "index";
    }

}

