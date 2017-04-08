package db_model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Sasha on 08.04.17.
 */
@Entity
@Table(name = "dwd_fedirector", schema = "public", catalog = "q1")
public class DwdFedirector {
	private int fedirectorkey;
	private Timestamp createdate;
	private String fedirectorid;
	private Integer importkey;

	@Id
	@Column(name = "fedirectorkey")
	public int getFedirectorkey() {
		return fedirectorkey;
	}

	public void setFedirectorkey(int fedirectorkey) {
		this.fedirectorkey = fedirectorkey;
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
	@Column(name = "fedirectorid")
	public String getFedirectorid() {
		return fedirectorid;
	}

	public void setFedirectorid(String fedirectorid) {
		this.fedirectorid = fedirectorid;
	}

	@Basic
	@Column(name = "importkey")
	public Integer getImportkey() {
		return importkey;
	}

	public void setImportkey(Integer importkey) {
		this.importkey = importkey;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DwdFedirector that = (DwdFedirector) o;

		if (fedirectorkey != that.fedirectorkey) return false;
		if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
		if (fedirectorid != null ? !fedirectorid.equals(that.fedirectorid) : that.fedirectorid != null) return false;
		if (importkey != null ? !importkey.equals(that.importkey) : that.importkey != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = fedirectorkey;
		result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
		result = 31 * result + (fedirectorid != null ? fedirectorid.hashCode() : 0);
		result = 31 * result + (importkey != null ? importkey.hashCode() : 0);
		return result;
	}
}
