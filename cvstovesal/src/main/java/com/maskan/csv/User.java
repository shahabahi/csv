package com.maskan.csv;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Data
public class User {
    @NotNull
    @Size(min = 2, max = 40,message = "تعداد کاراکتر مجاز بین 2 تا 40 می باشد")
    @Valid
    private String userName;
    @NotNull
    @Size(min = 2, max = 20,message = "تعداد کاراکتر مجاز بین 2 تا 8 می باشد")
    private String password;
    @NotNull
    private MultipartFile filePath;
    @NotNull
    @Size(min = 2, max = 14,message = "تعداد عدد مجاز بین 2 تا 8 می باشد")
    @Pattern(regexp = "\\d+",  message = "مقدار عددی مجاز می باشد")
    private String originator;

    private String content;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MultipartFile getFilePath() {
        return filePath;
    }

    public void setFilePath(MultipartFile filePath) {
        this.filePath = filePath;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
