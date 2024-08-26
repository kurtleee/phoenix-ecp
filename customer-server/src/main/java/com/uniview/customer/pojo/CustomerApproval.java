package com.uniview.customer.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客户审批表
 * @TableName customer_approval
 */
@TableName(value ="customer_approval")
@Data
public class CustomerApproval implements Serializable {
    /**
     * 审批记录ID
     */
    @TableId(type = IdType.AUTO)
    private Long approvalId;

    /**
     * 关联的客户ID
     */
    private Long customerId;

    /**
     * 关联的流程实例ID
     */
    private Long processInstanceId;

    /**
     * 审批类型 (新客户, 信息更改, 特殊发货要求等)
     */
    private String approvalType;

    /**
     * 审批状态 (pending, approved, rejected)
     */
    private String status;

    /**
     * 审批备注
     */
    private String remarks;

    /**
     * 审批记录创建时间
     */
    private Date createdAt;

    /**
     * 审批记录更新时间
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
        CustomerApproval other = (CustomerApproval) that;
        return (this.getApprovalId() == null ? other.getApprovalId() == null : this.getApprovalId().equals(other.getApprovalId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getProcessInstanceId() == null ? other.getProcessInstanceId() == null : this.getProcessInstanceId().equals(other.getProcessInstanceId()))
            && (this.getApprovalType() == null ? other.getApprovalType() == null : this.getApprovalType().equals(other.getApprovalType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApprovalId() == null) ? 0 : getApprovalId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getProcessInstanceId() == null) ? 0 : getProcessInstanceId().hashCode());
        result = prime * result + ((getApprovalType() == null) ? 0 : getApprovalType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
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
        sb.append(", approvalId=").append(approvalId);
        sb.append(", customerId=").append(customerId);
        sb.append(", processInstanceId=").append(processInstanceId);
        sb.append(", approvalType=").append(approvalType);
        sb.append(", status=").append(status);
        sb.append(", remarks=").append(remarks);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}