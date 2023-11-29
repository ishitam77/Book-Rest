package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookDao;
import com.entity.BookEntity;


@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<BookEntity> findAllBooks() {
        return bookDao.findAll(); //inbuilt
    }

    @Override
    public BookEntity fetchBookByBid(int bid) {
        return bookDao.findByBid(bid); //derived
    }

    @Override
    public void saveBook(BookEntity bookEntity) {
        bookDao.save(bookEntity); //inbuilt
    }

    @Override
    public void deleteBookById(int bid) {
        bookDao.deleteByBid(bid); //derived
    }

    @Override
    public void updateBook(BookEntity updatedBook) {
        BookEntity existingBook = bookDao.findByBid(updatedBook.getBid());
        if (existingBook != null) {
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setPrice(updatedBook.getPrice());
            bookDao.save(existingBook); //inbuilt
        }
    }

}
