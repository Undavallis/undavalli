package cam.raj.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.raj.news.controller.News;


@Repository
public class FlickrDao implements Dao {

	public JdbcTemplate jdbcTemplate;
      
	@Override
	public List<String> getAllImages() {
		// TODO Auto-generated method stub
		
		return jdbcTemplate.query("select * from news", new BeanPropertyRowMapper<News>());
	}
	
	
}
