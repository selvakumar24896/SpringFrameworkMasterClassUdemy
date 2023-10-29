package com.udemy.spring_master_class.SpringMasterClass.Springboot;

public class Course {
    public int courseId;
    public String author;
    public String platform;

    public Course(int courseId,String author, String platform){
        this.courseId = courseId;
        this.author = author;
        this.platform = platform;
    }
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
