package DemoBanHang.Service.AdminImpl;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.DAO.UserDao;
import DemoBanHang.Entity.User;
import DemoBanHang.Service.Admin.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserDao userDao;

	@Override
	public int AddUser(User user) {
		user.setPass(BCrypt.hashpw(user.getPass(), BCrypt.gensalt(12)));
		return userDao.AddUser(user);
	}

	@Override
	public User CheckAccount(User user) {
		
		String pas = user.getPass();
		user = userDao.GetUserByAcc(user);
		if (user != null) {
			if(BCrypt.checkpw(pas, user.getPass())) {
				return user;
			}else {
				return null;
			}

		}
		return null;
	}

	@Override
	public void Update(User user) {
		userDao.Update(user);
		
	}

	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}

}
