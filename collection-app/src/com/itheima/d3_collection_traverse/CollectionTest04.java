package com.itheima.d3_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/**
 * 目标：完成电影信息的展示。
 * new Movie("《肖生克的救赎》" , 9.7 ,  "罗宾斯")
 * new Movie("《霸王别姬》" , 9.6 ,  "张国荣、张丰毅")
 * new Movie("《阿甘正传》" , 9.5 ,  "汤姆.汉克斯")
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖生克的救赎》", 9.7, "罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6, "张国荣、张丰毅"));
        movies.add(new Movie("《阿甘正传》", 9.5, "汤姆.汉克斯"));


        Iterator<Movie> iterator = movies.iterator();
        while (iterator.hasNext()) {
            Movie movie = iterator.next();
            System.out.println(movie.getMovieName()+"__"+ movie.getScore()+"__"+ movie.getActor());
        }
        System.out.println("---------------");
        for (Movie movie : movies) {
            System.out.println(movie.getMovieName()+"__"+ movie.getScore()+"__"+ movie.getActor());
        }
        System.out.println("---------------");
        movies.forEach(movie->System.out.println(movie.getMovieName()+"__"+ movie.getScore()+"__"+ movie.getActor()));
    }
}
