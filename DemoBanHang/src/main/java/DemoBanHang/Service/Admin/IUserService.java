package DemoBanHang.Service.Admin;

import org.springframework.stereotype.Service;

import DemoBanHang.Entity.User;
@Service
public interface IUserService {
	public int AddUser(User user);
	public User CheckAccount(User user);
	public void Update(User user);
	public User findById(int id);

}
