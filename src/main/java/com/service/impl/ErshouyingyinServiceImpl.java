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


import com.dao.ErshouyingyinDao;
import com.entity.ErshouyingyinEntity;
import com.service.ErshouyingyinService;
import com.entity.vo.ErshouyingyinVO;
import com.entity.view.ErshouyingyinView;

@Service("ershouyingyinService")
public class ErshouyingyinServiceImpl extends ServiceImpl<ErshouyingyinDao, ErshouyingyinEntity> implements ErshouyingyinService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErshouyingyinEntity> page = this.selectPage(
                new Query<ErshouyingyinEntity>(params).getPage(),
                new EntityWrapper<ErshouyingyinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErshouyingyinEntity> wrapper) {
		  Page<ErshouyingyinView> page =new Query<ErshouyingyinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErshouyingyinVO> selectListVO(Wrapper<ErshouyingyinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErshouyingyinVO selectVO(Wrapper<ErshouyingyinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErshouyingyinView> selectListView(Wrapper<ErshouyingyinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErshouyingyinView selectView(Wrapper<ErshouyingyinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
