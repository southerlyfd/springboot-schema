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


import com.dao.ErshoushujidingdanDao;
import com.entity.ErshoushujidingdanEntity;
import com.service.ErshoushujidingdanService;
import com.entity.vo.ErshoushujidingdanVO;
import com.entity.view.ErshoushujidingdanView;

@Service("ershoushujidingdanService")
public class ErshoushujidingdanServiceImpl extends ServiceImpl<ErshoushujidingdanDao, ErshoushujidingdanEntity> implements ErshoushujidingdanService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErshoushujidingdanEntity> page = this.selectPage(
                new Query<ErshoushujidingdanEntity>(params).getPage(),
                new EntityWrapper<ErshoushujidingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErshoushujidingdanEntity> wrapper) {
		  Page<ErshoushujidingdanView> page =new Query<ErshoushujidingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErshoushujidingdanVO> selectListVO(Wrapper<ErshoushujidingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErshoushujidingdanVO selectVO(Wrapper<ErshoushujidingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErshoushujidingdanView> selectListView(Wrapper<ErshoushujidingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErshoushujidingdanView selectView(Wrapper<ErshoushujidingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
