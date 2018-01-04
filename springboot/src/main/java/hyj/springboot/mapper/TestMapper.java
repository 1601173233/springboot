package hyj.springboot.mapper;

import hyj.springboot.model.Test;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TestMapper {

	@Select("SELECT * FROM a")
	@Results({
		@Result(property = "id", column = "id"),
		@Result(property = "name", column = "aname") })
	List<Test> getAll();

	@Select("SELECT * FROM a WHERE aname = #{name}")
	@Results({
		@Result(property = "id", column = "id"),
		@Result(property = "name", column = "aname") })
	Test getByName(String name);

	@Select("SELECT * FROM a WHERE id = #{id}")
	@Results({
			@Result(property = "id", column = "id"),
			@Result(property = "name", column = "aname")})
	Test getById(String id);

	@Insert("INSERT INTO A(id,aname) VALUES(#{id}, #{name})")
	void insert(Test test);

	@Update("UPDATE A SET aname=#{name} WHERE id =#{id}")
	void update(Test test);
}
