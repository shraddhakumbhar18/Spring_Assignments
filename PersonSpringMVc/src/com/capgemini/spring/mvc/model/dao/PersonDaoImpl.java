package com.capgemini.spring.mvc.model.dao;

import java.util.List;

import com.capgemini.spring.mvc.model.entity.Person;
import com.capgemini.spring.mvc.model.service.PersonDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class PersonDaoImpl implements PersonDao 
{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public void addNew(Person person) 
	{
		template.update("INSERT INTO PERSON VALUES(?,?)",
				new Object[] {person.getPersonId(), person.setPersonName(personName)})
	}

		/* (non-Javadoc)
		 * @see com.capgemini.spring.mvc.model.service.PersonDao#getAll()
		 */
		@Override
		public List<Person> getAll() 
		{
			
			return null;	
		}

		/* (non-Javadoc)
		 * @see com.capgemini.spring.mvc.model.service.PersonDao#update(com.capgemini.spring.mvc.model.entity.Person)
		 */
		@Override
		public void update(Person person) 
		{
			

		}

		/* (non-Javadoc)
		 * @see com.capgemini.spring.mvc.model.service.PersonDao#delete(int)
		 */
		@Override
		public void delete(int personId) 
		{
			

		}

		/* (non-Javadoc)
		 * @see com.capgemini.spring.mvc.model.service.PersonDao#getPerson(int)
		 */
		@Override
		public Person getPerson(int personId) 
		{
			
			return null;
		}



}
