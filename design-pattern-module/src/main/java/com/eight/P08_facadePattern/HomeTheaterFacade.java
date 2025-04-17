package com.eight.P08_facadePattern;

import com.eight.P08_facadePattern.theaterComponent.*;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheaterLights theaterLights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner,
                             DvdPlayer dvdPlayer, CdPlayer cdPlayer,
                             Projector projector, TheaterLights theaterLights,
                             Screen screen, PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(Movie movie){
        System.out.println("Get ready to watch a movie...");
        this.popper.on();
        this.popper.pop();
        this.theaterLights.dim(10);
        this.screen.down();
        this.projector.on();
        this.projector.wideScreenMode();
        this.amplifier.on();
        this.amplifier.setDvdPlayer(this.dvdPlayer);
        this.amplifier.setSurroundSound();
        this.amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        this.popper.off();
        this.theaterLights.on();
        this.screen.up();
        this.projector.off();
        this.amplifier.off();
        this.dvdPlayer.stop();
        this.dvdPlayer.eject();
        this.dvdPlayer.off();
    }
}
