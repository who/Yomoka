package edu.pezzati.yo.user;

import edu.pezzati.yo.user.model.User;

public interface UserService {

	User create(User user);

	User update(User user);
}
