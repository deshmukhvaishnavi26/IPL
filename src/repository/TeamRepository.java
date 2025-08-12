package repository;

import entity.Team;

public class TeamRepository {

	// this method should return mi details
	public static Team getMITeamDetails () {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		return team;
	}
	
	// add similar methods for remaining 9 teams
	
	public static Team getCSKTeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("MS Dhoni");
		team.setCoachName("Stephen Fleming");
		team.setQualified(true);
		team.setnRR(0.992f);
		return team;
	}
	
	public static Team getDCTeamDetails() {
		Team team = new Team();
		team.setId(103);
		team.setTeamName("Delhi Capitals");
		team.setCaptainName("Axar Patel");
		team.setCoachName("Hemang Badani");
		team.setQualified(true);
		team.setnRR(0.11f);
		return team;
	}
	
	public static Team getGTTeamDetails() {
		Team team = new Team();
		team.setId(104);
		team.setTeamName("Gujraat Titans");
		team.setCaptainName("Shubman Gill");
		team.setCoachName("Ashish Nehra");
		team.setQualified(true);
		team.setnRR(0.795f);
		return team;
	}
	
	public static Team getPBKSTeamDetails() {
		Team team = new Team();
		team.setId(105);
		team.setTeamName("Punjab Kings");
		team.setCaptainName("Shreyas Iyer");
		team.setCoachName("Ricky Ponting");
		team.setQualified(true);
		team.setnRR(0.372f);
		return team;
	}
	
	public static Team getRCBTeamDetails() {
		Team team = new Team();
		team.setId(106);
		team.setTeamName("Royal Challengers Bengaluru");
		team.setCaptainName("Rajat Patidar");
		team.setCoachName("Andy Flower");
		team.setQualified(true);
		team.setnRR(0.482f);
		return team;
	}
	
	public static Team getSRHTeamDetails() {
		Team team = new Team();
		team.setId(107);
		team.setTeamName("Sunrises Hyderabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("Daniel Vettori");
		team.setQualified(true);
		team.setnRR(1.245f);
		return team;
	}
	
	public static Team getLSGTeamDetails() {
		Team team = new Team();
		team.setId(108);
		team.setTeamName("Lucknow Super Giants");
		team.setCaptainName("Rishabh Pant");
		team.setCoachName("Zaheer Khan");
		team.setQualified(true);
		team.setnRR(0.376f);
		return team;
	}
	
	public static Team getKKRTeamDetails() {
		Team team = new Team();
		team.setId(109);
		team.setTeamName("Kolkata Knight Riders");
		team.setCaptainName("Ajinkya Rahane");
		team.setCoachName("Chandrakant Pandit");
		team.setQualified(true);
		team.setnRR(0.305f);
		return team;
	}
	
	public static Team getRRTeamDetails() {
		Team team = new Team();
		team.setId(110);
		team.setTeamName("Rajasthan Royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Rahul Dravid");
		team.setQualified(true);
		team.setnRR(0.549f);
		return team;
	}
}
