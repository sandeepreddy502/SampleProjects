package com.rup.ignite.sample.target.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

import org.apache.ignite.cache.CacheAtomicityMode;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.cache.CacheRebalanceMode;
import org.apache.ignite.cache.CacheWriteSynchronizationMode;
import org.apache.ignite.cache.query.annotations.QuerySqlField;

import com.aladdin.cloud.Coldboot;
import com.aladdin.entities.AbstractAladdinEntity;
import com.aladdin.entities.ColumnType;
import com.aladdin.entities.annotations.AladdinColumn;
import com.aladdin.entities.annotations.AladdinDatabaseObject;
import com.aladdin.ignite.AladdinCacheManager;
import com.aladdin.ignite.AladdinSybaseCache;

@AladdinDatabaseObject(getTbl="target_param_val_master", keyClass=TargetParamValMasterKey.class)
public final class TargetParamValMaster extends AbstractAladdinEntity<TargetParamValMasterKey> implements Externalizable {

    private static final long serialVersionUID = 1L;
    
    @AladdinColumn(columnName="target_param_val_master_id", columnType=ColumnType.INT, primaryKey=true)
	@QuerySqlField(name="target_param_val_master_id",index = true)
	private Integer targetParamValMasterId;
	
    @AladdinColumn(columnName="target_param_def_id", columnType=ColumnType.INT)
    @QuerySqlField(name="target_param_def_id", index=true)
	private Integer targetParamDefId;
    
    @AladdinColumn(columnName="alloc_target_master_id", columnType=ColumnType.INT)
    @QuerySqlField(name="alloc_target_master_id", index=true)
    private Integer allocTargetMasterId;

    @AladdinColumn(columnName="value_varchar", columnType=ColumnType.STRING, length=255)
	@QuerySqlField(name="value_varchar")
	private String valueVarchar;

    @AladdinColumn(columnName="value_numeric", columnType=ColumnType.DOUBLE)
	@QuerySqlField(name="value_numeric")
	private Double valueNumeric;

    @AladdinColumn(columnName="value_float", columnType=ColumnType.DOUBLE)
    @QuerySqlField(name="value_float")
	private Double valueFloat;

    @AladdinColumn(columnName="value_int", columnType=ColumnType.INT)
    @QuerySqlField(name="value_int")
    private Integer valueInt;
    
    @AladdinColumn(columnName="created_by", columnType=ColumnType.STRING, length=8)
    @QuerySqlField(name="created_by")
	private String createdBy;
	
    @AladdinColumn(columnName="created_time", columnType=ColumnType.DATE)
    @QuerySqlField(name="created_time")
	private Date createdTime;
	
    @AladdinColumn(columnName="seq_num", columnType=ColumnType.INT)
    @QuerySqlField(name="seq_num")
    private Integer seqNum;

    
    public static AladdinSybaseCache<TargetParamValMasterKey, TargetParamValMaster> createCache(AladdinCacheManager acm, String name, Coldboot coldboot)
    {
        return acm.createSybaseCache(name, TargetParamValMasterKey.class, TargetParamValMaster.class, coldboot, CacheWriteSynchronizationMode.FULL_ASYNC, CacheRebalanceMode.ASYNC, 0, CacheMode.PARTITIONED, CacheAtomicityMode.TRANSACTIONAL);
    }
    
    public TargetParamValMaster() {
        super(null);
    }
   
    public TargetParamValMaster (Integer targetParamValMasterId, Integer targetParamDefId, Integer allocTargetMasterId, String valueVarchar, Double valueNumeric, Double valueFloat, Integer valueInt, String createdBy, Date createdTime, Integer seqNum) {
        super(new TargetParamValMasterKey(targetParamValMasterId, allocTargetMasterId));
        this.targetParamValMasterId = targetParamValMasterId;
        this.targetParamDefId = targetParamDefId;
        this.allocTargetMasterId = allocTargetMasterId;
        this.valueVarchar = valueVarchar;
        this.valueNumeric = valueNumeric;
        this.valueFloat = valueFloat;
        this.valueInt = valueInt;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.seqNum = seqNum;
    }


    public Integer getTargetParamValMasterId() {
        return targetParamValMasterId;
    }

    public void setTargetParamValMasterId(Integer targetParamValMasterId) {
        this.targetParamValMasterId = targetParamValMasterId;
    }

    public Integer getTargetParamDefId() {
        return targetParamDefId;
    }

    public void setTargetParamDefId(Integer targetParamDefId) {
        this.targetParamDefId = targetParamDefId;
    }

    public Integer getAllocTargetMasterId() {
        return allocTargetMasterId;
    }

    public void setAllocTargetMasterId(Integer allocTargetMasterId) {
        this.allocTargetMasterId = allocTargetMasterId;
    }

    public String getValueVarchar() {
        return valueVarchar;
    }

    public void setValueVarchar(String valueVarchar) {
        this.valueVarchar = valueVarchar;
    }

    public Double getValueNumeric() {
        return valueNumeric;
    }

    public void setValueNumeric(Double valueNumeric) {
        this.valueNumeric = valueNumeric;
    }

    public Double getValueFloat() {
        return valueFloat;
    }

    public void setValueFloat(Double valueFloat) {
        this.valueFloat = valueFloat;
    }

    public Integer getValueInt() {
        return valueInt;
    }

    public void setValueInt(Integer valueInt) {
        this.valueInt = valueInt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }
    
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((allocTargetMasterId == null) ? 0 : allocTargetMasterId.hashCode());
        result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
        result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
        result = prime * result + ((seqNum == null) ? 0 : seqNum.hashCode());
        result = prime * result + ((targetParamDefId == null) ? 0 : targetParamDefId.hashCode());
        result = prime * result + ((targetParamValMasterId == null) ? 0 : targetParamValMasterId.hashCode());
        result = prime * result + ((valueFloat == null) ? 0 : valueFloat.hashCode());
        result = prime * result + ((valueInt == null) ? 0 : valueInt.hashCode());
        result = prime * result + ((valueNumeric == null) ? 0 : valueNumeric.hashCode());
        result = prime * result + ((valueVarchar == null) ? 0 : valueVarchar.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TargetParamValMaster other = (TargetParamValMaster) obj;
        if (allocTargetMasterId == null) {
            if (other.allocTargetMasterId != null)
                return false;
        } else if (!allocTargetMasterId.equals(other.allocTargetMasterId))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        } else if (!createdBy.equals(other.createdBy))
            return false;
        if (createdTime == null) {
            if (other.createdTime != null)
                return false;
        } else if (!createdTime.equals(other.createdTime))
            return false;
        if (seqNum == null) {
            if (other.seqNum != null)
                return false;
        } else if (!seqNum.equals(other.seqNum))
            return false;
        if (targetParamDefId == null) {
            if (other.targetParamDefId != null)
                return false;
        } else if (!targetParamDefId.equals(other.targetParamDefId))
            return false;
        if (targetParamValMasterId == null) {
            if (other.targetParamValMasterId != null)
                return false;
        } else if (!targetParamValMasterId.equals(other.targetParamValMasterId))
            return false;
        if (valueFloat == null) {
            if (other.valueFloat != null)
                return false;
        } else if (!valueFloat.equals(other.valueFloat))
            return false;
        if (valueInt == null) {
            if (other.valueInt != null)
                return false;
        } else if (!valueInt.equals(other.valueInt))
            return false;
        if (valueNumeric == null) {
            if (other.valueNumeric != null)
                return false;
        } else if (!valueNumeric.equals(other.valueNumeric))
            return false;
        if (valueVarchar == null) {
            if (other.valueVarchar != null)
                return false;
        } else if (!valueVarchar.equals(other.valueVarchar))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "TargetParamValMaster [targetParamValMasterId=" + targetParamValMasterId + ", targetParamDefId=" + targetParamDefId + ", allocTargetMasterId="
                + allocTargetMasterId + ", valueVarchar=" + valueVarchar + ", valueNumeric=" + valueNumeric + ", valueFloat=" + valueFloat + ", valueInt="
                + valueInt + ", createdBy=" + createdBy + ", createdTime=" + createdTime + ", seqNum=" + seqNum + "]";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {
        super.writeExternal(out);
        out.writeInt(this.targetParamValMasterId);
        out.writeObject(this.targetParamDefId);
        out.writeObject(this.allocTargetMasterId);
        out.writeObject(this.valueVarchar);
        out.writeObject(this.valueNumeric);
        out.writeObject(this.valueFloat);
        out.writeObject(this.valueInt);
        out.writeObject(this.createdBy);
        out.writeObject(this.createdTime);
        out.writeObject(this.seqNum);
    }
    
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
        super.readExternal(in);
        this.targetParamValMasterId = in.readInt();
        this.targetParamDefId = (Integer)in.readObject();
        this.allocTargetMasterId = (Integer)in.readObject();
        this.valueVarchar = (String)in.readObject();
        this.valueNumeric = (Double)in.readObject();
        this.valueFloat = (Double)in.readObject();
        this.valueInt = (Integer)in.readObject();
        this.createdBy = (String)in.readObject();
        this.createdTime = (Date)in.readObject();
        this.seqNum = (Integer)in.readObject();
    }
	
}
