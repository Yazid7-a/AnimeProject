/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Alumno Mañana
 */
public class chapters {
    private int idchapters;
    private String title;
    private double duration;
    private Date launch;
    private String description;
    private double rate;
    private int animeFK;

    public chapters() {
    }

    public chapters(int idchapters, String title, double duration, Date launch, String description, double rate, int animeFK) {
        this.idchapters = idchapters;
        this.title = title;
        this.duration = duration;
        this.launch = launch;
        this.description = description;
        this.rate = rate;
        this.animeFK = animeFK;
    }

    public int getIdchapters() {
        return idchapters;
    }

    public void setIdchapters(int idchapters) {
        this.idchapters = idchapters;
    }

    public int getAnimeFK() {
        return animeFK;
    }

    public void setAnimeFK(int animeFK) {
        this.animeFK = animeFK;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Date getLaunch() {
        return launch;
    }

    public void setLaunch(Date launch) {
        this.launch = launch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idchapters;
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.duration) ^ (Double.doubleToLongBits(this.duration) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.launch);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.rate) ^ (Double.doubleToLongBits(this.rate) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final chapters other = (chapters) obj;
        if (this.idchapters != other.idchapters) {
            return false;
        }
        if (Double.doubleToLongBits(this.duration) != Double.doubleToLongBits(other.duration)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rate) != Double.doubleToLongBits(other.rate)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.launch, other.launch);
    }
    
    
    
}
