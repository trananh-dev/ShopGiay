package DemoBanHang.Service.Admin;

import org.springframework.stereotype.Service;

import DemoBanHang.Entity.Admin;

@Service
public interface IAdminService {
	public Admin CheckAccount(Admin ad);

}
