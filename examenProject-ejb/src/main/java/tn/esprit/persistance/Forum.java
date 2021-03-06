package tn.esprit.persistance;
// Generated 19 nov. 2016 13:17:14 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Forum generated by hbm2java
 */
@Entity
@Table(name = "forum", catalog = "troc")
public class Forum implements java.io.Serializable {

	private Integer idForum;
	private Swapper swapper;
	private String subject;
	private Date date;
	private int note;
	private String category;
	
	private List<Comments> commentses;
	private List<ForumClaim> forumsclaims;
	private static final long serialVersionUID = 1L;

	public Forum() {
	}

	public Forum(Swapper swapper, Date date, int note) {
		this.swapper = swapper;
		this.date = date;
		this.note = note;
	}

	public Forum(Swapper swapper, String subject, Date date, int note, String category, Set<Comments> commentses) {
		this.swapper = swapper;
		this.subject = subject;
		this.date = date;
		this.note = note;
		this.category = category;
		
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_forum", unique = true, nullable = false)
	public Integer getIdForum() {
		return this.idForum;
	}

	public void setIdForum(Integer idForum) {
		this.idForum = idForum;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "swapperID", nullable = false)
	public Swapper getSwapper() {
		return this.swapper;
	}

	public void setSwapper(Swapper swapper) {
		this.swapper = swapper;
	}

	@Column(name = "subject")
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "note", nullable = false)
	public int getNote() {
		return this.note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	@Column(name = "category")
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "forum",cascade=CascadeType.REMOVE,orphanRemoval = true)
	public List<Comments> getCommentses() {
		return this.commentses;
	}
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "forum",cascade=CascadeType.REMOVE,orphanRemoval = true)
	public List<ForumClaim> getForumsclaims() {
		return forumsclaims;
	}

	public void setForumsclaims(List<ForumClaim> forumsclaims) {
		this.forumsclaims = forumsclaims;
	}

	public void setCommentses(List<Comments> commentses) {
		this.commentses = commentses;
	}

	

	
	
}
