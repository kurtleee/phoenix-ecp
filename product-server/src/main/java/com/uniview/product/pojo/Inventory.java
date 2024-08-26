package com.uniview.product.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存表
 * @TableName inventory
 */
@TableName(value ="inventory")
@Data
public class Inventory implements Serializable {
    /**
     * 库存ID
     */
    @TableId(type = IdType.AUTO)
    private Long inventoryId;

    /**
     * 关联的产品ID
     */
    private Long productId;

    /**
     * 库存位置
     */
    private String location;

    /**
     * 库存数量
     */
    private Integer quantity;

    /**
     * 批次号
     */
    private String batchNumber;

    /**
     * 到期日期
     */
    private Date expirationDate;

    /**
     * 库存记录创建时间
     */
    private Date createdAt;

    /**
     * 库存记录更新时间
     */
    private Date updatedAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Inventory other = (Inventory) that;
        return (this.getInventoryId() == null ? other.getInventoryId() == null : this.getInventoryId().equals(other.getInventoryId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getBatchNumber() == null ? other.getBatchNumber() == null : this.getBatchNumber().equals(other.getBatchNumber()))
            && (this.getExpirationDate() == null ? other.getExpirationDate() == null : this.getExpirationDate().equals(other.getExpirationDate()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInventoryId() == null) ? 0 : getInventoryId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getBatchNumber() == null) ? 0 : getBatchNumber().hashCode());
        result = prime * result + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inventoryId=").append(inventoryId);
        sb.append(", productId=").append(productId);
        sb.append(", location=").append(location);
        sb.append(", quantity=").append(quantity);
        sb.append(", batchNumber=").append(batchNumber);
        sb.append(", expirationDate=").append(expirationDate);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}