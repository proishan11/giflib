package com.proishan11.giflib.controller;

import com.proishan11.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("giphy", LocalDate.of(2015,2,13),
                "Ishan Singh", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }

}
