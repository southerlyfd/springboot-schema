package com.dao;

import com.entity.ErshoushujidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ErshoushujidingdanVO;
import com.entity.view.ErshoushujidingdanView;


/**
 * 二手书籍订单
 * 
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface ErshoushujidingdanDao extends BaseMapper<ErshoushujidingdanEntity> {
	
	List<ErshoushujidingdanVO> selectListVO(@Param("ew") Wrapper<ErshoushujidingdanEntity> wrapper);
	
	ErshoushujidingdanVO selectVO(@Param("ew") Wrapper<ErshoushujidingdanEntity> wrapper);
	
	List<ErshoushujidingdanView> selectListView(@Param("ew") Wrapper<ErshoushujidingdanEntity> wrapper);

	List<ErshoushujidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ErshoushujidingdanEntity> wrapper);
	
	ErshoushujidingdanView selectView(@Param("ew") Wrapper<ErshoushujidingdanEntity> wrapper);
}
