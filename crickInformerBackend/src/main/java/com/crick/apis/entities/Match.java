package com.crick.apis.entities;

import java.util.Date;

import org.springframework.beans.factory.config.YamlProcessor.MatchStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor


@ToString
@Entity
@Table(name = "crick_mathes")
public class Match {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamHeading() {
		return teamHeading;
	}

	public void setTeamHeading(String teamHeading) {
		this.teamHeading = teamHeading;
	}

	public String getMatchNumberVenue() {
		return matchNumberVenue;
	}

	public void setMatchNumberVenue(String matchNumberVenue) {
		this.matchNumberVenue = matchNumberVenue;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	public String getBattingTeamScore() {
		return battingTeamScore;
	}

	public void setBattingTeamScore(String battingTeamScore) {
		this.battingTeamScore = battingTeamScore;
	}

	public String getBowlTeam() {
		return bowlTeam;
	}

	public void setBowlTeam(String bowlTeam) {
		this.bowlTeam = bowlTeam;
	}

	public String getBowlTeamScore() {
		return bowlTeamScore;
	}

	public void setBowlTeamScore(String bowlTeamScore) {
		this.bowlTeamScore = bowlTeamScore;
	}

	public String getLiveText() {
		return liveText;
	}

	public void setLiveText(String liveText) {
		this.liveText = liveText;
	}

	public String getMatchLink() {
		return matchLink;
	}

	public void setMatchLink(String matchLink) {
		this.matchLink = matchLink;
	}

	public String getTextComplete() {
		return textComplete;
	}

	public void setTextComplete(String textComplete) {
		this.textComplete = textComplete;
	}

	public com.crick.apis.entities.MatchStatus getStatus() {
		return status;
	}

	public void setStatus(com.crick.apis.entities.MatchStatus status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String teamHeading;
	
	private String matchNumberVenue;
	
	private String battingTeam;
	
	private String battingTeamScore;
	
	private String bowlTeam;
	
	private String bowlTeamScore;
	
	private String liveText;
	
	private String matchLink;
	
   private String textComplete;
   
   @Enumerated
   private com.crick.apis.entities.MatchStatus status;
   
   private Date date=new Date();
   
   //set the match status according to textComplete
   public void setMatchStatus() {
	   if(this.textComplete.isBlank()) {
		   this.status=com.crick.apis.entities.MatchStatus.COMPLETED;
		   
	   }else {
		   this.status=com.crick.apis.entities.MatchStatus.LIVE;
	   }
   }
	 
	 
	
	
	
	
	
	
	
	
	
}
