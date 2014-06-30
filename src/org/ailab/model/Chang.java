package org.ailab.model;

import java.sql.Timestamp;

public class Chang {

	private int changId;
	private int hostTeamId;
	private String hostTeamName;
	private int guestTeamId;
	private String guestTeamName;
	private Timestamp matchTime;

	public Chang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chang(int hostTeamId, String hostTeamName, int guestTeamId,
			String guestTeamName, Timestamp matchTime) {
		super();
		this.hostTeamId = hostTeamId;
		this.hostTeamName = hostTeamName;
		this.guestTeamId = guestTeamId;
		this.guestTeamName = guestTeamName;
		this.matchTime = matchTime;
	}

	public Chang(int changId, int hostTeamId, String hostTeamName,
			int guestTeamId, String guestTeamName, Timestamp matchTime) {
		super();
		this.changId = changId;
		this.hostTeamId = hostTeamId;
		this.hostTeamName = hostTeamName;
		this.guestTeamId = guestTeamId;
		this.guestTeamName = guestTeamName;
		this.matchTime = matchTime;
	}

	public int getChangId() {
		return changId;
	}

	public void setChangId(int changId) {
		this.changId = changId;
	}

	public int getHostTeamId() {
		return hostTeamId;
	}

	public void setHostTeamId(int hostTeamId) {
		this.hostTeamId = hostTeamId;
	}

	public String getHostTeamName() {
		return hostTeamName;
	}

	public void setHostTeamName(String hostTeamName) {
		this.hostTeamName = hostTeamName;
	}

	public int getGuestTeamId() {
		return guestTeamId;
	}

	public void setGuestTeamId(int guestTeamId) {
		this.guestTeamId = guestTeamId;
	}

	public String getGuestTeamName() {
		return guestTeamName;
	}

	public void setGuestTeamName(String guestTeamName) {
		this.guestTeamName = guestTeamName;
	}

	public Timestamp getMatchTime() {
		return matchTime;
	}

	public void setMatchTime(Timestamp matchTime) {
		this.matchTime = matchTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((guestTeamName == null) ? 0 : guestTeamName.hashCode());
		result = prime * result
				+ ((hostTeamName == null) ? 0 : hostTeamName.hashCode());
		result = prime * result
				+ ((matchTime == null) ? 0 : matchTime.hashCode());
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
		Chang other = (Chang) obj;
		if (guestTeamName == null) {
			if (other.guestTeamName != null)
				return false;
		} else if (!guestTeamName.equals(other.guestTeamName))
			return false;
		if (hostTeamName == null) {
			if (other.hostTeamName != null)
				return false;
		} else if (!hostTeamName.equals(other.hostTeamName))
			return false;
		if (matchTime == null) {
			if (other.matchTime != null)
				return false;
		} else if (!matchTime.equals(other.matchTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chang [changId=" + changId + ", hostTeamId=" + hostTeamId
				+ ", hostTeamName=" + hostTeamName + ", guestTeamId="
				+ guestTeamId + ", guestTeamName=" + guestTeamName
				+ ", matchTime=" + matchTime + "]";
	}

}
