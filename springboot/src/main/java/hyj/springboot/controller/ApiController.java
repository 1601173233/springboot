package hyj.springboot.controller;

import hyj.springboot.mapper.TestMapper;
import hyj.springboot.model.Test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {
	@Autowired
	private TestMapper testMapper;
	
    @RequestMapping("/getAll")
    @ResponseBody
    public Map<String, Object> getAll() throws Exception {
    	Map<String, Object> result = new HashMap<String, Object>();
    	result.put("result", testMapper.getAll());
    	return result;
    }
	
    @RequestMapping("/getById")
    @ResponseBody
    public Map<String, Object> getById(String id) throws Exception {
    	Map<String, Object> result = new HashMap<String, Object>();
    	result.put("result", testMapper.getById(id));
    	return result;
    }
	
    @RequestMapping("/update")
    @ResponseBody
    public Map<String, Object> update(Test test) throws Exception {
    	Map<String, Object> result = new HashMap<String, Object>();
    	testMapper.update(test);
    	return result;
    }
}