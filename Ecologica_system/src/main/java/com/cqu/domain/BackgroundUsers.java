package com.cqu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Objects;

@Data
public class BackgroundUsers {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private  String username;

    private String password;

    private  Integer status;
    private String updateBy;
    private String updateTime;

    public BackgroundUsers() {
    }

    public BackgroundUsers(Integer id, String username, String password, Integer status, String updateBy, String updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BackgroundUsers that = (BackgroundUsers) o;
        return Objects.equals(id, that.id) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(status, that.status) && Objects.equals(updateBy, that.updateBy) && Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, status, updateBy, updateTime);
    }
}
