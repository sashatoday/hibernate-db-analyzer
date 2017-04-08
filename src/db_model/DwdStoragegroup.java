package db_model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Sasha on 08.04.17.
 */
@Entity
@Table(name = "dwd_storagegroup", schema = "public", catalog = "q1")
public class DwdStoragegroup {
	private int storagegroupkey;
	private Timestamp createdate;
	private String storagegroupid;
	private Integer importkey;

	@Id
	@Column(name = "storagegroupkey")
	public int getStoragegroupkey() {
		return storagegroupkey;
	}

	public void setStoragegroupkey(int storagegroupkey) {
		this.storagegroupkey = storagegroupkey;
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
	@Column(name = "storagegroupid")
	public String getStoragegroupid() {
		return storagegroupid;
	}

	public void setStoragegroupid(String storagegroupid) {
		this.storagegroupid = storagegroupid;
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

		DwdStoragegroup that = (DwdStoragegroup) o;

		if (storagegroupkey != that.storagegroupkey) return false;
		if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
		if (importkey != null ? !importkey.equals(that.importkey) : that.importkey != null) return false;
		if (storagegroupid != null ? !storagegroupid.equals(that.storagegroupid) : that.storagegroupid != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = storagegroupkey;
		result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
		result = 31 * result + (storagegroupid != null ? storagegroupid.hashCode() : 0);
		result = 31 * result + (importkey != null ? importkey.hashCode() : 0);
		return result;
	}
}
