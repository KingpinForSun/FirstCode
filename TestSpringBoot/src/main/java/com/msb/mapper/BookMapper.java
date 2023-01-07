package com.msb.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    List selectAllBooks();
}
