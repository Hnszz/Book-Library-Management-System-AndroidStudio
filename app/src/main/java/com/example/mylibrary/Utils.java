package com.example.mylibrary;

import java.util.ArrayList;

public class Utils {
    private static Utils instance;
    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> alreadyReadBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> WantToReadBooks;
    private static ArrayList<Book> favoriteBooks;

    public Utils() {
        if (null == allBooks) {
            allBooks = new ArrayList<>();
            initData();
        }

        if (null == alreadyReadBooks) {
            alreadyReadBooks = new ArrayList<>();
        }
        if (null == currentlyReadingBooks) {
            currentlyReadingBooks = new ArrayList<>();
        }
        if (null == favoriteBooks) {
            favoriteBooks = new ArrayList<>();

        } if (null == WantToReadBooks) {
            WantToReadBooks = new ArrayList<>();
        }

    }


    public void initData() {
        // TODO: add initial data
        allBooks.add(new Book(1, "Stop Ovethinking", "Nick Trenton", 150, "https://ebooks.gramedia.com/ebook-covers/80603/thumb_image_normal/BLK_SOLHJHDTBB1670379687531.jpg", "Lebih Happy Jalani Hidup dengan Tidak Berpikir Berlebihan", ""));
        allBooks.add(new Book(2, "Failure", "Greatmind", 172, "https://ebooks.gramedia.com/ebook-covers/58992/thumb_image_normal/BLK_F2020214483.jpg", "", "Long Description"));
        allBooks.add(new Book(3, "Filosofi Teras", "Henry Manampiring", 346, "https://ebooks.gramedia.com/ebook-covers/45496/thumb_image_normal/ID_FITE2018MTH12.jpg", "", "Long Description"));
     }


    public static synchronized Utils getInstance() {
        if (null == instance) {
            instance = new Utils();
        }
        return instance;
    }
    public static ArrayList<Book> getWantToReadBooks() {
        return WantToReadBooks;
    }
    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }

    public static ArrayList<Book> getFavoriteBooks() {
        return favoriteBooks;
    }

    public Book getBookById(int id) {
        for (Book b: allBooks) {
            if (b.getId() == id) {
                return b;
            }
        }

        return null;
    }

    public boolean addToAlreadyRead(Book book) {
        return alreadyReadBooks.add(book);
    }

    public boolean addToWantToRead(Book book) {
        return WantToReadBooks.add(book);
    }
    public boolean addToCurrentlyReadingBooks(Book book) {
        return currentlyReadingBooks.add(book);
    }
    public boolean addToFavoritebooks(Book book) {
        return favoriteBooks.add(book);
    }

    // Remove method
    public boolean removeFromAlreadyRead(Book book) {

        return alreadyReadBooks.remove(book);
    }
    public boolean removeFromWantToRead(Book book) {

        return WantToReadBooks.remove(book);
    }
    public boolean removeFromCurrentlyReading(Book book) {

        return currentlyReadingBooks.remove(book);

    }
    public boolean removeFromFavorites(Book book) {

        return favoriteBooks.remove(book);
    }


}
