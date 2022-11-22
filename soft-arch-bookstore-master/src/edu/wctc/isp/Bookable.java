package edu.wctc.isp;

import java.time.LocalDate;

public interface Bookable extends Product {
    String getAuthor();

    String getISBN();

    int getPages();


    int getQuantityOnHand();

    LocalDate getReleaseDate();

    String getTitle();

    void order(int quantity);

    double getCost();

    String getFormattedReleaseDate();

}
