package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussershouyingyinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussershouyingyinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussershouyingyinView;


/**
 * 二手影音评论表
 *
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface DiscussershouyingyinService extends IService<DiscussershouyingyinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussershouyingyinVO> selectListVO(Wrapper<DiscussershouyingyinEntity> wrapper);
   	
   	DiscussershouyingyinVO selectVO(@Param("ew") Wrapper<DiscussershouyingyinEntity> wrapper);
   	
   	List<DiscussershouyingyinView> selectListView(Wrapper<DiscussershouyingyinEntity> wrapper);
   	
   	DiscussershouyingyinView selectView(@Param("ew") Wrapper<DiscussershouyingyinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussershouyingyinEntity> wrapper);
}

