package com.cognifyz;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebScraper {
    public static void main(String[] args) {
        // Sample URL for simple scraping
        String url = "https://quotes.toscrape.com/";

        try {
            // Connect to the website and fetch the HTML
            Document doc = Jsoup.connect(url).get();

            // Select and print the quotes
            Elements quotes = doc.select(".quote span.text");
            System.out.println("Quotes from the website:");
            for (Element quote : quotes) {
                System.out.println("- " + quote.text());
            }
        } catch (IOException e) {
            System.out.println("Error fetching the webpage: " + e.getMessage());
        }
    }
}
