package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussershouyingyinEntity;
import com.entity.view.DiscussershouyingyinView;

import com.service.DiscussershouyingyinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 二手影音评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
@RestController
@RequestMapping("/discussershouyingyin")
public class DiscussershouyingyinController {
    @Autowired
    private DiscussershouyingyinService discussershouyingyinService;
    

    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussershouyingyinEntity discussershouyingyin, HttpServletRequest request){
        EntityWrapper<DiscussershouyingyinEntity> ew = new EntityWrapper<DiscussershouyingyinEntity>();
		PageUtils page = discussershouyingyinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussershouyingyin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussershouyingyinEntity discussershouyingyin, HttpServletRequest request){
        EntityWrapper<DiscussershouyingyinEntity> ew = new EntityWrapper<DiscussershouyingyinEntity>();
		PageUtils page = discussershouyingyinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussershouyingyin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussershouyingyinEntity discussershouyingyin){
       	EntityWrapper<DiscussershouyingyinEntity> ew = new EntityWrapper<DiscussershouyingyinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussershouyingyin, "discussershouyingyin")); 
        return R.ok().put("data", discussershouyingyinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussershouyingyinEntity discussershouyingyin){
        EntityWrapper< DiscussershouyingyinEntity> ew = new EntityWrapper< DiscussershouyingyinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussershouyingyin, "discussershouyingyin")); 
		DiscussershouyingyinView discussershouyingyinView =  discussershouyingyinService.selectView(ew);
		return R.ok("查询二手影音评论表成功").put("data", discussershouyingyinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussershouyingyinEntity discussershouyingyin = discussershouyingyinService.selectById(id);
        return R.ok().put("data", discussershouyingyin);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussershouyingyinEntity discussershouyingyin = discussershouyingyinService.selectById(id);
        return R.ok().put("data", discussershouyingyin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussershouyingyinEntity discussershouyingyin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussershouyingyin);
        discussershouyingyinService.insert(discussershouyingyin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussershouyingyinEntity discussershouyingyin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussershouyingyin);
        discussershouyingyinService.insert(discussershouyingyin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussershouyingyinEntity discussershouyingyin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussershouyingyin);
        discussershouyingyinService.updateById(discussershouyingyin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussershouyingyinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussershouyingyinEntity> wrapper = new EntityWrapper<DiscussershouyingyinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussershouyingyinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}

}
