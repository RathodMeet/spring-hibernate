package com.mvc.controller;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserDaoImpl  implements UserDao{
		
		@Autowired
		SessionFactory sessionFactory;
		JdbcTemplate jdbcTemplate;
		
		@Autowired
		private UserRepository userRepository;
		
		public UserDaoImpl() {
		
		}
	
		public UserDaoImpl(SessionFactory sessionFactory, DataSource dataSource) {
			this.sessionFactory = sessionFactory;
			this.jdbcTemplate = new JdbcTemplate(dataSource);
		}

		@Override
		@Transactional
		public long save(User user) {
			long userId =  (long) sessionFactory.getCurrentSession().save(user);
			System.out.println("id::::::::::::::::::::::::::::::::"+userId);
			return userId;
		}

		@Override
		@Transactional
		public User getUserById(long id) {
			return userRepository.findById(id);
		}
}
