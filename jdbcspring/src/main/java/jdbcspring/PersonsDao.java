package jdbcspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonsDao {
	
	
	
	JdbcTemplate template;
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public String insertPerson(Persons person) {
		String sql ="insert into persons values(?,?,?,?)";
		template.update(sql,person.getName(),person.getCity(), person.getState(), person.getPid());
		return "record inserted";
	}

}
