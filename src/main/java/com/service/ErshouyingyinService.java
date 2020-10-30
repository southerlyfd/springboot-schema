package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErshouyingyinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErshouyingyinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErshouyingyinView;


/**
 * 二手影音
 *
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface ErshouyingyinService extends IService<ErshouyingyinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErshouyingyinVO> selectListVO(Wrapper<ErshouyingyinEntity> wrapper);
   	
   	ErshouyingyinVO selectVO(@Param("ew") Wrapper<ErshouyingyinEntity> wrapper);
   	
   	List<ErshouyingyinView> selectListView(Wrapper<ErshouyingyinEntity> wrapper);
   	
   	ErshouyingyinView selectView(@Param("ew") Wrapper<ErshouyingyinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErshouyingyinEntity> wrapper);
}

