package com.dao;

import com.entity.DiscussershoushujiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussershoushujiVO;
import com.entity.view.DiscussershoushujiView;


/**
 * 二手书籍评论表
 * 
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface DiscussershoushujiDao extends BaseMapper<DiscussershoushujiEntity> {
	
	List<DiscussershoushujiVO> selectListVO(@Param("ew") Wrapper<DiscussershoushujiEntity> wrapper);
	
	DiscussershoushujiVO selectVO(@Param("ew") Wrapper<DiscussershoushujiEntity> wrapper);
	
	List<DiscussershoushujiView> selectListView(@Param("ew") Wrapper<DiscussershoushujiEntity> wrapper);

	List<DiscussershoushujiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussershoushujiEntity> wrapper);
	
	DiscussershoushujiView selectView(@Param("ew") Wrapper<DiscussershoushujiEntity> wrapper);
}