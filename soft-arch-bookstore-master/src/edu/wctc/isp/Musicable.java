package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Musicable extends Product {
    String getArtist();

    Duration getPlayingTime();

    int getQuantityOnHand();

    LocalDate getReleaseDate();

    String getTitle();

    void order(int quantity);

    double getCost();

    String getFormattedReleaseDate();
}
