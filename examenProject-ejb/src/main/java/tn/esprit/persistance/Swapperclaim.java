package tn.esprit.persistance;
// Generated 19 nov. 2016 13:17:14 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Swapperclaim generated by hbm2java
 */
@Entity
@Table(name = "swapperclaim", catalog = "troc")
public class Swapperclaim implements java.io.Serializable {

	private Integer idSwapperclaim;
	private Swapper swapperBySwapperrecId;
	private Swapper swapperBySwappersurId;
	private String cause;
	private String description;
	private Date date;
	private String status;
	private static final long serialVersionUID = 1L;

	public Swapperclaim() {
	}

	public Swapperclaim(Swapper swapperBySwapperrecId, Swapper swapperBySwappersurId, Date date) {
		this.swapperBySwapperrecId = swapperBySwapperrecId;
		this.swapperBySwappersurId = swapperBySwappersurId;
		this.date = date;
	}

	public Swapperclaim(Swapper swapperBySwapperrecId, Swapper swapperBySwappersurId, String cause, String description,
			Date date, String status) {
		this.swapperBySwapperrecId = swapperBySwapperrecId;
		this.swapperBySwappersurId = swapperBySwappersurId;
		this.cause = cause;
		this.description = description;
		this.date = date;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_swapperclaim", unique = true, nullable = false)
	public Integer getIdSwapperclaim() {
		return this.idSwapperclaim;
	}

	public void setIdSwapperclaim(Integer idSwapperclaim) {
		this.idSwapperclaim = idSwapperclaim;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "swapperrecID", nullable = false)
	public Swapper getSwapperBySwapperrecId() {
		return this.swapperBySwapperrecId;
	}

	public void setSwapperBySwapperrecId(Swapper swapperBySwapperrecId) {
		this.swapperBySwapperrecId = swapperBySwapperrecId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "swappersurID", nullable = false)
	public Swapper getSwapperBySwappersurId() {
		return this.swapperBySwappersurId;
	}

	public void setSwapperBySwappersurId(Swapper swapperBySwappersurId) {
		this.swapperBySwappersurId = swapperBySwappersurId;
	}

	@Column(name = "cause")
	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
