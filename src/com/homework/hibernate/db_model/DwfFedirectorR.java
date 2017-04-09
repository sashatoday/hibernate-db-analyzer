package com.homework.hibernate.db_model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Sasha on 08.04.17.
 */
@Entity
@javax.persistence.Table(name = "dwf_fedirector_r", schema = "public", catalog = "q1")
public class DwfFedirectorR implements Serializable {
	private int timekey;

	@Id
	@javax.persistence.Column(name = "timekey")
	public int getTimekey() {
		return timekey;
	}

	public void setTimekey(int timekey) {
		this.timekey = timekey;
	}

	private int fedirectorkey;

	@Id
	@javax.persistence.Column(name = "fedirectorkey")
	public int getFedirectorkey() {
		return fedirectorkey;
	}

	public void setFedirectorkey(int fedirectorkey) {
		this.fedirectorkey = fedirectorkey;
	}

	private Short exclude;

	@Basic
	@javax.persistence.Column(name = "exclude")
	public Short getExclude() {
		return exclude;
	}

	public void setExclude(Short exclude) {
		this.exclude = exclude;
	}

	private Float spmiorate;

	@Basic
	@javax.persistence.Column(name = "spmiorate")
	public Float getSpmiorate() {
		return spmiorate;
	}

	public void setSpmiorate(Float spmiorate) {
		this.spmiorate = spmiorate;
	}

	private Float spmmbrate;

	@Basic
	@javax.persistence.Column(name = "spmmbrate")
	public Float getSpmmbrate() {
		return spmmbrate;
	}

	public void setSpmmbrate(Float spmmbrate) {
		this.spmmbrate = spmmbrate;
	}

	private Float spmpctreadhit;

	@Basic
	@javax.persistence.Column(name = "spmpctreadhit")
	public Float getSpmpctreadhit() {
		return spmpctreadhit;
	}

	public void setSpmpctreadhit(Float spmpctreadhit) {
		this.spmpctreadhit = spmpctreadhit;
	}

	private Float spmpctwritehit;

	@Basic
	@javax.persistence.Column(name = "spmpctwritehit")
	public Float getSpmpctwritehit() {
		return spmpctwritehit;
	}

	public void setSpmpctwritehit(Float spmpctwritehit) {
		this.spmpctwritehit = spmpctwritehit;
	}

	private Float spmreadhits;

	@Basic
	@javax.persistence.Column(name = "spmreadhits")
	public Float getSpmreadhits() {
		return spmreadhits;
	}

	public void setSpmreadhits(Float spmreadhits) {
		this.spmreadhits = spmreadhits;
	}

	private Float spmreads;

	@Basic
	@javax.persistence.Column(name = "spmreads")
	public Float getSpmreads() {
		return spmreads;
	}

	public void setSpmreads(Float spmreads) {
		this.spmreads = spmreads;
	}

	private Float spmutilization;

	@Basic
	@javax.persistence.Column(name = "spmutilization")
	public Float getSpmutilization() {
		return spmutilization;
	}

	public void setSpmutilization(Float spmutilization) {
		this.spmutilization = spmutilization;
	}

	private Float spmwritehits;

	@Basic
	@javax.persistence.Column(name = "spmwritehits")
	public Float getSpmwritehits() {
		return spmwritehits;
	}

	public void setSpmwritehits(Float spmwritehits) {
		this.spmwritehits = spmwritehits;
	}

	private Float spmwrites;

	@Basic
	@javax.persistence.Column(name = "spmwrites")
	public Float getSpmwrites() {
		return spmwrites;
	}

	public void setSpmwrites(Float spmwrites) {
		this.spmwrites = spmwrites;
	}

	private Float spmtotalreadcount;

	@Basic
	@javax.persistence.Column(name = "spmtotalreadcount")
	public Float getSpmtotalreadcount() {
		return spmtotalreadcount;
	}

	public void setSpmtotalreadcount(Float spmtotalreadcount) {
		this.spmtotalreadcount = spmtotalreadcount;
	}

	private Float spmtotalreadtime;

	@Basic
	@javax.persistence.Column(name = "spmtotalreadtime")
	public Float getSpmtotalreadtime() {
		return spmtotalreadtime;
	}

	public void setSpmtotalreadtime(Float spmtotalreadtime) {
		this.spmtotalreadtime = spmtotalreadtime;
	}

	private Float spmtotalwritecount;

	@Basic
	@javax.persistence.Column(name = "spmtotalwritecount")
	public Float getSpmtotalwritecount() {
		return spmtotalwritecount;
	}

	public void setSpmtotalwritecount(Float spmtotalwritecount) {
		this.spmtotalwritecount = spmtotalwritecount;
	}

	private Float spmtotalwritetime;

	@Basic
	@javax.persistence.Column(name = "spmtotalwritetime")
	public Float getSpmtotalwritetime() {
		return spmtotalwritetime;
	}

	public void setSpmtotalwritetime(Float spmtotalwritetime) {
		this.spmtotalwritetime = spmtotalwritetime;
	}

	private Float spmrtread;

	@Basic
	@javax.persistence.Column(name = "spmrtread")
	public Float getSpmrtread() {
		return spmrtread;
	}

	public void setSpmrtread(Float spmrtread) {
		this.spmrtread = spmrtread;
	}

	private Float spmrtwrite;

	@Basic
	@javax.persistence.Column(name = "spmrtwrite")
	public Float getSpmrtwrite() {
		return spmrtwrite;
	}

	public void setSpmrtwrite(Float spmrtwrite) {
		this.spmrtwrite = spmrtwrite;
	}

	private Float spmhits;

	@Basic
	@javax.persistence.Column(name = "spmhits")
	public Float getSpmhits() {
		return spmhits;
	}

	public void setSpmhits(Float spmhits) {
		this.spmhits = spmhits;
	}

	private Float spmrequests;

	@Basic
	@javax.persistence.Column(name = "spmrequests")
	public Float getSpmrequests() {
		return spmrequests;
	}

	public void setSpmrequests(Float spmrequests) {
		this.spmrequests = spmrequests;
	}

	private Float spmsyscallcount;

	@Basic
	@javax.persistence.Column(name = "spmsyscallcount")
	public Float getSpmsyscallcount() {
		return spmsyscallcount;
	}

	public void setSpmsyscallcount(Float spmsyscallcount) {
		this.spmsyscallcount = spmsyscallcount;
	}

	private Float spmsyscalltime;

	@Basic
	@javax.persistence.Column(name = "spmsyscalltime")
	public Float getSpmsyscalltime() {
		return spmsyscalltime;
	}

	public void setSpmsyscalltime(Float spmsyscalltime) {
		this.spmsyscalltime = spmsyscalltime;
	}

	private Float spmsyscallremote;

	@Basic
	@javax.persistence.Column(name = "spmsyscallremote")
	public Float getSpmsyscallremote() {
		return spmsyscallremote;
	}

	public void setSpmsyscallremote(Float spmsyscallremote) {
		this.spmsyscallremote = spmsyscallremote;
	}

	private Float spmsyscallrdf;

	@Basic
	@javax.persistence.Column(name = "spmsyscallrdf")
	public Float getSpmsyscallrdf() {
		return spmsyscallrdf;
	}

	public void setSpmsyscallrdf(Float spmsyscallrdf) {
		this.spmsyscallrdf = spmsyscallrdf;
	}

	private Float spmsyswpevts;

	@Basic
	@javax.persistence.Column(name = "spmsyswpevts")
	public Float getSpmsyswpevts() {
		return spmsyswpevts;
	}

	public void setSpmsyswpevts(Float spmsyswpevts) {
		this.spmsyswpevts = spmsyswpevts;
	}

	private Float spmdevwpevts;

	@Basic
	@javax.persistence.Column(name = "spmdevwpevts")
	public Float getSpmdevwpevts() {
		return spmdevwpevts;
	}

	public void setSpmdevwpevts(Float spmdevwpevts) {
		this.spmdevwpevts = spmdevwpevts;
	}

	private Float spmslotcollisions;

	@Basic
	@javax.persistence.Column(name = "spmslotcollisions")
	public Float getSpmslotcollisions() {
		return spmslotcollisions;
	}

	public void setSpmslotcollisions(Float spmslotcollisions) {
		this.spmslotcollisions = spmslotcollisions;
	}

	private Float spmintervaltime;

	@Basic
	@javax.persistence.Column(name = "spmintervaltime")
	public Float getSpmintervaltime() {
		return spmintervaltime;
	}

	public void setSpmintervaltime(Float spmintervaltime) {
		this.spmintervaltime = spmintervaltime;
	}

	private Float spmaccumdiridletime;

	@Basic
	@javax.persistence.Column(name = "spmaccumdiridletime")
	public Float getSpmaccumdiridletime() {
		return spmaccumdiridletime;
	}

	public void setSpmaccumdiridletime(Float spmaccumdiridletime) {
		this.spmaccumdiridletime = spmaccumdiridletime;
	}

	private Float spmaccumallportidletime;

	@Basic
	@javax.persistence.Column(name = "spmaccumallportidletime")
	public Float getSpmaccumallportidletime() {
		return spmaccumallportidletime;
	}

	public void setSpmaccumallportidletime(Float spmaccumallportidletime) {
		this.spmaccumallportidletime = spmaccumallportidletime;
	}

	private Float spmaccumqueuedep0;

	@Basic
	@javax.persistence.Column(name = "spmaccumqueuedep0")
	public Float getSpmaccumqueuedep0() {
		return spmaccumqueuedep0;
	}

	public void setSpmaccumqueuedep0(Float spmaccumqueuedep0) {
		this.spmaccumqueuedep0 = spmaccumqueuedep0;
	}

	private Float spmaccumqueuedep1;

	@Basic
	@javax.persistence.Column(name = "spmaccumqueuedep1")
	public Float getSpmaccumqueuedep1() {
		return spmaccumqueuedep1;
	}

	public void setSpmaccumqueuedep1(Float spmaccumqueuedep1) {
		this.spmaccumqueuedep1 = spmaccumqueuedep1;
	}

	private Float spmaccumqueuedep2;

	@Basic
	@javax.persistence.Column(name = "spmaccumqueuedep2")
	public Float getSpmaccumqueuedep2() {
		return spmaccumqueuedep2;
	}

	public void setSpmaccumqueuedep2(Float spmaccumqueuedep2) {
		this.spmaccumqueuedep2 = spmaccumqueuedep2;
	}

	private Float spmaccumqueuedep3;

	@Basic
	@javax.persistence.Column(name = "spmaccumqueuedep3")
	public Float getSpmaccumqueuedep3() {
		return spmaccumqueuedep3;
	}

	public void setSpmaccumqueuedep3(Float spmaccumqueuedep3) {
		this.spmaccumqueuedep3 = spmaccumqueuedep3;
	}

	private Float spmaccumqueuedep4;

	@Basic
	@javax.persistence.Column(name = "spmaccumqueuedep4")
	public Float getSpmaccumqueuedep4() {
		return spmaccumqueuedep4;
	}

	public void setSpmaccumqueuedep4(Float spmaccumqueuedep4) {
		this.spmaccumqueuedep4 = spmaccumqueuedep4;
	}

	private Float spmaccumqueuedep5;

	@Basic
	@javax.persistence.Column(name = "spmaccumqueuedep5")
	public Float getSpmaccumqueuedep5() {
		return spmaccumqueuedep5;
	}

	public void setSpmaccumqueuedep5(Float spmaccumqueuedep5) {
		this.spmaccumqueuedep5 = spmaccumqueuedep5;
	}

	private Float spmaccumqueuedep6;

	@Basic
	@javax.persistence.Column(name = "spmaccumqueuedep6")
	public Float getSpmaccumqueuedep6() {
		return spmaccumqueuedep6;
	}

	public void setSpmaccumqueuedep6(Float spmaccumqueuedep6) {
		this.spmaccumqueuedep6 = spmaccumqueuedep6;
	}

	private Float spmaccumqueuedep7;

	@Basic
	@javax.persistence.Column(name = "spmaccumqueuedep7")
	public Float getSpmaccumqueuedep7() {
		return spmaccumqueuedep7;
	}

	public void setSpmaccumqueuedep7(Float spmaccumqueuedep7) {
		this.spmaccumqueuedep7 = spmaccumqueuedep7;
	}

	private Float spmaccumqueuedep8;

	@Basic
	@javax.persistence.Column(name = "spmaccumqueuedep8")
	public Float getSpmaccumqueuedep8() {
		return spmaccumqueuedep8;
	}

	public void setSpmaccumqueuedep8(Float spmaccumqueuedep8) {
		this.spmaccumqueuedep8 = spmaccumqueuedep8;
	}

	private Float spmaccumqueuedep9;

	@Basic
	@javax.persistence.Column(name = "spmaccumqueuedep9")
	public Float getSpmaccumqueuedep9() {
		return spmaccumqueuedep9;
	}

	public void setSpmaccumqueuedep9(Float spmaccumqueuedep9) {
		this.spmaccumqueuedep9 = spmaccumqueuedep9;
	}

	private Float spmqueuedepcount0;

	@Basic
	@javax.persistence.Column(name = "spmqueuedepcount0")
	public Float getSpmqueuedepcount0() {
		return spmqueuedepcount0;
	}

	public void setSpmqueuedepcount0(Float spmqueuedepcount0) {
		this.spmqueuedepcount0 = spmqueuedepcount0;
	}

	private Float spmqueuedepcount1;

	@Basic
	@javax.persistence.Column(name = "spmqueuedepcount1")
	public Float getSpmqueuedepcount1() {
		return spmqueuedepcount1;
	}

	public void setSpmqueuedepcount1(Float spmqueuedepcount1) {
		this.spmqueuedepcount1 = spmqueuedepcount1;
	}

	private Float spmqueuedepcount2;

	@Basic
	@javax.persistence.Column(name = "spmqueuedepcount2")
	public Float getSpmqueuedepcount2() {
		return spmqueuedepcount2;
	}

	public void setSpmqueuedepcount2(Float spmqueuedepcount2) {
		this.spmqueuedepcount2 = spmqueuedepcount2;
	}

	private Float spmqueuedepcount3;

	@Basic
	@javax.persistence.Column(name = "spmqueuedepcount3")
	public Float getSpmqueuedepcount3() {
		return spmqueuedepcount3;
	}

	public void setSpmqueuedepcount3(Float spmqueuedepcount3) {
		this.spmqueuedepcount3 = spmqueuedepcount3;
	}

	private Float spmqueuedepcount4;

	@Basic
	@javax.persistence.Column(name = "spmqueuedepcount4")
	public Float getSpmqueuedepcount4() {
		return spmqueuedepcount4;
	}

	public void setSpmqueuedepcount4(Float spmqueuedepcount4) {
		this.spmqueuedepcount4 = spmqueuedepcount4;
	}

	private Float spmqueuedepcount5;

	@Basic
	@javax.persistence.Column(name = "spmqueuedepcount5")
	public Float getSpmqueuedepcount5() {
		return spmqueuedepcount5;
	}

	public void setSpmqueuedepcount5(Float spmqueuedepcount5) {
		this.spmqueuedepcount5 = spmqueuedepcount5;
	}

	private Float spmqueuedepcount6;

	@Basic
	@javax.persistence.Column(name = "spmqueuedepcount6")
	public Float getSpmqueuedepcount6() {
		return spmqueuedepcount6;
	}

	public void setSpmqueuedepcount6(Float spmqueuedepcount6) {
		this.spmqueuedepcount6 = spmqueuedepcount6;
	}

	private Float spmqueuedepcount7;

	@Basic
	@javax.persistence.Column(name = "spmqueuedepcount7")
	public Float getSpmqueuedepcount7() {
		return spmqueuedepcount7;
	}

	public void setSpmqueuedepcount7(Float spmqueuedepcount7) {
		this.spmqueuedepcount7 = spmqueuedepcount7;
	}

	private Float spmqueuedepcount8;

	@Basic
	@javax.persistence.Column(name = "spmqueuedepcount8")
	public Float getSpmqueuedepcount8() {
		return spmqueuedepcount8;
	}

	public void setSpmqueuedepcount8(Float spmqueuedepcount8) {
		this.spmqueuedepcount8 = spmqueuedepcount8;
	}

	private Float spmqueuedepcount9;

	@Basic
	@javax.persistence.Column(name = "spmqueuedepcount9")
	public Float getSpmqueuedepcount9() {
		return spmqueuedepcount9;
	}

	public void setSpmqueuedepcount9(Float spmqueuedepcount9) {
		this.spmqueuedepcount9 = spmqueuedepcount9;
	}

	private Float spmmissreqs;

	@Basic
	@javax.persistence.Column(name = "spmmissreqs")
	public Float getSpmmissreqs() {
		return spmmissreqs;
	}

	public void setSpmmissreqs(Float spmmissreqs) {
		this.spmmissreqs = spmmissreqs;
	}

	private Float spmreadmissreqs;

	@Basic
	@javax.persistence.Column(name = "spmreadmissreqs")
	public Float getSpmreadmissreqs() {
		return spmreadmissreqs;
	}

	public void setSpmreadmissreqs(Float spmreadmissreqs) {
		this.spmreadmissreqs = spmreadmissreqs;
	}

	private Float spmwritemissreqs;

	@Basic
	@javax.persistence.Column(name = "spmwritemissreqs")
	public Float getSpmwritemissreqs() {
		return spmwritemissreqs;
	}

	public void setSpmwritemissreqs(Float spmwritemissreqs) {
		this.spmwritemissreqs = spmwritemissreqs;
	}

	private Float spmreadrtcount0To1;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount0to1")
	public Float getSpmreadrtcount0To1() {
		return spmreadrtcount0To1;
	}

	public void setSpmreadrtcount0To1(Float spmreadrtcount0To1) {
		this.spmreadrtcount0To1 = spmreadrtcount0To1;
	}

	private Float spmreadrtcount1To2;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount1to2")
	public Float getSpmreadrtcount1To2() {
		return spmreadrtcount1To2;
	}

	public void setSpmreadrtcount1To2(Float spmreadrtcount1To2) {
		this.spmreadrtcount1To2 = spmreadrtcount1To2;
	}

	private Float spmreadrtcount2To4;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount2to4")
	public Float getSpmreadrtcount2To4() {
		return spmreadrtcount2To4;
	}

	public void setSpmreadrtcount2To4(Float spmreadrtcount2To4) {
		this.spmreadrtcount2To4 = spmreadrtcount2To4;
	}

	private Float spmreadrtcount4To8;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount4to8")
	public Float getSpmreadrtcount4To8() {
		return spmreadrtcount4To8;
	}

	public void setSpmreadrtcount4To8(Float spmreadrtcount4To8) {
		this.spmreadrtcount4To8 = spmreadrtcount4To8;
	}

	private Float spmreadrtcount8To16;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount8to16")
	public Float getSpmreadrtcount8To16() {
		return spmreadrtcount8To16;
	}

	public void setSpmreadrtcount8To16(Float spmreadrtcount8To16) {
		this.spmreadrtcount8To16 = spmreadrtcount8To16;
	}

	private Float spmreadrtcount16To32;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount16to32")
	public Float getSpmreadrtcount16To32() {
		return spmreadrtcount16To32;
	}

	public void setSpmreadrtcount16To32(Float spmreadrtcount16To32) {
		this.spmreadrtcount16To32 = spmreadrtcount16To32;
	}

	private Float spmreadrtcount32To64;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount32to64")
	public Float getSpmreadrtcount32To64() {
		return spmreadrtcount32To64;
	}

	public void setSpmreadrtcount32To64(Float spmreadrtcount32To64) {
		this.spmreadrtcount32To64 = spmreadrtcount32To64;
	}

	private Float spmreadrtcountover64;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcountover64")
	public Float getSpmreadrtcountover64() {
		return spmreadrtcountover64;
	}

	public void setSpmreadrtcountover64(Float spmreadrtcountover64) {
		this.spmreadrtcountover64 = spmreadrtcountover64;
	}

	private Float spmaccreadrt0To1;

	@Basic
	@javax.persistence.Column(name = "spmaccreadrt0to1")
	public Float getSpmaccreadrt0To1() {
		return spmaccreadrt0To1;
	}

	public void setSpmaccreadrt0To1(Float spmaccreadrt0To1) {
		this.spmaccreadrt0To1 = spmaccreadrt0To1;
	}

	private Float spmaccreadrt1To2;

	@Basic
	@javax.persistence.Column(name = "spmaccreadrt1to2")
	public Float getSpmaccreadrt1To2() {
		return spmaccreadrt1To2;
	}

	public void setSpmaccreadrt1To2(Float spmaccreadrt1To2) {
		this.spmaccreadrt1To2 = spmaccreadrt1To2;
	}

	private Float spmaccreadrt2To4;

	@Basic
	@javax.persistence.Column(name = "spmaccreadrt2to4")
	public Float getSpmaccreadrt2To4() {
		return spmaccreadrt2To4;
	}

	public void setSpmaccreadrt2To4(Float spmaccreadrt2To4) {
		this.spmaccreadrt2To4 = spmaccreadrt2To4;
	}

	private Float spmaccreadrt4To8;

	@Basic
	@javax.persistence.Column(name = "spmaccreadrt4to8")
	public Float getSpmaccreadrt4To8() {
		return spmaccreadrt4To8;
	}

	public void setSpmaccreadrt4To8(Float spmaccreadrt4To8) {
		this.spmaccreadrt4To8 = spmaccreadrt4To8;
	}

	private Float spmaccreadrt8To16;

	@Basic
	@javax.persistence.Column(name = "spmaccreadrt8to16")
	public Float getSpmaccreadrt8To16() {
		return spmaccreadrt8To16;
	}

	public void setSpmaccreadrt8To16(Float spmaccreadrt8To16) {
		this.spmaccreadrt8To16 = spmaccreadrt8To16;
	}

	private Float spmaccreadrt16To32;

	@Basic
	@javax.persistence.Column(name = "spmaccreadrt16to32")
	public Float getSpmaccreadrt16To32() {
		return spmaccreadrt16To32;
	}

	public void setSpmaccreadrt16To32(Float spmaccreadrt16To32) {
		this.spmaccreadrt16To32 = spmaccreadrt16To32;
	}

	private Float spmaccreadrt32To64;

	@Basic
	@javax.persistence.Column(name = "spmaccreadrt32to64")
	public Float getSpmaccreadrt32To64() {
		return spmaccreadrt32To64;
	}

	public void setSpmaccreadrt32To64(Float spmaccreadrt32To64) {
		this.spmaccreadrt32To64 = spmaccreadrt32To64;
	}

	private Float spmaccreadrtover64;

	@Basic
	@javax.persistence.Column(name = "spmaccreadrtover64")
	public Float getSpmaccreadrtover64() {
		return spmaccreadrtover64;
	}

	public void setSpmaccreadrtover64(Float spmaccreadrtover64) {
		this.spmaccreadrtover64 = spmaccreadrtover64;
	}

	private Float spmwritertcount0To1;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount0to1")
	public Float getSpmwritertcount0To1() {
		return spmwritertcount0To1;
	}

	public void setSpmwritertcount0To1(Float spmwritertcount0To1) {
		this.spmwritertcount0To1 = spmwritertcount0To1;
	}

	private Float spmwritertcount1To2;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount1to2")
	public Float getSpmwritertcount1To2() {
		return spmwritertcount1To2;
	}

	public void setSpmwritertcount1To2(Float spmwritertcount1To2) {
		this.spmwritertcount1To2 = spmwritertcount1To2;
	}

	private Float spmwritertcount2To4;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount2to4")
	public Float getSpmwritertcount2To4() {
		return spmwritertcount2To4;
	}

	public void setSpmwritertcount2To4(Float spmwritertcount2To4) {
		this.spmwritertcount2To4 = spmwritertcount2To4;
	}

	private Float spmwritertcount4To8;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount4to8")
	public Float getSpmwritertcount4To8() {
		return spmwritertcount4To8;
	}

	public void setSpmwritertcount4To8(Float spmwritertcount4To8) {
		this.spmwritertcount4To8 = spmwritertcount4To8;
	}

	private Float spmwritertcount8To16;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount8to16")
	public Float getSpmwritertcount8To16() {
		return spmwritertcount8To16;
	}

	public void setSpmwritertcount8To16(Float spmwritertcount8To16) {
		this.spmwritertcount8To16 = spmwritertcount8To16;
	}

	private Float spmwritertcount16To32;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount16to32")
	public Float getSpmwritertcount16To32() {
		return spmwritertcount16To32;
	}

	public void setSpmwritertcount16To32(Float spmwritertcount16To32) {
		this.spmwritertcount16To32 = spmwritertcount16To32;
	}

	private Float spmwritertcount32To64;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount32to64")
	public Float getSpmwritertcount32To64() {
		return spmwritertcount32To64;
	}

	public void setSpmwritertcount32To64(Float spmwritertcount32To64) {
		this.spmwritertcount32To64 = spmwritertcount32To64;
	}

	private Float spmwritertcountover64;

	@Basic
	@javax.persistence.Column(name = "spmwritertcountover64")
	public Float getSpmwritertcountover64() {
		return spmwritertcountover64;
	}

	public void setSpmwritertcountover64(Float spmwritertcountover64) {
		this.spmwritertcountover64 = spmwritertcountover64;
	}

	private Float spmaccwritert0To1;

	@Basic
	@javax.persistence.Column(name = "spmaccwritert0to1")
	public Float getSpmaccwritert0To1() {
		return spmaccwritert0To1;
	}

	public void setSpmaccwritert0To1(Float spmaccwritert0To1) {
		this.spmaccwritert0To1 = spmaccwritert0To1;
	}

	private Float spmaccwritert1To2;

	@Basic
	@javax.persistence.Column(name = "spmaccwritert1to2")
	public Float getSpmaccwritert1To2() {
		return spmaccwritert1To2;
	}

	public void setSpmaccwritert1To2(Float spmaccwritert1To2) {
		this.spmaccwritert1To2 = spmaccwritert1To2;
	}

	private Float spmaccwritert2To4;

	@Basic
	@javax.persistence.Column(name = "spmaccwritert2to4")
	public Float getSpmaccwritert2To4() {
		return spmaccwritert2To4;
	}

	public void setSpmaccwritert2To4(Float spmaccwritert2To4) {
		this.spmaccwritert2To4 = spmaccwritert2To4;
	}

	private Float spmaccwritert4To8;

	@Basic
	@javax.persistence.Column(name = "spmaccwritert4to8")
	public Float getSpmaccwritert4To8() {
		return spmaccwritert4To8;
	}

	public void setSpmaccwritert4To8(Float spmaccwritert4To8) {
		this.spmaccwritert4To8 = spmaccwritert4To8;
	}

	private Float spmaccwritert8To16;

	@Basic
	@javax.persistence.Column(name = "spmaccwritert8to16")
	public Float getSpmaccwritert8To16() {
		return spmaccwritert8To16;
	}

	public void setSpmaccwritert8To16(Float spmaccwritert8To16) {
		this.spmaccwritert8To16 = spmaccwritert8To16;
	}

	private Float spmaccwritert16To32;

	@Basic
	@javax.persistence.Column(name = "spmaccwritert16to32")
	public Float getSpmaccwritert16To32() {
		return spmaccwritert16To32;
	}

	public void setSpmaccwritert16To32(Float spmaccwritert16To32) {
		this.spmaccwritert16To32 = spmaccwritert16To32;
	}

	private Float spmaccwritert32To64;

	@Basic
	@javax.persistence.Column(name = "spmaccwritert32to64")
	public Float getSpmaccwritert32To64() {
		return spmaccwritert32To64;
	}

	public void setSpmaccwritert32To64(Float spmaccwritert32To64) {
		this.spmaccwritert32To64 = spmaccwritert32To64;
	}

	private Float spmaccwritertover64;

	@Basic
	@javax.persistence.Column(name = "spmaccwritertover64")
	public Float getSpmaccwritertover64() {
		return spmaccwritertover64;
	}

	public void setSpmaccwritertover64(Float spmaccwritertover64) {
		this.spmaccwritertover64 = spmaccwritertover64;
	}

	private Float spmwphistogram0To50;

	@Basic
	@javax.persistence.Column(name = "spmwphistogram0to50")
	public Float getSpmwphistogram0To50() {
		return spmwphistogram0To50;
	}

	public void setSpmwphistogram0To50(Float spmwphistogram0To50) {
		this.spmwphistogram0To50 = spmwphistogram0To50;
	}

	private Float spmwphistogram50To70;

	@Basic
	@javax.persistence.Column(name = "spmwphistogram50to70")
	public Float getSpmwphistogram50To70() {
		return spmwphistogram50To70;
	}

	public void setSpmwphistogram50To70(Float spmwphistogram50To70) {
		this.spmwphistogram50To70 = spmwphistogram50To70;
	}

	private Float spmwphistogram70To90;

	@Basic
	@javax.persistence.Column(name = "spmwphistogram70to90")
	public Float getSpmwphistogram70To90() {
		return spmwphistogram70To90;
	}

	public void setSpmwphistogram70To90(Float spmwphistogram70To90) {
		this.spmwphistogram70To90 = spmwphistogram70To90;
	}

	private Float spmwphistogram90To100;

	@Basic
	@javax.persistence.Column(name = "spmwphistogram90to100")
	public Float getSpmwphistogram90To100() {
		return spmwphistogram90To100;
	}

	public void setSpmwphistogram90To100(Float spmwphistogram90To100) {
		this.spmwphistogram90To100 = spmwphistogram90To100;
	}

	private Float spmqiorate;

	@Basic
	@javax.persistence.Column(name = "spmqiorate")
	public Float getSpmqiorate() {
		return spmqiorate;
	}

	public void setSpmqiorate(Float spmqiorate) {
		this.spmqiorate = spmqiorate;
	}

	private Float spmqmbrate;

	@Basic
	@javax.persistence.Column(name = "spmqmbrate")
	public Float getSpmqmbrate() {
		return spmqmbrate;
	}

	public void setSpmqmbrate(Float spmqmbrate) {
		this.spmqmbrate = spmqmbrate;
	}

	private Float spmqdlyios;

	@Basic
	@javax.persistence.Column(name = "spmqdlyios")
	public Float getSpmqdlyios() {
		return spmqdlyios;
	}

	public void setSpmqdlyios(Float spmqdlyios) {
		this.spmqdlyios = spmqdlyios;
	}

	private Float spmqdlytime;

	@Basic
	@javax.persistence.Column(name = "spmqdlytime")
	public Float getSpmqdlytime() {
		return spmqdlytime;
	}

	public void setSpmqdlytime(Float spmqdlytime) {
		this.spmqdlytime = spmqdlytime;
	}

	private Float spmqperdlyios;

	@Basic
	@javax.persistence.Column(name = "spmqperdlyios")
	public Float getSpmqperdlyios() {
		return spmqperdlyios;
	}

	public void setSpmqperdlyios(Float spmqperdlyios) {
		this.spmqperdlyios = spmqperdlyios;
	}

	private Float spmqavgdlytime;

	@Basic
	@javax.persistence.Column(name = "spmqavgdlytime")
	public Float getSpmqavgdlytime() {
		return spmqavgdlytime;
	}

	public void setSpmqavgdlytime(Float spmqavgdlytime) {
		this.spmqavgdlytime = spmqavgdlytime;
	}

	private Float spmcrmreads;

	@Basic
	@javax.persistence.Column(name = "spmcrmreads")
	public Float getSpmcrmreads() {
		return spmcrmreads;
	}

	public void setSpmcrmreads(Float spmcrmreads) {
		this.spmcrmreads = spmcrmreads;
	}

	private Float spmcrmmbread;

	@Basic
	@javax.persistence.Column(name = "spmcrmmbread")
	public Float getSpmcrmmbread() {
		return spmcrmmbread;
	}

	public void setSpmcrmmbread(Float spmcrmmbread) {
		this.spmcrmmbread = spmcrmmbread;
	}

	private Float spmcrmavgreadsize;

	@Basic
	@javax.persistence.Column(name = "spmcrmavgreadsize")
	public Float getSpmcrmavgreadsize() {
		return spmcrmavgreadsize;
	}

	public void setSpmcrmavgreadsize(Float spmcrmavgreadsize) {
		this.spmcrmavgreadsize = spmcrmavgreadsize;
	}

	private Float spmqdepthutil;

	@Basic
	@javax.persistence.Column(name = "spmqdepthutil")
	public Float getSpmqdepthutil() {
		return spmqdepthutil;
	}

	public void setSpmqdepthutil(Float spmqdepthutil) {
		this.spmqdepthutil = spmqdepthutil;
	}

	private Float spmlimitexceed;

	@Basic
	@javax.persistence.Column(name = "spmlimitexceed")
	public Float getSpmlimitexceed() {
		return spmlimitexceed;
	}

	public void setSpmlimitexceed(Float spmlimitexceed) {
		this.spmlimitexceed = spmlimitexceed;
	}

	private Float spmorssyncios;

	@Basic
	@javax.persistence.Column(name = "spmorssyncios")
	public Float getSpmorssyncios() {
		return spmorssyncios;
	}

	public void setSpmorssyncios(Float spmorssyncios) {
		this.spmorssyncios = spmorssyncios;
	}

	private Float spmorssyncmb;

	@Basic
	@javax.persistence.Column(name = "spmorssyncmb")
	public Float getSpmorssyncmb() {
		return spmorssyncmb;
	}

	public void setSpmorssyncmb(Float spmorssyncmb) {
		this.spmorssyncmb = spmorssyncmb;
	}

	private Float spmorsasyncios;

	@Basic
	@javax.persistence.Column(name = "spmorsasyncios")
	public Float getSpmorsasyncios() {
		return spmorsasyncios;
	}

	public void setSpmorsasyncios(Float spmorsasyncios) {
		this.spmorsasyncios = spmorsasyncios;
	}

	private Float spmorsasyncmb;

	@Basic
	@javax.persistence.Column(name = "spmorsasyncmb")
	public Float getSpmorsasyncmb() {
		return spmorsasyncmb;
	}

	public void setSpmorsasyncmb(Float spmorsasyncmb) {
		this.spmorsasyncmb = spmorsasyncmb;
	}

	private Float spmrpios;

	@Basic
	@javax.persistence.Column(name = "spmrpios")
	public Float getSpmrpios() {
		return spmrpios;
	}

	public void setSpmrpios(Float spmrpios) {
		this.spmrpios = spmrpios;
	}

	private Float spmrpmb;

	@Basic
	@javax.persistence.Column(name = "spmrpmb")
	public Float getSpmrpmb() {
		return spmrpmb;
	}

	public void setSpmrpmb(Float spmrpmb) {
		this.spmrpmb = spmrpmb;
	}

	private Float spmccwsperio;

	@Basic
	@javax.persistence.Column(name = "spmccwsperio")
	public Float getSpmccwsperio() {
		return spmccwsperio;
	}

	public void setSpmccwsperio(Float spmccwsperio) {
		this.spmccwsperio = spmccwsperio;
	}

	private Float spmzhpfreads;

	@Basic
	@javax.persistence.Column(name = "spmzhpfreads")
	public Float getSpmzhpfreads() {
		return spmzhpfreads;
	}

	public void setSpmzhpfreads(Float spmzhpfreads) {
		this.spmzhpfreads = spmzhpfreads;
	}

	private Float spmzhpfreadsmb;

	@Basic
	@javax.persistence.Column(name = "spmzhpfreadsmb")
	public Float getSpmzhpfreadsmb() {
		return spmzhpfreadsmb;
	}

	public void setSpmzhpfreadsmb(Float spmzhpfreadsmb) {
		this.spmzhpfreadsmb = spmzhpfreadsmb;
	}

	private Float spmzhpfwrites;

	@Basic
	@javax.persistence.Column(name = "spmzhpfwrites")
	public Float getSpmzhpfwrites() {
		return spmzhpfwrites;
	}

	public void setSpmzhpfwrites(Float spmzhpfwrites) {
		this.spmzhpfwrites = spmzhpfwrites;
	}

	private Float spmzhpfwritesmb;

	@Basic
	@javax.persistence.Column(name = "spmzhpfwritesmb")
	public Float getSpmzhpfwritesmb() {
		return spmzhpfwritesmb;
	}

	public void setSpmzhpfwritesmb(Float spmzhpfwritesmb) {
		this.spmzhpfwritesmb = spmzhpfwritesmb;
	}

	private Float spmranreadhits;

	@Basic
	@javax.persistence.Column(name = "spmranreadhits")
	public Float getSpmranreadhits() {
		return spmranreadhits;
	}

	public void setSpmranreadhits(Float spmranreadhits) {
		this.spmranreadhits = spmranreadhits;
	}

	private Float spmranreadhitsmb;

	@Basic
	@javax.persistence.Column(name = "spmranreadhitsmb")
	public Float getSpmranreadhitsmb() {
		return spmranreadhitsmb;
	}

	public void setSpmranreadhitsmb(Float spmranreadhitsmb) {
		this.spmranreadhitsmb = spmranreadhitsmb;
	}

	private Float spmranreadmiss;

	@Basic
	@javax.persistence.Column(name = "spmranreadmiss")
	public Float getSpmranreadmiss() {
		return spmranreadmiss;
	}

	public void setSpmranreadmiss(Float spmranreadmiss) {
		this.spmranreadmiss = spmranreadmiss;
	}

	private Float spmranreadmissmb;

	@Basic
	@javax.persistence.Column(name = "spmranreadmissmb")
	public Float getSpmranreadmissmb() {
		return spmranreadmissmb;
	}

	public void setSpmranreadmissmb(Float spmranreadmissmb) {
		this.spmranreadmissmb = spmranreadmissmb;
	}

	private Float spmseqreads;

	@Basic
	@javax.persistence.Column(name = "spmseqreads")
	public Float getSpmseqreads() {
		return spmseqreads;
	}

	public void setSpmseqreads(Float spmseqreads) {
		this.spmseqreads = spmseqreads;
	}

	private Float spmseqreadsmb;

	@Basic
	@javax.persistence.Column(name = "spmseqreadsmb")
	public Float getSpmseqreadsmb() {
		return spmseqreadsmb;
	}

	public void setSpmseqreadsmb(Float spmseqreadsmb) {
		this.spmseqreadsmb = spmseqreadsmb;
	}

	private Float spmranwriteswpslots;

	@Basic
	@javax.persistence.Column(name = "spmranwriteswpslots")
	public Float getSpmranwriteswpslots() {
		return spmranwriteswpslots;
	}

	public void setSpmranwriteswpslots(Float spmranwriteswpslots) {
		this.spmranwriteswpslots = spmranwriteswpslots;
	}

	private Float spmranwriteswpslotsmb;

	@Basic
	@javax.persistence.Column(name = "spmranwriteswpslotsmb")
	public Float getSpmranwriteswpslotsmb() {
		return spmranwriteswpslotsmb;
	}

	public void setSpmranwriteswpslotsmb(Float spmranwriteswpslotsmb) {
		this.spmranwriteswpslotsmb = spmranwriteswpslotsmb;
	}

	private Float spmranwritesnonwpslots;

	@Basic
	@javax.persistence.Column(name = "spmranwritesnonwpslots")
	public Float getSpmranwritesnonwpslots() {
		return spmranwritesnonwpslots;
	}

	public void setSpmranwritesnonwpslots(Float spmranwritesnonwpslots) {
		this.spmranwritesnonwpslots = spmranwritesnonwpslots;
	}

	private Float spmranwritesnonwpslotsmb;

	@Basic
	@javax.persistence.Column(name = "spmranwritesnonwpslotsmb")
	public Float getSpmranwritesnonwpslotsmb() {
		return spmranwritesnonwpslotsmb;
	}

	public void setSpmranwritesnonwpslotsmb(Float spmranwritesnonwpslotsmb) {
		this.spmranwritesnonwpslotsmb = spmranwritesnonwpslotsmb;
	}

	private Float spmseqwrites;

	@Basic
	@javax.persistence.Column(name = "spmseqwrites")
	public Float getSpmseqwrites() {
		return spmseqwrites;
	}

	public void setSpmseqwrites(Float spmseqwrites) {
		this.spmseqwrites = spmseqwrites;
	}

	private Float spmseqwritesmb;

	@Basic
	@javax.persistence.Column(name = "spmseqwritesmb")
	public Float getSpmseqwritesmb() {
		return spmseqwritesmb;
	}

	public void setSpmseqwritesmb(Float spmseqwritesmb) {
		this.spmseqwritesmb = spmseqwritesmb;
	}

	private Float spmavgreadmisstime;

	@Basic
	@javax.persistence.Column(name = "spmavgreadmisstime")
	public Float getSpmavgreadmisstime() {
		return spmavgreadmisstime;
	}

	public void setSpmavgreadmisstime(Float spmavgreadmisstime) {
		this.spmavgreadmisstime = spmavgreadmisstime;
	}

	private Float spmavgwpdisconnecttime;

	@Basic
	@javax.persistence.Column(name = "spmavgwpdisconnecttime")
	public Float getSpmavgwpdisconnecttime() {
		return spmavgwpdisconnecttime;
	}

	public void setSpmavgwpdisconnecttime(Float spmavgwpdisconnecttime) {
		this.spmavgwpdisconnecttime = spmavgwpdisconnecttime;
	}

	private Float spmavgrdfwritetime;

	@Basic
	@javax.persistence.Column(name = "spmavgrdfwritetime")
	public Float getSpmavgrdfwritetime() {
		return spmavgrdfwritetime;
	}

	public void setSpmavgrdfwritetime(Float spmavgrdfwritetime) {
		this.spmavgrdfwritetime = spmavgrdfwritetime;
	}

	private Float rtmaxutilization;

	@Basic
	@javax.persistence.Column(name = "rtmaxutilization")
	public Float getRtmaxutilization() {
		return rtmaxutilization;
	}

	public void setRtmaxutilization(Float rtmaxutilization) {
		this.rtmaxutilization = rtmaxutilization;
	}

	private Float rtmaxiorate;

	@Basic
	@javax.persistence.Column(name = "rtmaxiorate")
	public Float getRtmaxiorate() {
		return rtmaxiorate;
	}

	public void setRtmaxiorate(Float rtmaxiorate) {
		this.rtmaxiorate = rtmaxiorate;
	}

	private Float rtmaxmbrate;

	@Basic
	@javax.persistence.Column(name = "rtmaxmbrate")
	public Float getRtmaxmbrate() {
		return rtmaxmbrate;
	}

	public void setRtmaxmbrate(Float rtmaxmbrate) {
		this.rtmaxmbrate = rtmaxmbrate;
	}

	private Float rtmaxrequests;

	@Basic
	@javax.persistence.Column(name = "rtmaxrequests")
	public Float getRtmaxrequests() {
		return rtmaxrequests;
	}

	public void setRtmaxrequests(Float rtmaxrequests) {
		this.rtmaxrequests = rtmaxrequests;
	}

	private Float rtmaxreads;

	@Basic
	@javax.persistence.Column(name = "rtmaxreads")
	public Float getRtmaxreads() {
		return rtmaxreads;
	}

	public void setRtmaxreads(Float rtmaxreads) {
		this.rtmaxreads = rtmaxreads;
	}

	private Float rtmaxwrites;

	@Basic
	@javax.persistence.Column(name = "rtmaxwrites")
	public Float getRtmaxwrites() {
		return rtmaxwrites;
	}

	public void setRtmaxwrites(Float rtmaxwrites) {
		this.rtmaxwrites = rtmaxwrites;
	}

	private Float rtmaxhits;

	@Basic
	@javax.persistence.Column(name = "rtmaxhits")
	public Float getRtmaxhits() {
		return rtmaxhits;
	}

	public void setRtmaxhits(Float rtmaxhits) {
		this.rtmaxhits = rtmaxhits;
	}

	private Float rtmaxreadhits;

	@Basic
	@javax.persistence.Column(name = "rtmaxreadhits")
	public Float getRtmaxreadhits() {
		return rtmaxreadhits;
	}

	public void setRtmaxreadhits(Float rtmaxreadhits) {
		this.rtmaxreadhits = rtmaxreadhits;
	}

	private Float rtmaxwritehits;

	@Basic
	@javax.persistence.Column(name = "rtmaxwritehits")
	public Float getRtmaxwritehits() {
		return rtmaxwritehits;
	}

	public void setRtmaxwritehits(Float rtmaxwritehits) {
		this.rtmaxwritehits = rtmaxwritehits;
	}

	private Float rtmaxsyswpevts;

	@Basic
	@javax.persistence.Column(name = "rtmaxsyswpevts")
	public Float getRtmaxsyswpevts() {
		return rtmaxsyswpevts;
	}

	public void setRtmaxsyswpevts(Float rtmaxsyswpevts) {
		this.rtmaxsyswpevts = rtmaxsyswpevts;
	}

	private Float rtmaxdevwpevts;

	@Basic
	@javax.persistence.Column(name = "rtmaxdevwpevts")
	public Float getRtmaxdevwpevts() {
		return rtmaxdevwpevts;
	}

	public void setRtmaxdevwpevts(Float rtmaxdevwpevts) {
		this.rtmaxdevwpevts = rtmaxdevwpevts;
	}

	private Float rtmaxmissreqs;

	@Basic
	@javax.persistence.Column(name = "rtmaxmissreqs")
	public Float getRtmaxmissreqs() {
		return rtmaxmissreqs;
	}

	public void setRtmaxmissreqs(Float rtmaxmissreqs) {
		this.rtmaxmissreqs = rtmaxmissreqs;
	}

	private Float rtmaxreadmissreqs;

	@Basic
	@javax.persistence.Column(name = "rtmaxreadmissreqs")
	public Float getRtmaxreadmissreqs() {
		return rtmaxreadmissreqs;
	}

	public void setRtmaxreadmissreqs(Float rtmaxreadmissreqs) {
		this.rtmaxreadmissreqs = rtmaxreadmissreqs;
	}

	private Float rtmaxwritemissreqs;

	@Basic
	@javax.persistence.Column(name = "rtmaxwritemissreqs")
	public Float getRtmaxwritemissreqs() {
		return rtmaxwritemissreqs;
	}

	public void setRtmaxwritemissreqs(Float rtmaxwritemissreqs) {
		this.rtmaxwritemissreqs = rtmaxwritemissreqs;
	}

	private Float rtmaxrtread;

	@Basic
	@javax.persistence.Column(name = "rtmaxrtread")
	public Float getRtmaxrtread() {
		return rtmaxrtread;
	}

	public void setRtmaxrtread(Float rtmaxrtread) {
		this.rtmaxrtread = rtmaxrtread;
	}

	private Float rtmaxrtwrite;

	@Basic
	@javax.persistence.Column(name = "rtmaxrtwrite")
	public Float getRtmaxrtwrite() {
		return rtmaxrtwrite;
	}

	public void setRtmaxrtwrite(Float rtmaxrtwrite) {
		this.rtmaxrtwrite = rtmaxrtwrite;
	}

	private Float rtmaxtotalreadcount;

	@Basic
	@javax.persistence.Column(name = "rtmaxtotalreadcount")
	public Float getRtmaxtotalreadcount() {
		return rtmaxtotalreadcount;
	}

	public void setRtmaxtotalreadcount(Float rtmaxtotalreadcount) {
		this.rtmaxtotalreadcount = rtmaxtotalreadcount;
	}

	private Float rtmaxtotalwritecount;

	@Basic
	@javax.persistence.Column(name = "rtmaxtotalwritecount")
	public Float getRtmaxtotalwritecount() {
		return rtmaxtotalwritecount;
	}

	public void setRtmaxtotalwritecount(Float rtmaxtotalwritecount) {
		this.rtmaxtotalwritecount = rtmaxtotalwritecount;
	}

	private Float rtmaxcrmreads;

	@Basic
	@javax.persistence.Column(name = "rtmaxcrmreads")
	public Float getRtmaxcrmreads() {
		return rtmaxcrmreads;
	}

	public void setRtmaxcrmreads(Float rtmaxcrmreads) {
		this.rtmaxcrmreads = rtmaxcrmreads;
	}

	private Float rtmaxcrmmbread;

	@Basic
	@javax.persistence.Column(name = "rtmaxcrmmbread")
	public Float getRtmaxcrmmbread() {
		return rtmaxcrmmbread;
	}

	public void setRtmaxcrmmbread(Float rtmaxcrmmbread) {
		this.rtmaxcrmmbread = rtmaxcrmmbread;
	}

	private Float rtmaxcrmavgreadsize;

	@Basic
	@javax.persistence.Column(name = "rtmaxcrmavgreadsize")
	public Float getRtmaxcrmavgreadsize() {
		return rtmaxcrmavgreadsize;
	}

	public void setRtmaxcrmavgreadsize(Float rtmaxcrmavgreadsize) {
		this.rtmaxcrmavgreadsize = rtmaxcrmavgreadsize;
	}

	private Float spmaccumidlecore0;

	@Basic
	@javax.persistence.Column(name = "spmaccumidlecore0")
	public Float getSpmaccumidlecore0() {
		return spmaccumidlecore0;
	}

	public void setSpmaccumidlecore0(Float spmaccumidlecore0) {
		this.spmaccumidlecore0 = spmaccumidlecore0;
	}

	private Float spmaccumidlecore1;

	@Basic
	@javax.persistence.Column(name = "spmaccumidlecore1")
	public Float getSpmaccumidlecore1() {
		return spmaccumidlecore1;
	}

	public void setSpmaccumidlecore1(Float spmaccumidlecore1) {
		this.spmaccumidlecore1 = spmaccumidlecore1;
	}

	private Float spmperbusycore0;

	@Basic
	@javax.persistence.Column(name = "spmperbusycore0")
	public Float getSpmperbusycore0() {
		return spmperbusycore0;
	}

	public void setSpmperbusycore0(Float spmperbusycore0) {
		this.spmperbusycore0 = spmperbusycore0;
	}

	private Float spmperbusycore1;

	@Basic
	@javax.persistence.Column(name = "spmperbusycore1")
	public Float getSpmperbusycore1() {
		return spmperbusycore1;
	}

	public void setSpmperbusycore1(Float spmperbusycore1) {
		this.spmperbusycore1 = spmperbusycore1;
	}

	private Float wlpiosq;

	@Basic
	@javax.persistence.Column(name = "wlpiosq")
	public Float getWlpiosq() {
		return wlpiosq;
	}

	public void setWlpiosq(Float wlpiosq) {
		this.wlpiosq = wlpiosq;
	}

	private Float spmreadmisstime;

	@Basic
	@javax.persistence.Column(name = "spmreadmisstime")
	public Float getSpmreadmisstime() {
		return spmreadmisstime;
	}

	public void setSpmreadmisstime(Float spmreadmisstime) {
		this.spmreadmisstime = spmreadmisstime;
	}

	private Float spmwpdisconnecttime;

	@Basic
	@javax.persistence.Column(name = "spmwpdisconnecttime")
	public Float getSpmwpdisconnecttime() {
		return spmwpdisconnecttime;
	}

	public void setSpmwpdisconnecttime(Float spmwpdisconnecttime) {
		this.spmwpdisconnecttime = spmwpdisconnecttime;
	}

	private Float spmrdfwritetime;

	@Basic
	@javax.persistence.Column(name = "spmrdfwritetime")
	public Float getSpmrdfwritetime() {
		return spmrdfwritetime;
	}

	public void setSpmrdfwritetime(Float spmrdfwritetime) {
		this.spmrdfwritetime = spmrdfwritetime;
	}

	private Float spmreadmisscount;

	@Basic
	@javax.persistence.Column(name = "spmreadmisscount")
	public Float getSpmreadmisscount() {
		return spmreadmisscount;
	}

	public void setSpmreadmisscount(Float spmreadmisscount) {
		this.spmreadmisscount = spmreadmisscount;
	}

	private Float spmwpdisconnectcount;

	@Basic
	@javax.persistence.Column(name = "spmwpdisconnectcount")
	public Float getSpmwpdisconnectcount() {
		return spmwpdisconnectcount;
	}

	public void setSpmwpdisconnectcount(Float spmwpdisconnectcount) {
		this.spmwpdisconnectcount = spmwpdisconnectcount;
	}

	private Float spmrdfwritecount;

	@Basic
	@javax.persistence.Column(name = "spmrdfwritecount")
	public Float getSpmrdfwritecount() {
		return spmrdfwritecount;
	}

	public void setSpmrdfwritecount(Float spmrdfwritecount) {
		this.spmrdfwritecount = spmrdfwritecount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DwfFedirectorR that = (DwfFedirectorR) o;

		if (fedirectorkey != that.fedirectorkey) return false;
		if (timekey != that.timekey) return false;
		if (exclude != null ? !exclude.equals(that.exclude) : that.exclude != null) return false;
		if (rtmaxcrmavgreadsize != null ? !rtmaxcrmavgreadsize.equals(that.rtmaxcrmavgreadsize) : that.rtmaxcrmavgreadsize != null)
			return false;
		if (rtmaxcrmmbread != null ? !rtmaxcrmmbread.equals(that.rtmaxcrmmbread) : that.rtmaxcrmmbread != null)
			return false;
		if (rtmaxcrmreads != null ? !rtmaxcrmreads.equals(that.rtmaxcrmreads) : that.rtmaxcrmreads != null)
			return false;
		if (rtmaxdevwpevts != null ? !rtmaxdevwpevts.equals(that.rtmaxdevwpevts) : that.rtmaxdevwpevts != null)
			return false;
		if (rtmaxhits != null ? !rtmaxhits.equals(that.rtmaxhits) : that.rtmaxhits != null) return false;
		if (rtmaxiorate != null ? !rtmaxiorate.equals(that.rtmaxiorate) : that.rtmaxiorate != null) return false;
		if (rtmaxmbrate != null ? !rtmaxmbrate.equals(that.rtmaxmbrate) : that.rtmaxmbrate != null) return false;
		if (rtmaxmissreqs != null ? !rtmaxmissreqs.equals(that.rtmaxmissreqs) : that.rtmaxmissreqs != null)
			return false;
		if (rtmaxreadhits != null ? !rtmaxreadhits.equals(that.rtmaxreadhits) : that.rtmaxreadhits != null)
			return false;
		if (rtmaxreadmissreqs != null ? !rtmaxreadmissreqs.equals(that.rtmaxreadmissreqs) : that.rtmaxreadmissreqs != null)
			return false;
		if (rtmaxreads != null ? !rtmaxreads.equals(that.rtmaxreads) : that.rtmaxreads != null) return false;
		if (rtmaxrequests != null ? !rtmaxrequests.equals(that.rtmaxrequests) : that.rtmaxrequests != null)
			return false;
		if (rtmaxrtread != null ? !rtmaxrtread.equals(that.rtmaxrtread) : that.rtmaxrtread != null) return false;
		if (rtmaxrtwrite != null ? !rtmaxrtwrite.equals(that.rtmaxrtwrite) : that.rtmaxrtwrite != null) return false;
		if (rtmaxsyswpevts != null ? !rtmaxsyswpevts.equals(that.rtmaxsyswpevts) : that.rtmaxsyswpevts != null)
			return false;
		if (rtmaxtotalreadcount != null ? !rtmaxtotalreadcount.equals(that.rtmaxtotalreadcount) : that.rtmaxtotalreadcount != null)
			return false;
		if (rtmaxtotalwritecount != null ? !rtmaxtotalwritecount.equals(that.rtmaxtotalwritecount) : that.rtmaxtotalwritecount != null)
			return false;
		if (rtmaxutilization != null ? !rtmaxutilization.equals(that.rtmaxutilization) : that.rtmaxutilization != null)
			return false;
		if (rtmaxwritehits != null ? !rtmaxwritehits.equals(that.rtmaxwritehits) : that.rtmaxwritehits != null)
			return false;
		if (rtmaxwritemissreqs != null ? !rtmaxwritemissreqs.equals(that.rtmaxwritemissreqs) : that.rtmaxwritemissreqs != null)
			return false;
		if (rtmaxwrites != null ? !rtmaxwrites.equals(that.rtmaxwrites) : that.rtmaxwrites != null) return false;
		if (spmaccreadrt0To1 != null ? !spmaccreadrt0To1.equals(that.spmaccreadrt0To1) : that.spmaccreadrt0To1 != null)
			return false;
		if (spmaccreadrt16To32 != null ? !spmaccreadrt16To32.equals(that.spmaccreadrt16To32) : that.spmaccreadrt16To32 != null)
			return false;
		if (spmaccreadrt1To2 != null ? !spmaccreadrt1To2.equals(that.spmaccreadrt1To2) : that.spmaccreadrt1To2 != null)
			return false;
		if (spmaccreadrt2To4 != null ? !spmaccreadrt2To4.equals(that.spmaccreadrt2To4) : that.spmaccreadrt2To4 != null)
			return false;
		if (spmaccreadrt32To64 != null ? !spmaccreadrt32To64.equals(that.spmaccreadrt32To64) : that.spmaccreadrt32To64 != null)
			return false;
		if (spmaccreadrt4To8 != null ? !spmaccreadrt4To8.equals(that.spmaccreadrt4To8) : that.spmaccreadrt4To8 != null)
			return false;
		if (spmaccreadrt8To16 != null ? !spmaccreadrt8To16.equals(that.spmaccreadrt8To16) : that.spmaccreadrt8To16 != null)
			return false;
		if (spmaccreadrtover64 != null ? !spmaccreadrtover64.equals(that.spmaccreadrtover64) : that.spmaccreadrtover64 != null)
			return false;
		if (spmaccumallportidletime != null ? !spmaccumallportidletime.equals(that.spmaccumallportidletime) : that.spmaccumallportidletime != null)
			return false;
		if (spmaccumdiridletime != null ? !spmaccumdiridletime.equals(that.spmaccumdiridletime) : that.spmaccumdiridletime != null)
			return false;
		if (spmaccumidlecore0 != null ? !spmaccumidlecore0.equals(that.spmaccumidlecore0) : that.spmaccumidlecore0 != null)
			return false;
		if (spmaccumidlecore1 != null ? !spmaccumidlecore1.equals(that.spmaccumidlecore1) : that.spmaccumidlecore1 != null)
			return false;
		if (spmaccumqueuedep0 != null ? !spmaccumqueuedep0.equals(that.spmaccumqueuedep0) : that.spmaccumqueuedep0 != null)
			return false;
		if (spmaccumqueuedep1 != null ? !spmaccumqueuedep1.equals(that.spmaccumqueuedep1) : that.spmaccumqueuedep1 != null)
			return false;
		if (spmaccumqueuedep2 != null ? !spmaccumqueuedep2.equals(that.spmaccumqueuedep2) : that.spmaccumqueuedep2 != null)
			return false;
		if (spmaccumqueuedep3 != null ? !spmaccumqueuedep3.equals(that.spmaccumqueuedep3) : that.spmaccumqueuedep3 != null)
			return false;
		if (spmaccumqueuedep4 != null ? !spmaccumqueuedep4.equals(that.spmaccumqueuedep4) : that.spmaccumqueuedep4 != null)
			return false;
		if (spmaccumqueuedep5 != null ? !spmaccumqueuedep5.equals(that.spmaccumqueuedep5) : that.spmaccumqueuedep5 != null)
			return false;
		if (spmaccumqueuedep6 != null ? !spmaccumqueuedep6.equals(that.spmaccumqueuedep6) : that.spmaccumqueuedep6 != null)
			return false;
		if (spmaccumqueuedep7 != null ? !spmaccumqueuedep7.equals(that.spmaccumqueuedep7) : that.spmaccumqueuedep7 != null)
			return false;
		if (spmaccumqueuedep8 != null ? !spmaccumqueuedep8.equals(that.spmaccumqueuedep8) : that.spmaccumqueuedep8 != null)
			return false;
		if (spmaccumqueuedep9 != null ? !spmaccumqueuedep9.equals(that.spmaccumqueuedep9) : that.spmaccumqueuedep9 != null)
			return false;
		if (spmaccwritert0To1 != null ? !spmaccwritert0To1.equals(that.spmaccwritert0To1) : that.spmaccwritert0To1 != null)
			return false;
		if (spmaccwritert16To32 != null ? !spmaccwritert16To32.equals(that.spmaccwritert16To32) : that.spmaccwritert16To32 != null)
			return false;
		if (spmaccwritert1To2 != null ? !spmaccwritert1To2.equals(that.spmaccwritert1To2) : that.spmaccwritert1To2 != null)
			return false;
		if (spmaccwritert2To4 != null ? !spmaccwritert2To4.equals(that.spmaccwritert2To4) : that.spmaccwritert2To4 != null)
			return false;
		if (spmaccwritert32To64 != null ? !spmaccwritert32To64.equals(that.spmaccwritert32To64) : that.spmaccwritert32To64 != null)
			return false;
		if (spmaccwritert4To8 != null ? !spmaccwritert4To8.equals(that.spmaccwritert4To8) : that.spmaccwritert4To8 != null)
			return false;
		if (spmaccwritert8To16 != null ? !spmaccwritert8To16.equals(that.spmaccwritert8To16) : that.spmaccwritert8To16 != null)
			return false;
		if (spmaccwritertover64 != null ? !spmaccwritertover64.equals(that.spmaccwritertover64) : that.spmaccwritertover64 != null)
			return false;
		if (spmavgrdfwritetime != null ? !spmavgrdfwritetime.equals(that.spmavgrdfwritetime) : that.spmavgrdfwritetime != null)
			return false;
		if (spmavgreadmisstime != null ? !spmavgreadmisstime.equals(that.spmavgreadmisstime) : that.spmavgreadmisstime != null)
			return false;
		if (spmavgwpdisconnecttime != null ? !spmavgwpdisconnecttime.equals(that.spmavgwpdisconnecttime) : that.spmavgwpdisconnecttime != null)
			return false;
		if (spmccwsperio != null ? !spmccwsperio.equals(that.spmccwsperio) : that.spmccwsperio != null) return false;
		if (spmcrmavgreadsize != null ? !spmcrmavgreadsize.equals(that.spmcrmavgreadsize) : that.spmcrmavgreadsize != null)
			return false;
		if (spmcrmmbread != null ? !spmcrmmbread.equals(that.spmcrmmbread) : that.spmcrmmbread != null) return false;
		if (spmcrmreads != null ? !spmcrmreads.equals(that.spmcrmreads) : that.spmcrmreads != null) return false;
		if (spmdevwpevts != null ? !spmdevwpevts.equals(that.spmdevwpevts) : that.spmdevwpevts != null) return false;
		if (spmhits != null ? !spmhits.equals(that.spmhits) : that.spmhits != null) return false;
		if (spmintervaltime != null ? !spmintervaltime.equals(that.spmintervaltime) : that.spmintervaltime != null)
			return false;
		if (spmiorate != null ? !spmiorate.equals(that.spmiorate) : that.spmiorate != null) return false;
		if (spmlimitexceed != null ? !spmlimitexceed.equals(that.spmlimitexceed) : that.spmlimitexceed != null)
			return false;
		if (spmmbrate != null ? !spmmbrate.equals(that.spmmbrate) : that.spmmbrate != null) return false;
		if (spmmissreqs != null ? !spmmissreqs.equals(that.spmmissreqs) : that.spmmissreqs != null) return false;
		if (spmorsasyncios != null ? !spmorsasyncios.equals(that.spmorsasyncios) : that.spmorsasyncios != null)
			return false;
		if (spmorsasyncmb != null ? !spmorsasyncmb.equals(that.spmorsasyncmb) : that.spmorsasyncmb != null)
			return false;
		if (spmorssyncios != null ? !spmorssyncios.equals(that.spmorssyncios) : that.spmorssyncios != null)
			return false;
		if (spmorssyncmb != null ? !spmorssyncmb.equals(that.spmorssyncmb) : that.spmorssyncmb != null) return false;
		if (spmpctreadhit != null ? !spmpctreadhit.equals(that.spmpctreadhit) : that.spmpctreadhit != null)
			return false;
		if (spmpctwritehit != null ? !spmpctwritehit.equals(that.spmpctwritehit) : that.spmpctwritehit != null)
			return false;
		if (spmperbusycore0 != null ? !spmperbusycore0.equals(that.spmperbusycore0) : that.spmperbusycore0 != null)
			return false;
		if (spmperbusycore1 != null ? !spmperbusycore1.equals(that.spmperbusycore1) : that.spmperbusycore1 != null)
			return false;
		if (spmqavgdlytime != null ? !spmqavgdlytime.equals(that.spmqavgdlytime) : that.spmqavgdlytime != null)
			return false;
		if (spmqdepthutil != null ? !spmqdepthutil.equals(that.spmqdepthutil) : that.spmqdepthutil != null)
			return false;
		if (spmqdlyios != null ? !spmqdlyios.equals(that.spmqdlyios) : that.spmqdlyios != null) return false;
		if (spmqdlytime != null ? !spmqdlytime.equals(that.spmqdlytime) : that.spmqdlytime != null) return false;
		if (spmqiorate != null ? !spmqiorate.equals(that.spmqiorate) : that.spmqiorate != null) return false;
		if (spmqmbrate != null ? !spmqmbrate.equals(that.spmqmbrate) : that.spmqmbrate != null) return false;
		if (spmqperdlyios != null ? !spmqperdlyios.equals(that.spmqperdlyios) : that.spmqperdlyios != null)
			return false;
		if (spmqueuedepcount0 != null ? !spmqueuedepcount0.equals(that.spmqueuedepcount0) : that.spmqueuedepcount0 != null)
			return false;
		if (spmqueuedepcount1 != null ? !spmqueuedepcount1.equals(that.spmqueuedepcount1) : that.spmqueuedepcount1 != null)
			return false;
		if (spmqueuedepcount2 != null ? !spmqueuedepcount2.equals(that.spmqueuedepcount2) : that.spmqueuedepcount2 != null)
			return false;
		if (spmqueuedepcount3 != null ? !spmqueuedepcount3.equals(that.spmqueuedepcount3) : that.spmqueuedepcount3 != null)
			return false;
		if (spmqueuedepcount4 != null ? !spmqueuedepcount4.equals(that.spmqueuedepcount4) : that.spmqueuedepcount4 != null)
			return false;
		if (spmqueuedepcount5 != null ? !spmqueuedepcount5.equals(that.spmqueuedepcount5) : that.spmqueuedepcount5 != null)
			return false;
		if (spmqueuedepcount6 != null ? !spmqueuedepcount6.equals(that.spmqueuedepcount6) : that.spmqueuedepcount6 != null)
			return false;
		if (spmqueuedepcount7 != null ? !spmqueuedepcount7.equals(that.spmqueuedepcount7) : that.spmqueuedepcount7 != null)
			return false;
		if (spmqueuedepcount8 != null ? !spmqueuedepcount8.equals(that.spmqueuedepcount8) : that.spmqueuedepcount8 != null)
			return false;
		if (spmqueuedepcount9 != null ? !spmqueuedepcount9.equals(that.spmqueuedepcount9) : that.spmqueuedepcount9 != null)
			return false;
		if (spmranreadhits != null ? !spmranreadhits.equals(that.spmranreadhits) : that.spmranreadhits != null)
			return false;
		if (spmranreadhitsmb != null ? !spmranreadhitsmb.equals(that.spmranreadhitsmb) : that.spmranreadhitsmb != null)
			return false;
		if (spmranreadmiss != null ? !spmranreadmiss.equals(that.spmranreadmiss) : that.spmranreadmiss != null)
			return false;
		if (spmranreadmissmb != null ? !spmranreadmissmb.equals(that.spmranreadmissmb) : that.spmranreadmissmb != null)
			return false;
		if (spmranwritesnonwpslots != null ? !spmranwritesnonwpslots.equals(that.spmranwritesnonwpslots) : that.spmranwritesnonwpslots != null)
			return false;
		if (spmranwritesnonwpslotsmb != null ? !spmranwritesnonwpslotsmb.equals(that.spmranwritesnonwpslotsmb) : that.spmranwritesnonwpslotsmb != null)
			return false;
		if (spmranwriteswpslots != null ? !spmranwriteswpslots.equals(that.spmranwriteswpslots) : that.spmranwriteswpslots != null)
			return false;
		if (spmranwriteswpslotsmb != null ? !spmranwriteswpslotsmb.equals(that.spmranwriteswpslotsmb) : that.spmranwriteswpslotsmb != null)
			return false;
		if (spmrdfwritecount != null ? !spmrdfwritecount.equals(that.spmrdfwritecount) : that.spmrdfwritecount != null)
			return false;
		if (spmrdfwritetime != null ? !spmrdfwritetime.equals(that.spmrdfwritetime) : that.spmrdfwritetime != null)
			return false;
		if (spmreadhits != null ? !spmreadhits.equals(that.spmreadhits) : that.spmreadhits != null) return false;
		if (spmreadmisscount != null ? !spmreadmisscount.equals(that.spmreadmisscount) : that.spmreadmisscount != null)
			return false;
		if (spmreadmissreqs != null ? !spmreadmissreqs.equals(that.spmreadmissreqs) : that.spmreadmissreqs != null)
			return false;
		if (spmreadmisstime != null ? !spmreadmisstime.equals(that.spmreadmisstime) : that.spmreadmisstime != null)
			return false;
		if (spmreadrtcount0To1 != null ? !spmreadrtcount0To1.equals(that.spmreadrtcount0To1) : that.spmreadrtcount0To1 != null)
			return false;
		if (spmreadrtcount16To32 != null ? !spmreadrtcount16To32.equals(that.spmreadrtcount16To32) : that.spmreadrtcount16To32 != null)
			return false;
		if (spmreadrtcount1To2 != null ? !spmreadrtcount1To2.equals(that.spmreadrtcount1To2) : that.spmreadrtcount1To2 != null)
			return false;
		if (spmreadrtcount2To4 != null ? !spmreadrtcount2To4.equals(that.spmreadrtcount2To4) : that.spmreadrtcount2To4 != null)
			return false;
		if (spmreadrtcount32To64 != null ? !spmreadrtcount32To64.equals(that.spmreadrtcount32To64) : that.spmreadrtcount32To64 != null)
			return false;
		if (spmreadrtcount4To8 != null ? !spmreadrtcount4To8.equals(that.spmreadrtcount4To8) : that.spmreadrtcount4To8 != null)
			return false;
		if (spmreadrtcount8To16 != null ? !spmreadrtcount8To16.equals(that.spmreadrtcount8To16) : that.spmreadrtcount8To16 != null)
			return false;
		if (spmreadrtcountover64 != null ? !spmreadrtcountover64.equals(that.spmreadrtcountover64) : that.spmreadrtcountover64 != null)
			return false;
		if (spmreads != null ? !spmreads.equals(that.spmreads) : that.spmreads != null) return false;
		if (spmrequests != null ? !spmrequests.equals(that.spmrequests) : that.spmrequests != null) return false;
		if (spmrpios != null ? !spmrpios.equals(that.spmrpios) : that.spmrpios != null) return false;
		if (spmrpmb != null ? !spmrpmb.equals(that.spmrpmb) : that.spmrpmb != null) return false;
		if (spmrtread != null ? !spmrtread.equals(that.spmrtread) : that.spmrtread != null) return false;
		if (spmrtwrite != null ? !spmrtwrite.equals(that.spmrtwrite) : that.spmrtwrite != null) return false;
		if (spmseqreads != null ? !spmseqreads.equals(that.spmseqreads) : that.spmseqreads != null) return false;
		if (spmseqreadsmb != null ? !spmseqreadsmb.equals(that.spmseqreadsmb) : that.spmseqreadsmb != null)
			return false;
		if (spmseqwrites != null ? !spmseqwrites.equals(that.spmseqwrites) : that.spmseqwrites != null) return false;
		if (spmseqwritesmb != null ? !spmseqwritesmb.equals(that.spmseqwritesmb) : that.spmseqwritesmb != null)
			return false;
		if (spmslotcollisions != null ? !spmslotcollisions.equals(that.spmslotcollisions) : that.spmslotcollisions != null)
			return false;
		if (spmsyscallcount != null ? !spmsyscallcount.equals(that.spmsyscallcount) : that.spmsyscallcount != null)
			return false;
		if (spmsyscallrdf != null ? !spmsyscallrdf.equals(that.spmsyscallrdf) : that.spmsyscallrdf != null)
			return false;
		if (spmsyscallremote != null ? !spmsyscallremote.equals(that.spmsyscallremote) : that.spmsyscallremote != null)
			return false;
		if (spmsyscalltime != null ? !spmsyscalltime.equals(that.spmsyscalltime) : that.spmsyscalltime != null)
			return false;
		if (spmsyswpevts != null ? !spmsyswpevts.equals(that.spmsyswpevts) : that.spmsyswpevts != null) return false;
		if (spmtotalreadcount != null ? !spmtotalreadcount.equals(that.spmtotalreadcount) : that.spmtotalreadcount != null)
			return false;
		if (spmtotalreadtime != null ? !spmtotalreadtime.equals(that.spmtotalreadtime) : that.spmtotalreadtime != null)
			return false;
		if (spmtotalwritecount != null ? !spmtotalwritecount.equals(that.spmtotalwritecount) : that.spmtotalwritecount != null)
			return false;
		if (spmtotalwritetime != null ? !spmtotalwritetime.equals(that.spmtotalwritetime) : that.spmtotalwritetime != null)
			return false;
		if (spmutilization != null ? !spmutilization.equals(that.spmutilization) : that.spmutilization != null)
			return false;
		if (spmwpdisconnectcount != null ? !spmwpdisconnectcount.equals(that.spmwpdisconnectcount) : that.spmwpdisconnectcount != null)
			return false;
		if (spmwpdisconnecttime != null ? !spmwpdisconnecttime.equals(that.spmwpdisconnecttime) : that.spmwpdisconnecttime != null)
			return false;
		if (spmwphistogram0To50 != null ? !spmwphistogram0To50.equals(that.spmwphistogram0To50) : that.spmwphistogram0To50 != null)
			return false;
		if (spmwphistogram50To70 != null ? !spmwphistogram50To70.equals(that.spmwphistogram50To70) : that.spmwphistogram50To70 != null)
			return false;
		if (spmwphistogram70To90 != null ? !spmwphistogram70To90.equals(that.spmwphistogram70To90) : that.spmwphistogram70To90 != null)
			return false;
		if (spmwphistogram90To100 != null ? !spmwphistogram90To100.equals(that.spmwphistogram90To100) : that.spmwphistogram90To100 != null)
			return false;
		if (spmwritehits != null ? !spmwritehits.equals(that.spmwritehits) : that.spmwritehits != null) return false;
		if (spmwritemissreqs != null ? !spmwritemissreqs.equals(that.spmwritemissreqs) : that.spmwritemissreqs != null)
			return false;
		if (spmwritertcount0To1 != null ? !spmwritertcount0To1.equals(that.spmwritertcount0To1) : that.spmwritertcount0To1 != null)
			return false;
		if (spmwritertcount16To32 != null ? !spmwritertcount16To32.equals(that.spmwritertcount16To32) : that.spmwritertcount16To32 != null)
			return false;
		if (spmwritertcount1To2 != null ? !spmwritertcount1To2.equals(that.spmwritertcount1To2) : that.spmwritertcount1To2 != null)
			return false;
		if (spmwritertcount2To4 != null ? !spmwritertcount2To4.equals(that.spmwritertcount2To4) : that.spmwritertcount2To4 != null)
			return false;
		if (spmwritertcount32To64 != null ? !spmwritertcount32To64.equals(that.spmwritertcount32To64) : that.spmwritertcount32To64 != null)
			return false;
		if (spmwritertcount4To8 != null ? !spmwritertcount4To8.equals(that.spmwritertcount4To8) : that.spmwritertcount4To8 != null)
			return false;
		if (spmwritertcount8To16 != null ? !spmwritertcount8To16.equals(that.spmwritertcount8To16) : that.spmwritertcount8To16 != null)
			return false;
		if (spmwritertcountover64 != null ? !spmwritertcountover64.equals(that.spmwritertcountover64) : that.spmwritertcountover64 != null)
			return false;
		if (spmwrites != null ? !spmwrites.equals(that.spmwrites) : that.spmwrites != null) return false;
		if (spmzhpfreads != null ? !spmzhpfreads.equals(that.spmzhpfreads) : that.spmzhpfreads != null) return false;
		if (spmzhpfreadsmb != null ? !spmzhpfreadsmb.equals(that.spmzhpfreadsmb) : that.spmzhpfreadsmb != null)
			return false;
		if (spmzhpfwrites != null ? !spmzhpfwrites.equals(that.spmzhpfwrites) : that.spmzhpfwrites != null)
			return false;
		if (spmzhpfwritesmb != null ? !spmzhpfwritesmb.equals(that.spmzhpfwritesmb) : that.spmzhpfwritesmb != null)
			return false;
		if (wlpiosq != null ? !wlpiosq.equals(that.wlpiosq) : that.wlpiosq != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = timekey;
		result = 31 * result + fedirectorkey;
		result = 31 * result + (exclude != null ? exclude.hashCode() : 0);
		result = 31 * result + (spmiorate != null ? spmiorate.hashCode() : 0);
		result = 31 * result + (spmmbrate != null ? spmmbrate.hashCode() : 0);
		result = 31 * result + (spmpctreadhit != null ? spmpctreadhit.hashCode() : 0);
		result = 31 * result + (spmpctwritehit != null ? spmpctwritehit.hashCode() : 0);
		result = 31 * result + (spmreadhits != null ? spmreadhits.hashCode() : 0);
		result = 31 * result + (spmreads != null ? spmreads.hashCode() : 0);
		result = 31 * result + (spmutilization != null ? spmutilization.hashCode() : 0);
		result = 31 * result + (spmwritehits != null ? spmwritehits.hashCode() : 0);
		result = 31 * result + (spmwrites != null ? spmwrites.hashCode() : 0);
		result = 31 * result + (spmtotalreadcount != null ? spmtotalreadcount.hashCode() : 0);
		result = 31 * result + (spmtotalreadtime != null ? spmtotalreadtime.hashCode() : 0);
		result = 31 * result + (spmtotalwritecount != null ? spmtotalwritecount.hashCode() : 0);
		result = 31 * result + (spmtotalwritetime != null ? spmtotalwritetime.hashCode() : 0);
		result = 31 * result + (spmrtread != null ? spmrtread.hashCode() : 0);
		result = 31 * result + (spmrtwrite != null ? spmrtwrite.hashCode() : 0);
		result = 31 * result + (spmhits != null ? spmhits.hashCode() : 0);
		result = 31 * result + (spmrequests != null ? spmrequests.hashCode() : 0);
		result = 31 * result + (spmsyscallcount != null ? spmsyscallcount.hashCode() : 0);
		result = 31 * result + (spmsyscalltime != null ? spmsyscalltime.hashCode() : 0);
		result = 31 * result + (spmsyscallremote != null ? spmsyscallremote.hashCode() : 0);
		result = 31 * result + (spmsyscallrdf != null ? spmsyscallrdf.hashCode() : 0);
		result = 31 * result + (spmsyswpevts != null ? spmsyswpevts.hashCode() : 0);
		result = 31 * result + (spmdevwpevts != null ? spmdevwpevts.hashCode() : 0);
		result = 31 * result + (spmslotcollisions != null ? spmslotcollisions.hashCode() : 0);
		result = 31 * result + (spmintervaltime != null ? spmintervaltime.hashCode() : 0);
		result = 31 * result + (spmaccumdiridletime != null ? spmaccumdiridletime.hashCode() : 0);
		result = 31 * result + (spmaccumallportidletime != null ? spmaccumallportidletime.hashCode() : 0);
		result = 31 * result + (spmaccumqueuedep0 != null ? spmaccumqueuedep0.hashCode() : 0);
		result = 31 * result + (spmaccumqueuedep1 != null ? spmaccumqueuedep1.hashCode() : 0);
		result = 31 * result + (spmaccumqueuedep2 != null ? spmaccumqueuedep2.hashCode() : 0);
		result = 31 * result + (spmaccumqueuedep3 != null ? spmaccumqueuedep3.hashCode() : 0);
		result = 31 * result + (spmaccumqueuedep4 != null ? spmaccumqueuedep4.hashCode() : 0);
		result = 31 * result + (spmaccumqueuedep5 != null ? spmaccumqueuedep5.hashCode() : 0);
		result = 31 * result + (spmaccumqueuedep6 != null ? spmaccumqueuedep6.hashCode() : 0);
		result = 31 * result + (spmaccumqueuedep7 != null ? spmaccumqueuedep7.hashCode() : 0);
		result = 31 * result + (spmaccumqueuedep8 != null ? spmaccumqueuedep8.hashCode() : 0);
		result = 31 * result + (spmaccumqueuedep9 != null ? spmaccumqueuedep9.hashCode() : 0);
		result = 31 * result + (spmqueuedepcount0 != null ? spmqueuedepcount0.hashCode() : 0);
		result = 31 * result + (spmqueuedepcount1 != null ? spmqueuedepcount1.hashCode() : 0);
		result = 31 * result + (spmqueuedepcount2 != null ? spmqueuedepcount2.hashCode() : 0);
		result = 31 * result + (spmqueuedepcount3 != null ? spmqueuedepcount3.hashCode() : 0);
		result = 31 * result + (spmqueuedepcount4 != null ? spmqueuedepcount4.hashCode() : 0);
		result = 31 * result + (spmqueuedepcount5 != null ? spmqueuedepcount5.hashCode() : 0);
		result = 31 * result + (spmqueuedepcount6 != null ? spmqueuedepcount6.hashCode() : 0);
		result = 31 * result + (spmqueuedepcount7 != null ? spmqueuedepcount7.hashCode() : 0);
		result = 31 * result + (spmqueuedepcount8 != null ? spmqueuedepcount8.hashCode() : 0);
		result = 31 * result + (spmqueuedepcount9 != null ? spmqueuedepcount9.hashCode() : 0);
		result = 31 * result + (spmmissreqs != null ? spmmissreqs.hashCode() : 0);
		result = 31 * result + (spmreadmissreqs != null ? spmreadmissreqs.hashCode() : 0);
		result = 31 * result + (spmwritemissreqs != null ? spmwritemissreqs.hashCode() : 0);
		result = 31 * result + (spmreadrtcount0To1 != null ? spmreadrtcount0To1.hashCode() : 0);
		result = 31 * result + (spmreadrtcount1To2 != null ? spmreadrtcount1To2.hashCode() : 0);
		result = 31 * result + (spmreadrtcount2To4 != null ? spmreadrtcount2To4.hashCode() : 0);
		result = 31 * result + (spmreadrtcount4To8 != null ? spmreadrtcount4To8.hashCode() : 0);
		result = 31 * result + (spmreadrtcount8To16 != null ? spmreadrtcount8To16.hashCode() : 0);
		result = 31 * result + (spmreadrtcount16To32 != null ? spmreadrtcount16To32.hashCode() : 0);
		result = 31 * result + (spmreadrtcount32To64 != null ? spmreadrtcount32To64.hashCode() : 0);
		result = 31 * result + (spmreadrtcountover64 != null ? spmreadrtcountover64.hashCode() : 0);
		result = 31 * result + (spmaccreadrt0To1 != null ? spmaccreadrt0To1.hashCode() : 0);
		result = 31 * result + (spmaccreadrt1To2 != null ? spmaccreadrt1To2.hashCode() : 0);
		result = 31 * result + (spmaccreadrt2To4 != null ? spmaccreadrt2To4.hashCode() : 0);
		result = 31 * result + (spmaccreadrt4To8 != null ? spmaccreadrt4To8.hashCode() : 0);
		result = 31 * result + (spmaccreadrt8To16 != null ? spmaccreadrt8To16.hashCode() : 0);
		result = 31 * result + (spmaccreadrt16To32 != null ? spmaccreadrt16To32.hashCode() : 0);
		result = 31 * result + (spmaccreadrt32To64 != null ? spmaccreadrt32To64.hashCode() : 0);
		result = 31 * result + (spmaccreadrtover64 != null ? spmaccreadrtover64.hashCode() : 0);
		result = 31 * result + (spmwritertcount0To1 != null ? spmwritertcount0To1.hashCode() : 0);
		result = 31 * result + (spmwritertcount1To2 != null ? spmwritertcount1To2.hashCode() : 0);
		result = 31 * result + (spmwritertcount2To4 != null ? spmwritertcount2To4.hashCode() : 0);
		result = 31 * result + (spmwritertcount4To8 != null ? spmwritertcount4To8.hashCode() : 0);
		result = 31 * result + (spmwritertcount8To16 != null ? spmwritertcount8To16.hashCode() : 0);
		result = 31 * result + (spmwritertcount16To32 != null ? spmwritertcount16To32.hashCode() : 0);
		result = 31 * result + (spmwritertcount32To64 != null ? spmwritertcount32To64.hashCode() : 0);
		result = 31 * result + (spmwritertcountover64 != null ? spmwritertcountover64.hashCode() : 0);
		result = 31 * result + (spmaccwritert0To1 != null ? spmaccwritert0To1.hashCode() : 0);
		result = 31 * result + (spmaccwritert1To2 != null ? spmaccwritert1To2.hashCode() : 0);
		result = 31 * result + (spmaccwritert2To4 != null ? spmaccwritert2To4.hashCode() : 0);
		result = 31 * result + (spmaccwritert4To8 != null ? spmaccwritert4To8.hashCode() : 0);
		result = 31 * result + (spmaccwritert8To16 != null ? spmaccwritert8To16.hashCode() : 0);
		result = 31 * result + (spmaccwritert16To32 != null ? spmaccwritert16To32.hashCode() : 0);
		result = 31 * result + (spmaccwritert32To64 != null ? spmaccwritert32To64.hashCode() : 0);
		result = 31 * result + (spmaccwritertover64 != null ? spmaccwritertover64.hashCode() : 0);
		result = 31 * result + (spmwphistogram0To50 != null ? spmwphistogram0To50.hashCode() : 0);
		result = 31 * result + (spmwphistogram50To70 != null ? spmwphistogram50To70.hashCode() : 0);
		result = 31 * result + (spmwphistogram70To90 != null ? spmwphistogram70To90.hashCode() : 0);
		result = 31 * result + (spmwphistogram90To100 != null ? spmwphistogram90To100.hashCode() : 0);
		result = 31 * result + (spmqiorate != null ? spmqiorate.hashCode() : 0);
		result = 31 * result + (spmqmbrate != null ? spmqmbrate.hashCode() : 0);
		result = 31 * result + (spmqdlyios != null ? spmqdlyios.hashCode() : 0);
		result = 31 * result + (spmqdlytime != null ? spmqdlytime.hashCode() : 0);
		result = 31 * result + (spmqperdlyios != null ? spmqperdlyios.hashCode() : 0);
		result = 31 * result + (spmqavgdlytime != null ? spmqavgdlytime.hashCode() : 0);
		result = 31 * result + (spmcrmreads != null ? spmcrmreads.hashCode() : 0);
		result = 31 * result + (spmcrmmbread != null ? spmcrmmbread.hashCode() : 0);
		result = 31 * result + (spmcrmavgreadsize != null ? spmcrmavgreadsize.hashCode() : 0);
		result = 31 * result + (spmqdepthutil != null ? spmqdepthutil.hashCode() : 0);
		result = 31 * result + (spmlimitexceed != null ? spmlimitexceed.hashCode() : 0);
		result = 31 * result + (spmorssyncios != null ? spmorssyncios.hashCode() : 0);
		result = 31 * result + (spmorssyncmb != null ? spmorssyncmb.hashCode() : 0);
		result = 31 * result + (spmorsasyncios != null ? spmorsasyncios.hashCode() : 0);
		result = 31 * result + (spmorsasyncmb != null ? spmorsasyncmb.hashCode() : 0);
		result = 31 * result + (spmrpios != null ? spmrpios.hashCode() : 0);
		result = 31 * result + (spmrpmb != null ? spmrpmb.hashCode() : 0);
		result = 31 * result + (spmccwsperio != null ? spmccwsperio.hashCode() : 0);
		result = 31 * result + (spmzhpfreads != null ? spmzhpfreads.hashCode() : 0);
		result = 31 * result + (spmzhpfreadsmb != null ? spmzhpfreadsmb.hashCode() : 0);
		result = 31 * result + (spmzhpfwrites != null ? spmzhpfwrites.hashCode() : 0);
		result = 31 * result + (spmzhpfwritesmb != null ? spmzhpfwritesmb.hashCode() : 0);
		result = 31 * result + (spmranreadhits != null ? spmranreadhits.hashCode() : 0);
		result = 31 * result + (spmranreadhitsmb != null ? spmranreadhitsmb.hashCode() : 0);
		result = 31 * result + (spmranreadmiss != null ? spmranreadmiss.hashCode() : 0);
		result = 31 * result + (spmranreadmissmb != null ? spmranreadmissmb.hashCode() : 0);
		result = 31 * result + (spmseqreads != null ? spmseqreads.hashCode() : 0);
		result = 31 * result + (spmseqreadsmb != null ? spmseqreadsmb.hashCode() : 0);
		result = 31 * result + (spmranwriteswpslots != null ? spmranwriteswpslots.hashCode() : 0);
		result = 31 * result + (spmranwriteswpslotsmb != null ? spmranwriteswpslotsmb.hashCode() : 0);
		result = 31 * result + (spmranwritesnonwpslots != null ? spmranwritesnonwpslots.hashCode() : 0);
		result = 31 * result + (spmranwritesnonwpslotsmb != null ? spmranwritesnonwpslotsmb.hashCode() : 0);
		result = 31 * result + (spmseqwrites != null ? spmseqwrites.hashCode() : 0);
		result = 31 * result + (spmseqwritesmb != null ? spmseqwritesmb.hashCode() : 0);
		result = 31 * result + (spmavgreadmisstime != null ? spmavgreadmisstime.hashCode() : 0);
		result = 31 * result + (spmavgwpdisconnecttime != null ? spmavgwpdisconnecttime.hashCode() : 0);
		result = 31 * result + (spmavgrdfwritetime != null ? spmavgrdfwritetime.hashCode() : 0);
		result = 31 * result + (rtmaxutilization != null ? rtmaxutilization.hashCode() : 0);
		result = 31 * result + (rtmaxiorate != null ? rtmaxiorate.hashCode() : 0);
		result = 31 * result + (rtmaxmbrate != null ? rtmaxmbrate.hashCode() : 0);
		result = 31 * result + (rtmaxrequests != null ? rtmaxrequests.hashCode() : 0);
		result = 31 * result + (rtmaxreads != null ? rtmaxreads.hashCode() : 0);
		result = 31 * result + (rtmaxwrites != null ? rtmaxwrites.hashCode() : 0);
		result = 31 * result + (rtmaxhits != null ? rtmaxhits.hashCode() : 0);
		result = 31 * result + (rtmaxreadhits != null ? rtmaxreadhits.hashCode() : 0);
		result = 31 * result + (rtmaxwritehits != null ? rtmaxwritehits.hashCode() : 0);
		result = 31 * result + (rtmaxsyswpevts != null ? rtmaxsyswpevts.hashCode() : 0);
		result = 31 * result + (rtmaxdevwpevts != null ? rtmaxdevwpevts.hashCode() : 0);
		result = 31 * result + (rtmaxmissreqs != null ? rtmaxmissreqs.hashCode() : 0);
		result = 31 * result + (rtmaxreadmissreqs != null ? rtmaxreadmissreqs.hashCode() : 0);
		result = 31 * result + (rtmaxwritemissreqs != null ? rtmaxwritemissreqs.hashCode() : 0);
		result = 31 * result + (rtmaxrtread != null ? rtmaxrtread.hashCode() : 0);
		result = 31 * result + (rtmaxrtwrite != null ? rtmaxrtwrite.hashCode() : 0);
		result = 31 * result + (rtmaxtotalreadcount != null ? rtmaxtotalreadcount.hashCode() : 0);
		result = 31 * result + (rtmaxtotalwritecount != null ? rtmaxtotalwritecount.hashCode() : 0);
		result = 31 * result + (rtmaxcrmreads != null ? rtmaxcrmreads.hashCode() : 0);
		result = 31 * result + (rtmaxcrmmbread != null ? rtmaxcrmmbread.hashCode() : 0);
		result = 31 * result + (rtmaxcrmavgreadsize != null ? rtmaxcrmavgreadsize.hashCode() : 0);
		result = 31 * result + (spmaccumidlecore0 != null ? spmaccumidlecore0.hashCode() : 0);
		result = 31 * result + (spmaccumidlecore1 != null ? spmaccumidlecore1.hashCode() : 0);
		result = 31 * result + (spmperbusycore0 != null ? spmperbusycore0.hashCode() : 0);
		result = 31 * result + (spmperbusycore1 != null ? spmperbusycore1.hashCode() : 0);
		result = 31 * result + (wlpiosq != null ? wlpiosq.hashCode() : 0);
		result = 31 * result + (spmreadmisstime != null ? spmreadmisstime.hashCode() : 0);
		result = 31 * result + (spmwpdisconnecttime != null ? spmwpdisconnecttime.hashCode() : 0);
		result = 31 * result + (spmrdfwritetime != null ? spmrdfwritetime.hashCode() : 0);
		result = 31 * result + (spmreadmisscount != null ? spmreadmisscount.hashCode() : 0);
		result = 31 * result + (spmwpdisconnectcount != null ? spmwpdisconnectcount.hashCode() : 0);
		result = 31 * result + (spmrdfwritecount != null ? spmrdfwritecount.hashCode() : 0);
		return result;
	}
}
