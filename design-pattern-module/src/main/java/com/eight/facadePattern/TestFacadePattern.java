package com.eight.facadePattern;

import com.eight.facadePattern.theaterComponent.*;
import org.junit.Test;

public class TestFacadePattern {

    @Test
    public void ideal(){
        Tuner tuner = new Tuner();
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        DvdPlayer dvdPlayer = new DvdPlayer();
        TheaterLights theaterLights = new TheaterLights();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        Movie movie = new Movie();

        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(amplifier,tuner,
                        dvdPlayer, cdPlayer, projector, theaterLights, screen, popper);
        homeTheaterFacade.watchMovie(movie);
        homeTheaterFacade.endMovie();
    }

    @Test
    public void test(){
        PopcornPopper popper = new PopcornPopper();
        popper.on();
        popper.pop();

        TheaterLights lights = new TheaterLights();
        lights.dim(10);

        Screen screen = new Screen();
        screen.down();

        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        projector.on();
        projector.setInput(dvdPlayer);

        Amplifier amplifier = new Amplifier();
        amplifier.on();
        amplifier.setDvdPlayer(dvdPlayer);
        amplifier.setVolume(5);

        Movie movie = new Movie();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }
}
