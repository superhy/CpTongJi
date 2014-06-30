package org.ailab.model;

import java.sql.Timestamp;

public class Shengfurec {

	private int recId;
	private int changId;
	private int rang;
	private double s;
	private double p;
	private double f;
	private Timestamp crawlTime;

	public Shengfurec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shengfurec(int changId, int rang, double s, double p, double f,
			Timestamp crawlTime) {
		super();
		this.changId = changId;
		this.rang = rang;
		this.s = s;
		this.p = p;
		this.f = f;
		this.crawlTime = crawlTime;
	}

	public Shengfurec(int recId, int changId, int rang, double s, double p,
			double f, Timestamp crawlTime) {
		super();
		this.recId = recId;
		this.changId = changId;
		this.rang = rang;
		this.s = s;
		this.p = p;
		this.f = f;
		this.crawlTime = crawlTime;
	}

	public int getRecId() {
		return recId;
	}

	public void setRecId(int recId) {
		this.recId = recId;
	}

	public int getChangId() {
		return changId;
	}

	public void setChangId(int changId) {
		this.changId = changId;
	}

	public int getRang() {
		return rang;
	}

	public void setRang(int rang) {
		this.rang = rang;
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public Timestamp getCrawlTime() {
		return crawlTime;
	}

	public void setCrawlTime(Timestamp crawlTime) {
		this.crawlTime = crawlTime;
	}

	@Override
	public String toString() {
		return "Shengfurec [recId=" + recId + ", changId=" + changId
				+ ", rang=" + rang + ", s=" + s + ", p=" + p + ", f=" + f
				+ ", crawlTime=" + crawlTime + "]";
	}

}
