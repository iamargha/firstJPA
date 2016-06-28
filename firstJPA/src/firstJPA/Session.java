package firstJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SESSIONS database table.
 * 
 */
@Entity
@Table(name="SESSIONS")
@NamedQuery(name="Session.findAll", query="SELECT s FROM Session s")
public class Session implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCESS_")
	private BigDecimal access;

	@Lob
	@Column(name="\"DATA\"")
	private String data;

	private String id;

	public Session() {
	}

	public BigDecimal getAccess() {
		return this.access;
	}

	public void setAccess(BigDecimal access) {
		this.access = access;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

}