package com.birprojedaha.app.data.jdbc.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.ActiveProfiles;

import com.birprojedaha.app.data.jdbc.model.Address;
import com.birprojedaha.app.data.jdbc.model.Role;
import com.birprojedaha.app.data.jdbc.model.SocialMediaAccount;
import com.birprojedaha.app.data.jdbc.model.User;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ActiveProfiles("test")
class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;

	@Test
	final void testFindByFirstName() {
		Address address = new Address();
		address.setCity("Antalya");
		User user = new User();
		user.setFirstName("Elvira");
		user.setLastName("Ozkan");
		user.setEmail("email@email.com");
		Set<String> roles = new HashSet<>();

		user.setAddress(address);
		user.addRole(new Role(1, "ROLE_ADMIN"));
		
		Set<SocialMediaAccount> smSet = new HashSet<>();
		
		// SELECT `t_socialmedia_account`.`account_id` AS `account_id`, `t_socialmedia_account`.`social_media_account_id` AS `social_media_account_id` FROM `t_socialmedia_account` WHERE `t_socialmedia_account`.`S_ID` = ?]

		SocialMediaAccount smAccount0 = new SocialMediaAccount();
		smAccount0.setAccountId("a1");
		smSet.add(smAccount0);
		
		SocialMediaAccount smAccount1 = new SocialMediaAccount();
		smAccount1.setId(16L);
		smAccount1.setAccountId("b1");
		smSet.add(smAccount1);
		
		user.setSocialMediaAccounts(smSet);
		
		User userResult = userRepository.save(user);
		
		Optional<User> user2 = userRepository.findById(userResult.getId());
		
	//	List<Role> roles2 =  userRepository.findAllUserRolesById(userResult.getId());
		
	//	List<User> users = userRepository.findByFirstName("Elvira");
		//Book savedBook = bookRepository.findById(book.getId()).orElseThrow(RuntimeException::new);

		assertThat(userResult).isNotNull();
	}

	@SpringBootApplication
	static class TestConfiguration {
	}

}
