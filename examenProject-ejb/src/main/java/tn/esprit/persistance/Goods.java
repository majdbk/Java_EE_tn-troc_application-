package tn.esprit.persistance;
// Generated 19 nov. 2016 13:17:14 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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
 * Goods generated by hbm2java
 */
@Entity
@Table(name = "goods", catalog = "troc")
public class Goods implements java.io.Serializable {

	private Integer idGoods;
	private Subcategory subcategory;
	private Swapper swapper;
	private String brand;
	private String description;
	private Date date;
	private int validity;
	private int quantity;
	private String label;
	private int accepted;
	private String imgPath;
	private String image;
	private int score;
	private Set<Exchange> exchangesForIdgooddemande = new HashSet<Exchange>(0);
	private Set<Exchange> exchangesForIdgoodOffre = new HashSet<Exchange>(0);
	private static final long serialVersionUID = 1L;

	public Goods() {
	}

	public Goods(Subcategory subcategory, Swapper swapper, Date date, int validity, int quantity, int accepted,
			int score) {
		this.subcategory = subcategory;
		this.swapper = swapper;
		this.date = date;
		this.validity = validity;
		this.quantity = quantity;
		this.accepted = accepted;
		this.score = score;
	}

	public Goods(Subcategory subcategory, Swapper swapper, String brand, String description, Date date, int validity,
			int quantity, String label, int accepted, String imgPath, String image, int score,
			Set<Exchange> exchangesForIdgooddemande, Set<Exchange> exchangesForIdgoodOffre) {
		this.subcategory = subcategory;
		this.swapper = swapper;
		this.brand = brand;
		this.description = description;
		this.date = date;
		this.validity = validity;
		this.quantity = quantity;
		this.label = label;
		this.accepted = accepted;
		this.imgPath = imgPath;
		this.image = image;
		this.score = score;
		this.exchangesForIdgooddemande = exchangesForIdgooddemande;
		this.exchangesForIdgoodOffre = exchangesForIdgoodOffre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_goods", unique = true, nullable = false)
	public Integer getIdGoods() {
		return this.idGoods;
	}

	public void setIdGoods(Integer idGoods) {
		this.idGoods = idGoods;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subCategoryID", nullable = false)
	public Subcategory getSubcategory() {
		return this.subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "swapperID", nullable = false)
	public Swapper getSwapper() {
		return this.swapper;
	}

	public void setSwapper(Swapper swapper) {
		this.swapper = swapper;
	}

	@Column(name = "brand")
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	@Column(name = "validity", nullable = false)
	public int getValidity() {
		return this.validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "label")
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Column(name = "accepted", nullable = false)
	public int getAccepted() {
		return this.accepted;
	}

	public void setAccepted(int accepted) {
		this.accepted = accepted;
	}

	@Column(name = "imgPath")
	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Column(name = "image")
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "score", nullable = false)
	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goodsByIdgooddemande")
	public Set<Exchange> getExchangesForIdgooddemande() {
		return this.exchangesForIdgooddemande;
	}

	public void setExchangesForIdgooddemande(Set<Exchange> exchangesForIdgooddemande) {
		this.exchangesForIdgooddemande = exchangesForIdgooddemande;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "goodsByIdgoodOffre")
	public Set<Exchange> getExchangesForIdgoodOffre() {
		return this.exchangesForIdgoodOffre;
	}

	public void setExchangesForIdgoodOffre(Set<Exchange> exchangesForIdgoodOffre) {
		this.exchangesForIdgoodOffre = exchangesForIdgoodOffre;
	}

}
