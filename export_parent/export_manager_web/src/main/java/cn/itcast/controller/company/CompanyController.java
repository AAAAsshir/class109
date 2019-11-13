package cn.itcast.controller.company;

import cn.itcast.domain.company.Company;
import cn.itcast.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    @RequestMapping("/list")
    public String findAll(HttpServletRequest request){
        List<Company> list = companyService.findAll();
        request.setAttribute("list",list);
        return "company/company-list";
    }
}
