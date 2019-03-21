package cn.kgc.tangcco.tcm073.xumaofeng.tbuser.service;

import java.util.List;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.TbUser;

public interface TbUserService {
	TbUser login(TbUser user);

	int addUser(TbUser user);

	int updateUser(TbUser user);

	int deleteUser(Integer pk);

	List<TbUser> listTbUsers(TbUser user);

	TbUser detailUser(Integer pk);
}
