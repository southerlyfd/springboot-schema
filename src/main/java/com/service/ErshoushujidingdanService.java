package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErshoushujidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErshoushujidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErshoushujidingdanView;


/**
 * 二手书籍订单
 *
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface ErshoushujidingdanService extends IService<ErshoushujidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErshoushujidingdanVO> selectListVO(Wrapper<ErshoushujidingdanEntity> wrapper);
   	
   	ErshoushujidingdanVO selectVO(@Param("ew") Wrapper<ErshoushujidingdanEntity> wrapper);
   	
   	List<ErshoushujidingdanView> selectListView(Wrapper<ErshoushujidingdanEntity> wrapper);
   	
   	ErshoushujidingdanView selectView(@Param("ew") Wrapper<ErshoushujidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErshoushujidingdanEntity> wrapper);
}

