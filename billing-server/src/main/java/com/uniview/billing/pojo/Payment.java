package com.uniview.billing.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 支付表
 * @TableName payment
 */
@TableName(value ="payment")
@Data
public class Payment implements Serializable {
    /**
     * 支付ID
     */
    @TableId(type = IdType.AUTO)
    private Long paymentId;

    /**
     * 关联的发票ID
     */
    private Long invoiceId;

    /**
     * 支付日期
     */
    private Date paymentDate;

    /**
     * 支付金额
     */
    private BigDecimal amount;

    /**
     * 支付方式 (Credit, Bank Transfer, Cash)
     */
    private String paymentMethod;

    /**
     * 支付确认号
     */
    private String confirmationNumber;

    /**
     * 支付记录创建时间
     */
    private Date createdAt;

    /**
     * 支付记录更新时间
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
        Payment other = (Payment) that;
        return (this.getPaymentId() == null ? other.getPaymentId() == null : this.getPaymentId().equals(other.getPaymentId()))
            && (this.getInvoiceId() == null ? other.getInvoiceId() == null : this.getInvoiceId().equals(other.getInvoiceId()))
            && (this.getPaymentDate() == null ? other.getPaymentDate() == null : this.getPaymentDate().equals(other.getPaymentDate()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPaymentMethod() == null ? other.getPaymentMethod() == null : this.getPaymentMethod().equals(other.getPaymentMethod()))
            && (this.getConfirmationNumber() == null ? other.getConfirmationNumber() == null : this.getConfirmationNumber().equals(other.getConfirmationNumber()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaymentId() == null) ? 0 : getPaymentId().hashCode());
        result = prime * result + ((getInvoiceId() == null) ? 0 : getInvoiceId().hashCode());
        result = prime * result + ((getPaymentDate() == null) ? 0 : getPaymentDate().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPaymentMethod() == null) ? 0 : getPaymentMethod().hashCode());
        result = prime * result + ((getConfirmationNumber() == null) ? 0 : getConfirmationNumber().hashCode());
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
        sb.append(", paymentId=").append(paymentId);
        sb.append(", invoiceId=").append(invoiceId);
        sb.append(", paymentDate=").append(paymentDate);
        sb.append(", amount=").append(amount);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", confirmationNumber=").append(confirmationNumber);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}