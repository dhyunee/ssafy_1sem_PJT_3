package Service;

import Dto.UserDto;

public interface LoginService {

	public UserDto login(String userEmail, String userPassword);

}
