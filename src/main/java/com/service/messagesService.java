package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.messagesEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.messagesVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.messagesView;


/**
 * 留言板
 *
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public interface messagesService extends IService<messagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<messagesVO> selectListVO(Wrapper<messagesEntity> wrapper);
   	
   	messagesVO selectVO(@Param("ew") Wrapper<messagesEntity> wrapper);
   	
   	List<messagesView> selectListView(Wrapper<messagesEntity> wrapper);
   	
   	messagesView selectView(@Param("ew") Wrapper<messagesEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<messagesEntity> wrapper);
}

