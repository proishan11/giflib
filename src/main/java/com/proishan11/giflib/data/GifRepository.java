package com.proishan11.giflib.data;

import com.proishan11.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("200", LocalDate.of(2018,7,9), "Mohd Omama", true, 1),
            new Gif("gif-09", LocalDate.of(2018,7,9), "Rahul Jha", true, 2),
            new Gif("giphy", LocalDate.of(2018,7,9), "Vikram Verma", true, 1),
            new Gif("penrose-triangle-illusion-gif", LocalDate.of(2018,7,9), "Zeba Karin", true, 3),
            new Gif("poolisbigger", LocalDate.of(2018, 7, 9), "Rimsha Khan", true, 3),
            new Gif("tenor", LocalDate.of(2018, 7, 9), "Eram Taslima", true, 2),
            new Gif("tumblr", LocalDate.of(2018, 7, 9), "Monalisa", false, 1)
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

    public List<Gif> findByCategoryId(int id) {
        List<Gif> gifs = new ArrayList<>();
        for(Gif gif: ALL_GIFS) {
            if(gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }
}
