package com.dao;

import com.entity.ErshouyingyinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ErshouyingyinVO;
import com.entity.view.ErshouyingyinView;


/**
 * 二手影音
 * 
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface ErshouyingyinDao extends BaseMapper<ErshouyingyinEntity> {
	
	List<ErshouyingyinVO> selectListVO(@Param("ew") Wrapper<ErshouyingyinEntity> wrapper);
	
	ErshouyingyinVO selectVO(@Param("ew") Wrapper<ErshouyingyinEntity> wrapper);
	
	List<ErshouyingyinView> selectListView(@Param("ew") Wrapper<ErshouyingyinEntity> wrapper);

	List<ErshouyingyinView> selectListView(Pagination page,@Param("ew") Wrapper<ErshouyingyinEntity> wrapper);
	
	ErshouyingyinView selectView(@Param("ew") Wrapper<ErshouyingyinEntity> wrapper);
}
