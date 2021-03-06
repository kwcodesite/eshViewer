package eshviewer.data;
// Generated Dec 11, 2017 9:52:44 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * CodeValueEventR generated by hbm2java
 */
@Entity
@Table(name="CODE_VALUE_EVENT_R"
    ,schema="V500"
    , uniqueConstraints = @UniqueConstraint(columnNames={"PARENT_CD", "FLEX1_CD", "FLEX2_CD", "FLEX3_CD", "FLEX4_CD", "FLEX5_CD"}) 
)
public class CodeValueEventR  implements java.io.Serializable {


     private CodeValueEventRId id;

    public CodeValueEventR() {
    }

    public CodeValueEventR(CodeValueEventRId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="eventCd", column=@Column(name="EVENT_CD", nullable=false, precision=126, scale=0) ), 
        @AttributeOverride(name="parentCd", column=@Column(name="PARENT_CD", nullable=false, precision=126, scale=0) ), 
        @AttributeOverride(name="flex1Cd", column=@Column(name="FLEX1_CD", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="flex2Cd", column=@Column(name="FLEX2_CD", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="flex3Cd", column=@Column(name="FLEX3_CD", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="flex4Cd", column=@Column(name="FLEX4_CD", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="updtDtTm", column=@Column(name="UPDT_DT_TM", nullable=false, length=7) ), 
        @AttributeOverride(name="flex5Cd", column=@Column(name="FLEX5_CD", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="updtId", column=@Column(name="UPDT_ID", nullable=false, precision=126, scale=0) ), 
        @AttributeOverride(name="updtTask", column=@Column(name="UPDT_TASK", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="updtCnt", column=@Column(name="UPDT_CNT", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="updtApplctx", column=@Column(name="UPDT_APPLCTX", nullable=false, precision=22, scale=0) )/*, 
        @AttributeOverride(name="lastUtcTs", column=@Column(name="LAST_UTC_TS") )*/ } )
    public CodeValueEventRId getId() {
        return this.id;
    }
    
    public void setId(CodeValueEventRId id) {
        this.id = id;
    }




}


