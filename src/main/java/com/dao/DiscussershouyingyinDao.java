package com.dao;

import com.entity.DiscussershouyingyinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussershouyingyinVO;
import com.entity.view.DiscussershouyingyinView;


/**
 * 二手影音评论表
 * 
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface DiscussershouyingyinDao extends BaseMapper<DiscussershouyingyinEntity> {
	
	List<DiscussershouyingyinVO> selectListVO(@Param("ew") Wrapper<DiscussershouyingyinEntity> wrapper);
	
	DiscussershouyingyinVO selectVO(@Param("ew") Wrapper<DiscussershouyingyinEntity> wrapper);
	
	List<DiscussershouyingyinView> selectListView(@Param("ew") Wrapper<DiscussershouyingyinEntity> wrapper);

	List<DiscussershouyingyinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussershouyingyinEntity> wrapper);
	
	DiscussershouyingyinView selectView(@Param("ew") Wrapper<DiscussershouyingyinEntity> wrapper);
}
