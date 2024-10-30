package com.prince.video_service.Feign;


import com.prince.common.data.dtos.ACourseDetailsDto;
import com.prince.common.data.dtos.CourseDetailsDto;
import com.prince.common.data.dtos.CourseDto;
import com.prince.common.data.entities.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;


@FeignClient(name = "COURSE")
public interface FeignClientCourse {
    @GetMapping("/course/{courseId}")
    ResponseEntity<Course> getCourseDetails(@PathVariable Long courseId);
}