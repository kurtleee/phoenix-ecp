package com.uniview.shipping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 发货表
 * @TableName shipment
 */
@TableName(value ="shipment")
@Data
public class Shipment implements Serializable {
    /**
     * 发货ID
     */
    @TableId(type = IdType.AUTO)
    private Long shipmentId;

    /**
     * 关联的订单ID
     */
    private Long orderId;

    /**
     * 发货日期
     */
    private Date shipmentDate;

    /**
     * 物流公司
     */
    private String carrier;

    /**
     * 物流追踪号
     */
    private String trackingNumber;

    /**
     * 发货状态 (shipped, in_transit, delivered)
     */
    private String status;

    /**
     * 运输费用
     */
    private BigDecimal shippingCost;

    /**
     * 发货记录创建时间
     */
    private Date createdAt;

    /**
     * 发货记录更新时间
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
        Shipment other = (Shipment) that;
        return (this.getShipmentId() == null ? other.getShipmentId() == null : this.getShipmentId().equals(other.getShipmentId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getShipmentDate() == null ? other.getShipmentDate() == null : this.getShipmentDate().equals(other.getShipmentDate()))
            && (this.getCarrier() == null ? other.getCarrier() == null : this.getCarrier().equals(other.getCarrier()))
            && (this.getTrackingNumber() == null ? other.getTrackingNumber() == null : this.getTrackingNumber().equals(other.getTrackingNumber()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getShippingCost() == null ? other.getShippingCost() == null : this.getShippingCost().equals(other.getShippingCost()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShipmentId() == null) ? 0 : getShipmentId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getShipmentDate() == null) ? 0 : getShipmentDate().hashCode());
        result = prime * result + ((getCarrier() == null) ? 0 : getCarrier().hashCode());
        result = prime * result + ((getTrackingNumber() == null) ? 0 : getTrackingNumber().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getShippingCost() == null) ? 0 : getShippingCost().hashCode());
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
        sb.append(", shipmentId=").append(shipmentId);
        sb.append(", orderId=").append(orderId);
        sb.append(", shipmentDate=").append(shipmentDate);
        sb.append(", carrier=").append(carrier);
        sb.append(", trackingNumber=").append(trackingNumber);
        sb.append(", status=").append(status);
        sb.append(", shippingCost=").append(shippingCost);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}