package com.example.gasnugasfinal;

public class MyListTugas{
    private String description;
    private String Tanggal;
    private String Deadline;
    private String Catatan;
    private int imgId;
    public MyListTugas(String description, int imgId,String tanggal, String deadline, String catatan) {
        this.description = description;
        this.imgId = imgId;
        this.Tanggal = tanggal;
        this.Deadline = deadline;
        this.Catatan = catatan;
    }
    public String getDescription() {
        return description;
    }
    public String getTanggal(){return Tanggal;}
    public void setTanggal(String Tanggal){ this.Tanggal = Tanggal; }
    public String getDeadline(){return Deadline;}
    public void setDeadline(String Deadline){this.Deadline = Deadline;}
    public String getCatatan(){return Catatan;}
    public void setCatatan(String Catatan){this.Catatan = Catatan;}
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}