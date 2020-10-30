package com.dao;

import com.entity.ErshouyingyindingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ErshouyingyindingdanVO;
import com.entity.view.ErshouyingyindingdanView;


/**
 * 二手影音订单
 * 
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface ErshouyingyindingdanDao extends BaseMapper<ErshouyingyindingdanEntity> {
	
	List<ErshouyingyindingdanVO> selectListVO(@Param("ew") Wrapper<ErshouyingyindingdanEntity> wrapper);
	
	ErshouyingyindingdanVO selectVO(@Param("ew") Wrapper<ErshouyingyindingdanEntity> wrapper);
	
	List<ErshouyingyindingdanView> selectListView(@Param("ew") Wrapper<ErshouyingyindingdanEntity> wrapper);

	List<ErshouyingyindingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ErshouyingyindingdanEntity> wrapper);
	
	ErshouyingyindingdanView selectView(@Param("ew") Wrapper<ErshouyingyindingdanEntity> wrapper);
}
