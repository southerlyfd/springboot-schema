package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingyinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingyinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingyinfenleiView;


/**
 * 影音分类
 *
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface YingyinfenleiService extends IService<YingyinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyinfenleiVO> selectListVO(Wrapper<YingyinfenleiEntity> wrapper);
   	
   	YingyinfenleiVO selectVO(@Param("ew") Wrapper<YingyinfenleiEntity> wrapper);
   	
   	List<YingyinfenleiView> selectListView(Wrapper<YingyinfenleiEntity> wrapper);
   	
   	YingyinfenleiView selectView(@Param("ew") Wrapper<YingyinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyinfenleiEntity> wrapper);
}

