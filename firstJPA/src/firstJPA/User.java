package firstJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the USERS database table.
 * 
 */
@Entity
@Table(name="USERS")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCESS_")
	private BigDecimal access;

	private String book;

	private BigDecimal demo;

	private String fullname;

	@Temporal(TemporalType.DATE)
	private Date lastaction;

	private String lastsection;

	private BigDecimal loggedin;

	private String passmd5;

	private String remoteip;

	private String settings;

	@Column(name="\"TIMEOUT\"")
	private BigDecimal timeout;

	private String username;

	private BigDecimal usernum;

	private BigDecimal usersection;

	public User() {
	}

	public BigDecimal getAccess() {
		return this.access;
	}

	public void setAccess(BigDecimal access) {
		this.access = access;
	}

	public String getBook() {
		return this.book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public BigDecimal getDemo() {
		return this.demo;
	}

	public void setDemo(BigDecimal demo) {
		this.demo = demo;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getLastaction() {
		return this.lastaction;
	}

	public void setLastaction(Date lastaction) {
		this.lastaction = lastaction;
	}

	public String getLastsection() {
		return this.lastsection;
	}

	public void setLastsection(String lastsection) {
		this.lastsection = lastsection;
	}

	public BigDecimal getLoggedin() {
		return this.loggedin;
	}

	public void setLoggedin(BigDecimal loggedin) {
		this.loggedin = loggedin;
	}

	public String getPassmd5() {
		return this.passmd5;
	}

	public void setPassmd5(String passmd5) {
		this.passmd5 = passmd5;
	}

	public String getRemoteip() {
		return this.remoteip;
	}

	public void setRemoteip(String remoteip) {
		this.remoteip = remoteip;
	}

	public String getSettings() {
		return this.settings;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

	public BigDecimal getTimeout() {
		return this.timeout;
	}

	public void setTimeout(BigDecimal timeout) {
		this.timeout = timeout;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public BigDecimal getUsernum() {
		return this.usernum;
	}

	public void setUsernum(BigDecimal usernum) {
		this.usernum = usernum;
	}

	public BigDecimal getUsersection() {
		return this.usersection;
	}

	public void setUsersection(BigDecimal usersection) {
		this.usersection = usersection;
	}

}