package com.imageupload.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "File_Details")
public class FileDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "file_id", nullable = false)
    private Long fileId;
    
    @Column(name = "file_name", nullable = false)
    private String fileName;
    
    @Column(name = "filesize", nullable = false)
    private long filesize;
    
    @Column(name = "upload_time", nullable = false)
    private LocalDateTime uploadTime;
    
    @Column(name = "content_type", nullable = false)
    private String contentType;
    
//    @ManyToOne
//    @JoinColumn(name = "userId")
//    UserModel userModel;
}
