package com.maskan.csv;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.validation.Valid;
import java.io.*;
import java.util.*;

@Controller
public class ControllerCSV {
    private List<List<String>> records = new ArrayList<>();
    public static String status = "is ready";
    public static int percentage = 0;
    @Autowired
    private VesalClient vesalClient;

    @GetMapping(value = "/sendmanytomany")
    public String send(@ModelAttribute(value = "user") UserManyToMany user,
                       Model model) {
        model.addAttribute("user", user);
        return "sendmanytomany";
    }

    @PostMapping(value = "/sendmanytomany")
    public @ResponseBody
    MyData sendSubmit(MultipartHttpServletRequest request,
                      @ModelAttribute(value = "user") @Valid UserManyToMany user,
                      Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            return new MyData(new Date(), "خطا", percentage);
        }
        status = "in progress";
        model.addAttribute("user", user);
        Iterator<String> itr = request.getFileNames();
        MultipartFile mpf = null;
        if (itr.hasNext()) {
            mpf = request.getFile(itr.next());
        }
        try {
            status = "reading file";
            String extension = FilenameUtils.getExtension(mpf.getOriginalFilename());
            if (!extension.equals("txt")) {
                throw new Exception("File extention is incorrect");
            }
            InputStream stream = mpf.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(stream));
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }

            long result = vesalClient.sendManyToManyVesal(records, user);
            status = "Finish";
            if (result == 0) {
                return new MyData(new Date(), "موفق", percentage);
            } else {
                return new MyData(new Date(), "خطا", percentage);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return new MyData(new Date(), "خطا", percentage);
        }
    }

    @GetMapping(value = "/sendonetomany")
    public String sendOneToMany(@ModelAttribute(value = "user") User user,
                                Model model) {
        model.addAttribute("user", user);
        return "sendonetomany";
    }

    @PostMapping(value = "/sendonetomany")
    public MyData sendOneToManySubmit(MultipartHttpServletRequest request,
                                      @ModelAttribute(value = "user") @Valid User user,
                                      Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            return new MyData(new Date(), "خطا", percentage);
        }
        model.addAttribute("user", user);
        Iterator<String> itr = request.getFileNames();
        MultipartFile mpf = null;
        if (itr.hasNext()) {
            mpf = request.getFile(itr.next());
        }
        try {
            status = "reading file";
            String extension = FilenameUtils.getExtension(mpf.getOriginalFilename());
            if (!extension.equals("txt")) {
                throw new Exception("File extention is incorrect");
            }
            InputStream stream = mpf.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(stream));
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
            long result = vesalClient.sendOneToManyVesal(records, user);
            status = "Finish";
            if (result == 0) {
                return new MyData(new Date(), "موفق", percentage);
            } else {
                return new MyData(new Date(), "خطا", percentage);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return new MyData(new Date(), "خطا", percentage);

        }
    }

    @RequestMapping("/status")
    public @ResponseBody
    MyData handle() {
        return new MyData(new Date(), status, percentage);
    }
}
