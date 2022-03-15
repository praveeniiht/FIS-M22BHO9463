package jdbcspring;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
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
	
	public String deletePerson(int pid) {
		String sql ="delete from persons where pid=?";
		template.update(sql,pid);
		return "Record Deleted...";
	}
	
	public List<Persons> getAllPersons(){
		String sql="select * from persons";
		return template.query(sql, new PersonRowMapper());
	}
	
	public List<Users> getAllUsers(){
		return template.query("select * from users", new UserRowMapper());
	}
	
}
