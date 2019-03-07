package devy.favorites.service.mapper;

import devy.favorites.domain.Exam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExamMapper {

    List<Exam> selectExam();

    int insertExam();

}
