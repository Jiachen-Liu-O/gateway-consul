package com.example.controller;

import com.example.Service2Client;
import com.example.domain.Book;
import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Flowable;

import java.util.ArrayList;

@Fallback
public class DefaultService2Client implements Service2Client {

    @Override
    public Flowable<ArrayList<Book>> findBooks() {
        Book errorBook = new Book();
        errorBook.setTitle("Server Error");

        ArrayList<Book> list = new ArrayList<>();
        list.add(errorBook);

        return Flowable.just(list);
    }
}
