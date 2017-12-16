package eshviewer.data;
// Generated Dec 11, 2017 9:52:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 * V500EventSetExplodeId generated by hbm2java
 */
@Embeddable
public class V500EventSetExplodeId  implements java.io.Serializable {


     private BigDecimal eventCd;
     private BigDecimal eventSetCd;
     private BigDecimal eventSetStatusCd;
     private Date updtDtTm;
     private BigDecimal updtTask;
     private BigDecimal updtId;
     private BigDecimal updtCnt;
     private BigDecimal updtApplctx;
     private BigDecimal eventSetLevel;
     private Date lastUtcTs;

    public V500EventSetExplodeId() {
    }

	
    public V500EventSetExplodeId(BigDecimal eventCd, BigDecimal eventSetCd, BigDecimal eventSetStatusCd, Date updtDtTm, BigDecimal updtTask, BigDecimal updtId, BigDecimal updtCnt, BigDecimal updtApplctx) {
        this.eventCd = eventCd;
        this.eventSetCd = eventSetCd;
        this.eventSetStatusCd = eventSetStatusCd;
        this.updtDtTm = updtDtTm;
        this.updtTask = updtTask;
        this.updtId = updtId;
        this.updtCnt = updtCnt;
        this.updtApplctx = updtApplctx;
    }
    public V500EventSetExplodeId(BigDecimal eventCd, BigDecimal eventSetCd, BigDecimal eventSetStatusCd, Date updtDtTm, BigDecimal updtTask, BigDecimal updtId, BigDecimal updtCnt, BigDecimal updtApplctx, BigDecimal eventSetLevel, Date lastUtcTs) {
       this.eventCd = eventCd;
       this.eventSetCd = eventSetCd;
       this.eventSetStatusCd = eventSetStatusCd;
       this.updtDtTm = updtDtTm;
       this.updtTask = updtTask;
       this.updtId = updtId;
       this.updtCnt = updtCnt;
       this.updtApplctx = updtApplctx;
       this.eventSetLevel = eventSetLevel;
       this.lastUtcTs = lastUtcTs;
    }
   


    @Column(name="EVENT_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getEventCd() {
        return this.eventCd;
    }
    
    public void setEventCd(BigDecimal eventCd) {
        this.eventCd = eventCd;
    }


    @Column(name="EVENT_SET_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getEventSetCd() {
        return this.eventSetCd;
    }
    
    public void setEventSetCd(BigDecimal eventSetCd) {
        this.eventSetCd = eventSetCd;
    }


    @Column(name="EVENT_SET_STATUS_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getEventSetStatusCd() {
        return this.eventSetStatusCd;
    }
    
    public void setEventSetStatusCd(BigDecimal eventSetStatusCd) {
        this.eventSetStatusCd = eventSetStatusCd;
    }


    @Column(name="UPDT_DT_TM", nullable=false, length=7)
    public Date getUpdtDtTm() {
        return this.updtDtTm;
    }
    
    public void setUpdtDtTm(Date updtDtTm) {
        this.updtDtTm = updtDtTm;
    }


    @Column(name="UPDT_TASK", nullable=false, precision=22, scale=0)
    public BigDecimal getUpdtTask() {
        return this.updtTask;
    }
    
    public void setUpdtTask(BigDecimal updtTask) {
        this.updtTask = updtTask;
    }


    @Column(name="UPDT_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getUpdtId() {
        return this.updtId;
    }
    
    public void setUpdtId(BigDecimal updtId) {
        this.updtId = updtId;
    }


    @Column(name="UPDT_CNT", nullable=false, precision=22, scale=0)
    public BigDecimal getUpdtCnt() {
        return this.updtCnt;
    }
    
    public void setUpdtCnt(BigDecimal updtCnt) {
        this.updtCnt = updtCnt;
    }


    @Column(name="UPDT_APPLCTX", nullable=false, precision=22, scale=0)
    public BigDecimal getUpdtApplctx() {
        return this.updtApplctx;
    }
    
    public void setUpdtApplctx(BigDecimal updtApplctx) {
        this.updtApplctx = updtApplctx;
    }


    @Column(name="EVENT_SET_LEVEL", precision=22, scale=0)
    public BigDecimal getEventSetLevel() {
        return this.eventSetLevel;
    }
    
    public void setEventSetLevel(BigDecimal eventSetLevel) {
        this.eventSetLevel = eventSetLevel;
    }


    /*@Column(name="LAST_UTC_TS")*/
    @Transient
    public Date getLastUtcTs() {
        return this.lastUtcTs;
    }
    
    public void setLastUtcTs(Date lastUtcTs) {
        this.lastUtcTs = lastUtcTs;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof V500EventSetExplodeId) ) return false;
		 V500EventSetExplodeId castOther = ( V500EventSetExplodeId ) other; 
         
		 return ( (this.getEventCd()==castOther.getEventCd()) || ( this.getEventCd()!=null && castOther.getEventCd()!=null && this.getEventCd().equals(castOther.getEventCd()) ) )
 && ( (this.getEventSetCd()==castOther.getEventSetCd()) || ( this.getEventSetCd()!=null && castOther.getEventSetCd()!=null && this.getEventSetCd().equals(castOther.getEventSetCd()) ) )
 && ( (this.getEventSetStatusCd()==castOther.getEventSetStatusCd()) || ( this.getEventSetStatusCd()!=null && castOther.getEventSetStatusCd()!=null && this.getEventSetStatusCd().equals(castOther.getEventSetStatusCd()) ) )
 && ( (this.getUpdtDtTm()==castOther.getUpdtDtTm()) || ( this.getUpdtDtTm()!=null && castOther.getUpdtDtTm()!=null && this.getUpdtDtTm().equals(castOther.getUpdtDtTm()) ) )
 && ( (this.getUpdtTask()==castOther.getUpdtTask()) || ( this.getUpdtTask()!=null && castOther.getUpdtTask()!=null && this.getUpdtTask().equals(castOther.getUpdtTask()) ) )
 && ( (this.getUpdtId()==castOther.getUpdtId()) || ( this.getUpdtId()!=null && castOther.getUpdtId()!=null && this.getUpdtId().equals(castOther.getUpdtId()) ) )
 && ( (this.getUpdtCnt()==castOther.getUpdtCnt()) || ( this.getUpdtCnt()!=null && castOther.getUpdtCnt()!=null && this.getUpdtCnt().equals(castOther.getUpdtCnt()) ) )
 && ( (this.getUpdtApplctx()==castOther.getUpdtApplctx()) || ( this.getUpdtApplctx()!=null && castOther.getUpdtApplctx()!=null && this.getUpdtApplctx().equals(castOther.getUpdtApplctx()) ) )
 && ( (this.getEventSetLevel()==castOther.getEventSetLevel()) || ( this.getEventSetLevel()!=null && castOther.getEventSetLevel()!=null && this.getEventSetLevel().equals(castOther.getEventSetLevel()) ) )
 && ( (this.getLastUtcTs()==castOther.getLastUtcTs()) || ( this.getLastUtcTs()!=null && castOther.getLastUtcTs()!=null && this.getLastUtcTs().equals(castOther.getLastUtcTs()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEventCd() == null ? 0 : this.getEventCd().hashCode() );
         result = 37 * result + ( getEventSetCd() == null ? 0 : this.getEventSetCd().hashCode() );
         result = 37 * result + ( getEventSetStatusCd() == null ? 0 : this.getEventSetStatusCd().hashCode() );
         result = 37 * result + ( getUpdtDtTm() == null ? 0 : this.getUpdtDtTm().hashCode() );
         result = 37 * result + ( getUpdtTask() == null ? 0 : this.getUpdtTask().hashCode() );
         result = 37 * result + ( getUpdtId() == null ? 0 : this.getUpdtId().hashCode() );
         result = 37 * result + ( getUpdtCnt() == null ? 0 : this.getUpdtCnt().hashCode() );
         result = 37 * result + ( getUpdtApplctx() == null ? 0 : this.getUpdtApplctx().hashCode() );
         result = 37 * result + ( getEventSetLevel() == null ? 0 : this.getEventSetLevel().hashCode() );
         result = 37 * result + ( getLastUtcTs() == null ? 0 : this.getLastUtcTs().hashCode() );
         return result;
   }   


}


