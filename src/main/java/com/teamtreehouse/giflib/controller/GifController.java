package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(Model model) {
        List<Gif> allGifs = gifRepository.getAllGifs();
        model.addAttribute("gifs", allGifs);
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, Model model) {
        Gif gif = gifRepository.findByName(name);
        model.addAttribute("gif", gif);
        return "gif-details";
    }

    @RequestMapping("/favorites")
    public String favorites(Model model) {
        List<Gif> faves = gifRepository.getFavorites();
        model.addAttribute("gifs",faves);
        return "favorites";
    }
}