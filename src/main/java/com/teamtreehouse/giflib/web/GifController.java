package com.teamtreehouse.giflib.web;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(Model model) {
        Gif gif = new Gif("compiler-bot", LocalDate.of(2015, 2, 13), "Chris Ramacciotti", true);
        model.addAttribute("gif",gif);
        return "gif-details";
    }
}