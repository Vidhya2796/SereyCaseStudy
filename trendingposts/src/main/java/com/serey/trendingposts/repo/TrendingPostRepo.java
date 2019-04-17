package com.serey.trendingposts.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serey.trendingposts.pojo.SereyTrendingPosts;

public interface TrendingPostRepo extends MongoRepository<SereyTrendingPosts, String> {

}
