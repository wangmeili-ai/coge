package com.szwx.yht.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-8-19
 * Time: 下午8:45
 * To change this template use File | Settings | File Templates.
 */
public class DocWS {
    private BigDecimal REGCODE;
    private BigDecimal WORKTYPE;

    private String DOCNO;
    private String DOCNAME;
    private String DOCRANK;

    private String DPTNAME;
    private String DPTNO;

    private Date DATETIME;

    public BigDecimal getREGCODE() {
        return REGCODE;
    }

    public void setREGCODE(BigDecimal REGCODE) {
        this.REGCODE = REGCODE;
    }

    public String getDOCNO() {
        return DOCNO;
    }

    public void setDOCNO(String DOCNO) {
        this.DOCNO = DOCNO;
    }

    public String getDOCNAME() {
        return DOCNAME;
    }

    public void setDOCNAME(String DOCNAME) {
        this.DOCNAME = DOCNAME;
    }

    public String getDOCRANK() {
        return DOCRANK;
    }

    public void setDOCRANK(String DOCRANK) {
        this.DOCRANK = DOCRANK;
    }

    public String getDPTNAME() {
        return DPTNAME;
    }

    public void setDPTNAME(String DPTNAME) {
        this.DPTNAME = DPTNAME;
    }

    public String getDPTNO() {
        return DPTNO;
    }

    public void setDPTNO(String DPTNO) {
        this.DPTNO = DPTNO;
    }

    public Date getDATETIME() {
        return DATETIME;
    }

    public void setDATETIME(Date DATETIME) {
        this.DATETIME = DATETIME;
    }

    public BigDecimal getWORKTYPE() {
        return WORKTYPE;
    }

    public void setWORKTYPE(BigDecimal WORKTYPE) {
        this.WORKTYPE = WORKTYPE;
    }

    //    private String regCode;
//
//    private String docNo;
//    private String docName;
//    private String docRank;
//
//    private String dptName;
//    private String dptNo;
//
//    private String date;
//
//
//    public String getRegCode() {
//        return regCode;
//    }
//
//    public void setRegCode(String regCode) {
//        this.regCode = regCode;
//    }
//
//    public String getDocNo() {
//        return docNo;
//    }
//
//    public void setDocNo(String docNo) {
//        this.docNo = docNo;
//    }
//
//    public String getDocName() {
//        return docName;
//    }
//
//    public void setDocName(String docName) {
//        this.docName = docName;
//    }
//
//    public String getDocRank() {
//        return docRank;
//    }
//
//    public void setDocRank(String docRank) {
//        this.docRank = docRank;
//    }
//
//    public String getDptName() {
//        return dptName;
//    }
//
//    public void setDptName(String dptName) {
//        this.dptName = dptName;
//    }
//
//    public String getDptNo() {
//        return dptNo;
//    }
//
//    public void setDptNo(String dptNo) {
//        this.dptNo = dptNo;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
}
