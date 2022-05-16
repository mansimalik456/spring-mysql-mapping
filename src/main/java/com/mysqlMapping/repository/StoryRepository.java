package com.mysqlMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysqlMapping.entity.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, Integer>{
	


}
