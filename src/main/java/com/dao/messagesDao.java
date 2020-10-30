package com.dao;

import com.entity.messagesEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.messagesVO;
import com.entity.view.messagesView;


/**
 * 留言板
 * 
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface messagesDao extends BaseMapper<messagesEntity> {
	
	List<messagesVO> selectListVO(@Param("ew") Wrapper<messagesEntity> wrapper);
	
	messagesVO selectVO(@Param("ew") Wrapper<messagesEntity> wrapper);
	
	List<messagesView> selectListView(@Param("ew") Wrapper<messagesEntity> wrapper);

	List<messagesView> selectListView(Pagination page,@Param("ew") Wrapper<messagesEntity> wrapper);
	
	messagesView selectView(@Param("ew") Wrapper<messagesEntity> wrapper);
}
