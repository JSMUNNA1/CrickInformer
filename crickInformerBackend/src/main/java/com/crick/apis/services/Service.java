package com.crick.apis.services;

import java.util.List;
import java.util.Map;

import com.crick.apis.entities.Match;

public interface Service {
     //get all matches
	
	List<Match> getAllMatchs();
	
	
	//get live matches
	
	List<Match>getLiveMatchs();
	
	
	//get cwc2023 point table
	
	List<List< String>>getCWC2023PointTable();
	
}
