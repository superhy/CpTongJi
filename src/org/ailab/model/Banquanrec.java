package org.ailab.model;

import java.sql.Timestamp;

public class Banquanrec {

	private int recId;
	private int changId;
	private double ss;
	private double sp;
	private double sf;
	private double ps;
	private double pp;
	private double pf;
	private double fs;
	private double fp;
	private double ff;
	private Timestamp crawlTime;

	// 外键关联场次
	private Chang chang;

	public Banquanrec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Banquanrec(int changId, double ss, double sp, double sf, double ps,
			double pp, double pf, double fs, double fp, double ff,
			Timestamp crawlTime, Chang chang) {
		super();
		this.changId = changId;
		this.ss = ss;
		this.sp = sp;
		this.sf = sf;
		this.ps = ps;
		this.pp = pp;
		this.pf = pf;
		this.fs = fs;
		this.fp = fp;
		this.ff = ff;
		this.crawlTime = crawlTime;
		this.chang = chang;
	}

	public Banquanrec(int recId, int changId, double ss, double sp, double sf,
			double ps, double pp, double pf, double fs, double fp, double ff,
			Timestamp crawlTime, Chang chang) {
		super();
		this.recId = recId;
		this.changId = changId;
		this.ss = ss;
		this.sp = sp;
		this.sf = sf;
		this.ps = ps;
		this.pp = pp;
		this.pf = pf;
		this.fs = fs;
		this.fp = fp;
		this.ff = ff;
		this.crawlTime = crawlTime;
		this.chang = chang;
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

	public double getSs() {
		return ss;
	}

	public void setSs(double ss) {
		this.ss = ss;
	}

	public double getSp() {
		return sp;
	}

	public void setSp(double sp) {
		this.sp = sp;
	}

	public double getSf() {
		return sf;
	}

	public void setSf(double sf) {
		this.sf = sf;
	}

	public double getPs() {
		return ps;
	}

	public void setPs(double ps) {
		this.ps = ps;
	}

	public double getPp() {
		return pp;
	}

	public void setPp(double pp) {
		this.pp = pp;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getFs() {
		return fs;
	}

	public void setFs(double fs) {
		this.fs = fs;
	}

	public double getFp() {
		return fp;
	}

	public void setFp(double fp) {
		this.fp = fp;
	}

	public double getFf() {
		return ff;
	}

	public void setFf(double ff) {
		this.ff = ff;
	}

	public Timestamp getCrawlTime() {
		return crawlTime;
	}

	public void setCrawlTime(Timestamp crawlTime) {
		this.crawlTime = crawlTime;
	}

	public Chang getChang() {
		return chang;
	}

	public void setChang(Chang chang) {
		this.chang = chang;
	}

	@Override
	public String toString() {
		return "Banquanrec [recId=" + recId + ", changId=" + changId + ", ss="
				+ ss + ", sp=" + sp + ", sf=" + sf + ", ps=" + ps + ", pp="
				+ pp + ", pf=" + pf + ", fs=" + fs + ", fp=" + fp + ", ff="
				+ ff + ", crawlTime=" + crawlTime + ", chang=" + chang + "]";
	}

}
