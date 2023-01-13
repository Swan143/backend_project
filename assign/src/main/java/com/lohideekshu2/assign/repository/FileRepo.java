package com.lohideekshu2.assign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lohideekshu2.assign.entity.File;

//import net.javaguides.springboot.fileuploaddownload.model.DatabaseFile;
@Repository
public interface FileRepo extends JpaRepository <File, String> {
//	package net.javaguides.springboot.fileuploaddownload.repository;




}
