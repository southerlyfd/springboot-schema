package com.dao;

import com.entity.YingyinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingyinfenleiVO;
import com.entity.view.YingyinfenleiView;


/**
 * 影音分类
 * 
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface YingyinfenleiDao extends BaseMapper<YingyinfenleiEntity> {
	
	List<YingyinfenleiVO> selectListVO(@Param("ew") Wrapper<YingyinfenleiEntity> wrapper);
	
	YingyinfenleiVO selectVO(@Param("ew") Wrapper<YingyinfenleiEntity> wrapper);
	
	List<YingyinfenleiView> selectListView(@Param("ew") Wrapper<YingyinfenleiEntity> wrapper);

	List<YingyinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YingyinfenleiEntity> wrapper);
	
	YingyinfenleiView selectView(@Param("ew") Wrapper<YingyinfenleiEntity> wrapper);
}
