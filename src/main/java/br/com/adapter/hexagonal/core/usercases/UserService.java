package br.com.adapter.hexagonal.core.usercases;

import java.util.List;

import br.com.adapter.hexagonal.core.model.User;
import br.com.adapter.hexagonal.core.ports.UserRepository;

public class UserService {
	private UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public void saveUser(User user) {
		boolean alreadyUsedEmail = userRepo.getAll().stream()
				.anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(user.getEmail()));
		if (alreadyUsedEmail)
			throw new RuntimeException("Email addres already exists!");
		userRepo.save(user);
	}

	public List<User> getUsers() {
		return userRepo.getAll();
	}
}
