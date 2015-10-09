package com.teamtreehouse.giflib.web;

import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs(Model model) {
        model.addAttribute("gifs", GifRepository.ALL_GIFS);
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(Model model, @PathVariable String name) {
        Gif gif = new Gif(name, LocalDate.of(2015, 2, 13), "Chris Ramacciotti", true);
        model.addAttribute("gif",gif);
        return "gif-details";
    }
}