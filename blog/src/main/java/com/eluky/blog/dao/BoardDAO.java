package com.eluky.blog.dao;

import com.eluky.blog.info.BoardInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDAO extends JpaRepository<BoardInfo,Integer> {
}
