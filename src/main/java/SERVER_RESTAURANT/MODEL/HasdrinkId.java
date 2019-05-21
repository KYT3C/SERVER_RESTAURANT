package SERVER_RESTAURANT.MODEL;
// Generated 21-may-2019 12:53:03 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HasdrinkId generated by hbm2java
 */
@Embeddable
public class HasdrinkId implements java.io.Serializable {

	private int idTicket;
	private int idItemDrink;

	public HasdrinkId() {
	}

	public HasdrinkId(int idTicket, int idItemDrink) {
		this.idTicket = idTicket;
		this.idItemDrink = idItemDrink;
	}

	@Column(name = "id_ticket", nullable = false)
	public int getIdTicket() {
		return this.idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	@Column(name = "id_item_drink", nullable = false)
	public int getIdItemDrink() {
		return this.idItemDrink;
	}

	public void setIdItemDrink(int idItemDrink) {
		this.idItemDrink = idItemDrink;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HasdrinkId))
			return false;
		HasdrinkId castOther = (HasdrinkId) other;

		return (this.getIdTicket() == castOther.getIdTicket()) && (this.getIdItemDrink() == castOther.getIdItemDrink());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdTicket();
		result = 37 * result + this.getIdItemDrink();
		return result;
	}

}
