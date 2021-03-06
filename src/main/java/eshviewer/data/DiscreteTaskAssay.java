package eshviewer.data;
// Generated Dec 11, 2017 9:52:44 PM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DiscreteTaskAssay generated by hbm2java
 */
@Entity
@Table(name="DISCRETE_TASK_ASSAY"
    ,schema="V500"
)
public class DiscreteTaskAssay  implements java.io.Serializable {


     private BigDecimal taskAssayCd;
     private BigDecimal strtAssayId;
     private String mnemonicKeyCap;
     private BigDecimal activityTypeCd;
     private BigDecimal defaultResultTypeCd;
     private BigDecimal eventCd;
     private BigDecimal taskReptInd;
     private String mnemonic;
     private String description;
     private BigDecimal transmitIndicator;
     private BigDecimal printResults;
     private BigDecimal printRefRangesOnRept;
     private BigDecimal historyActivityTypeCd;
     private BigDecimal signatureLineInd;
     private BigDecimal renderingProviderInd;
     private BigDecimal icdCodeInd;
     private BigDecimal cernerDefinedInd;
     private BigDecimal activeInd;
     private Date updtDtTm;
     private BigDecimal updtId;
     private BigDecimal updtTask;
     private BigDecimal updtCnt;
     private BigDecimal updtApplctx;
     private BigDecimal hlaLociCd;
     private BigDecimal bbResultProcessingCd;
     private String refRangeScript;
     private BigDecimal codeSet;
     private BigDecimal activeStatusCd;
     private Date activeStatusDtTm;
     private BigDecimal activeStatusPrsnlId;
     private Date begEffectiveDtTm;
     private Date endEffectiveDtTm;
     private BigDecimal interpDataInd;
     private BigDecimal radSectionTypeCd;
     private BigDecimal relAssayInd;
     private BigDecimal deltaLvlFlag;
     private BigDecimal modifierInd;
     private double versionNumber;
     private BigDecimal singleSelectInd;
     private BigDecimal defaultTypeFlag;
     private String conceptCki;
     private BigDecimal ioFlag;
     private BigDecimal sciNotationInd;
     private BigDecimal labelTemplateId;
     private BigDecimal templateScriptCd;
     private String mnemonicKeyCapNls;
     private String mnemonicKeyCapANls;
     private Date lastUtcTs;
     private Set<ProfileTaskR> profileTaskRs = new HashSet(0);
     
    public DiscreteTaskAssay() {
    }

	
    public DiscreteTaskAssay(BigDecimal taskAssayCd, BigDecimal strtAssayId, BigDecimal activityTypeCd, BigDecimal defaultResultTypeCd, BigDecimal eventCd, BigDecimal historyActivityTypeCd, BigDecimal signatureLineInd, Date updtDtTm, BigDecimal updtId, BigDecimal updtTask, BigDecimal updtCnt, BigDecimal updtApplctx, BigDecimal hlaLociCd, BigDecimal bbResultProcessingCd, BigDecimal activeStatusCd, BigDecimal activeStatusPrsnlId, Date begEffectiveDtTm, Date endEffectiveDtTm, BigDecimal radSectionTypeCd, double versionNumber, BigDecimal singleSelectInd, BigDecimal defaultTypeFlag, String conceptCki) {
        this.taskAssayCd = taskAssayCd;
        this.strtAssayId = strtAssayId;
        this.activityTypeCd = activityTypeCd;
        this.defaultResultTypeCd = defaultResultTypeCd;
        this.eventCd = eventCd;
        this.historyActivityTypeCd = historyActivityTypeCd;
        this.signatureLineInd = signatureLineInd;
        this.updtDtTm = updtDtTm;
        this.updtId = updtId;
        this.updtTask = updtTask;
        this.updtCnt = updtCnt;
        this.updtApplctx = updtApplctx;
        this.hlaLociCd = hlaLociCd;
        this.bbResultProcessingCd = bbResultProcessingCd;
        this.activeStatusCd = activeStatusCd;
        this.activeStatusPrsnlId = activeStatusPrsnlId;
        this.begEffectiveDtTm = begEffectiveDtTm;
        this.endEffectiveDtTm = endEffectiveDtTm;
        this.radSectionTypeCd = radSectionTypeCd;
        this.versionNumber = versionNumber;
        this.singleSelectInd = singleSelectInd;
        this.defaultTypeFlag = defaultTypeFlag;
        this.conceptCki = conceptCki;
    }
    public DiscreteTaskAssay(BigDecimal taskAssayCd, BigDecimal strtAssayId, String mnemonicKeyCap, BigDecimal activityTypeCd, BigDecimal defaultResultTypeCd, BigDecimal eventCd, BigDecimal taskReptInd, String mnemonic, String description, BigDecimal transmitIndicator, BigDecimal printResults, BigDecimal printRefRangesOnRept, BigDecimal historyActivityTypeCd, BigDecimal signatureLineInd, BigDecimal renderingProviderInd, BigDecimal icdCodeInd, BigDecimal cernerDefinedInd, BigDecimal activeInd, Date updtDtTm, BigDecimal updtId, BigDecimal updtTask, BigDecimal updtCnt, BigDecimal updtApplctx, BigDecimal hlaLociCd, BigDecimal bbResultProcessingCd, String refRangeScript, BigDecimal codeSet, BigDecimal activeStatusCd, Date activeStatusDtTm, BigDecimal activeStatusPrsnlId, Date begEffectiveDtTm, Date endEffectiveDtTm, BigDecimal interpDataInd, BigDecimal radSectionTypeCd, BigDecimal relAssayInd, BigDecimal deltaLvlFlag, BigDecimal modifierInd, double versionNumber, BigDecimal singleSelectInd, BigDecimal defaultTypeFlag, String conceptCki, BigDecimal ioFlag, BigDecimal sciNotationInd, BigDecimal labelTemplateId, BigDecimal templateScriptCd, String mnemonicKeyCapNls, String mnemonicKeyCapANls, Date lastUtcTs, Set profileTaskRs) {
       this.taskAssayCd = taskAssayCd;
       this.strtAssayId = strtAssayId;
       this.mnemonicKeyCap = mnemonicKeyCap;
       this.activityTypeCd = activityTypeCd;
       this.defaultResultTypeCd = defaultResultTypeCd;
       this.eventCd = eventCd;
       this.taskReptInd = taskReptInd;
       this.mnemonic = mnemonic;
       this.description = description;
       this.transmitIndicator = transmitIndicator;
       this.printResults = printResults;
       this.printRefRangesOnRept = printRefRangesOnRept;
       this.historyActivityTypeCd = historyActivityTypeCd;
       this.signatureLineInd = signatureLineInd;
       this.renderingProviderInd = renderingProviderInd;
       this.icdCodeInd = icdCodeInd;
       this.cernerDefinedInd = cernerDefinedInd;
       this.activeInd = activeInd;
       this.updtDtTm = updtDtTm;
       this.updtId = updtId;
       this.updtTask = updtTask;
       this.updtCnt = updtCnt;
       this.updtApplctx = updtApplctx;
       this.hlaLociCd = hlaLociCd;
       this.bbResultProcessingCd = bbResultProcessingCd;
       this.refRangeScript = refRangeScript;
       this.codeSet = codeSet;
       this.activeStatusCd = activeStatusCd;
       this.activeStatusDtTm = activeStatusDtTm;
       this.activeStatusPrsnlId = activeStatusPrsnlId;
       this.begEffectiveDtTm = begEffectiveDtTm;
       this.endEffectiveDtTm = endEffectiveDtTm;
       this.interpDataInd = interpDataInd;
       this.radSectionTypeCd = radSectionTypeCd;
       this.relAssayInd = relAssayInd;
       this.deltaLvlFlag = deltaLvlFlag;
       this.modifierInd = modifierInd;
       this.versionNumber = versionNumber;
       this.singleSelectInd = singleSelectInd;
       this.defaultTypeFlag = defaultTypeFlag;
       this.conceptCki = conceptCki;
       this.ioFlag = ioFlag;
       this.sciNotationInd = sciNotationInd;
       this.labelTemplateId = labelTemplateId;
       this.templateScriptCd = templateScriptCd;
       this.mnemonicKeyCapNls = mnemonicKeyCapNls;
       this.mnemonicKeyCapANls = mnemonicKeyCapANls;
       this.lastUtcTs = lastUtcTs;
       this.profileTaskRs = profileTaskRs;
    }
   
     @Id 

    
    @Column(name="TASK_ASSAY_CD", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getTaskAssayCd() {
        return this.taskAssayCd;
    }
    
    public void setTaskAssayCd(BigDecimal taskAssayCd) {
        this.taskAssayCd = taskAssayCd;
    }

    
    @Column(name="STRT_ASSAY_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getStrtAssayId() {
        return this.strtAssayId;
    }
    
    public void setStrtAssayId(BigDecimal strtAssayId) {
        this.strtAssayId = strtAssayId;
    }

    
    @Column(name="MNEMONIC_KEY_CAP", length=50)
    public String getMnemonicKeyCap() {
        return this.mnemonicKeyCap;
    }
    
    public void setMnemonicKeyCap(String mnemonicKeyCap) {
        this.mnemonicKeyCap = mnemonicKeyCap;
    }

    
    @Column(name="ACTIVITY_TYPE_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getActivityTypeCd() {
        return this.activityTypeCd;
    }
    
    public void setActivityTypeCd(BigDecimal activityTypeCd) {
        this.activityTypeCd = activityTypeCd;
    }

    
    @Column(name="DEFAULT_RESULT_TYPE_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getDefaultResultTypeCd() {
        return this.defaultResultTypeCd;
    }
    
    public void setDefaultResultTypeCd(BigDecimal defaultResultTypeCd) {
        this.defaultResultTypeCd = defaultResultTypeCd;
    }

    
    @Column(name="EVENT_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getEventCd() {
        return this.eventCd;
    }
    
    public void setEventCd(BigDecimal eventCd) {
        this.eventCd = eventCd;
    }

    
    @Column(name="TASK_REPT_IND", precision=22, scale=0)
    public BigDecimal getTaskReptInd() {
        return this.taskReptInd;
    }
    
    public void setTaskReptInd(BigDecimal taskReptInd) {
        this.taskReptInd = taskReptInd;
    }

    
    @Column(name="MNEMONIC", length=50)
    public String getMnemonic() {
        return this.mnemonic;
    }
    
    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    
    @Column(name="DESCRIPTION", length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="TRANSMIT_INDICATOR", precision=22, scale=0)
    public BigDecimal getTransmitIndicator() {
        return this.transmitIndicator;
    }
    
    public void setTransmitIndicator(BigDecimal transmitIndicator) {
        this.transmitIndicator = transmitIndicator;
    }

    
    @Column(name="PRINT_RESULTS", precision=22, scale=0)
    public BigDecimal getPrintResults() {
        return this.printResults;
    }
    
    public void setPrintResults(BigDecimal printResults) {
        this.printResults = printResults;
    }

    
    @Column(name="PRINT_REF_RANGES_ON_REPT", precision=22, scale=0)
    public BigDecimal getPrintRefRangesOnRept() {
        return this.printRefRangesOnRept;
    }
    
    public void setPrintRefRangesOnRept(BigDecimal printRefRangesOnRept) {
        this.printRefRangesOnRept = printRefRangesOnRept;
    }

    
    @Column(name="HISTORY_ACTIVITY_TYPE_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getHistoryActivityTypeCd() {
        return this.historyActivityTypeCd;
    }
    
    public void setHistoryActivityTypeCd(BigDecimal historyActivityTypeCd) {
        this.historyActivityTypeCd = historyActivityTypeCd;
    }

    
    @Column(name="SIGNATURE_LINE_IND", nullable=false, precision=22, scale=0)
    public BigDecimal getSignatureLineInd() {
        return this.signatureLineInd;
    }
    
    public void setSignatureLineInd(BigDecimal signatureLineInd) {
        this.signatureLineInd = signatureLineInd;
    }

    
    @Column(name="RENDERING_PROVIDER_IND", precision=22, scale=0)
    public BigDecimal getRenderingProviderInd() {
        return this.renderingProviderInd;
    }
    
    public void setRenderingProviderInd(BigDecimal renderingProviderInd) {
        this.renderingProviderInd = renderingProviderInd;
    }

    
    @Column(name="ICD_CODE_IND", precision=22, scale=0)
    public BigDecimal getIcdCodeInd() {
        return this.icdCodeInd;
    }
    
    public void setIcdCodeInd(BigDecimal icdCodeInd) {
        this.icdCodeInd = icdCodeInd;
    }

    
    @Column(name="CERNER_DEFINED_IND", precision=22, scale=0)
    public BigDecimal getCernerDefinedInd() {
        return this.cernerDefinedInd;
    }
    
    public void setCernerDefinedInd(BigDecimal cernerDefinedInd) {
        this.cernerDefinedInd = cernerDefinedInd;
    }

    
    @Column(name="ACTIVE_IND", precision=22, scale=0)
    public BigDecimal getActiveInd() {
        return this.activeInd;
    }
    
    public void setActiveInd(BigDecimal activeInd) {
        this.activeInd = activeInd;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="UPDT_DT_TM", nullable=false, length=7)
    public Date getUpdtDtTm() {
        return this.updtDtTm;
    }
    
    public void setUpdtDtTm(Date updtDtTm) {
        this.updtDtTm = updtDtTm;
    }

    
    @Column(name="UPDT_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getUpdtId() {
        return this.updtId;
    }
    
    public void setUpdtId(BigDecimal updtId) {
        this.updtId = updtId;
    }

    
    @Column(name="UPDT_TASK", nullable=false, precision=22, scale=0)
    public BigDecimal getUpdtTask() {
        return this.updtTask;
    }
    
    public void setUpdtTask(BigDecimal updtTask) {
        this.updtTask = updtTask;
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

    
    @Column(name="HLA_LOCI_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getHlaLociCd() {
        return this.hlaLociCd;
    }
    
    public void setHlaLociCd(BigDecimal hlaLociCd) {
        this.hlaLociCd = hlaLociCd;
    }

    
    @Column(name="BB_RESULT_PROCESSING_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getBbResultProcessingCd() {
        return this.bbResultProcessingCd;
    }
    
    public void setBbResultProcessingCd(BigDecimal bbResultProcessingCd) {
        this.bbResultProcessingCd = bbResultProcessingCd;
    }

    
    @Column(name="REF_RANGE_SCRIPT", length=50)
    public String getRefRangeScript() {
        return this.refRangeScript;
    }
    
    public void setRefRangeScript(String refRangeScript) {
        this.refRangeScript = refRangeScript;
    }

    
    @Column(name="CODE_SET", precision=22, scale=0)
    public BigDecimal getCodeSet() {
        return this.codeSet;
    }
    
    public void setCodeSet(BigDecimal codeSet) {
        this.codeSet = codeSet;
    }

    
    @Column(name="ACTIVE_STATUS_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getActiveStatusCd() {
        return this.activeStatusCd;
    }
    
    public void setActiveStatusCd(BigDecimal activeStatusCd) {
        this.activeStatusCd = activeStatusCd;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ACTIVE_STATUS_DT_TM", length=7)
    public Date getActiveStatusDtTm() {
        return this.activeStatusDtTm;
    }
    
    public void setActiveStatusDtTm(Date activeStatusDtTm) {
        this.activeStatusDtTm = activeStatusDtTm;
    }

    
    @Column(name="ACTIVE_STATUS_PRSNL_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getActiveStatusPrsnlId() {
        return this.activeStatusPrsnlId;
    }
    
    public void setActiveStatusPrsnlId(BigDecimal activeStatusPrsnlId) {
        this.activeStatusPrsnlId = activeStatusPrsnlId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="BEG_EFFECTIVE_DT_TM", nullable=false, length=7)
    public Date getBegEffectiveDtTm() {
        return this.begEffectiveDtTm;
    }
    
    public void setBegEffectiveDtTm(Date begEffectiveDtTm) {
        this.begEffectiveDtTm = begEffectiveDtTm;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="END_EFFECTIVE_DT_TM", nullable=false, length=7)
    public Date getEndEffectiveDtTm() {
        return this.endEffectiveDtTm;
    }
    
    public void setEndEffectiveDtTm(Date endEffectiveDtTm) {
        this.endEffectiveDtTm = endEffectiveDtTm;
    }

    
    @Column(name="INTERP_DATA_IND", precision=22, scale=0)
    public BigDecimal getInterpDataInd() {
        return this.interpDataInd;
    }
    
    public void setInterpDataInd(BigDecimal interpDataInd) {
        this.interpDataInd = interpDataInd;
    }

    
    @Column(name="RAD_SECTION_TYPE_CD", nullable=false, precision=22, scale=0)
    public BigDecimal getRadSectionTypeCd() {
        return this.radSectionTypeCd;
    }
    
    public void setRadSectionTypeCd(BigDecimal radSectionTypeCd) {
        this.radSectionTypeCd = radSectionTypeCd;
    }

    
    @Column(name="REL_ASSAY_IND", precision=22, scale=0)
    public BigDecimal getRelAssayInd() {
        return this.relAssayInd;
    }
    
    public void setRelAssayInd(BigDecimal relAssayInd) {
        this.relAssayInd = relAssayInd;
    }

    
    @Column(name="DELTA_LVL_FLAG", precision=22, scale=0)
    public BigDecimal getDeltaLvlFlag() {
        return this.deltaLvlFlag;
    }
    
    public void setDeltaLvlFlag(BigDecimal deltaLvlFlag) {
        this.deltaLvlFlag = deltaLvlFlag;
    }

    
    @Column(name="MODIFIER_IND", precision=22, scale=0)
    public BigDecimal getModifierInd() {
        return this.modifierInd;
    }
    
    public void setModifierInd(BigDecimal modifierInd) {
        this.modifierInd = modifierInd;
    }

    
    @Column(name="VERSION_NUMBER", nullable=false, precision=126, scale=0)
    public double getVersionNumber() {
        return this.versionNumber;
    }
    
    public void setVersionNumber(double versionNumber) {
        this.versionNumber = versionNumber;
    }

    
    @Column(name="SINGLE_SELECT_IND", nullable=false, precision=22, scale=0)
    public BigDecimal getSingleSelectInd() {
        return this.singleSelectInd;
    }
    
    public void setSingleSelectInd(BigDecimal singleSelectInd) {
        this.singleSelectInd = singleSelectInd;
    }

    
    @Column(name="DEFAULT_TYPE_FLAG", nullable=false, precision=22, scale=0)
    public BigDecimal getDefaultTypeFlag() {
        return this.defaultTypeFlag;
    }
    
    public void setDefaultTypeFlag(BigDecimal defaultTypeFlag) {
        this.defaultTypeFlag = defaultTypeFlag;
    }

    
    @Column(name="CONCEPT_CKI", nullable=false)
    public String getConceptCki() {
        return this.conceptCki;
    }
    
    public void setConceptCki(String conceptCki) {
        this.conceptCki = conceptCki;
    }

    
    @Column(name="IO_FLAG", precision=22, scale=0)
    public BigDecimal getIoFlag() {
        return this.ioFlag;
    }
    
    public void setIoFlag(BigDecimal ioFlag) {
        this.ioFlag = ioFlag;
    }

    
    @Column(name="SCI_NOTATION_IND", precision=22, scale=0)
    public BigDecimal getSciNotationInd() {
        return this.sciNotationInd;
    }
    
    public void setSciNotationInd(BigDecimal sciNotationInd) {
        this.sciNotationInd = sciNotationInd;
    }

    
    @Column(name="LABEL_TEMPLATE_ID", precision=22, scale=0)
    public BigDecimal getLabelTemplateId() {
        return this.labelTemplateId;
    }
    
    public void setLabelTemplateId(BigDecimal labelTemplateId) {
        this.labelTemplateId = labelTemplateId;
    }

    
    @Column(name="TEMPLATE_SCRIPT_CD", precision=22, scale=0)
    public BigDecimal getTemplateScriptCd() {
        return this.templateScriptCd;
    }
    
    public void setTemplateScriptCd(BigDecimal templateScriptCd) {
        this.templateScriptCd = templateScriptCd;
    }

    
    @Column(name="MNEMONIC_KEY_CAP_NLS", length=102)
    public String getMnemonicKeyCapNls() {
        return this.mnemonicKeyCapNls;
    }
    
    public void setMnemonicKeyCapNls(String mnemonicKeyCapNls) {
        this.mnemonicKeyCapNls = mnemonicKeyCapNls;
    }

    
    @Column(name="MNEMONIC_KEY_CAP_A_NLS", length=200)
    public String getMnemonicKeyCapANls() {
        return this.mnemonicKeyCapANls;
    }
    
    public void setMnemonicKeyCapANls(String mnemonicKeyCapANls) {
        this.mnemonicKeyCapANls = mnemonicKeyCapANls;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LAST_UTC_TS")
    public Date getLastUtcTs() {
        return this.lastUtcTs;
    }
    
    public void setLastUtcTs(Date lastUtcTs) {
        this.lastUtcTs = lastUtcTs;
    }

@JsonManagedReference    
@OneToMany(fetch=FetchType.LAZY, mappedBy="discreteTaskAssay")
    public Set<ProfileTaskR> getProfileTaskRs() {
        return this.profileTaskRs;
    }
    
    public void setProfileTaskRs(Set<ProfileTaskR> profileTaskRs) {
        this.profileTaskRs = profileTaskRs;
    }



}


