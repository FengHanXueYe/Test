package cn.kgc.tangcco.tcm073.xumaofeng.tbuser.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.kgc.tangcco.tcm073.xumaofeng.entity.TbUser;
import lombok.Delegate;

public interface TbUserMapper {
	TbUser login(TbUser user);

	@Insert(value = "insert into tbuser value(null,#{username},#{password},#{userroles},#{nickname})")
	int addUser(TbUser user);

	@Update(value = "update tbuser set username=#{username},password=#{password},userroles=#{userroles},nickname=#{nickname} where userid=#{userid}")
	int updateUser(TbUser user);

	@Delete(value = "delete from tbuser where userid=#{userid}")
	int deleteUser(Integer pk);

	List<TbUser> listTbUsers(TbUser user);

	@Select(value = "select * from tbuser where userid=#{userid}")
	TbUser detailUser(Integer pk);

}
