package com.guoshanyi.ehealth.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class RedirectController {
    @RequestMapping("/hello")
    public ModelAndView getListaUtentiView(){
        ModelMap model = new ModelMap();
        model.addAttribute("name", "Spring Boot");
        return new ModelAndView("Hello", model);
    }


//    @RequestMapping("/patientProfile")
//    public ModelAndView getatientProfileView(){
//        ModelMap model = new ModelMap();
//       // model.addAttribute("name", "Spring Boot");
//        return new ModelAndView("patientProfile", model);
//    }

//    @RequestMapping("/login")
//    public ModelAndView getLoginView(){
//        ModelMap model = new ModelMap();
//        // model.addAttribute("name", "Spring Boot");
//        return new ModelAndView("login", model);
//    }

    //changeProfile.jsp
    @RequestMapping("/changeProfile")
    public ModelAndView changeProfileView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("changeProfile", model);
    }

    //clinicGroupAdd.jsp
    @RequestMapping("/clinicGroupAdd")
    public ModelAndView clinicGroupAddView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("clinicGroupAdd", model);
    }

    //doctorAbout.jsp

    @RequestMapping("/doctorAbout")
    public ModelAndView doctorAboutView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorAbout", model);
    }

    //doctorAppoint.jsp

    @RequestMapping("/doctorAppoint")
    public ModelAndView doctorAppointView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorAppoint", model);
    }

    //doctorClinicBasicAdd.jsp
    @RequestMapping("/doctorClinicBasicAdd")
    public ModelAndView doctorClinicBasicAddView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorClinicBasicAdd", model);
    }

    //doctorFirstBasicAdd.jsp
    @RequestMapping("/doctorFirstBasicAdd")
    public ModelAndView doctorFirstBasicAddView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorFirstBasicAdd", model);
    }

    //doctorHelper.jsp

    @RequestMapping("/doctorHelper")
    public ModelAndView doctorHelperView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorHelper", model);
    }

    //doctorHelperMedicineAddShortcut.jsp
    @RequestMapping("/doctorHelperMedicineAddShortcut")
    public ModelAndView doctorHelperMedicineAddShortcutView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorHelperMedicineAddShortcut", model);
    }

    //doctorHelperShow.jsp
    @RequestMapping("/doctorHelperShow")
    public ModelAndView doctorHelperShowView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorHelperShow", model);
    }

    //doctorIndex.jsp
    @RequestMapping("/doctorIndex")
    public ModelAndView doctorIndexView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorIndex", model);
    }

    //doctorPatient.jsp
    @RequestMapping("/doctorPatient")
    public ModelAndView doctorPatientView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorPatient", model);
    }

    //doctorPatientEach.jsp
    @RequestMapping("/doctorPatientEach")
    public ModelAndView doctorPatientEachView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorPatientEach", model);
    }

    //doctorPatientEachShow.jsp
    @RequestMapping("/doctorPatientEachShow")
    public ModelAndView doctorPatientEachShowView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorPatientEachShow", model);
    }

    //doctorPatientGroupAdd.jsp
    @RequestMapping("/doctorPatientGroupAdd")
    public ModelAndView doctorPatientGroupAddView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorPatientGroupAdd", model);
    }

    //doctorPatientMedicineAdd.jsp
    @RequestMapping("/doctorPatientMedicineAdd")
    public ModelAndView doctorPatientMedicineAddView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorPatientMedicineAdd", model);
    }

    //doctorPatientMedicineAddShortcut.jsp
    @RequestMapping("/doctorPatientMedicineAddShortcut")
    public ModelAndView doctorPatientMedicineAddShortcutView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorPatientMedicineAddShortcut", model);
    }

    //doctorProfile.jsp
    @RequestMapping("/doctorProfile")
    public ModelAndView doctorProfileView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorProfile", model);
    }

    //doctorSetting.jsp
    @RequestMapping("/doctorSetting")
    public ModelAndView doctorSettingView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("doctorSetting", model);
    }

    //groupAdd.jsp
    @RequestMapping("/groupAdd")
    public ModelAndView groupAddView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("groupAdd", model);
    }

    //index.jsp
    @RequestMapping("/index")
    public ModelAndView indexView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("index", model);
    }

    //login.jsp
    @RequestMapping("/login")
    public ModelAndView loginView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("login", model);
    }

    //loginCheck.jsp
    @RequestMapping("/loginCheck")
    public ModelAndView loginCheckView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("loginCheck", model);
    }

    //patientIndex.jsp
    @RequestMapping("/patientIndex")
    public ModelAndView patientIndexView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("patientIndex", model);
    }

    //patientProfile.jsp
    @RequestMapping("/patientProfile")
    public ModelAndView patientProfileView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("patientProfile", model);
    }

    //patientQuery.jsp
    @RequestMapping("/patientQuery")
    public ModelAndView patientQueryView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("patientQuery", model);
    }

    //register.jsp
    @RequestMapping("/register")
    public ModelAndView registerView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("register", model);
    }

    //registerCheck.jsp
    @RequestMapping("/registerCheck")
    public ModelAndView registerCheckView(){
        ModelMap model = new ModelMap();
        return new ModelAndView("registerCheck", model);
    }
}
