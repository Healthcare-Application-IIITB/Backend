package com.example.backend.Controller;

import com.example.backend.Bean.Admin;
import com.example.backend.Service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@CrossOrigin
@RequestMapping("/api/v1/admin")
public class AdminController {
    @Resource(name = "adminService")
    private AdminService adminService;

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public ResponseEntity addDoctor(@RequestBody Admin admin) {
//        Boolean status = adminService.login(admin);
//        if (status == Boolean.FALSE)
//            return ResponseEntity.notFound().build();
//        return ResponseEntity.ok().build();
//    }
}
