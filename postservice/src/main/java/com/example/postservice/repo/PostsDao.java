package com.example.postservice.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postservice.model.Posts;

@Repository
@Transactional
public interface PostsDao extends JpaRepository<Posts,Integer>{

}
