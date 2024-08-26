package com.uniview.customer.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客户表
 * @TableName customer
 */
@TableName(value ="customer")
@Data
public class Customer implements Serializable {
    /**
     * 客户ID
     */
    @TableId(type = IdType.AUTO)
    private Long customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户代码（系统自动生成）
     */
    private String customerCode;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 客户税号
     */
    private String taxNumber;

    /**
     * 销售员代码
     */
    private String salesCode;

    /**
     * 销售员所属地区
     */
    private String region;

    /**
     * 客户创建时间
     */
    private Date createdAt;

    /**
     * 客户信息更新时间
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
        Customer other = (Customer) that;
        return (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCustomerCode() == null ? other.getCustomerCode() == null : this.getCustomerCode().equals(other.getCustomerCode()))
            && (this.getOrganizationCode() == null ? other.getOrganizationCode() == null : this.getOrganizationCode().equals(other.getOrganizationCode()))
            && (this.getTaxNumber() == null ? other.getTaxNumber() == null : this.getTaxNumber().equals(other.getTaxNumber()))
            && (this.getSalesCode() == null ? other.getSalesCode() == null : this.getSalesCode().equals(other.getSalesCode()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCustomerCode() == null) ? 0 : getCustomerCode().hashCode());
        result = prime * result + ((getOrganizationCode() == null) ? 0 : getOrganizationCode().hashCode());
        result = prime * result + ((getTaxNumber() == null) ? 0 : getTaxNumber().hashCode());
        result = prime * result + ((getSalesCode() == null) ? 0 : getSalesCode().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
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
        sb.append(", customerId=").append(customerId);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerCode=").append(customerCode);
        sb.append(", organizationCode=").append(organizationCode);
        sb.append(", taxNumber=").append(taxNumber);
        sb.append(", salesCode=").append(salesCode);
        sb.append(", region=").append(region);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}