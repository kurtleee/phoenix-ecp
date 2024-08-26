package com.uniview.shipping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 收货地址表
 * @TableName shipping_address
 */
@TableName(value ="shipping_address")
@Data
public class ShippingAddress implements Serializable {
    /**
     * 地址ID
     */
    @TableId(type = IdType.AUTO)
    private Long addressId;

    /**
     * 关联的订单ID
     */
    private Long orderId;

    /**
     * 收件人姓名
     */
    private String recipientName;

    /**
     * 收货地址
     */
    private String shippingAddress;

    /**
     * 城市
     */
    private String city;

    /**
     * 邮政编码
     */
    private String postalCode;

    /**
     * 收货联系电话
     */
    private String contactPhone;

    /**
     * 地址记录创建时间
     */
    private Date createdAt;

    /**
     * 地址记录更新时间
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
        ShippingAddress other = (ShippingAddress) that;
        return (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getRecipientName() == null ? other.getRecipientName() == null : this.getRecipientName().equals(other.getRecipientName()))
            && (this.getShippingAddress() == null ? other.getShippingAddress() == null : this.getShippingAddress().equals(other.getShippingAddress()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getPostalCode() == null ? other.getPostalCode() == null : this.getPostalCode().equals(other.getPostalCode()))
            && (this.getContactPhone() == null ? other.getContactPhone() == null : this.getContactPhone().equals(other.getContactPhone()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getRecipientName() == null) ? 0 : getRecipientName().hashCode());
        result = prime * result + ((getShippingAddress() == null) ? 0 : getShippingAddress().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        result = prime * result + ((getContactPhone() == null) ? 0 : getContactPhone().hashCode());
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
        sb.append(", addressId=").append(addressId);
        sb.append(", orderId=").append(orderId);
        sb.append(", recipientName=").append(recipientName);
        sb.append(", shippingAddress=").append(shippingAddress);
        sb.append(", city=").append(city);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", contactPhone=").append(contactPhone);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}