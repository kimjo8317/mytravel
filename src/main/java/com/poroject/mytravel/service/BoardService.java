package com.poroject.mytravel.service;

import com.poroject.mytravel.model.Board;
import com.poroject.mytravel.model.User;
import com.poroject.mytravel.repository.BoardRepository;
import com.poroject.mytravel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }

}
