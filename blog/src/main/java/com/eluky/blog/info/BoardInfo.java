package com.eluky.blog.info;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "board")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class BoardInfo {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull(message = "昵称不能为空")
    private String nickname;

    @NotNull(message = "内容不能为空")
    private String message;

    private String time;

    private Integer like;

    public void BoardInfo(Integer id,String nickname,String message,String time,Integer like){
        this.id = id;
        this.nickname = nickname;
        this.message = message;
        this.time = time;
        this.like = like;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getNickname() {
        return nickname;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public Integer getLike() {
        return like;
    }
}
