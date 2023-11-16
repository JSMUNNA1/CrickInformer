package com.crick.apis.controller;

import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.apis.entities.Match;
import com.crick.apis.services.Service;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
	
	
	private Service matchService;
	

	public MatchController(Service matchService) {
		super();
		this.matchService = matchService;
	}


	//get live matches
	@GetMapping("/live")
	public ResponseEntity<List<Match>>getLiveMatches(){
		return new ResponseEntity<List<Match>>(this.matchService.getLiveMatchs(),HttpStatus.OK);
	}
	
	//get all matches
	@GetMapping
	public ResponseEntity<List<Match>>getAllMatches(){
		return new ResponseEntity<List<Match>>(this.matchService.getAllMatchs(),HttpStatus.OK);
	}
	
	//get point table
	@GetMapping("/pointTable")
	public ResponseEntity<?>getPointTableWC23(){
		return new ResponseEntity<>(this.matchService.getCWC2023PointTable(),HttpStatus.OK);
	}
	
}
