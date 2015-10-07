package com.teamtreehouse.giflib.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    @RequestMapping("/")
    @ResponseBody
    public String listGifs() {
        return "List of all the GIFs!";
    }
}
