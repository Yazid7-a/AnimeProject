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
public class anime {
    private int idanime;
    private String name;
    private String author;
    private String description;
    private int ncaps;
    private int seasons;
    private Date launch;
    private Date end;
    private String language;
    private double rate;
    private boolean movie;
    private String category;

    public anime() {
    }
    
    public anime(int idanime, String name, String author, String description, int ncaps, int seasons, Date launch, Date end, String language, double rate, boolean movie, String category) {
        this.idanime = idanime;
        this.name = name;
        this.author = author;
        this.description = description;
        this.ncaps = ncaps;
        this.seasons = seasons;
        this.launch = launch;
        this.end = end;
        this.language = language;
        this.rate = rate;
        this.movie = movie;
        this.category = category;
    }

    public int getIdanime() {
        return idanime;
    }

    public void setIdanime(int idanime) {
        this.idanime = idanime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNcaps() {
        return ncaps;
    }

    public void setNcaps(int ncaps) {
        this.ncaps = ncaps;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public Date getLaunch() {
        return launch;
    }

    public void setLaunch(Date launch) {
        this.launch = launch;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isMovie() {
        return movie;
    }

    public void setMovie(boolean movie) {
        this.movie = movie;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idanime;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.author);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + this.ncaps;
        hash = 23 * hash + this.seasons;
        hash = 23 * hash + Objects.hashCode(this.launch);
        hash = 23 * hash + Objects.hashCode(this.end);
        hash = 23 * hash + Objects.hashCode(this.language);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.rate) ^ (Double.doubleToLongBits(this.rate) >>> 32));
        hash = 23 * hash + (this.movie ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.category);
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
        final anime other = (anime) obj;
        if (this.idanime != other.idanime) {
            return false;
        }
        if (this.ncaps != other.ncaps) {
            return false;
        }
        if (this.seasons != other.seasons) {
            return false;
        }
        if (Double.doubleToLongBits(this.rate) != Double.doubleToLongBits(other.rate)) {
            return false;
        }
        if (this.movie != other.movie) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.launch, other.launch)) {
            return false;
        }
        return Objects.equals(this.end, other.end);
    }
    
    
    
}
