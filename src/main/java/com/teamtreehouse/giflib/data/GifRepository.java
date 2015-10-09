package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Gif;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class GifRepository {
    public static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("android-explosion", LocalDate.of(2015,2,13), "", false),
        new Gif("ben-and-mike", LocalDate.of(2015,10,30), "", true),
        new Gif("book-dominos", LocalDate.of(2015,9,15), "", false),
        new Gif("compiler-bot", LocalDate.of(2015,2,13), "", true),
        new Gif("cowboy-coder", LocalDate.of(2015,2,13), "", false),
        new Gif("infinite-andrew", LocalDate.of(2015,8,23), "", true)
    );
}
