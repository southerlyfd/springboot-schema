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


import com.dao.DiscussershouyingyinDao;
import com.entity.DiscussershouyingyinEntity;
import com.service.DiscussershouyingyinService;
import com.entity.vo.DiscussershouyingyinVO;
import com.entity.view.DiscussershouyingyinView;

@Service("discussershouyingyinService")
public class DiscussershouyingyinServiceImpl extends ServiceImpl<DiscussershouyingyinDao, DiscussershouyingyinEntity> implements DiscussershouyingyinService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussershouyingyinEntity> page = this.selectPage(
                new Query<DiscussershouyingyinEntity>(params).getPage(),
                new EntityWrapper<DiscussershouyingyinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussershouyingyinEntity> wrapper) {
		  Page<DiscussershouyingyinView> page =new Query<DiscussershouyingyinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussershouyingyinVO> selectListVO(Wrapper<DiscussershouyingyinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussershouyingyinVO selectVO(Wrapper<DiscussershouyingyinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussershouyingyinView> selectListView(Wrapper<DiscussershouyingyinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussershouyingyinView selectView(Wrapper<DiscussershouyingyinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
