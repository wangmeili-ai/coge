package com.szwx.yht.action;

import com.szwx.yht.dto.WSDoctorListDto;
import com.szwx.yht.exception.ActionException;
import com.szwx.yht.exception.ServiceException;
import com.szwx.yht.service.IRegisterService;
import com.szwx.yht.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: hch
 * Date: 13-8-6
 * Time: 下午8:50
 * To change this template use File | Settings | File Templates.
 */

@Controller("load_doc_schedule")
@Scope("request")
public class LoadDoctorSchedule extends DataAccessAction {
    @Autowired
    private IRegisterService registerService;

    private List<WSDoctorListDto> wsDoctors;
    private List<Date> listDate;
    private String docName;
    private String deptName;
    private Page page = new Page();

    LoadDoctorSchedule() {
        page = new Page();
    }

    @Override
    public String exec() throws Exception {
        String hospitalId = null;

        if (session.containsKey("hospitalId"))
            hospitalId = session.get("hospitalId").toString();
        else hospitalId = "SDFY";

        GregorianCalendar calendar = new GregorianCalendar();
        listDate = new ArrayList<Date>();
        for (int i = 0; i < 7; i++) {
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            listDate.add(calendar.getTime());
        }


        if (docName != null && !"".equals(docName.trim())) {
            docName = new String(
                    docName.getBytes("iso8859-1"), "utf-8"
            );
        }
        if (deptName != null && !"".equals(deptName.trim())) {
            deptName = new String(
                    deptName.getBytes("iso8859-1"), "utf-8"
            );
        }

        wsDoctors = registerService.getWsDoctorListDtosimpl(
                docName, deptName, page, hospitalId
        );

        return SUCCESS;
    }


    public IRegisterService getRegisterService() {
        return registerService;
    }

    public void setRegisterService(IRegisterService registerService) {
        this.registerService = registerService;
    }

    public List<WSDoctorListDto> getWsDoctors() {
        return wsDoctors;
    }

    public void setWsDoctors(List<WSDoctorListDto> wsDoctors) {
        this.wsDoctors = wsDoctors;
    }

    public List<Date> getListDate() {
        return listDate;
    }

    public void setListDate(List<Date> listDate) {
        this.listDate = listDate;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}