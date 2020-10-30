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


import com.dao.ErshouyingyindingdanDao;
import com.entity.ErshouyingyindingdanEntity;
import com.service.ErshouyingyindingdanService;
import com.entity.vo.ErshouyingyindingdanVO;
import com.entity.view.ErshouyingyindingdanView;

@Service("ershouyingyindingdanService")
public class ErshouyingyindingdanServiceImpl extends ServiceImpl<ErshouyingyindingdanDao, ErshouyingyindingdanEntity> implements ErshouyingyindingdanService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErshouyingyindingdanEntity> page = this.selectPage(
                new Query<ErshouyingyindingdanEntity>(params).getPage(),
                new EntityWrapper<ErshouyingyindingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErshouyingyindingdanEntity> wrapper) {
		  Page<ErshouyingyindingdanView> page =new Query<ErshouyingyindingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErshouyingyindingdanVO> selectListVO(Wrapper<ErshouyingyindingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErshouyingyindingdanVO selectVO(Wrapper<ErshouyingyindingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErshouyingyindingdanView> selectListView(Wrapper<ErshouyingyindingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErshouyingyindingdanView selectView(Wrapper<ErshouyingyindingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
