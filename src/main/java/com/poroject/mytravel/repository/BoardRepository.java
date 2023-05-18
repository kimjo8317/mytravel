package com.poroject.mytravel.repository;

import com.poroject.mytravel.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
