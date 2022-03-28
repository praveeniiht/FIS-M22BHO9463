package com.example.postservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postservice.model.Posts;
import com.example.postservice.repo.PostsDao;


@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostsDao dao;

	@Override
	public List<Posts> getAllPosts() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Posts insertPost(Posts post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}

	@Override
	public String deletePost(Posts post) {
		// TODO Auto-generated method stub
		dao.delete(post);
		return "Post Deleted...";
	}

	@Override
	public Optional<Posts> findByPostId(int pid) {
		// TODO Auto-generated method stub
		return dao.findById(pid);
	}

	@Override
	public List<Posts> searchPostsByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Posts> posts = dao.findAll();
		List<Posts> data= new ArrayList();
		for(Posts p: posts) {
			if(p.getAuthor().equals(author))
				data.add(p);
		}
		
		return data;
	}

	@Override
	public List<Posts> searchPostsByTitle(String title) {
		// TODO Auto-generated method stub
		List<Posts> posts = dao.findAll();
		List<Posts> data= new ArrayList();
		for(Posts p: posts) {
			if(p.getTitle().equals(title))
				data.add(p);
		}
		
		return data;
	}

}
