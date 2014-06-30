package org.ailab.model;

public class Team {

	private int teamId;
	private String teamName;
	private int rank;
	private int disable;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(String teamName, int rank, int disable) {
		super();
		this.teamName = teamName;
		this.rank = rank;
		this.disable = disable;
	}

	public Team(int teamId, String teamName, int rank, int disable) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.rank = rank;
		this.disable = disable;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getDisable() {
		return disable;
	}

	public void setDisable(int disable) {
		this.disable = disable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((teamName == null) ? 0 : teamName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", rank="
				+ rank + ", disable=" + disable + "]";
	}

}
