package com.proishan11.giflib.data;

import com.proishan11.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("200", LocalDate.of(2018,7,9), "Mohd Omama", true ),
            new Gif("gif-09", LocalDate.of(2018,7,9), "Rahul Jha", true),
            new Gif("giphy", LocalDate.of(2018,7,9), "Vikram Verma", true),
            new Gif("penrose-triangle-illusion-gif", LocalDate.of(2018,7,9), "Zeba Karin", true),
            new Gif("poolisbigger", LocalDate.of(2018, 7, 9), "Rimsha Khan", true),
            new Gif("tenor", LocalDate.of(2018, 7, 9), "Eram Taslima", true),
            new Gif("tumblr", LocalDate.of(2018, 7, 9), "Monalisa", false)
    );

    public Gif findByName(String name) {
        for(Gif gif: ALL_GIFS) {
            if(gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }
}
