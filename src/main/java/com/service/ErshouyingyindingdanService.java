package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErshouyingyindingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErshouyingyindingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErshouyingyindingdanView;


/**
 * 二手影音订单
 *
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface ErshouyingyindingdanService extends IService<ErshouyingyindingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErshouyingyindingdanVO> selectListVO(Wrapper<ErshouyingyindingdanEntity> wrapper);
   	
   	ErshouyingyindingdanVO selectVO(@Param("ew") Wrapper<ErshouyingyindingdanEntity> wrapper);
   	
   	List<ErshouyingyindingdanView> selectListView(Wrapper<ErshouyingyindingdanEntity> wrapper);
   	
   	ErshouyingyindingdanView selectView(@Param("ew") Wrapper<ErshouyingyindingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErshouyingyindingdanEntity> wrapper);
}

