package com.example.demo;

import org.springframework.data.repository.CrudRepository;



public interface BooksRepository extends CrudRepository<Books, Integer>
{
}