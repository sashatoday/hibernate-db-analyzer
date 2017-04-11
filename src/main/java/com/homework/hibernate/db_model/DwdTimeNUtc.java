package com.homework.hibernate.db_model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Sasha on 08.04.17.
 */
@Entity
@Table(name = "dwd_time_n_utc", schema = "public", catalog = "q1")
public class DwdTimeNUtc {
	private int timekey;
	private Timestamp createdate;
	private Timestamp datestamp;
	private short theyear;
	private short month;
	private short weekinyear;
	private short dayofmonth;
	private short dayofweek;
	private short hourofday;
	private short minuteofhour;

	@Id
	@Column(name = "timekey")
	public int getTimekey() {
		return timekey;
	}

	public void setTimekey(int timekey) {
		this.timekey = timekey;
	}

	@Basic
	@Column(name = "createdate")
	public Timestamp getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	@Basic
	@Column(name = "datestamp")
	public Timestamp getDatestamp() {
		return datestamp;
	}

	public void setDatestamp(Timestamp datestamp) {
		this.datestamp = datestamp;
	}

	@Basic
	@Column(name = "theyear")
	public short getTheyear() {
		return theyear;
	}

	public void setTheyear(short theyear) {
		this.theyear = theyear;
	}

	@Basic
	@Column(name = "month")
	public short getMonth() {
		return month;
	}

	public void setMonth(short month) {
		this.month = month;
	}

	@Basic
	@Column(name = "weekinyear")
	public short getWeekinyear() {
		return weekinyear;
	}

	public void setWeekinyear(short weekinyear) {
		this.weekinyear = weekinyear;
	}

	@Basic
	@Column(name = "dayofmonth")
	public short getDayofmonth() {
		return dayofmonth;
	}

	public void setDayofmonth(short dayofmonth) {
		this.dayofmonth = dayofmonth;
	}

	@Basic
	@Column(name = "dayofweek")
	public short getDayofweek() {
		return dayofweek;
	}

	public void setDayofweek(short dayofweek) {
		this.dayofweek = dayofweek;
	}

	@Basic
	@Column(name = "hourofday")
	public short getHourofday() {
		return hourofday;
	}

	public void setHourofday(short hourofday) {
		this.hourofday = hourofday;
	}

	@Basic
	@Column(name = "minuteofhour")
	public short getMinuteofhour() {
		return minuteofhour;
	}

	public void setMinuteofhour(short minuteofhour) {
		this.minuteofhour = minuteofhour;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DwdTimeNUtc that = (DwdTimeNUtc) o;

		if (dayofmonth != that.dayofmonth) return false;
		if (dayofweek != that.dayofweek) return false;
		if (hourofday != that.hourofday) return false;
		if (minuteofhour != that.minuteofhour) return false;
		if (month != that.month) return false;
		if (theyear != that.theyear) return false;
		if (timekey != that.timekey) return false;
		if (weekinyear != that.weekinyear) return false;
		if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
		if (datestamp != null ? !datestamp.equals(that.datestamp) : that.datestamp != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = timekey;
		result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
		result = 31 * result + (datestamp != null ? datestamp.hashCode() : 0);
		result = 31 * result + (int) theyear;
		result = 31 * result + (int) month;
		result = 31 * result + (int) weekinyear;
		result = 31 * result + (int) dayofmonth;
		result = 31 * result + (int) dayofweek;
		result = 31 * result + (int) hourofday;
		result = 31 * result + (int) minuteofhour;
		return result;
	}
}
