package db_model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Sasha on 08.04.17.
 */
@Entity
@javax.persistence.Table(name = "dwf_storagegroup_r_p20160722", schema = "public", catalog = "q1")
public class DwfStoragegroupRP20160722 implements Serializable {
	private int partitionkey;

	@Id
	@javax.persistence.Column(name = "partitionkey")
	public int getPartitionkey() {
		return partitionkey;
	}

	public void setPartitionkey(int partitionkey) {
		this.partitionkey = partitionkey;
	}

	private int timekey;

	@Id
	@javax.persistence.Column(name = "timekey")
	public int getTimekey() {
		return timekey;
	}

	public void setTimekey(int timekey) {
		this.timekey = timekey;
	}

	private int storagegroupkey;

	@Id
	@javax.persistence.Column(name = "storagegroupkey")
	public int getStoragegroupkey() {
		return storagegroupkey;
	}

	public void setStoragegroupkey(int storagegroupkey) {
		this.storagegroupkey = storagegroupkey;
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

	private Float spmbembreadrate;

	@Basic
	@javax.persistence.Column(name = "spmbembreadrate")
	public Float getSpmbembreadrate() {
		return spmbembreadrate;
	}

	public void setSpmbembreadrate(Float spmbembreadrate) {
		this.spmbembreadrate = spmbembreadrate;
	}

	private Float spmbembwriterate;

	@Basic
	@javax.persistence.Column(name = "spmbembwriterate")
	public Float getSpmbembwriterate() {
		return spmbembwriterate;
	}

	public void setSpmbembwriterate(Float spmbembwriterate) {
		this.spmbembwriterate = spmbembwriterate;
	}

	private Float spmbereads;

	@Basic
	@javax.persistence.Column(name = "spmbereads")
	public Float getSpmbereads() {
		return spmbereads;
	}

	public void setSpmbereads(Float spmbereads) {
		this.spmbereads = spmbereads;
	}

	private Float spmbewrites;

	@Basic
	@javax.persistence.Column(name = "spmbewrites")
	public Float getSpmbewrites() {
		return spmbewrites;
	}

	public void setSpmbewrites(Float spmbewrites) {
		this.spmbewrites = spmbewrites;
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

	private Float spmmbreadrate;

	@Basic
	@javax.persistence.Column(name = "spmmbreadrate")
	public Float getSpmmbreadrate() {
		return spmmbreadrate;
	}

	public void setSpmmbreadrate(Float spmmbreadrate) {
		this.spmmbreadrate = spmmbreadrate;
	}

	private Float spmmbwriterate;

	@Basic
	@javax.persistence.Column(name = "spmmbwriterate")
	public Float getSpmmbwriterate() {
		return spmmbwriterate;
	}

	public void setSpmmbwriterate(Float spmmbwriterate) {
		this.spmmbwriterate = spmmbwriterate;
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

	private Float spmreadtime;

	@Basic
	@javax.persistence.Column(name = "spmreadtime")
	public Float getSpmreadtime() {
		return spmreadtime;
	}

	public void setSpmreadtime(Float spmreadtime) {
		this.spmreadtime = spmreadtime;
	}

	private Float spmrndreadhits;

	@Basic
	@javax.persistence.Column(name = "spmrndreadhits")
	public Float getSpmrndreadhits() {
		return spmrndreadhits;
	}

	public void setSpmrndreadhits(Float spmrndreadhits) {
		this.spmrndreadhits = spmrndreadhits;
	}

	private Float spmrndreads;

	@Basic
	@javax.persistence.Column(name = "spmrndreads")
	public Float getSpmrndreads() {
		return spmrndreads;
	}

	public void setSpmrndreads(Float spmrndreads) {
		this.spmrndreads = spmrndreads;
	}

	private Float spmrndwritehits;

	@Basic
	@javax.persistence.Column(name = "spmrndwritehits")
	public Float getSpmrndwritehits() {
		return spmrndwritehits;
	}

	public void setSpmrndwritehits(Float spmrndwritehits) {
		this.spmrndwritehits = spmrndwritehits;
	}

	private Float spmrndwrites;

	@Basic
	@javax.persistence.Column(name = "spmrndwrites")
	public Float getSpmrndwrites() {
		return spmrndwrites;
	}

	public void setSpmrndwrites(Float spmrndwrites) {
		this.spmrndwrites = spmrndwrites;
	}

	private Float spmrtreadcount;

	@Basic
	@javax.persistence.Column(name = "spmrtreadcount")
	public Float getSpmrtreadcount() {
		return spmrtreadcount;
	}

	public void setSpmrtreadcount(Float spmrtreadcount) {
		this.spmrtreadcount = spmrtreadcount;
	}

	private Float spmrtwritecount;

	@Basic
	@javax.persistence.Column(name = "spmrtwritecount")
	public Float getSpmrtwritecount() {
		return spmrtwritecount;
	}

	public void setSpmrtwritecount(Float spmrtwritecount) {
		this.spmrtwritecount = spmrtwritecount;
	}

	private Float spmseqreadhits;

	@Basic
	@javax.persistence.Column(name = "spmseqreadhits")
	public Float getSpmseqreadhits() {
		return spmseqreadhits;
	}

	public void setSpmseqreadhits(Float spmseqreadhits) {
		this.spmseqreadhits = spmseqreadhits;
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

	private Float spmseqwritehits;

	@Basic
	@javax.persistence.Column(name = "spmseqwritehits")
	public Float getSpmseqwritehits() {
		return spmseqwritehits;
	}

	public void setSpmseqwritehits(Float spmseqwritehits) {
		this.spmseqwritehits = spmseqwritehits;
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

	private Float spmwrites;

	@Basic
	@javax.persistence.Column(name = "spmwrites")
	public Float getSpmwrites() {
		return spmwrites;
	}

	public void setSpmwrites(Float spmwrites) {
		this.spmwrites = spmwrites;
	}

	private Float spmwritespending;

	@Basic
	@javax.persistence.Column(name = "spmwritespending")
	public Float getSpmwritespending() {
		return spmwritespending;
	}

	public void setSpmwritespending(Float spmwritespending) {
		this.spmwritespending = spmwritespending;
	}

	private Float spmwritetime;

	@Basic
	@javax.persistence.Column(name = "spmwritetime")
	public Float getSpmwritetime() {
		return spmwritetime;
	}

	public void setSpmwritetime(Float spmwritetime) {
		this.spmwritetime = spmwritetime;
	}

	private Float spmrndios;

	@Basic
	@javax.persistence.Column(name = "spmrndios")
	public Float getSpmrndios() {
		return spmrndios;
	}

	public void setSpmrndios(Float spmrndios) {
		this.spmrndios = spmrndios;
	}

	private Float spmrndhits;

	@Basic
	@javax.persistence.Column(name = "spmrndhits")
	public Float getSpmrndhits() {
		return spmrndhits;
	}

	public void setSpmrndhits(Float spmrndhits) {
		this.spmrndhits = spmrndhits;
	}

	private Float spmdapreftrx;

	@Basic
	@javax.persistence.Column(name = "spmdapreftrx")
	public Float getSpmdapreftrx() {
		return spmdapreftrx;
	}

	public void setSpmdapreftrx(Float spmdapreftrx) {
		this.spmdapreftrx = spmdapreftrx;
	}

	private Float spmdapreftrxused;

	@Basic
	@javax.persistence.Column(name = "spmdapreftrxused")
	public Float getSpmdapreftrxused() {
		return spmdapreftrxused;
	}

	public void setSpmdapreftrxused(Float spmdapreftrxused) {
		this.spmdapreftrxused = spmdapreftrxused;
	}

	private Float spmdareqtime;

	@Basic
	@javax.persistence.Column(name = "spmdareqtime")
	public Float getSpmdareqtime() {
		return spmdareqtime;
	}

	public void setSpmdareqtime(Float spmdareqtime) {
		this.spmdareqtime = spmdareqtime;
	}

	private Float spmdadisktime;

	@Basic
	@javax.persistence.Column(name = "spmdadisktime")
	public Float getSpmdadisktime() {
		return spmdadisktime;
	}

	public void setSpmdadisktime(Float spmdadisktime) {
		this.spmdadisktime = spmdadisktime;
	}

	private Float spmdatasktime;

	@Basic
	@javax.persistence.Column(name = "spmdatasktime")
	public Float getSpmdatasktime() {
		return spmdatasktime;
	}

	public void setSpmdatasktime(Float spmdatasktime) {
		this.spmdatasktime = spmdatasktime;
	}

	private Float spmmaxwpthres;

	@Basic
	@javax.persistence.Column(name = "spmmaxwpthres")
	public Float getSpmmaxwpthres() {
		return spmmaxwpthres;
	}

	public void setSpmmaxwpthres(Float spmmaxwpthres) {
		this.spmmaxwpthres = spmmaxwpthres;
	}

	private Float spmsampreadtime;

	@Basic
	@javax.persistence.Column(name = "spmsampreadtime")
	public Float getSpmsampreadtime() {
		return spmsampreadtime;
	}

	public void setSpmsampreadtime(Float spmsampreadtime) {
		this.spmsampreadtime = spmsampreadtime;
	}

	private Float spmsampwritetime;

	@Basic
	@javax.persistence.Column(name = "spmsampwritetime")
	public Float getSpmsampwritetime() {
		return spmsampwritetime;
	}

	public void setSpmsampwritetime(Float spmsampwritetime) {
		this.spmsampwritetime = spmsampwritetime;
	}

	private Float spmsampreadmtime;

	@Basic
	@javax.persistence.Column(name = "spmsampreadmtime")
	public Float getSpmsampreadmtime() {
		return spmsampreadmtime;
	}

	public void setSpmsampreadmtime(Float spmsampreadmtime) {
		this.spmsampreadmtime = spmsampreadmtime;
	}

	private Float spmsampwpdisctime;

	@Basic
	@javax.persistence.Column(name = "spmsampwpdisctime")
	public Float getSpmsampwpdisctime() {
		return spmsampwpdisctime;
	}

	public void setSpmsampwpdisctime(Float spmsampwpdisctime) {
		this.spmsampwpdisctime = spmsampwpdisctime;
	}

	private Float spmsamprdfwritetime;

	@Basic
	@javax.persistence.Column(name = "spmsamprdfwritetime")
	public Float getSpmsamprdfwritetime() {
		return spmsamprdfwritetime;
	}

	public void setSpmsamprdfwritetime(Float spmsamprdfwritetime) {
		this.spmsamprdfwritetime = spmsamprdfwritetime;
	}

	private Float spmsampreadmw;

	@Basic
	@javax.persistence.Column(name = "spmsampreadmw")
	public Float getSpmsampreadmw() {
		return spmsampreadmw;
	}

	public void setSpmsampreadmw(Float spmsampreadmw) {
		this.spmsampreadmw = spmsampreadmw;
	}

	private Float spmsampwpdiscs;

	@Basic
	@javax.persistence.Column(name = "spmsampwpdiscs")
	public Float getSpmsampwpdiscs() {
		return spmsampwpdiscs;
	}

	public void setSpmsampwpdiscs(Float spmsampwpdiscs) {
		this.spmsampwpdiscs = spmsampwpdiscs;
	}

	private Float spmsamprdfwritew;

	@Basic
	@javax.persistence.Column(name = "spmsamprdfwritew")
	public Float getSpmsamprdfwritew() {
		return spmsamprdfwritew;
	}

	public void setSpmsamprdfwritew(Float spmsamprdfwritew) {
		this.spmsamprdfwritew = spmsamprdfwritew;
	}

	private Float spmnuminvalidtrx;

	@Basic
	@javax.persistence.Column(name = "spmnuminvalidtrx")
	public Float getSpmnuminvalidtrx() {
		return spmnuminvalidtrx;
	}

	public void setSpmnuminvalidtrx(Float spmnuminvalidtrx) {
		this.spmnuminvalidtrx = spmnuminvalidtrx;
	}

	private Float spmm1Invalidtrx;

	@Basic
	@javax.persistence.Column(name = "spmm1invalidtrx")
	public Float getSpmm1Invalidtrx() {
		return spmm1Invalidtrx;
	}

	public void setSpmm1Invalidtrx(Float spmm1Invalidtrx) {
		this.spmm1Invalidtrx = spmm1Invalidtrx;
	}

	private Float spmm2Invalidtrx;

	@Basic
	@javax.persistence.Column(name = "spmm2invalidtrx")
	public Float getSpmm2Invalidtrx() {
		return spmm2Invalidtrx;
	}

	public void setSpmm2Invalidtrx(Float spmm2Invalidtrx) {
		this.spmm2Invalidtrx = spmm2Invalidtrx;
	}

	private Float spmm3Invalidtrx;

	@Basic
	@javax.persistence.Column(name = "spmm3invalidtrx")
	public Float getSpmm3Invalidtrx() {
		return spmm3Invalidtrx;
	}

	public void setSpmm3Invalidtrx(Float spmm3Invalidtrx) {
		this.spmm3Invalidtrx = spmm3Invalidtrx;
	}

	private Float spmm4Invalidtrx;

	@Basic
	@javax.persistence.Column(name = "spmm4invalidtrx")
	public Float getSpmm4Invalidtrx() {
		return spmm4Invalidtrx;
	}

	public void setSpmm4Invalidtrx(Float spmm4Invalidtrx) {
		this.spmm4Invalidtrx = spmm4Invalidtrx;
	}

	private Float spmdablkwrittenvlunmig;

	@Basic
	@javax.persistence.Column(name = "spmdablkwrittenvlunmig")
	public Float getSpmdablkwrittenvlunmig() {
		return spmdablkwrittenvlunmig;
	}

	public void setSpmdablkwrittenvlunmig(Float spmdablkwrittenvlunmig) {
		this.spmdablkwrittenvlunmig = spmdablkwrittenvlunmig;
	}

	private Float spmdaparsecwriteblk;

	@Basic
	@javax.persistence.Column(name = "spmdaparsecwriteblk")
	public Float getSpmdaparsecwriteblk() {
		return spmdaparsecwriteblk;
	}

	public void setSpmdaparsecwriteblk(Float spmdaparsecwriteblk) {
		this.spmdaparsecwriteblk = spmdaparsecwriteblk;
	}

	private Float spmdaoptwriteblk;

	@Basic
	@javax.persistence.Column(name = "spmdaoptwriteblk")
	public Float getSpmdaoptwriteblk() {
		return spmdaoptwriteblk;
	}

	public void setSpmdaoptwriteblk(Float spmdaoptwriteblk) {
		this.spmdaoptwriteblk = spmdaoptwriteblk;
	}

	private Float spmdaxorreads;

	@Basic
	@javax.persistence.Column(name = "spmdaxorreads")
	public Float getSpmdaxorreads() {
		return spmdaxorreads;
	}

	public void setSpmdaxorreads(Float spmdaxorreads) {
		this.spmdaxorreads = spmdaxorreads;
	}

	private Float spmdaxorblkread;

	@Basic
	@javax.persistence.Column(name = "spmdaxorblkread")
	public Float getSpmdaxorblkread() {
		return spmdaxorblkread;
	}

	public void setSpmdaxorblkread(Float spmdaxorblkread) {
		this.spmdaxorblkread = spmdaxorblkread;
	}

	private Float spmdareadforcopy;

	@Basic
	@javax.persistence.Column(name = "spmdareadforcopy")
	public Float getSpmdareadforcopy() {
		return spmdareadforcopy;
	}

	public void setSpmdareadforcopy(Float spmdareadforcopy) {
		this.spmdareadforcopy = spmdareadforcopy;
	}

	private Float spmdablkreadcopy;

	@Basic
	@javax.persistence.Column(name = "spmdablkreadcopy")
	public Float getSpmdablkreadcopy() {
		return spmdablkreadcopy;
	}

	public void setSpmdablkreadcopy(Float spmdablkreadcopy) {
		this.spmdablkreadcopy = spmdablkreadcopy;
	}

	private Float spmdawritecopy;

	@Basic
	@javax.persistence.Column(name = "spmdawritecopy")
	public Float getSpmdawritecopy() {
		return spmdawritecopy;
	}

	public void setSpmdawritecopy(Float spmdawritecopy) {
		this.spmdawritecopy = spmdawritecopy;
	}

	private Float spmdablkwrittencopy;

	@Basic
	@javax.persistence.Column(name = "spmdablkwrittencopy")
	public Float getSpmdablkwrittencopy() {
		return spmdablkwrittencopy;
	}

	public void setSpmdablkwrittencopy(Float spmdablkwrittencopy) {
		this.spmdablkwrittencopy = spmdablkwrittencopy;
	}

	private Float spmdareadvlunmig;

	@Basic
	@javax.persistence.Column(name = "spmdareadvlunmig")
	public Float getSpmdareadvlunmig() {
		return spmdareadvlunmig;
	}

	public void setSpmdareadvlunmig(Float spmdareadvlunmig) {
		this.spmdareadvlunmig = spmdareadvlunmig;
	}

	private Float spmdablkreadvlunmig;

	@Basic
	@javax.persistence.Column(name = "spmdablkreadvlunmig")
	public Float getSpmdablkreadvlunmig() {
		return spmdablkreadvlunmig;
	}

	public void setSpmdablkreadvlunmig(Float spmdablkreadvlunmig) {
		this.spmdablkreadvlunmig = spmdablkreadvlunmig;
	}

	private Float spmdawritevlunmig;

	@Basic
	@javax.persistence.Column(name = "spmdawritevlunmig")
	public Float getSpmdawritevlunmig() {
		return spmdawritevlunmig;
	}

	public void setSpmdawritevlunmig(Float spmdawritevlunmig) {
		this.spmdawritevlunmig = spmdawritevlunmig;
	}

	private Float spmdawriterebuild;

	@Basic
	@javax.persistence.Column(name = "spmdawriterebuild")
	public Float getSpmdawriterebuild() {
		return spmdawriterebuild;
	}

	public void setSpmdawriterebuild(Float spmdawriterebuild) {
		this.spmdawriterebuild = spmdawriterebuild;
	}

	private Float spmdablkwrittenrebuild;

	@Basic
	@javax.persistence.Column(name = "spmdablkwrittenrebuild")
	public Float getSpmdablkwrittenrebuild() {
		return spmdablkwrittenrebuild;
	}

	public void setSpmdablkwrittenrebuild(Float spmdablkwrittenrebuild) {
		this.spmdablkwrittenrebuild = spmdablkwrittenrebuild;
	}

	private Float spmdardfcopy;

	@Basic
	@javax.persistence.Column(name = "spmdardfcopy")
	public Float getSpmdardfcopy() {
		return spmdardfcopy;
	}

	public void setSpmdardfcopy(Float spmdardfcopy) {
		this.spmdardfcopy = spmdardfcopy;
	}

	private Float spmdablkrdfcopy;

	@Basic
	@javax.persistence.Column(name = "spmdablkrdfcopy")
	public Float getSpmdablkrdfcopy() {
		return spmdablkrdfcopy;
	}

	public void setSpmdablkrdfcopy(Float spmdablkrdfcopy) {
		this.spmdablkrdfcopy = spmdablkrdfcopy;
	}

	private Float spmdevicecapacity;

	@Basic
	@javax.persistence.Column(name = "spmdevicecapacity")
	public Float getSpmdevicecapacity() {
		return spmdevicecapacity;
	}

	public void setSpmdevicecapacity(Float spmdevicecapacity) {
		this.spmdevicecapacity = spmdevicecapacity;
	}

	private Float spmdeviceblocksize;

	@Basic
	@javax.persistence.Column(name = "spmdeviceblocksize")
	public Float getSpmdeviceblocksize() {
		return spmdeviceblocksize;
	}

	public void setSpmdeviceblocksize(Float spmdeviceblocksize) {
		this.spmdeviceblocksize = spmdeviceblocksize;
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

	private Float spmbereqs;

	@Basic
	@javax.persistence.Column(name = "spmbereqs")
	public Float getSpmbereqs() {
		return spmbereqs;
	}

	public void setSpmbereqs(Float spmbereqs) {
		this.spmbereqs = spmbereqs;
	}

	private Float spmbembrate;

	@Basic
	@javax.persistence.Column(name = "spmbembrate")
	public Float getSpmbembrate() {
		return spmbembrate;
	}

	public void setSpmbembrate(Float spmbembrate) {
		this.spmbembrate = spmbembrate;
	}

	private Float spmrt;

	@Basic
	@javax.persistence.Column(name = "spmrt")
	public Float getSpmrt() {
		return spmrt;
	}

	public void setSpmrt(Float spmrt) {
		this.spmrt = spmrt;
	}

	private Float spmreadrt;

	@Basic
	@javax.persistence.Column(name = "spmreadrt")
	public Float getSpmreadrt() {
		return spmreadrt;
	}

	public void setSpmreadrt(Float spmreadrt) {
		this.spmreadrt = spmreadrt;
	}

	private Float spmwritert;

	@Basic
	@javax.persistence.Column(name = "spmwritert")
	public Float getSpmwritert() {
		return spmwritert;
	}

	public void setSpmwritert(Float spmwritert) {
		this.spmwritert = spmwritert;
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

	private Float spmwpdisctime;

	@Basic
	@javax.persistence.Column(name = "spmwpdisctime")
	public Float getSpmwpdisctime() {
		return spmwpdisctime;
	}

	public void setSpmwpdisctime(Float spmwpdisctime) {
		this.spmwpdisctime = spmwpdisctime;
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

	private Float spmavgbereqtime;

	@Basic
	@javax.persistence.Column(name = "spmavgbereqtime")
	public Float getSpmavgbereqtime() {
		return spmavgbereqtime;
	}

	public void setSpmavgbereqtime(Float spmavgbereqtime) {
		this.spmavgbereqtime = spmavgbereqtime;
	}

	private Float spmavgbedisktime;

	@Basic
	@javax.persistence.Column(name = "spmavgbedisktime")
	public Float getSpmavgbedisktime() {
		return spmavgbedisktime;
	}

	public void setSpmavgbedisktime(Float spmavgbedisktime) {
		this.spmavgbedisktime = spmavgbedisktime;
	}

	private Float spmavgbetasktime;

	@Basic
	@javax.persistence.Column(name = "spmavgbetasktime")
	public Float getSpmavgbetasktime() {
		return spmavgbetasktime;
	}

	public void setSpmavgbetasktime(Float spmavgbetasktime) {
		this.spmavgbetasktime = spmavgbetasktime;
	}

	private Float spmseqreadmisses;

	@Basic
	@javax.persistence.Column(name = "spmseqreadmisses")
	public Float getSpmseqreadmisses() {
		return spmseqreadmisses;
	}

	public void setSpmseqreadmisses(Float spmseqreadmisses) {
		this.spmseqreadmisses = spmseqreadmisses;
	}

	private Float spmseqwritemisses;

	@Basic
	@javax.persistence.Column(name = "spmseqwritemisses")
	public Float getSpmseqwritemisses() {
		return spmseqwritemisses;
	}

	public void setSpmseqwritemisses(Float spmseqwritemisses) {
		this.spmseqwritemisses = spmseqwritemisses;
	}

	private Float spmrndreadmisses;

	@Basic
	@javax.persistence.Column(name = "spmrndreadmisses")
	public Float getSpmrndreadmisses() {
		return spmrndreadmisses;
	}

	public void setSpmrndreadmisses(Float spmrndreadmisses) {
		this.spmrndreadmisses = spmrndreadmisses;
	}

	private Float spmrndwritemisses;

	@Basic
	@javax.persistence.Column(name = "spmrndwritemisses")
	public Float getSpmrndwritemisses() {
		return spmrndwritemisses;
	}

	public void setSpmrndwritemisses(Float spmrndwritemisses) {
		this.spmrndwritemisses = spmrndwritemisses;
	}

	private Float spmiodensity;

	@Basic
	@javax.persistence.Column(name = "spmiodensity")
	public Float getSpmiodensity() {
		return spmiodensity;
	}

	public void setSpmiodensity(Float spmiodensity) {
		this.spmiodensity = spmiodensity;
	}

	private Float spmdevcount;

	@Basic
	@javax.persistence.Column(name = "spmdevcount")
	public Float getSpmdevcount() {
		return spmdevcount;
	}

	public void setSpmdevcount(Float spmdevcount) {
		this.spmdevcount = spmdevcount;
	}

	private Float spmmetacount;

	@Basic
	@javax.persistence.Column(name = "spmmetacount")
	public Float getSpmmetacount() {
		return spmmetacount;
	}

	public void setSpmmetacount(Float spmmetacount) {
		this.spmmetacount = spmmetacount;
	}

	private Float spmperhit;

	@Basic
	@javax.persistence.Column(name = "spmperhit")
	public Float getSpmperhit() {
		return spmperhit;
	}

	public void setSpmperhit(Float spmperhit) {
		this.spmperhit = spmperhit;
	}

	private Float spmperwrite;

	@Basic
	@javax.persistence.Column(name = "spmperwrite")
	public Float getSpmperwrite() {
		return spmperwrite;
	}

	public void setSpmperwrite(Float spmperwrite) {
		this.spmperwrite = spmperwrite;
	}

	private Float spmperreadmiss;

	@Basic
	@javax.persistence.Column(name = "spmperreadmiss")
	public Float getSpmperreadmiss() {
		return spmperreadmiss;
	}

	public void setSpmperreadmiss(Float spmperreadmiss) {
		this.spmperreadmiss = spmperreadmiss;
	}

	private Float spmbeperread;

	@Basic
	@javax.persistence.Column(name = "spmbeperread")
	public Float getSpmbeperread() {
		return spmbeperread;
	}

	public void setSpmbeperread(Float spmbeperread) {
		this.spmbeperread = spmbeperread;
	}

	private Float spmbeperwrite;

	@Basic
	@javax.persistence.Column(name = "spmbeperwrite")
	public Float getSpmbeperwrite() {
		return spmbeperwrite;
	}

	public void setSpmbeperwrite(Float spmbeperwrite) {
		this.spmbeperwrite = spmbeperwrite;
	}

	private Float spmvfcreadhits;

	@Basic
	@javax.persistence.Column(name = "spmvfcreadhits")
	public Float getSpmvfcreadhits() {
		return spmvfcreadhits;
	}

	public void setSpmvfcreadhits(Float spmvfcreadhits) {
		this.spmvfcreadhits = spmvfcreadhits;
	}

	private Float spmvfcwritehits;

	@Basic
	@javax.persistence.Column(name = "spmvfcwritehits")
	public Float getSpmvfcwritehits() {
		return spmvfcwritehits;
	}

	public void setSpmvfcwritehits(Float spmvfcwritehits) {
		this.spmvfcwritehits = spmvfcwritehits;
	}

	private Float spmvfcreads;

	@Basic
	@javax.persistence.Column(name = "spmvfcreads")
	public Float getSpmvfcreads() {
		return spmvfcreads;
	}

	public void setSpmvfcreads(Float spmvfcreads) {
		this.spmvfcreads = spmvfcreads;
	}

	private Float spmvfcwrites;

	@Basic
	@javax.persistence.Column(name = "spmvfcwrites")
	public Float getSpmvfcwrites() {
		return spmvfcwrites;
	}

	public void setSpmvfcwrites(Float spmvfcwrites) {
		this.spmvfcwrites = spmvfcwrites;
	}

	private Float spmvfcios;

	@Basic
	@javax.persistence.Column(name = "spmvfcios")
	public Float getSpmvfcios() {
		return spmvfcios;
	}

	public void setSpmvfcios(Float spmvfcios) {
		this.spmvfcios = spmvfcios;
	}

	private Float spmpervfcreads;

	@Basic
	@javax.persistence.Column(name = "spmpervfcreads")
	public Float getSpmpervfcreads() {
		return spmpervfcreads;
	}

	public void setSpmpervfcreads(Float spmpervfcreads) {
		this.spmpervfcreads = spmpervfcreads;
	}

	private Float spmpervfcreadhits;

	@Basic
	@javax.persistence.Column(name = "spmpervfcreadhits")
	public Float getSpmpervfcreadhits() {
		return spmpervfcreadhits;
	}

	public void setSpmpervfcreadhits(Float spmpervfcreadhits) {
		this.spmpervfcreadhits = spmpervfcreadhits;
	}

	private Float spmpervfcwrites;

	@Basic
	@javax.persistence.Column(name = "spmpervfcwrites")
	public Float getSpmpervfcwrites() {
		return spmpervfcwrites;
	}

	public void setSpmpervfcwrites(Float spmpervfcwrites) {
		this.spmpervfcwrites = spmpervfcwrites;
	}

	private Float spmvfcskippedios;

	@Basic
	@javax.persistence.Column(name = "spmvfcskippedios")
	public Float getSpmvfcskippedios() {
		return spmvfcskippedios;
	}

	public void setSpmvfcskippedios(Float spmvfcskippedios) {
		this.spmvfcskippedios = spmvfcskippedios;
	}

	private Float spmvfcdeduphits;

	@Basic
	@javax.persistence.Column(name = "spmvfcdeduphits")
	public Float getSpmvfcdeduphits() {
		return spmvfcdeduphits;
	}

	public void setSpmvfcdeduphits(Float spmvfcdeduphits) {
		this.spmvfcdeduphits = spmvfcdeduphits;
	}

	private Float spmvfcdedupreads;

	@Basic
	@javax.persistence.Column(name = "spmvfcdedupreads")
	public Float getSpmvfcdedupreads() {
		return spmvfcdedupreads;
	}

	public void setSpmvfcdedupreads(Float spmvfcdedupreads) {
		this.spmvfcdedupreads = spmvfcdedupreads;
	}

	private Float spmvfcdedupwrites;

	@Basic
	@javax.persistence.Column(name = "spmvfcdedupwrites")
	public Float getSpmvfcdedupwrites() {
		return spmvfcdedupwrites;
	}

	public void setSpmvfcdedupwrites(Float spmvfcdedupwrites) {
		this.spmvfcdedupwrites = spmvfcdedupwrites;
	}

	private Float spmvfcmbread;

	@Basic
	@javax.persistence.Column(name = "spmvfcmbread")
	public Float getSpmvfcmbread() {
		return spmvfcmbread;
	}

	public void setSpmvfcmbread(Float spmvfcmbread) {
		this.spmvfcmbread = spmvfcmbread;
	}

	private Float spmvfcmbwritten;

	@Basic
	@javax.persistence.Column(name = "spmvfcmbwritten")
	public Float getSpmvfcmbwritten() {
		return spmvfcmbwritten;
	}

	public void setSpmvfcmbwritten(Float spmvfcmbwritten) {
		this.spmvfcmbwritten = spmvfcmbwritten;
	}

	private Float spmvfcmb;

	@Basic
	@javax.persistence.Column(name = "spmvfcmb")
	public Float getSpmvfcmb() {
		return spmvfcmb;
	}

	public void setSpmvfcmb(Float spmvfcmb) {
		this.spmvfcmb = spmvfcmb;
	}

	private Float spmvfcreadtime;

	@Basic
	@javax.persistence.Column(name = "spmvfcreadtime")
	public Float getSpmvfcreadtime() {
		return spmvfcreadtime;
	}

	public void setSpmvfcreadtime(Float spmvfcreadtime) {
		this.spmvfcreadtime = spmvfcreadtime;
	}

	private Float spmvfcwritetime;

	@Basic
	@javax.persistence.Column(name = "spmvfcwritetime")
	public Float getSpmvfcwritetime() {
		return spmvfcwritetime;
	}

	public void setSpmvfcwritetime(Float spmvfcwritetime) {
		this.spmvfcwritetime = spmvfcwritetime;
	}

	private Float spmvfcwreadrt;

	@Basic
	@javax.persistence.Column(name = "spmvfcwreadrt")
	public Float getSpmvfcwreadrt() {
		return spmvfcwreadrt;
	}

	public void setSpmvfcwreadrt(Float spmvfcwreadrt) {
		this.spmvfcwreadrt = spmvfcwreadrt;
	}

	private Float spmvfcwritert;

	@Basic
	@javax.persistence.Column(name = "spmvfcwritert")
	public Float getSpmvfcwritert() {
		return spmvfcwritert;
	}

	public void setSpmvfcwritert(Float spmvfcwritert) {
		this.spmvfcwritert = spmvfcwritert;
	}

	private Float spmvfcrt;

	@Basic
	@javax.persistence.Column(name = "spmvfcrt")
	public Float getSpmvfcrt() {
		return spmvfcrt;
	}

	public void setSpmvfcrt(Float spmvfcrt) {
		this.spmvfcrt = spmvfcrt;
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

	private Float spmavgreadsize;

	@Basic
	@javax.persistence.Column(name = "spmavgreadsize")
	public Float getSpmavgreadsize() {
		return spmavgreadsize;
	}

	public void setSpmavgreadsize(Float spmavgreadsize) {
		this.spmavgreadsize = spmavgreadsize;
	}

	private Float spmavgwritesize;

	@Basic
	@javax.persistence.Column(name = "spmavgwritesize")
	public Float getSpmavgwritesize() {
		return spmavgwritesize;
	}

	public void setSpmavgwritesize(Float spmavgwritesize) {
		this.spmavgwritesize = spmavgwritesize;
	}

	private Float spmavgiosize;

	@Basic
	@javax.persistence.Column(name = "spmavgiosize")
	public Float getSpmavgiosize() {
		return spmavgiosize;
	}

	public void setSpmavgiosize(Float spmavgiosize) {
		this.spmavgiosize = spmavgiosize;
	}

	private Float spmfewlscore;

	@Basic
	@javax.persistence.Column(name = "spmfewlscore")
	public Float getSpmfewlscore() {
		return spmfewlscore;
	}

	public void setSpmfewlscore(Float spmfewlscore) {
		this.spmfewlscore = spmfewlscore;
	}

	private Float spmbewlscore;

	@Basic
	@javax.persistence.Column(name = "spmbewlscore")
	public Float getSpmbewlscore() {
		return spmbewlscore;
	}

	public void setSpmbewlscore(Float spmbewlscore) {
		this.spmbewlscore = spmbewlscore;
	}

	private Float spmdskwlscore;

	@Basic
	@javax.persistence.Column(name = "spmdskwlscore")
	public Float getSpmdskwlscore() {
		return spmdskwlscore;
	}

	public void setSpmdskwlscore(Float spmdskwlscore) {
		this.spmdskwlscore = spmdskwlscore;
	}

	private Float spmwlscore;

	@Basic
	@javax.persistence.Column(name = "spmwlscore")
	public Float getSpmwlscore() {
		return spmwlscore;
	}

	public void setSpmwlscore(Float spmwlscore) {
		this.spmwlscore = spmwlscore;
	}

	private Float spmwritepaceddelay;

	@Basic
	@javax.persistence.Column(name = "spmwritepaceddelay")
	public Float getSpmwritepaceddelay() {
		return spmwritepaceddelay;
	}

	public void setSpmwritepaceddelay(Float spmwritepaceddelay) {
		this.spmwritepaceddelay = spmwritepaceddelay;
	}

	private Float spmavgwritepaceddelay;

	@Basic
	@javax.persistence.Column(name = "spmavgwritepaceddelay")
	public Float getSpmavgwritepaceddelay() {
		return spmavgwritepaceddelay;
	}

	public void setSpmavgwritepaceddelay(Float spmavgwritepaceddelay) {
		this.spmavgwritepaceddelay = spmavgwritepaceddelay;
	}

	private Float spmparitygenreads;

	@Basic
	@javax.persistence.Column(name = "spmparitygenreads")
	public Float getSpmparitygenreads() {
		return spmparitygenreads;
	}

	public void setSpmparitygenreads(Float spmparitygenreads) {
		this.spmparitygenreads = spmparitygenreads;
	}

	private Float spmparitygenblkread;

	@Basic
	@javax.persistence.Column(name = "spmparitygenblkread")
	public Float getSpmparitygenblkread() {
		return spmparitygenblkread;
	}

	public void setSpmparitygenblkread(Float spmparitygenblkread) {
		this.spmparitygenblkread = spmparitygenblkread;
	}

	private Float spmdareadrebuild;

	@Basic
	@javax.persistence.Column(name = "spmdareadrebuild")
	public Float getSpmdareadrebuild() {
		return spmdareadrebuild;
	}

	public void setSpmdareadrebuild(Float spmdareadrebuild) {
		this.spmdareadrebuild = spmdareadrebuild;
	}

	private Float spmdablkreadrebuild;

	@Basic
	@javax.persistence.Column(name = "spmdablkreadrebuild")
	public Float getSpmdablkreadrebuild() {
		return spmdablkreadrebuild;
	}

	public void setSpmdablkreadrebuild(Float spmdablkreadrebuild) {
		this.spmdablkreadrebuild = spmdablkreadrebuild;
	}

	private Float spmwritesivtoc;

	@Basic
	@javax.persistence.Column(name = "spmwritesivtoc")
	public Float getSpmwritesivtoc() {
		return spmwritesivtoc;
	}

	public void setSpmwritesivtoc(Float spmwritesivtoc) {
		this.spmwritesivtoc = spmwritesivtoc;
	}

	private Float spmblkswrittenivtoc;

	@Basic
	@javax.persistence.Column(name = "spmblkswrittenivtoc")
	public Float getSpmblkswrittenivtoc() {
		return spmblkswrittenivtoc;
	}

	public void setSpmblkswrittenivtoc(Float spmblkswrittenivtoc) {
		this.spmblkswrittenivtoc = spmblkswrittenivtoc;
	}

	private Float spmpreftrxmb;

	@Basic
	@javax.persistence.Column(name = "spmpreftrxmb")
	public Float getSpmpreftrxmb() {
		return spmpreftrxmb;
	}

	public void setSpmpreftrxmb(Float spmpreftrxmb) {
		this.spmpreftrxmb = spmpreftrxmb;
	}

	private Float spmrdfreads;

	@Basic
	@javax.persistence.Column(name = "spmrdfreads")
	public Float getSpmrdfreads() {
		return spmrdfreads;
	}

	public void setSpmrdfreads(Float spmrdfreads) {
		this.spmrdfreads = spmrdfreads;
	}

	private Float spmrdfwrites;

	@Basic
	@javax.persistence.Column(name = "spmrdfwrites")
	public Float getSpmrdfwrites() {
		return spmrdfwrites;
	}

	public void setSpmrdfwrites(Float spmrdfwrites) {
		this.spmrdfwrites = spmrdfwrites;
	}

	private Float spmrdfmbread;

	@Basic
	@javax.persistence.Column(name = "spmrdfmbread")
	public Float getSpmrdfmbread() {
		return spmrdfmbread;
	}

	public void setSpmrdfmbread(Float spmrdfmbread) {
		this.spmrdfmbread = spmrdfmbread;
	}

	private Float spmrdfmbwritten;

	@Basic
	@javax.persistence.Column(name = "spmrdfmbwritten")
	public Float getSpmrdfmbwritten() {
		return spmrdfmbwritten;
	}

	public void setSpmrdfmbwritten(Float spmrdfmbwritten) {
		this.spmrdfmbwritten = spmrdfmbwritten;
	}

	private Float spmrdfreadhits;

	@Basic
	@javax.persistence.Column(name = "spmrdfreadhits")
	public Float getSpmrdfreadhits() {
		return spmrdfreadhits;
	}

	public void setSpmrdfreadhits(Float spmrdfreadhits) {
		this.spmrdfreadhits = spmrdfreadhits;
	}

	private Float spmrdfrewrites;

	@Basic
	@javax.persistence.Column(name = "spmrdfrewrites")
	public Float getSpmrdfrewrites() {
		return spmrdfrewrites;
	}

	public void setSpmrdfrewrites(Float spmrdfrewrites) {
		this.spmrdfrewrites = spmrdfrewrites;
	}

	private Float spmrdfacioservtime;

	@Basic
	@javax.persistence.Column(name = "spmrdfacioservtime")
	public Float getSpmrdfacioservtime() {
		return spmrdfacioservtime;
	}

	public void setSpmrdfacioservtime(Float spmrdfacioservtime) {
		this.spmrdfacioservtime = spmrdfacioservtime;
	}

	private Float spmrdfioservtimelong;

	@Basic
	@javax.persistence.Column(name = "spmrdfioservtimelong")
	public Float getSpmrdfioservtimelong() {
		return spmrdfioservtimelong;
	}

	public void setSpmrdfioservtimelong(Float spmrdfioservtimelong) {
		this.spmrdfioservtimelong = spmrdfioservtimelong;
	}

	private Float spmrdfioservtimeshort;

	@Basic
	@javax.persistence.Column(name = "spmrdfioservtimeshort")
	public Float getSpmrdfioservtimeshort() {
		return spmrdfioservtimeshort;
	}

	public void setSpmrdfioservtimeshort(Float spmrdfioservtimeshort) {
		this.spmrdfioservtimeshort = spmrdfioservtimeshort;
	}

	private Float spmrdfmaxioservtime;

	@Basic
	@javax.persistence.Column(name = "spmrdfmaxioservtime")
	public Float getSpmrdfmaxioservtime() {
		return spmrdfmaxioservtime;
	}

	public void setSpmrdfmaxioservtime(Float spmrdfmaxioservtime) {
		this.spmrdfmaxioservtime = spmrdfmaxioservtime;
	}

	private Float spmrdfminioservtime;

	@Basic
	@javax.persistence.Column(name = "spmrdfminioservtime")
	public Float getSpmrdfminioservtime() {
		return spmrdfminioservtime;
	}

	public void setSpmrdfminioservtime(Float spmrdfminioservtime) {
		this.spmrdfminioservtime = spmrdfminioservtime;
	}

	private Float spmxcdevrank;

	@Basic
	@javax.persistence.Column(name = "spmxcdevrank")
	public Float getSpmxcdevrank() {
		return spmxcdevrank;
	}

	public void setSpmxcdevrank(Float spmxcdevrank) {
		this.spmxcdevrank = spmxcdevrank;
	}

	private Float spmalertinfo;

	@Basic
	@javax.persistence.Column(name = "spmalertinfo")
	public Float getSpmalertinfo() {
		return spmalertinfo;
	}

	public void setSpmalertinfo(Float spmalertinfo) {
		this.spmalertinfo = spmalertinfo;
	}

	private Float spmalertwarn;

	@Basic
	@javax.persistence.Column(name = "spmalertwarn")
	public Float getSpmalertwarn() {
		return spmalertwarn;
	}

	public void setSpmalertwarn(Float spmalertwarn) {
		this.spmalertwarn = spmalertwarn;
	}

	private Float spmalertcrit;

	@Basic
	@javax.persistence.Column(name = "spmalertcrit")
	public Float getSpmalertcrit() {
		return spmalertcrit;
	}

	public void setSpmalertcrit(Float spmalertcrit) {
		this.spmalertcrit = spmalertcrit;
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

	private Float spmqmbrate;

	@Basic
	@javax.persistence.Column(name = "spmqmbrate")
	public Float getSpmqmbrate() {
		return spmqmbrate;
	}

	public void setSpmqmbrate(Float spmqmbrate) {
		this.spmqmbrate = spmqmbrate;
	}

	private Float spmsrdfswtcnt;

	@Basic
	@javax.persistence.Column(name = "spmsrdfswtcnt")
	public Float getSpmsrdfswtcnt() {
		return spmsrdfswtcnt;
	}

	public void setSpmsrdfswtcnt(Float spmsrdfswtcnt) {
		this.spmsrdfswtcnt = spmsrdfswtcnt;
	}

	private Float spmsrdfswtmb;

	@Basic
	@javax.persistence.Column(name = "spmsrdfswtmb")
	public Float getSpmsrdfswtmb() {
		return spmsrdfswtmb;
	}

	public void setSpmsrdfswtmb(Float spmsrdfswtmb) {
		this.spmsrdfswtmb = spmsrdfswtmb;
	}

	private Float spmsrdfawtcnt;

	@Basic
	@javax.persistence.Column(name = "spmsrdfawtcnt")
	public Float getSpmsrdfawtcnt() {
		return spmsrdfawtcnt;
	}

	public void setSpmsrdfawtcnt(Float spmsrdfawtcnt) {
		this.spmsrdfawtcnt = spmsrdfawtcnt;
	}

	private Float spmsrdfawtmb;

	@Basic
	@javax.persistence.Column(name = "spmsrdfawtmb")
	public Float getSpmsrdfawtmb() {
		return spmsrdfawtmb;
	}

	public void setSpmsrdfawtmb(Float spmsrdfawtmb) {
		this.spmsrdfawtmb = spmsrdfawtmb;
	}

	private Float spmallocatedtracks;

	@Basic
	@javax.persistence.Column(name = "spmallocatedtracks")
	public Float getSpmallocatedtracks() {
		return spmallocatedtracks;
	}

	public void setSpmallocatedtracks(Float spmallocatedtracks) {
		this.spmallocatedtracks = spmallocatedtracks;
	}

	private Float spmcompressedtracks;

	@Basic
	@javax.persistence.Column(name = "spmcompressedtracks")
	public Float getSpmcompressedtracks() {
		return spmcompressedtracks;
	}

	public void setSpmcompressedtracks(Float spmcompressedtracks) {
		this.spmcompressedtracks = spmcompressedtracks;
	}

	private Float spmpercomptracks;

	@Basic
	@javax.persistence.Column(name = "spmpercomptracks")
	public Float getSpmpercomptracks() {
		return spmpercomptracks;
	}

	public void setSpmpercomptracks(Float spmpercomptracks) {
		this.spmpercomptracks = spmpercomptracks;
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

	private Float spmallocdevicecapacity;

	@Basic
	@javax.persistence.Column(name = "spmallocdevicecapacity")
	public Float getSpmallocdevicecapacity() {
		return spmallocdevicecapacity;
	}

	public void setSpmallocdevicecapacity(Float spmallocdevicecapacity) {
		this.spmallocdevicecapacity = spmallocdevicecapacity;
	}

	private Float spmpertimeexceed;

	@Basic
	@javax.persistence.Column(name = "spmpertimeexceed")
	public Float getSpmpertimeexceed() {
		return spmpertimeexceed;
	}

	public void setSpmpertimeexceed(Float spmpertimeexceed) {
		this.spmpertimeexceed = spmpertimeexceed;
	}

	private Float spmrdfresponsetime;

	@Basic
	@javax.persistence.Column(name = "spmrdfresponsetime")
	public Float getSpmrdfresponsetime() {
		return spmrdfresponsetime;
	}

	public void setSpmrdfresponsetime(Float spmrdfresponsetime) {
		this.spmrdfresponsetime = spmrdfresponsetime;
	}

	private Float wlprrhmulios;

	@Basic
	@javax.persistence.Column(name = "wlprrhmulios")
	public Float getWlprrhmulios() {
		return wlprrhmulios;
	}

	public void setWlprrhmulios(Float wlprrhmulios) {
		this.wlprrhmulios = wlprrhmulios;
	}

	private Float wlpsrmulios;

	@Basic
	@javax.persistence.Column(name = "wlpsrmulios")
	public Float getWlpsrmulios() {
		return wlpsrmulios;
	}

	public void setWlpsrmulios(Float wlpsrmulios) {
		this.wlpsrmulios = wlpsrmulios;
	}

	private Float wlprmmulios;

	@Basic
	@javax.persistence.Column(name = "wlprmmulios")
	public Float getWlprmmulios() {
		return wlprmmulios;
	}

	public void setWlprmmulios(Float wlprmmulios) {
		this.wlprmmulios = wlprmmulios;
	}

	private Float wlprwmulios;

	@Basic
	@javax.persistence.Column(name = "wlprwmulios")
	public Float getWlprwmulios() {
		return wlprwmulios;
	}

	public void setWlprwmulios(Float wlprwmulios) {
		this.wlprwmulios = wlprwmulios;
	}

	private Float wlpswmulios;

	@Basic
	@javax.persistence.Column(name = "wlpswmulios")
	public Float getWlpswmulios() {
		return wlpswmulios;
	}

	public void setWlpswmulios(Float wlpswmulios) {
		this.wlpswmulios = wlpswmulios;
	}

	private Float wlpwhmulios;

	@Basic
	@javax.persistence.Column(name = "wlpwhmulios")
	public Float getWlpwhmulios() {
		return wlpwhmulios;
	}

	public void setWlpwhmulios(Float wlpwhmulios) {
		this.wlpwhmulios = wlpwhmulios;
	}

	private Float wlpcopyiomulios;

	@Basic
	@javax.persistence.Column(name = "wlpcopyiomulios")
	public Float getWlpcopyiomulios() {
		return wlpcopyiomulios;
	}

	public void setWlpcopyiomulios(Float wlpcopyiomulios) {
		this.wlpcopyiomulios = wlpcopyiomulios;
	}

	private Float wlpsrdfswritemulios;

	@Basic
	@javax.persistence.Column(name = "wlpsrdfswritemulios")
	public Float getWlpsrdfswritemulios() {
		return wlpsrdfswritemulios;
	}

	public void setWlpsrdfswritemulios(Float wlpsrdfswritemulios) {
		this.wlpsrdfswritemulios = wlpsrdfswritemulios;
	}

	private Float wlpsrdfawritemulios;

	@Basic
	@javax.persistence.Column(name = "wlpsrdfawritemulios")
	public Float getWlpsrdfawritemulios() {
		return wlpsrdfawritemulios;
	}

	public void setWlpsrdfawritemulios(Float wlpsrdfawritemulios) {
		this.wlpsrdfawritemulios = wlpsrdfawritemulios;
	}

	private Float wlprrhmulsizemulios;

	@Basic
	@javax.persistence.Column(name = "wlprrhmulsizemulios")
	public Float getWlprrhmulsizemulios() {
		return wlprrhmulsizemulios;
	}

	public void setWlprrhmulsizemulios(Float wlprrhmulsizemulios) {
		this.wlprrhmulsizemulios = wlprrhmulsizemulios;
	}

	private Float wlpsrmulsizemulios;

	@Basic
	@javax.persistence.Column(name = "wlpsrmulsizemulios")
	public Float getWlpsrmulsizemulios() {
		return wlpsrmulsizemulios;
	}

	public void setWlpsrmulsizemulios(Float wlpsrmulsizemulios) {
		this.wlpsrmulsizemulios = wlpsrmulsizemulios;
	}

	private Float wlprmmulsizemulios;

	@Basic
	@javax.persistence.Column(name = "wlprmmulsizemulios")
	public Float getWlprmmulsizemulios() {
		return wlprmmulsizemulios;
	}

	public void setWlprmmulsizemulios(Float wlprmmulsizemulios) {
		this.wlprmmulsizemulios = wlprmmulsizemulios;
	}

	private Float wlprwmulsizemulios;

	@Basic
	@javax.persistence.Column(name = "wlprwmulsizemulios")
	public Float getWlprwmulsizemulios() {
		return wlprwmulsizemulios;
	}

	public void setWlprwmulsizemulios(Float wlprwmulsizemulios) {
		this.wlprwmulsizemulios = wlprwmulsizemulios;
	}

	private Float wlpswmulsizemulios;

	@Basic
	@javax.persistence.Column(name = "wlpswmulsizemulios")
	public Float getWlpswmulsizemulios() {
		return wlpswmulsizemulios;
	}

	public void setWlpswmulsizemulios(Float wlpswmulsizemulios) {
		this.wlpswmulsizemulios = wlpswmulsizemulios;
	}

	private Float wlpwhmulsizemulios;

	@Basic
	@javax.persistence.Column(name = "wlpwhmulsizemulios")
	public Float getWlpwhmulsizemulios() {
		return wlpwhmulsizemulios;
	}

	public void setWlpwhmulsizemulios(Float wlpwhmulsizemulios) {
		this.wlpwhmulsizemulios = wlpwhmulsizemulios;
	}

	private Float wlpcopyiosizemulios;

	@Basic
	@javax.persistence.Column(name = "wlpcopyiosizemulios")
	public Float getWlpcopyiosizemulios() {
		return wlpcopyiosizemulios;
	}

	public void setWlpcopyiosizemulios(Float wlpcopyiosizemulios) {
		this.wlpcopyiosizemulios = wlpcopyiosizemulios;
	}

	private Float wlpsrdfsmbwritemulios;

	@Basic
	@javax.persistence.Column(name = "wlpsrdfsmbwritemulios")
	public Float getWlpsrdfsmbwritemulios() {
		return wlpsrdfsmbwritemulios;
	}

	public void setWlpsrdfsmbwritemulios(Float wlpsrdfsmbwritemulios) {
		this.wlpsrdfsmbwritemulios = wlpsrdfsmbwritemulios;
	}

	private Float wlpsrdfambwritemulios;

	@Basic
	@javax.persistence.Column(name = "wlpsrdfambwritemulios")
	public Float getWlpsrdfambwritemulios() {
		return wlpsrdfambwritemulios;
	}

	public void setWlpsrdfambwritemulios(Float wlpsrdfambwritemulios) {
		this.wlpsrdfambwritemulios = wlpsrdfambwritemulios;
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

	private Float wlpresptimemulios;

	@Basic
	@javax.persistence.Column(name = "wlpresptimemulios")
	public Float getWlpresptimemulios() {
		return wlpresptimemulios;
	}

	public void setWlpresptimemulios(Float wlpresptimemulios) {
		this.wlpresptimemulios = wlpresptimemulios;
	}

	private Float wlpresptimesqmulios;

	@Basic
	@javax.persistence.Column(name = "wlpresptimesqmulios")
	public Float getWlpresptimesqmulios() {
		return wlpresptimesqmulios;
	}

	public void setWlpresptimesqmulios(Float wlpresptimesqmulios) {
		this.wlpresptimesqmulios = wlpresptimesqmulios;
	}

	private Float spmlocalreptracks;

	@Basic
	@javax.persistence.Column(name = "spmlocalreptracks")
	public Float getSpmlocalreptracks() {
		return spmlocalreptracks;
	}

	public void setSpmlocalreptracks(Float spmlocalreptracks) {
		this.spmlocalreptracks = spmlocalreptracks;
	}

	private Float spmreadrtcount1;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount1")
	public Float getSpmreadrtcount1() {
		return spmreadrtcount1;
	}

	public void setSpmreadrtcount1(Float spmreadrtcount1) {
		this.spmreadrtcount1 = spmreadrtcount1;
	}

	private Float spmreadrtcount2;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount2")
	public Float getSpmreadrtcount2() {
		return spmreadrtcount2;
	}

	public void setSpmreadrtcount2(Float spmreadrtcount2) {
		this.spmreadrtcount2 = spmreadrtcount2;
	}

	private Float spmreadrtcount3;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount3")
	public Float getSpmreadrtcount3() {
		return spmreadrtcount3;
	}

	public void setSpmreadrtcount3(Float spmreadrtcount3) {
		this.spmreadrtcount3 = spmreadrtcount3;
	}

	private Float spmreadrtcount4;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount4")
	public Float getSpmreadrtcount4() {
		return spmreadrtcount4;
	}

	public void setSpmreadrtcount4(Float spmreadrtcount4) {
		this.spmreadrtcount4 = spmreadrtcount4;
	}

	private Float spmreadrtcount5;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount5")
	public Float getSpmreadrtcount5() {
		return spmreadrtcount5;
	}

	public void setSpmreadrtcount5(Float spmreadrtcount5) {
		this.spmreadrtcount5 = spmreadrtcount5;
	}

	private Float spmreadrtcount6;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount6")
	public Float getSpmreadrtcount6() {
		return spmreadrtcount6;
	}

	public void setSpmreadrtcount6(Float spmreadrtcount6) {
		this.spmreadrtcount6 = spmreadrtcount6;
	}

	private Float spmreadrtcount7;

	@Basic
	@javax.persistence.Column(name = "spmreadrtcount7")
	public Float getSpmreadrtcount7() {
		return spmreadrtcount7;
	}

	public void setSpmreadrtcount7(Float spmreadrtcount7) {
		this.spmreadrtcount7 = spmreadrtcount7;
	}

	private Float spmreadrttime6;

	@Basic
	@javax.persistence.Column(name = "spmreadrttime6")
	public Float getSpmreadrttime6() {
		return spmreadrttime6;
	}

	public void setSpmreadrttime6(Float spmreadrttime6) {
		this.spmreadrttime6 = spmreadrttime6;
	}

	private Float spmreadrttime7;

	@Basic
	@javax.persistence.Column(name = "spmreadrttime7")
	public Float getSpmreadrttime7() {
		return spmreadrttime7;
	}

	public void setSpmreadrttime7(Float spmreadrttime7) {
		this.spmreadrttime7 = spmreadrttime7;
	}

	private Float spmwritertcount1;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount1")
	public Float getSpmwritertcount1() {
		return spmwritertcount1;
	}

	public void setSpmwritertcount1(Float spmwritertcount1) {
		this.spmwritertcount1 = spmwritertcount1;
	}

	private Float spmwritertcount2;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount2")
	public Float getSpmwritertcount2() {
		return spmwritertcount2;
	}

	public void setSpmwritertcount2(Float spmwritertcount2) {
		this.spmwritertcount2 = spmwritertcount2;
	}

	private Float spmwritertcount3;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount3")
	public Float getSpmwritertcount3() {
		return spmwritertcount3;
	}

	public void setSpmwritertcount3(Float spmwritertcount3) {
		this.spmwritertcount3 = spmwritertcount3;
	}

	private Float spmwritertcount4;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount4")
	public Float getSpmwritertcount4() {
		return spmwritertcount4;
	}

	public void setSpmwritertcount4(Float spmwritertcount4) {
		this.spmwritertcount4 = spmwritertcount4;
	}

	private Float spmwritertcount5;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount5")
	public Float getSpmwritertcount5() {
		return spmwritertcount5;
	}

	public void setSpmwritertcount5(Float spmwritertcount5) {
		this.spmwritertcount5 = spmwritertcount5;
	}

	private Float spmwritertcount6;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount6")
	public Float getSpmwritertcount6() {
		return spmwritertcount6;
	}

	public void setSpmwritertcount6(Float spmwritertcount6) {
		this.spmwritertcount6 = spmwritertcount6;
	}

	private Float spmwritertcount7;

	@Basic
	@javax.persistence.Column(name = "spmwritertcount7")
	public Float getSpmwritertcount7() {
		return spmwritertcount7;
	}

	public void setSpmwritertcount7(Float spmwritertcount7) {
		this.spmwritertcount7 = spmwritertcount7;
	}

	private Float spmwriterttime6;

	@Basic
	@javax.persistence.Column(name = "spmwriterttime6")
	public Float getSpmwriterttime6() {
		return spmwriterttime6;
	}

	public void setSpmwriterttime6(Float spmwriterttime6) {
		this.spmwriterttime6 = spmwriterttime6;
	}

	private Float spmwriterttime7;

	@Basic
	@javax.persistence.Column(name = "spmwriterttime7")
	public Float getSpmwriterttime7() {
		return spmwriterttime7;
	}

	public void setSpmwriterttime7(Float spmwriterttime7) {
		this.spmwriterttime7 = spmwriterttime7;
	}

	private Float spmreadrt6;

	@Basic
	@javax.persistence.Column(name = "spmreadrt6")
	public Float getSpmreadrt6() {
		return spmreadrt6;
	}

	public void setSpmreadrt6(Float spmreadrt6) {
		this.spmreadrt6 = spmreadrt6;
	}

	private Float spmreadrt7;

	@Basic
	@javax.persistence.Column(name = "spmreadrt7")
	public Float getSpmreadrt7() {
		return spmreadrt7;
	}

	public void setSpmreadrt7(Float spmreadrt7) {
		this.spmreadrt7 = spmreadrt7;
	}

	private Float spmwritert6;

	@Basic
	@javax.persistence.Column(name = "spmwritert6")
	public Float getSpmwritert6() {
		return spmwritert6;
	}

	public void setSpmwritert6(Float spmwritert6) {
		this.spmwritert6 = spmwritert6;
	}

	private Float spmwritert7;

	@Basic
	@javax.persistence.Column(name = "spmwritert7")
	public Float getSpmwritert7() {
		return spmwritert7;
	}

	public void setSpmwritert7(Float spmwritert7) {
		this.spmwritert7 = spmwritert7;
	}

	private Float spmskew;

	@Basic
	@javax.persistence.Column(name = "spmskew")
	public Float getSpmskew() {
		return spmskew;
	}

	public void setSpmskew(Float spmskew) {
		this.spmskew = spmskew;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DwfStoragegroupRP20160722 that = (DwfStoragegroupRP20160722) o;

		if (partitionkey != that.partitionkey) return false;
		if (storagegroupkey != that.storagegroupkey) return false;
		if (timekey != that.timekey) return false;
		if (exclude != null ? !exclude.equals(that.exclude) : that.exclude != null) return false;
		if (spmalertcrit != null ? !spmalertcrit.equals(that.spmalertcrit) : that.spmalertcrit != null) return false;
		if (spmalertinfo != null ? !spmalertinfo.equals(that.spmalertinfo) : that.spmalertinfo != null) return false;
		if (spmalertwarn != null ? !spmalertwarn.equals(that.spmalertwarn) : that.spmalertwarn != null) return false;
		if (spmallocatedtracks != null ? !spmallocatedtracks.equals(that.spmallocatedtracks) : that.spmallocatedtracks != null)
			return false;
		if (spmallocdevicecapacity != null ? !spmallocdevicecapacity.equals(that.spmallocdevicecapacity) : that.spmallocdevicecapacity != null)
			return false;
		if (spmavgbedisktime != null ? !spmavgbedisktime.equals(that.spmavgbedisktime) : that.spmavgbedisktime != null)
			return false;
		if (spmavgbereqtime != null ? !spmavgbereqtime.equals(that.spmavgbereqtime) : that.spmavgbereqtime != null)
			return false;
		if (spmavgbetasktime != null ? !spmavgbetasktime.equals(that.spmavgbetasktime) : that.spmavgbetasktime != null)
			return false;
		if (spmavgiosize != null ? !spmavgiosize.equals(that.spmavgiosize) : that.spmavgiosize != null) return false;
		if (spmavgreadsize != null ? !spmavgreadsize.equals(that.spmavgreadsize) : that.spmavgreadsize != null)
			return false;
		if (spmavgwritepaceddelay != null ? !spmavgwritepaceddelay.equals(that.spmavgwritepaceddelay) : that.spmavgwritepaceddelay != null)
			return false;
		if (spmavgwritesize != null ? !spmavgwritesize.equals(that.spmavgwritesize) : that.spmavgwritesize != null)
			return false;
		if (spmbembrate != null ? !spmbembrate.equals(that.spmbembrate) : that.spmbembrate != null) return false;
		if (spmbembreadrate != null ? !spmbembreadrate.equals(that.spmbembreadrate) : that.spmbembreadrate != null)
			return false;
		if (spmbembwriterate != null ? !spmbembwriterate.equals(that.spmbembwriterate) : that.spmbembwriterate != null)
			return false;
		if (spmbeperread != null ? !spmbeperread.equals(that.spmbeperread) : that.spmbeperread != null) return false;
		if (spmbeperwrite != null ? !spmbeperwrite.equals(that.spmbeperwrite) : that.spmbeperwrite != null)
			return false;
		if (spmbereads != null ? !spmbereads.equals(that.spmbereads) : that.spmbereads != null) return false;
		if (spmbereqs != null ? !spmbereqs.equals(that.spmbereqs) : that.spmbereqs != null) return false;
		if (spmbewlscore != null ? !spmbewlscore.equals(that.spmbewlscore) : that.spmbewlscore != null) return false;
		if (spmbewrites != null ? !spmbewrites.equals(that.spmbewrites) : that.spmbewrites != null) return false;
		if (spmblkswrittenivtoc != null ? !spmblkswrittenivtoc.equals(that.spmblkswrittenivtoc) : that.spmblkswrittenivtoc != null)
			return false;
		if (spmcompressedtracks != null ? !spmcompressedtracks.equals(that.spmcompressedtracks) : that.spmcompressedtracks != null)
			return false;
		if (spmcrmavgreadsize != null ? !spmcrmavgreadsize.equals(that.spmcrmavgreadsize) : that.spmcrmavgreadsize != null)
			return false;
		if (spmcrmmbread != null ? !spmcrmmbread.equals(that.spmcrmmbread) : that.spmcrmmbread != null) return false;
		if (spmcrmreads != null ? !spmcrmreads.equals(that.spmcrmreads) : that.spmcrmreads != null) return false;
		if (spmdablkrdfcopy != null ? !spmdablkrdfcopy.equals(that.spmdablkrdfcopy) : that.spmdablkrdfcopy != null)
			return false;
		if (spmdablkreadcopy != null ? !spmdablkreadcopy.equals(that.spmdablkreadcopy) : that.spmdablkreadcopy != null)
			return false;
		if (spmdablkreadrebuild != null ? !spmdablkreadrebuild.equals(that.spmdablkreadrebuild) : that.spmdablkreadrebuild != null)
			return false;
		if (spmdablkreadvlunmig != null ? !spmdablkreadvlunmig.equals(that.spmdablkreadvlunmig) : that.spmdablkreadvlunmig != null)
			return false;
		if (spmdablkwrittencopy != null ? !spmdablkwrittencopy.equals(that.spmdablkwrittencopy) : that.spmdablkwrittencopy != null)
			return false;
		if (spmdablkwrittenrebuild != null ? !spmdablkwrittenrebuild.equals(that.spmdablkwrittenrebuild) : that.spmdablkwrittenrebuild != null)
			return false;
		if (spmdablkwrittenvlunmig != null ? !spmdablkwrittenvlunmig.equals(that.spmdablkwrittenvlunmig) : that.spmdablkwrittenvlunmig != null)
			return false;
		if (spmdadisktime != null ? !spmdadisktime.equals(that.spmdadisktime) : that.spmdadisktime != null)
			return false;
		if (spmdaoptwriteblk != null ? !spmdaoptwriteblk.equals(that.spmdaoptwriteblk) : that.spmdaoptwriteblk != null)
			return false;
		if (spmdaparsecwriteblk != null ? !spmdaparsecwriteblk.equals(that.spmdaparsecwriteblk) : that.spmdaparsecwriteblk != null)
			return false;
		if (spmdapreftrx != null ? !spmdapreftrx.equals(that.spmdapreftrx) : that.spmdapreftrx != null) return false;
		if (spmdapreftrxused != null ? !spmdapreftrxused.equals(that.spmdapreftrxused) : that.spmdapreftrxused != null)
			return false;
		if (spmdardfcopy != null ? !spmdardfcopy.equals(that.spmdardfcopy) : that.spmdardfcopy != null) return false;
		if (spmdareadforcopy != null ? !spmdareadforcopy.equals(that.spmdareadforcopy) : that.spmdareadforcopy != null)
			return false;
		if (spmdareadrebuild != null ? !spmdareadrebuild.equals(that.spmdareadrebuild) : that.spmdareadrebuild != null)
			return false;
		if (spmdareadvlunmig != null ? !spmdareadvlunmig.equals(that.spmdareadvlunmig) : that.spmdareadvlunmig != null)
			return false;
		if (spmdareqtime != null ? !spmdareqtime.equals(that.spmdareqtime) : that.spmdareqtime != null) return false;
		if (spmdatasktime != null ? !spmdatasktime.equals(that.spmdatasktime) : that.spmdatasktime != null)
			return false;
		if (spmdawritecopy != null ? !spmdawritecopy.equals(that.spmdawritecopy) : that.spmdawritecopy != null)
			return false;
		if (spmdawriterebuild != null ? !spmdawriterebuild.equals(that.spmdawriterebuild) : that.spmdawriterebuild != null)
			return false;
		if (spmdawritevlunmig != null ? !spmdawritevlunmig.equals(that.spmdawritevlunmig) : that.spmdawritevlunmig != null)
			return false;
		if (spmdaxorblkread != null ? !spmdaxorblkread.equals(that.spmdaxorblkread) : that.spmdaxorblkread != null)
			return false;
		if (spmdaxorreads != null ? !spmdaxorreads.equals(that.spmdaxorreads) : that.spmdaxorreads != null)
			return false;
		if (spmdevcount != null ? !spmdevcount.equals(that.spmdevcount) : that.spmdevcount != null) return false;
		if (spmdeviceblocksize != null ? !spmdeviceblocksize.equals(that.spmdeviceblocksize) : that.spmdeviceblocksize != null)
			return false;
		if (spmdevicecapacity != null ? !spmdevicecapacity.equals(that.spmdevicecapacity) : that.spmdevicecapacity != null)
			return false;
		if (spmdskwlscore != null ? !spmdskwlscore.equals(that.spmdskwlscore) : that.spmdskwlscore != null)
			return false;
		if (spmfewlscore != null ? !spmfewlscore.equals(that.spmfewlscore) : that.spmfewlscore != null) return false;
		if (spmiodensity != null ? !spmiodensity.equals(that.spmiodensity) : that.spmiodensity != null) return false;
		if (spmiorate != null ? !spmiorate.equals(that.spmiorate) : that.spmiorate != null) return false;
		if (spmlimitexceed != null ? !spmlimitexceed.equals(that.spmlimitexceed) : that.spmlimitexceed != null)
			return false;
		if (spmlocalreptracks != null ? !spmlocalreptracks.equals(that.spmlocalreptracks) : that.spmlocalreptracks != null)
			return false;
		if (spmm1Invalidtrx != null ? !spmm1Invalidtrx.equals(that.spmm1Invalidtrx) : that.spmm1Invalidtrx != null)
			return false;
		if (spmm2Invalidtrx != null ? !spmm2Invalidtrx.equals(that.spmm2Invalidtrx) : that.spmm2Invalidtrx != null)
			return false;
		if (spmm3Invalidtrx != null ? !spmm3Invalidtrx.equals(that.spmm3Invalidtrx) : that.spmm3Invalidtrx != null)
			return false;
		if (spmm4Invalidtrx != null ? !spmm4Invalidtrx.equals(that.spmm4Invalidtrx) : that.spmm4Invalidtrx != null)
			return false;
		if (spmmaxwpthres != null ? !spmmaxwpthres.equals(that.spmmaxwpthres) : that.spmmaxwpthres != null)
			return false;
		if (spmmbrate != null ? !spmmbrate.equals(that.spmmbrate) : that.spmmbrate != null) return false;
		if (spmmbreadrate != null ? !spmmbreadrate.equals(that.spmmbreadrate) : that.spmmbreadrate != null)
			return false;
		if (spmmbwriterate != null ? !spmmbwriterate.equals(that.spmmbwriterate) : that.spmmbwriterate != null)
			return false;
		if (spmmetacount != null ? !spmmetacount.equals(that.spmmetacount) : that.spmmetacount != null) return false;
		if (spmnuminvalidtrx != null ? !spmnuminvalidtrx.equals(that.spmnuminvalidtrx) : that.spmnuminvalidtrx != null)
			return false;
		if (spmparitygenblkread != null ? !spmparitygenblkread.equals(that.spmparitygenblkread) : that.spmparitygenblkread != null)
			return false;
		if (spmparitygenreads != null ? !spmparitygenreads.equals(that.spmparitygenreads) : that.spmparitygenreads != null)
			return false;
		if (spmpercomptracks != null ? !spmpercomptracks.equals(that.spmpercomptracks) : that.spmpercomptracks != null)
			return false;
		if (spmperhit != null ? !spmperhit.equals(that.spmperhit) : that.spmperhit != null) return false;
		if (spmperreadmiss != null ? !spmperreadmiss.equals(that.spmperreadmiss) : that.spmperreadmiss != null)
			return false;
		if (spmpertimeexceed != null ? !spmpertimeexceed.equals(that.spmpertimeexceed) : that.spmpertimeexceed != null)
			return false;
		if (spmpervfcreadhits != null ? !spmpervfcreadhits.equals(that.spmpervfcreadhits) : that.spmpervfcreadhits != null)
			return false;
		if (spmpervfcreads != null ? !spmpervfcreads.equals(that.spmpervfcreads) : that.spmpervfcreads != null)
			return false;
		if (spmpervfcwrites != null ? !spmpervfcwrites.equals(that.spmpervfcwrites) : that.spmpervfcwrites != null)
			return false;
		if (spmperwrite != null ? !spmperwrite.equals(that.spmperwrite) : that.spmperwrite != null) return false;
		if (spmpreftrxmb != null ? !spmpreftrxmb.equals(that.spmpreftrxmb) : that.spmpreftrxmb != null) return false;
		if (spmqavgdlytime != null ? !spmqavgdlytime.equals(that.spmqavgdlytime) : that.spmqavgdlytime != null)
			return false;
		if (spmqdlyios != null ? !spmqdlyios.equals(that.spmqdlyios) : that.spmqdlyios != null) return false;
		if (spmqdlytime != null ? !spmqdlytime.equals(that.spmqdlytime) : that.spmqdlytime != null) return false;
		if (spmqiorate != null ? !spmqiorate.equals(that.spmqiorate) : that.spmqiorate != null) return false;
		if (spmqmbrate != null ? !spmqmbrate.equals(that.spmqmbrate) : that.spmqmbrate != null) return false;
		if (spmqperdlyios != null ? !spmqperdlyios.equals(that.spmqperdlyios) : that.spmqperdlyios != null)
			return false;
		if (spmrdfacioservtime != null ? !spmrdfacioservtime.equals(that.spmrdfacioservtime) : that.spmrdfacioservtime != null)
			return false;
		if (spmrdfioservtimelong != null ? !spmrdfioservtimelong.equals(that.spmrdfioservtimelong) : that.spmrdfioservtimelong != null)
			return false;
		if (spmrdfioservtimeshort != null ? !spmrdfioservtimeshort.equals(that.spmrdfioservtimeshort) : that.spmrdfioservtimeshort != null)
			return false;
		if (spmrdfmaxioservtime != null ? !spmrdfmaxioservtime.equals(that.spmrdfmaxioservtime) : that.spmrdfmaxioservtime != null)
			return false;
		if (spmrdfmbread != null ? !spmrdfmbread.equals(that.spmrdfmbread) : that.spmrdfmbread != null) return false;
		if (spmrdfmbwritten != null ? !spmrdfmbwritten.equals(that.spmrdfmbwritten) : that.spmrdfmbwritten != null)
			return false;
		if (spmrdfminioservtime != null ? !spmrdfminioservtime.equals(that.spmrdfminioservtime) : that.spmrdfminioservtime != null)
			return false;
		if (spmrdfreadhits != null ? !spmrdfreadhits.equals(that.spmrdfreadhits) : that.spmrdfreadhits != null)
			return false;
		if (spmrdfreads != null ? !spmrdfreads.equals(that.spmrdfreads) : that.spmrdfreads != null) return false;
		if (spmrdfresponsetime != null ? !spmrdfresponsetime.equals(that.spmrdfresponsetime) : that.spmrdfresponsetime != null)
			return false;
		if (spmrdfrewrites != null ? !spmrdfrewrites.equals(that.spmrdfrewrites) : that.spmrdfrewrites != null)
			return false;
		if (spmrdfwrites != null ? !spmrdfwrites.equals(that.spmrdfwrites) : that.spmrdfwrites != null) return false;
		if (spmrdfwritetime != null ? !spmrdfwritetime.equals(that.spmrdfwritetime) : that.spmrdfwritetime != null)
			return false;
		if (spmreadmisstime != null ? !spmreadmisstime.equals(that.spmreadmisstime) : that.spmreadmisstime != null)
			return false;
		if (spmreadrt != null ? !spmreadrt.equals(that.spmreadrt) : that.spmreadrt != null) return false;
		if (spmreadrt6 != null ? !spmreadrt6.equals(that.spmreadrt6) : that.spmreadrt6 != null) return false;
		if (spmreadrt7 != null ? !spmreadrt7.equals(that.spmreadrt7) : that.spmreadrt7 != null) return false;
		if (spmreadrtcount1 != null ? !spmreadrtcount1.equals(that.spmreadrtcount1) : that.spmreadrtcount1 != null)
			return false;
		if (spmreadrtcount2 != null ? !spmreadrtcount2.equals(that.spmreadrtcount2) : that.spmreadrtcount2 != null)
			return false;
		if (spmreadrtcount3 != null ? !spmreadrtcount3.equals(that.spmreadrtcount3) : that.spmreadrtcount3 != null)
			return false;
		if (spmreadrtcount4 != null ? !spmreadrtcount4.equals(that.spmreadrtcount4) : that.spmreadrtcount4 != null)
			return false;
		if (spmreadrtcount5 != null ? !spmreadrtcount5.equals(that.spmreadrtcount5) : that.spmreadrtcount5 != null)
			return false;
		if (spmreadrtcount6 != null ? !spmreadrtcount6.equals(that.spmreadrtcount6) : that.spmreadrtcount6 != null)
			return false;
		if (spmreadrtcount7 != null ? !spmreadrtcount7.equals(that.spmreadrtcount7) : that.spmreadrtcount7 != null)
			return false;
		if (spmreadrttime6 != null ? !spmreadrttime6.equals(that.spmreadrttime6) : that.spmreadrttime6 != null)
			return false;
		if (spmreadrttime7 != null ? !spmreadrttime7.equals(that.spmreadrttime7) : that.spmreadrttime7 != null)
			return false;
		if (spmreads != null ? !spmreads.equals(that.spmreads) : that.spmreads != null) return false;
		if (spmreadtime != null ? !spmreadtime.equals(that.spmreadtime) : that.spmreadtime != null) return false;
		if (spmrndhits != null ? !spmrndhits.equals(that.spmrndhits) : that.spmrndhits != null) return false;
		if (spmrndios != null ? !spmrndios.equals(that.spmrndios) : that.spmrndios != null) return false;
		if (spmrndreadhits != null ? !spmrndreadhits.equals(that.spmrndreadhits) : that.spmrndreadhits != null)
			return false;
		if (spmrndreadmisses != null ? !spmrndreadmisses.equals(that.spmrndreadmisses) : that.spmrndreadmisses != null)
			return false;
		if (spmrndreads != null ? !spmrndreads.equals(that.spmrndreads) : that.spmrndreads != null) return false;
		if (spmrndwritehits != null ? !spmrndwritehits.equals(that.spmrndwritehits) : that.spmrndwritehits != null)
			return false;
		if (spmrndwritemisses != null ? !spmrndwritemisses.equals(that.spmrndwritemisses) : that.spmrndwritemisses != null)
			return false;
		if (spmrndwrites != null ? !spmrndwrites.equals(that.spmrndwrites) : that.spmrndwrites != null) return false;
		if (spmrt != null ? !spmrt.equals(that.spmrt) : that.spmrt != null) return false;
		if (spmrtreadcount != null ? !spmrtreadcount.equals(that.spmrtreadcount) : that.spmrtreadcount != null)
			return false;
		if (spmrtwritecount != null ? !spmrtwritecount.equals(that.spmrtwritecount) : that.spmrtwritecount != null)
			return false;
		if (spmsamprdfwritetime != null ? !spmsamprdfwritetime.equals(that.spmsamprdfwritetime) : that.spmsamprdfwritetime != null)
			return false;
		if (spmsamprdfwritew != null ? !spmsamprdfwritew.equals(that.spmsamprdfwritew) : that.spmsamprdfwritew != null)
			return false;
		if (spmsampreadmtime != null ? !spmsampreadmtime.equals(that.spmsampreadmtime) : that.spmsampreadmtime != null)
			return false;
		if (spmsampreadmw != null ? !spmsampreadmw.equals(that.spmsampreadmw) : that.spmsampreadmw != null)
			return false;
		if (spmsampreadtime != null ? !spmsampreadtime.equals(that.spmsampreadtime) : that.spmsampreadtime != null)
			return false;
		if (spmsampwpdiscs != null ? !spmsampwpdiscs.equals(that.spmsampwpdiscs) : that.spmsampwpdiscs != null)
			return false;
		if (spmsampwpdisctime != null ? !spmsampwpdisctime.equals(that.spmsampwpdisctime) : that.spmsampwpdisctime != null)
			return false;
		if (spmsampwritetime != null ? !spmsampwritetime.equals(that.spmsampwritetime) : that.spmsampwritetime != null)
			return false;
		if (spmseqreadhits != null ? !spmseqreadhits.equals(that.spmseqreadhits) : that.spmseqreadhits != null)
			return false;
		if (spmseqreadmisses != null ? !spmseqreadmisses.equals(that.spmseqreadmisses) : that.spmseqreadmisses != null)
			return false;
		if (spmseqreads != null ? !spmseqreads.equals(that.spmseqreads) : that.spmseqreads != null) return false;
		if (spmseqwritehits != null ? !spmseqwritehits.equals(that.spmseqwritehits) : that.spmseqwritehits != null)
			return false;
		if (spmseqwritemisses != null ? !spmseqwritemisses.equals(that.spmseqwritemisses) : that.spmseqwritemisses != null)
			return false;
		if (spmseqwrites != null ? !spmseqwrites.equals(that.spmseqwrites) : that.spmseqwrites != null) return false;
		if (spmskew != null ? !spmskew.equals(that.spmskew) : that.spmskew != null) return false;
		if (spmsrdfawtcnt != null ? !spmsrdfawtcnt.equals(that.spmsrdfawtcnt) : that.spmsrdfawtcnt != null)
			return false;
		if (spmsrdfawtmb != null ? !spmsrdfawtmb.equals(that.spmsrdfawtmb) : that.spmsrdfawtmb != null) return false;
		if (spmsrdfswtcnt != null ? !spmsrdfswtcnt.equals(that.spmsrdfswtcnt) : that.spmsrdfswtcnt != null)
			return false;
		if (spmsrdfswtmb != null ? !spmsrdfswtmb.equals(that.spmsrdfswtmb) : that.spmsrdfswtmb != null) return false;
		if (spmvfcdeduphits != null ? !spmvfcdeduphits.equals(that.spmvfcdeduphits) : that.spmvfcdeduphits != null)
			return false;
		if (spmvfcdedupreads != null ? !spmvfcdedupreads.equals(that.spmvfcdedupreads) : that.spmvfcdedupreads != null)
			return false;
		if (spmvfcdedupwrites != null ? !spmvfcdedupwrites.equals(that.spmvfcdedupwrites) : that.spmvfcdedupwrites != null)
			return false;
		if (spmvfcios != null ? !spmvfcios.equals(that.spmvfcios) : that.spmvfcios != null) return false;
		if (spmvfcmb != null ? !spmvfcmb.equals(that.spmvfcmb) : that.spmvfcmb != null) return false;
		if (spmvfcmbread != null ? !spmvfcmbread.equals(that.spmvfcmbread) : that.spmvfcmbread != null) return false;
		if (spmvfcmbwritten != null ? !spmvfcmbwritten.equals(that.spmvfcmbwritten) : that.spmvfcmbwritten != null)
			return false;
		if (spmvfcreadhits != null ? !spmvfcreadhits.equals(that.spmvfcreadhits) : that.spmvfcreadhits != null)
			return false;
		if (spmvfcreads != null ? !spmvfcreads.equals(that.spmvfcreads) : that.spmvfcreads != null) return false;
		if (spmvfcreadtime != null ? !spmvfcreadtime.equals(that.spmvfcreadtime) : that.spmvfcreadtime != null)
			return false;
		if (spmvfcrt != null ? !spmvfcrt.equals(that.spmvfcrt) : that.spmvfcrt != null) return false;
		if (spmvfcskippedios != null ? !spmvfcskippedios.equals(that.spmvfcskippedios) : that.spmvfcskippedios != null)
			return false;
		if (spmvfcwreadrt != null ? !spmvfcwreadrt.equals(that.spmvfcwreadrt) : that.spmvfcwreadrt != null)
			return false;
		if (spmvfcwritehits != null ? !spmvfcwritehits.equals(that.spmvfcwritehits) : that.spmvfcwritehits != null)
			return false;
		if (spmvfcwritert != null ? !spmvfcwritert.equals(that.spmvfcwritert) : that.spmvfcwritert != null)
			return false;
		if (spmvfcwrites != null ? !spmvfcwrites.equals(that.spmvfcwrites) : that.spmvfcwrites != null) return false;
		if (spmvfcwritetime != null ? !spmvfcwritetime.equals(that.spmvfcwritetime) : that.spmvfcwritetime != null)
			return false;
		if (spmwlscore != null ? !spmwlscore.equals(that.spmwlscore) : that.spmwlscore != null) return false;
		if (spmwpdisctime != null ? !spmwpdisctime.equals(that.spmwpdisctime) : that.spmwpdisctime != null)
			return false;
		if (spmwritepaceddelay != null ? !spmwritepaceddelay.equals(that.spmwritepaceddelay) : that.spmwritepaceddelay != null)
			return false;
		if (spmwritert != null ? !spmwritert.equals(that.spmwritert) : that.spmwritert != null) return false;
		if (spmwritert6 != null ? !spmwritert6.equals(that.spmwritert6) : that.spmwritert6 != null) return false;
		if (spmwritert7 != null ? !spmwritert7.equals(that.spmwritert7) : that.spmwritert7 != null) return false;
		if (spmwritertcount1 != null ? !spmwritertcount1.equals(that.spmwritertcount1) : that.spmwritertcount1 != null)
			return false;
		if (spmwritertcount2 != null ? !spmwritertcount2.equals(that.spmwritertcount2) : that.spmwritertcount2 != null)
			return false;
		if (spmwritertcount3 != null ? !spmwritertcount3.equals(that.spmwritertcount3) : that.spmwritertcount3 != null)
			return false;
		if (spmwritertcount4 != null ? !spmwritertcount4.equals(that.spmwritertcount4) : that.spmwritertcount4 != null)
			return false;
		if (spmwritertcount5 != null ? !spmwritertcount5.equals(that.spmwritertcount5) : that.spmwritertcount5 != null)
			return false;
		if (spmwritertcount6 != null ? !spmwritertcount6.equals(that.spmwritertcount6) : that.spmwritertcount6 != null)
			return false;
		if (spmwritertcount7 != null ? !spmwritertcount7.equals(that.spmwritertcount7) : that.spmwritertcount7 != null)
			return false;
		if (spmwriterttime6 != null ? !spmwriterttime6.equals(that.spmwriterttime6) : that.spmwriterttime6 != null)
			return false;
		if (spmwriterttime7 != null ? !spmwriterttime7.equals(that.spmwriterttime7) : that.spmwriterttime7 != null)
			return false;
		if (spmwrites != null ? !spmwrites.equals(that.spmwrites) : that.spmwrites != null) return false;
		if (spmwritesivtoc != null ? !spmwritesivtoc.equals(that.spmwritesivtoc) : that.spmwritesivtoc != null)
			return false;
		if (spmwritespending != null ? !spmwritespending.equals(that.spmwritespending) : that.spmwritespending != null)
			return false;
		if (spmwritetime != null ? !spmwritetime.equals(that.spmwritetime) : that.spmwritetime != null) return false;
		if (spmxcdevrank != null ? !spmxcdevrank.equals(that.spmxcdevrank) : that.spmxcdevrank != null) return false;
		if (wlpcopyiomulios != null ? !wlpcopyiomulios.equals(that.wlpcopyiomulios) : that.wlpcopyiomulios != null)
			return false;
		if (wlpcopyiosizemulios != null ? !wlpcopyiosizemulios.equals(that.wlpcopyiosizemulios) : that.wlpcopyiosizemulios != null)
			return false;
		if (wlpiosq != null ? !wlpiosq.equals(that.wlpiosq) : that.wlpiosq != null) return false;
		if (wlpresptimemulios != null ? !wlpresptimemulios.equals(that.wlpresptimemulios) : that.wlpresptimemulios != null)
			return false;
		if (wlpresptimesqmulios != null ? !wlpresptimesqmulios.equals(that.wlpresptimesqmulios) : that.wlpresptimesqmulios != null)
			return false;
		if (wlprmmulios != null ? !wlprmmulios.equals(that.wlprmmulios) : that.wlprmmulios != null) return false;
		if (wlprmmulsizemulios != null ? !wlprmmulsizemulios.equals(that.wlprmmulsizemulios) : that.wlprmmulsizemulios != null)
			return false;
		if (wlprrhmulios != null ? !wlprrhmulios.equals(that.wlprrhmulios) : that.wlprrhmulios != null) return false;
		if (wlprrhmulsizemulios != null ? !wlprrhmulsizemulios.equals(that.wlprrhmulsizemulios) : that.wlprrhmulsizemulios != null)
			return false;
		if (wlprwmulios != null ? !wlprwmulios.equals(that.wlprwmulios) : that.wlprwmulios != null) return false;
		if (wlprwmulsizemulios != null ? !wlprwmulsizemulios.equals(that.wlprwmulsizemulios) : that.wlprwmulsizemulios != null)
			return false;
		if (wlpsrdfambwritemulios != null ? !wlpsrdfambwritemulios.equals(that.wlpsrdfambwritemulios) : that.wlpsrdfambwritemulios != null)
			return false;
		if (wlpsrdfawritemulios != null ? !wlpsrdfawritemulios.equals(that.wlpsrdfawritemulios) : that.wlpsrdfawritemulios != null)
			return false;
		if (wlpsrdfsmbwritemulios != null ? !wlpsrdfsmbwritemulios.equals(that.wlpsrdfsmbwritemulios) : that.wlpsrdfsmbwritemulios != null)
			return false;
		if (wlpsrdfswritemulios != null ? !wlpsrdfswritemulios.equals(that.wlpsrdfswritemulios) : that.wlpsrdfswritemulios != null)
			return false;
		if (wlpsrmulios != null ? !wlpsrmulios.equals(that.wlpsrmulios) : that.wlpsrmulios != null) return false;
		if (wlpsrmulsizemulios != null ? !wlpsrmulsizemulios.equals(that.wlpsrmulsizemulios) : that.wlpsrmulsizemulios != null)
			return false;
		if (wlpswmulios != null ? !wlpswmulios.equals(that.wlpswmulios) : that.wlpswmulios != null) return false;
		if (wlpswmulsizemulios != null ? !wlpswmulsizemulios.equals(that.wlpswmulsizemulios) : that.wlpswmulsizemulios != null)
			return false;
		if (wlpwhmulios != null ? !wlpwhmulios.equals(that.wlpwhmulios) : that.wlpwhmulios != null) return false;
		if (wlpwhmulsizemulios != null ? !wlpwhmulsizemulios.equals(that.wlpwhmulsizemulios) : that.wlpwhmulsizemulios != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = partitionkey;
		result = 31 * result + timekey;
		result = 31 * result + storagegroupkey;
		result = 31 * result + (exclude != null ? exclude.hashCode() : 0);
		result = 31 * result + (spmbembreadrate != null ? spmbembreadrate.hashCode() : 0);
		result = 31 * result + (spmbembwriterate != null ? spmbembwriterate.hashCode() : 0);
		result = 31 * result + (spmbereads != null ? spmbereads.hashCode() : 0);
		result = 31 * result + (spmbewrites != null ? spmbewrites.hashCode() : 0);
		result = 31 * result + (spmmbrate != null ? spmmbrate.hashCode() : 0);
		result = 31 * result + (spmmbreadrate != null ? spmmbreadrate.hashCode() : 0);
		result = 31 * result + (spmmbwriterate != null ? spmmbwriterate.hashCode() : 0);
		result = 31 * result + (spmreads != null ? spmreads.hashCode() : 0);
		result = 31 * result + (spmreadtime != null ? spmreadtime.hashCode() : 0);
		result = 31 * result + (spmrndreadhits != null ? spmrndreadhits.hashCode() : 0);
		result = 31 * result + (spmrndreads != null ? spmrndreads.hashCode() : 0);
		result = 31 * result + (spmrndwritehits != null ? spmrndwritehits.hashCode() : 0);
		result = 31 * result + (spmrndwrites != null ? spmrndwrites.hashCode() : 0);
		result = 31 * result + (spmrtreadcount != null ? spmrtreadcount.hashCode() : 0);
		result = 31 * result + (spmrtwritecount != null ? spmrtwritecount.hashCode() : 0);
		result = 31 * result + (spmseqreadhits != null ? spmseqreadhits.hashCode() : 0);
		result = 31 * result + (spmseqreads != null ? spmseqreads.hashCode() : 0);
		result = 31 * result + (spmseqwritehits != null ? spmseqwritehits.hashCode() : 0);
		result = 31 * result + (spmseqwrites != null ? spmseqwrites.hashCode() : 0);
		result = 31 * result + (spmwrites != null ? spmwrites.hashCode() : 0);
		result = 31 * result + (spmwritespending != null ? spmwritespending.hashCode() : 0);
		result = 31 * result + (spmwritetime != null ? spmwritetime.hashCode() : 0);
		result = 31 * result + (spmrndios != null ? spmrndios.hashCode() : 0);
		result = 31 * result + (spmrndhits != null ? spmrndhits.hashCode() : 0);
		result = 31 * result + (spmdapreftrx != null ? spmdapreftrx.hashCode() : 0);
		result = 31 * result + (spmdapreftrxused != null ? spmdapreftrxused.hashCode() : 0);
		result = 31 * result + (spmdareqtime != null ? spmdareqtime.hashCode() : 0);
		result = 31 * result + (spmdadisktime != null ? spmdadisktime.hashCode() : 0);
		result = 31 * result + (spmdatasktime != null ? spmdatasktime.hashCode() : 0);
		result = 31 * result + (spmmaxwpthres != null ? spmmaxwpthres.hashCode() : 0);
		result = 31 * result + (spmsampreadtime != null ? spmsampreadtime.hashCode() : 0);
		result = 31 * result + (spmsampwritetime != null ? spmsampwritetime.hashCode() : 0);
		result = 31 * result + (spmsampreadmtime != null ? spmsampreadmtime.hashCode() : 0);
		result = 31 * result + (spmsampwpdisctime != null ? spmsampwpdisctime.hashCode() : 0);
		result = 31 * result + (spmsamprdfwritetime != null ? spmsamprdfwritetime.hashCode() : 0);
		result = 31 * result + (spmsampreadmw != null ? spmsampreadmw.hashCode() : 0);
		result = 31 * result + (spmsampwpdiscs != null ? spmsampwpdiscs.hashCode() : 0);
		result = 31 * result + (spmsamprdfwritew != null ? spmsamprdfwritew.hashCode() : 0);
		result = 31 * result + (spmnuminvalidtrx != null ? spmnuminvalidtrx.hashCode() : 0);
		result = 31 * result + (spmm1Invalidtrx != null ? spmm1Invalidtrx.hashCode() : 0);
		result = 31 * result + (spmm2Invalidtrx != null ? spmm2Invalidtrx.hashCode() : 0);
		result = 31 * result + (spmm3Invalidtrx != null ? spmm3Invalidtrx.hashCode() : 0);
		result = 31 * result + (spmm4Invalidtrx != null ? spmm4Invalidtrx.hashCode() : 0);
		result = 31 * result + (spmdablkwrittenvlunmig != null ? spmdablkwrittenvlunmig.hashCode() : 0);
		result = 31 * result + (spmdaparsecwriteblk != null ? spmdaparsecwriteblk.hashCode() : 0);
		result = 31 * result + (spmdaoptwriteblk != null ? spmdaoptwriteblk.hashCode() : 0);
		result = 31 * result + (spmdaxorreads != null ? spmdaxorreads.hashCode() : 0);
		result = 31 * result + (spmdaxorblkread != null ? spmdaxorblkread.hashCode() : 0);
		result = 31 * result + (spmdareadforcopy != null ? spmdareadforcopy.hashCode() : 0);
		result = 31 * result + (spmdablkreadcopy != null ? spmdablkreadcopy.hashCode() : 0);
		result = 31 * result + (spmdawritecopy != null ? spmdawritecopy.hashCode() : 0);
		result = 31 * result + (spmdablkwrittencopy != null ? spmdablkwrittencopy.hashCode() : 0);
		result = 31 * result + (spmdareadvlunmig != null ? spmdareadvlunmig.hashCode() : 0);
		result = 31 * result + (spmdablkreadvlunmig != null ? spmdablkreadvlunmig.hashCode() : 0);
		result = 31 * result + (spmdawritevlunmig != null ? spmdawritevlunmig.hashCode() : 0);
		result = 31 * result + (spmdawriterebuild != null ? spmdawriterebuild.hashCode() : 0);
		result = 31 * result + (spmdablkwrittenrebuild != null ? spmdablkwrittenrebuild.hashCode() : 0);
		result = 31 * result + (spmdardfcopy != null ? spmdardfcopy.hashCode() : 0);
		result = 31 * result + (spmdablkrdfcopy != null ? spmdablkrdfcopy.hashCode() : 0);
		result = 31 * result + (spmdevicecapacity != null ? spmdevicecapacity.hashCode() : 0);
		result = 31 * result + (spmdeviceblocksize != null ? spmdeviceblocksize.hashCode() : 0);
		result = 31 * result + (spmiorate != null ? spmiorate.hashCode() : 0);
		result = 31 * result + (spmbereqs != null ? spmbereqs.hashCode() : 0);
		result = 31 * result + (spmbembrate != null ? spmbembrate.hashCode() : 0);
		result = 31 * result + (spmrt != null ? spmrt.hashCode() : 0);
		result = 31 * result + (spmreadrt != null ? spmreadrt.hashCode() : 0);
		result = 31 * result + (spmwritert != null ? spmwritert.hashCode() : 0);
		result = 31 * result + (spmreadmisstime != null ? spmreadmisstime.hashCode() : 0);
		result = 31 * result + (spmwpdisctime != null ? spmwpdisctime.hashCode() : 0);
		result = 31 * result + (spmrdfwritetime != null ? spmrdfwritetime.hashCode() : 0);
		result = 31 * result + (spmavgbereqtime != null ? spmavgbereqtime.hashCode() : 0);
		result = 31 * result + (spmavgbedisktime != null ? spmavgbedisktime.hashCode() : 0);
		result = 31 * result + (spmavgbetasktime != null ? spmavgbetasktime.hashCode() : 0);
		result = 31 * result + (spmseqreadmisses != null ? spmseqreadmisses.hashCode() : 0);
		result = 31 * result + (spmseqwritemisses != null ? spmseqwritemisses.hashCode() : 0);
		result = 31 * result + (spmrndreadmisses != null ? spmrndreadmisses.hashCode() : 0);
		result = 31 * result + (spmrndwritemisses != null ? spmrndwritemisses.hashCode() : 0);
		result = 31 * result + (spmiodensity != null ? spmiodensity.hashCode() : 0);
		result = 31 * result + (spmdevcount != null ? spmdevcount.hashCode() : 0);
		result = 31 * result + (spmmetacount != null ? spmmetacount.hashCode() : 0);
		result = 31 * result + (spmperhit != null ? spmperhit.hashCode() : 0);
		result = 31 * result + (spmperwrite != null ? spmperwrite.hashCode() : 0);
		result = 31 * result + (spmperreadmiss != null ? spmperreadmiss.hashCode() : 0);
		result = 31 * result + (spmbeperread != null ? spmbeperread.hashCode() : 0);
		result = 31 * result + (spmbeperwrite != null ? spmbeperwrite.hashCode() : 0);
		result = 31 * result + (spmvfcreadhits != null ? spmvfcreadhits.hashCode() : 0);
		result = 31 * result + (spmvfcwritehits != null ? spmvfcwritehits.hashCode() : 0);
		result = 31 * result + (spmvfcreads != null ? spmvfcreads.hashCode() : 0);
		result = 31 * result + (spmvfcwrites != null ? spmvfcwrites.hashCode() : 0);
		result = 31 * result + (spmvfcios != null ? spmvfcios.hashCode() : 0);
		result = 31 * result + (spmpervfcreads != null ? spmpervfcreads.hashCode() : 0);
		result = 31 * result + (spmpervfcreadhits != null ? spmpervfcreadhits.hashCode() : 0);
		result = 31 * result + (spmpervfcwrites != null ? spmpervfcwrites.hashCode() : 0);
		result = 31 * result + (spmvfcskippedios != null ? spmvfcskippedios.hashCode() : 0);
		result = 31 * result + (spmvfcdeduphits != null ? spmvfcdeduphits.hashCode() : 0);
		result = 31 * result + (spmvfcdedupreads != null ? spmvfcdedupreads.hashCode() : 0);
		result = 31 * result + (spmvfcdedupwrites != null ? spmvfcdedupwrites.hashCode() : 0);
		result = 31 * result + (spmvfcmbread != null ? spmvfcmbread.hashCode() : 0);
		result = 31 * result + (spmvfcmbwritten != null ? spmvfcmbwritten.hashCode() : 0);
		result = 31 * result + (spmvfcmb != null ? spmvfcmb.hashCode() : 0);
		result = 31 * result + (spmvfcreadtime != null ? spmvfcreadtime.hashCode() : 0);
		result = 31 * result + (spmvfcwritetime != null ? spmvfcwritetime.hashCode() : 0);
		result = 31 * result + (spmvfcwreadrt != null ? spmvfcwreadrt.hashCode() : 0);
		result = 31 * result + (spmvfcwritert != null ? spmvfcwritert.hashCode() : 0);
		result = 31 * result + (spmvfcrt != null ? spmvfcrt.hashCode() : 0);
		result = 31 * result + (spmcrmreads != null ? spmcrmreads.hashCode() : 0);
		result = 31 * result + (spmcrmmbread != null ? spmcrmmbread.hashCode() : 0);
		result = 31 * result + (spmcrmavgreadsize != null ? spmcrmavgreadsize.hashCode() : 0);
		result = 31 * result + (spmavgreadsize != null ? spmavgreadsize.hashCode() : 0);
		result = 31 * result + (spmavgwritesize != null ? spmavgwritesize.hashCode() : 0);
		result = 31 * result + (spmavgiosize != null ? spmavgiosize.hashCode() : 0);
		result = 31 * result + (spmfewlscore != null ? spmfewlscore.hashCode() : 0);
		result = 31 * result + (spmbewlscore != null ? spmbewlscore.hashCode() : 0);
		result = 31 * result + (spmdskwlscore != null ? spmdskwlscore.hashCode() : 0);
		result = 31 * result + (spmwlscore != null ? spmwlscore.hashCode() : 0);
		result = 31 * result + (spmwritepaceddelay != null ? spmwritepaceddelay.hashCode() : 0);
		result = 31 * result + (spmavgwritepaceddelay != null ? spmavgwritepaceddelay.hashCode() : 0);
		result = 31 * result + (spmparitygenreads != null ? spmparitygenreads.hashCode() : 0);
		result = 31 * result + (spmparitygenblkread != null ? spmparitygenblkread.hashCode() : 0);
		result = 31 * result + (spmdareadrebuild != null ? spmdareadrebuild.hashCode() : 0);
		result = 31 * result + (spmdablkreadrebuild != null ? spmdablkreadrebuild.hashCode() : 0);
		result = 31 * result + (spmwritesivtoc != null ? spmwritesivtoc.hashCode() : 0);
		result = 31 * result + (spmblkswrittenivtoc != null ? spmblkswrittenivtoc.hashCode() : 0);
		result = 31 * result + (spmpreftrxmb != null ? spmpreftrxmb.hashCode() : 0);
		result = 31 * result + (spmrdfreads != null ? spmrdfreads.hashCode() : 0);
		result = 31 * result + (spmrdfwrites != null ? spmrdfwrites.hashCode() : 0);
		result = 31 * result + (spmrdfmbread != null ? spmrdfmbread.hashCode() : 0);
		result = 31 * result + (spmrdfmbwritten != null ? spmrdfmbwritten.hashCode() : 0);
		result = 31 * result + (spmrdfreadhits != null ? spmrdfreadhits.hashCode() : 0);
		result = 31 * result + (spmrdfrewrites != null ? spmrdfrewrites.hashCode() : 0);
		result = 31 * result + (spmrdfacioservtime != null ? spmrdfacioservtime.hashCode() : 0);
		result = 31 * result + (spmrdfioservtimelong != null ? spmrdfioservtimelong.hashCode() : 0);
		result = 31 * result + (spmrdfioservtimeshort != null ? spmrdfioservtimeshort.hashCode() : 0);
		result = 31 * result + (spmrdfmaxioservtime != null ? spmrdfmaxioservtime.hashCode() : 0);
		result = 31 * result + (spmrdfminioservtime != null ? spmrdfminioservtime.hashCode() : 0);
		result = 31 * result + (spmxcdevrank != null ? spmxcdevrank.hashCode() : 0);
		result = 31 * result + (spmalertinfo != null ? spmalertinfo.hashCode() : 0);
		result = 31 * result + (spmalertwarn != null ? spmalertwarn.hashCode() : 0);
		result = 31 * result + (spmalertcrit != null ? spmalertcrit.hashCode() : 0);
		result = 31 * result + (spmlimitexceed != null ? spmlimitexceed.hashCode() : 0);
		result = 31 * result + (spmqmbrate != null ? spmqmbrate.hashCode() : 0);
		result = 31 * result + (spmsrdfswtcnt != null ? spmsrdfswtcnt.hashCode() : 0);
		result = 31 * result + (spmsrdfswtmb != null ? spmsrdfswtmb.hashCode() : 0);
		result = 31 * result + (spmsrdfawtcnt != null ? spmsrdfawtcnt.hashCode() : 0);
		result = 31 * result + (spmsrdfawtmb != null ? spmsrdfawtmb.hashCode() : 0);
		result = 31 * result + (spmallocatedtracks != null ? spmallocatedtracks.hashCode() : 0);
		result = 31 * result + (spmcompressedtracks != null ? spmcompressedtracks.hashCode() : 0);
		result = 31 * result + (spmpercomptracks != null ? spmpercomptracks.hashCode() : 0);
		result = 31 * result + (spmqiorate != null ? spmqiorate.hashCode() : 0);
		result = 31 * result + (spmqdlyios != null ? spmqdlyios.hashCode() : 0);
		result = 31 * result + (spmqdlytime != null ? spmqdlytime.hashCode() : 0);
		result = 31 * result + (spmqperdlyios != null ? spmqperdlyios.hashCode() : 0);
		result = 31 * result + (spmqavgdlytime != null ? spmqavgdlytime.hashCode() : 0);
		result = 31 * result + (spmallocdevicecapacity != null ? spmallocdevicecapacity.hashCode() : 0);
		result = 31 * result + (spmpertimeexceed != null ? spmpertimeexceed.hashCode() : 0);
		result = 31 * result + (spmrdfresponsetime != null ? spmrdfresponsetime.hashCode() : 0);
		result = 31 * result + (wlprrhmulios != null ? wlprrhmulios.hashCode() : 0);
		result = 31 * result + (wlpsrmulios != null ? wlpsrmulios.hashCode() : 0);
		result = 31 * result + (wlprmmulios != null ? wlprmmulios.hashCode() : 0);
		result = 31 * result + (wlprwmulios != null ? wlprwmulios.hashCode() : 0);
		result = 31 * result + (wlpswmulios != null ? wlpswmulios.hashCode() : 0);
		result = 31 * result + (wlpwhmulios != null ? wlpwhmulios.hashCode() : 0);
		result = 31 * result + (wlpcopyiomulios != null ? wlpcopyiomulios.hashCode() : 0);
		result = 31 * result + (wlpsrdfswritemulios != null ? wlpsrdfswritemulios.hashCode() : 0);
		result = 31 * result + (wlpsrdfawritemulios != null ? wlpsrdfawritemulios.hashCode() : 0);
		result = 31 * result + (wlprrhmulsizemulios != null ? wlprrhmulsizemulios.hashCode() : 0);
		result = 31 * result + (wlpsrmulsizemulios != null ? wlpsrmulsizemulios.hashCode() : 0);
		result = 31 * result + (wlprmmulsizemulios != null ? wlprmmulsizemulios.hashCode() : 0);
		result = 31 * result + (wlprwmulsizemulios != null ? wlprwmulsizemulios.hashCode() : 0);
		result = 31 * result + (wlpswmulsizemulios != null ? wlpswmulsizemulios.hashCode() : 0);
		result = 31 * result + (wlpwhmulsizemulios != null ? wlpwhmulsizemulios.hashCode() : 0);
		result = 31 * result + (wlpcopyiosizemulios != null ? wlpcopyiosizemulios.hashCode() : 0);
		result = 31 * result + (wlpsrdfsmbwritemulios != null ? wlpsrdfsmbwritemulios.hashCode() : 0);
		result = 31 * result + (wlpsrdfambwritemulios != null ? wlpsrdfambwritemulios.hashCode() : 0);
		result = 31 * result + (wlpiosq != null ? wlpiosq.hashCode() : 0);
		result = 31 * result + (wlpresptimemulios != null ? wlpresptimemulios.hashCode() : 0);
		result = 31 * result + (wlpresptimesqmulios != null ? wlpresptimesqmulios.hashCode() : 0);
		result = 31 * result + (spmlocalreptracks != null ? spmlocalreptracks.hashCode() : 0);
		result = 31 * result + (spmreadrtcount1 != null ? spmreadrtcount1.hashCode() : 0);
		result = 31 * result + (spmreadrtcount2 != null ? spmreadrtcount2.hashCode() : 0);
		result = 31 * result + (spmreadrtcount3 != null ? spmreadrtcount3.hashCode() : 0);
		result = 31 * result + (spmreadrtcount4 != null ? spmreadrtcount4.hashCode() : 0);
		result = 31 * result + (spmreadrtcount5 != null ? spmreadrtcount5.hashCode() : 0);
		result = 31 * result + (spmreadrtcount6 != null ? spmreadrtcount6.hashCode() : 0);
		result = 31 * result + (spmreadrtcount7 != null ? spmreadrtcount7.hashCode() : 0);
		result = 31 * result + (spmreadrttime6 != null ? spmreadrttime6.hashCode() : 0);
		result = 31 * result + (spmreadrttime7 != null ? spmreadrttime7.hashCode() : 0);
		result = 31 * result + (spmwritertcount1 != null ? spmwritertcount1.hashCode() : 0);
		result = 31 * result + (spmwritertcount2 != null ? spmwritertcount2.hashCode() : 0);
		result = 31 * result + (spmwritertcount3 != null ? spmwritertcount3.hashCode() : 0);
		result = 31 * result + (spmwritertcount4 != null ? spmwritertcount4.hashCode() : 0);
		result = 31 * result + (spmwritertcount5 != null ? spmwritertcount5.hashCode() : 0);
		result = 31 * result + (spmwritertcount6 != null ? spmwritertcount6.hashCode() : 0);
		result = 31 * result + (spmwritertcount7 != null ? spmwritertcount7.hashCode() : 0);
		result = 31 * result + (spmwriterttime6 != null ? spmwriterttime6.hashCode() : 0);
		result = 31 * result + (spmwriterttime7 != null ? spmwriterttime7.hashCode() : 0);
		result = 31 * result + (spmreadrt6 != null ? spmreadrt6.hashCode() : 0);
		result = 31 * result + (spmreadrt7 != null ? spmreadrt7.hashCode() : 0);
		result = 31 * result + (spmwritert6 != null ? spmwritert6.hashCode() : 0);
		result = 31 * result + (spmwritert7 != null ? spmwritert7.hashCode() : 0);
		result = 31 * result + (spmskew != null ? spmskew.hashCode() : 0);
		return result;
	}
}
