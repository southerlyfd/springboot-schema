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


import com.dao.YingyinfenleiDao;
import com.entity.YingyinfenleiEntity;
import com.service.YingyinfenleiService;
import com.entity.vo.YingyinfenleiVO;
import com.entity.view.YingyinfenleiView;

@Service("yingyinfenleiService")
public class YingyinfenleiServiceImpl extends ServiceImpl<YingyinfenleiDao, YingyinfenleiEntity> implements YingyinfenleiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyinfenleiEntity> page = this.selectPage(
                new Query<YingyinfenleiEntity>(params).getPage(),
                new EntityWrapper<YingyinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyinfenleiEntity> wrapper) {
		  Page<YingyinfenleiView> page =new Query<YingyinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingyinfenleiVO> selectListVO(Wrapper<YingyinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingyinfenleiVO selectVO(Wrapper<YingyinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingyinfenleiView> selectListView(Wrapper<YingyinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyinfenleiView selectView(Wrapper<YingyinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
