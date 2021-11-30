package com.example.ktx.controller;
import com.example.ktx.entity.User;
import com.example.ktx.entity.Zoom;
import com.example.ktx.responsitory.ZoomRepository;
import com.example.ktx.service.UserService;
import com.example.ktx.service.ZoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;
@Controller
//@RequestMapping("/zoom/")
public class ZoomController {
    @Autowired
    private ZoomRepository zoomRepository;
//    @Autowired
    private ZoomService zoomService;
//        @RequestMapping("/zoom")
//    public String zoomhome(Model model) {
//        List<Zoom> zooms = zoomService.getAllZoom();
//        model.addAttribute("zooms", zooms);
//
//        return "listZoom";
//    }
//    @GetMapping(value = "/zoom")
//    public String index(Model model){
//    model.addAttribute("zooms",zoomRepository.findAll());
//    return "listZoom";
//}
//    @RequestMapping(value = "/zoom/add")
//    public String addZoom(Model model) {
//        model.addAttribute("zoom", new Zoom());
//        return "addZoom";
//    }
    @RequestMapping(value = "/zoom/edit", method = RequestMethod.GET)
    public String editZoom(@RequestParam("id") Long zoomId, Model model) {
        Optional<Zoom> zoomEdit = zoomService.findZoomById(zoomId);
        zoomEdit.ifPresent(zoom -> model.addAttribute("zoom", zoom));
        return "editZoom";
    }
    @RequestMapping(value = "zoom/save", method = RequestMethod.POST)
    public String saveZoom(Zoom zoom) {
        zoomService.saveZoom(zoom);
        return "listZoom";
    }
//    @RequestMapping(value = "/delete", method = RequestMethod.GET)
//    public String deleteZoom(@RequestParam("id") Long zoomId) {
//        zoomService.deleteZoom(zoomId);
//        return "redirect:/";
//    }


//    public String add(HttpServletRequest request, Model model){
//        long zoomId=Long.parseLong(request.getParameter("zoomId"));
//        long classId=Integer.parseInt(request.getParameter("classId"));
//
//        //Validation fields
////        if (!studentClassRepository.findByStudentIDAndClassID(studentId,classId).isEmpty()) throw new Exception("Student had joined this classes already !");
//
//        //Add class to student learnings
//        StudentClass studentClass=new StudentClass();
//        studentClass.setDemo1StudentByStudentid(studentRepository.findById(studentId).orElse(null));
//        studentClass.setDemo1ClassByClassid(classRepository.findById(classId).orElse(null));
//
//        //Save to database
//        studentClassRepository.save(studentClass);
//        Zoom zoom = new Zoom();
//
//        zoomRepository.save(zoom);
//        return "done";
    }
//    @PostMapping(value = "/")
//    public String index(Model model){
//        model.addAttribute("zooms",zoomRepository.findAll());
//        return "listZoom";
//    }
//    @RequestMapping("/")
//    public String zoom(Model model) {
//        List<Zoom> zooms = zoomService.getAllZoom();
//        model.addAttribute("zooms", zooms);
//
//        return "listZoom";
//    }
////
////
//    @RequestMapping(value = "/add")
//    public String addZoom(Model model) {
//        model.addAttribute("zoom", new Zoom());
//        return "addZoom";
//    }
//

//
//    //        @PostMapping(value = "/add")
////    public void save(@RequestBody User user) {
////        userService.saveUser(user);
////    }
//    @RequestMapping(value = "save", method = RequestMethod.POST)
//    public String saveAdd(Zoom zoom) {
//        zoomService.saveZoom(zoom);
//        return "redirect:/";
//    }
////    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
////    public String saveEdit(User user) {
////        userService.saveUser(user);
////        return "redirect:/";
////    }
//
//    @RequestMapping(value = "/delete", method = RequestMethod.GET)
//    public String deleteZoom(@RequestParam("id") Long zoomId, Model model) {
//        zoomService.deleteZoom(zoomId);
//        return "redirect:/";
//    }

