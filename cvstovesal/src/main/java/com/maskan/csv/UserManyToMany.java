package com.maskan.csv;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Data
public class UserManyToMany {
    @NotNull
    @Size(min = 2, max = 40,message = "تعداد کاراکتر مجاز بین 2 تا 40 می باشد")
    @Valid
    private String userName;
    @NotNull
    @Size(min = 2, max = 8,message = "تعداد کاراکتر مجاز بین 2 تا 8 می باشد")
    private String password;
    @NotNull
    private MultipartFile filePath;


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

}
