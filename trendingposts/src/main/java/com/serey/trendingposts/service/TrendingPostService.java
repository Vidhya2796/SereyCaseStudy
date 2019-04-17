package com.serey.trendingposts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.serey.trendingposts.pojo.SereyTrendingPosts;
import com.serey.trendingposts.repo.TrendingPostRepo;
import org.springframework.data.mongodb.core.MongoOperations;

@Component
public class TrendingPostService {
	@Autowired
	TrendingPostRepo trendingPostRepo;
	
	@Autowired
	MongoOperations mongoOperations;


	public List<SereyTrendingPosts> getPosts() {
		// TODO Auto-generated method stub
		 List<SereyTrendingPosts> listOfPosts=trendingPostRepo.findAll();
		return listOfPosts;
	}


	public boolean savePost(SereyTrendingPosts sereyTrendingPosts) {
		// TODO Auto-generated method stub
		trendingPostRepo.save(sereyTrendingPosts);
		return true;
		
	}


	public boolean updateLike(String userName, int likes) {
		mongoOperations.updateFirst(
				  new Query(Criteria.where("userName").is(userName)),
			  Update.update("likes", likes),SereyTrendingPosts.class);
		return true;
		
	}


	/*
	 * public boolean updateLike(String userName, int likes,SereyTrendingPosts
	 * sereyTrendingPosts) {
	 * 
	 * List<SereyTrendingPosts> listOfPosts=trendingPostRepo.findAll();
	 * for(SereyTrendingPosts postsDB:listOfPosts) {
	 * if(postsDB.getUserName().equals(userName)) { postsDB.setLikes(likes);
	 * trendingPostRepo.save(sereyTrendingPosts); return true; } }
	 * 
	 * return false; }
	 */

//		mongoOperations.updateFirst(
//				  new Query(Criteria.where("userName").is(userName)),
//			  Update.update("likes", likes),SereyTrendingPosts.class);
//		return true;
		
	
	
//	 //update first found record, empName field, where empId = 1004,
//	 //from your default collection
//	 mongoOperation.updateFirst(
//	  new Query(Criteria.where("empId").is(1004)),
//	  Update.update("empName", "new name"));
	
	

}
