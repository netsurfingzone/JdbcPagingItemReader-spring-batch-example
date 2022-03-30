package com.springbatchexample.component;

import com.springbatchexample.entity.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentItemProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {
        return student;
    }
}
