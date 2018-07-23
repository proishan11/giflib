package com.proishan11.giflib.controller;

import com.proishan11.giflib.data.CategoryRepository;
import com.proishan11.giflib.data.GifRepository;
import com.proishan11.giflib.model.Category;
import com.proishan11.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }

    @RequestMapping("/search")
    public String searchGifs(@RequestParam String search, ModelMap modelMap) {
        List<Gif> searchGifs = gifRepository.findBySearch(search);
        modelMap.put("gifs", searchGifs);
        return "favorites";
    }

    @RequestMapping("/favorites")
    public String listAllFavorites(ModelMap modelMap) {
        List<Gif> favoriteGifs = gifRepository.findAllFavorites();
        modelMap.put("gifs", favoriteGifs);
        return "favorites";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }

}
