package com.kodilla.good.patterns.challenges;

public class ShowMovieStore {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(x->x.getValue().stream())
                .forEach(x->System.out.print(x + ","));


    }

}
