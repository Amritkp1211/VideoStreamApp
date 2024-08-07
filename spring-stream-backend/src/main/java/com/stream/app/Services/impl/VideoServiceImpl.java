package com.stream.app.Services.impl;

import com.stream.app.Services.VideoService;
import com.stream.app.entities.Video;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Value("$files.video")
    String fileDir;

    @Override
    public Video save(Video video, MultipartFile file) {

        try {
            //original file name


            String filename = file.getOriginalFilename();
            String contentType = file.getContentType();
            InputStream inputStream = file.getInputStream();

            //folder path /create
            String cleanFileName = StringUtils.cleanPath(filename);
            String cleanFolder = StringUtils.cleanPath(fileDir);

            Path path= Paths.get(cleanFolder,cleanFileName);


            // folder name with  filenanme;
            //copyfile to folder

            //video metadata
            //metadata save

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public Video get(String videoId) {
        return null;
    }

    @Override
    public Video getByTitle(String title) {
        return null;
    }

    @Override
    public List<Video> getAll() {
        return List.of();
    }
}
