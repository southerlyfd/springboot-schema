package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.messagesDao;
import com.entity.messagesEntity;
import com.service.messagesService;
import com.entity.vo.messagesVO;
import com.entity.view.messagesView;

@Service("messagesService")
public class messagesServiceImpl extends ServiceImpl<messagesDao, messagesEntity> implements messagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<messagesEntity> page = this.selectPage(
                new Query<messagesEntity>(params).getPage(),
                new EntityWrapper<messagesEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<messagesEntity> wrapper) {
		  Page<messagesView> page =new Query<messagesView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<messagesVO> selectListVO(Wrapper<messagesEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public messagesVO selectVO(Wrapper<messagesEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<messagesView> selectListView(Wrapper<messagesEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public messagesView selectView(Wrapper<messagesEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
