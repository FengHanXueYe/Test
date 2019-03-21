package cn.kgc.tangcco.tcm073.xumaofeng.tbuser.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.TbUser;
import cn.kgc.tangcco.tcm073.xumaofeng.tbuser.mapper.TbUserMapper;
@Service
public class TbUserServiceImpl implements TbUserService {
	
	@Resource
	private TbUserMapper t;
	
	@Override
	public TbUser login(TbUser user) {
		return t.login(user);
	}

	@Override
	public int addUser(TbUser user) {
		return t.addUser(user);
	}

	@Override
	public int updateUser(TbUser user) {
		return t.updateUser(user);
	}

	@Override
	public int deleteUser(Integer pk) {
		return t.deleteUser(pk);
	}

	@Override
	public List<TbUser> listTbUsers(TbUser user) {
		return t.listTbUsers(user);
	}

	@Override
	public TbUser detailUser(Integer pk) {
		return t.detailUser(pk);
	}

}
