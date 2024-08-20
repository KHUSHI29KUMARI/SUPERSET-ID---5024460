package com.bookstore.mapper;

import com.bookstore.dto.BookDTO;
import com.bookstore.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toEntity(BookDTO bookDTO);
    BookDTO toDTO(Book book);
}
