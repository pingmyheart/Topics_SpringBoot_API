package com.example.demo.model;

public class Presentation {
    private String introduction;
    private String adding;
    private String email;
    private String phone;

    public Presentation(){
        setIntroduction("This API is developed by Russi Antonio using Spring Boot");
        setAdding("For information contacts");
        setEmail("antoniorussi1972@gmail.com");
        setPhone("Almost Private");
    }

    private void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    private void setAdding(String adding) {
        this.adding = adding;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getAdding() {
        return adding;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
