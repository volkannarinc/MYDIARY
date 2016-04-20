package com.mydiary.notes.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement()
@Table(name = "DIARY")
public class Shop {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "NOTE_ID")
    private int id;

    @Column(name = "NOTE_HEADER",length = 100)
    private String noteHeader;

    @Column(name = "NOTE_DESCRIPTION", length = 5000)
    private String noteDescription;

    @Column(name = "UPDATED_BY", length = 100)
    private String updatedBy;

    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    public Shop() {}

    public Shop(String noteHeader, String noteDescription) {
        this.setNoteHeader(noteHeader);
        this.setNoteDescription(noteDescription);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoteHeader() {
        return noteHeader;
    }

    public void setNoteHeader(String noteHeader) {
        this.noteHeader = noteHeader;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
