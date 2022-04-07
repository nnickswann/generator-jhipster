package com.mycompany.myapp.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.UUID;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

/**
 * quantity можеть быть Integer, в зависимости от задачи
 */
@Schema(description = "quantity можеть быть Integer, в зависимости от задачи")
@Entity
@Table(name = "orders")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Type(type = "uuid-char")
    @Column(name = "id", length = 36)
    private UUID id;

    @Type(type = "uuid-char")
    @Column(name = "user_id", length = 36)
    private UUID userId;

    @Type(type = "uuid-char")
    @Column(name = "product_id", length = 36)
    private UUID productId;

    @Column(name = "total")
    private Double total;

    @Column(name = "quantity")
    private Double quantity;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public UUID getId() {
        return this.id;
    }

    public Orders id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return this.userId;
    }

    public Orders userId(UUID userId) {
        this.setUserId(userId);
        return this;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getProductId() {
        return this.productId;
    }

    public Orders productId(UUID productId) {
        this.setProductId(productId);
        return this;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public Double getTotal() {
        return this.total;
    }

    public Orders total(Double total) {
        this.setTotal(total);
        return this;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public Orders quantity(Double quantity) {
        this.setQuantity(quantity);
        return this;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Orders)) {
            return false;
        }
        return id != null && id.equals(((Orders) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Orders{" +
            "id=" + getId() +
            ", userId='" + getUserId() + "'" +
            ", productId='" + getProductId() + "'" +
            ", total=" + getTotal() +
            ", quantity=" + getQuantity() +
            "}";
    }
}
