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

import com.entity.ErshouyingyindingdanEntity;
import com.entity.view.ErshouyingyindingdanView;

import com.service.ErshouyingyindingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 二手影音订单
 * 后端接口
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
@RestController
@RequestMapping("/ershouyingyindingdan")
public class ErshouyingyindingdanController {
    @Autowired
    private ErshouyingyindingdanService ershouyingyindingdanService;
    

    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ErshouyingyindingdanEntity ershouyingyindingdan, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("maijia")) {
			ershouyingyindingdan.setMaijiahao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			ershouyingyindingdan.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ErshouyingyindingdanEntity> ew = new EntityWrapper<ErshouyingyindingdanEntity>();
		PageUtils page = ershouyingyindingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ershouyingyindingdan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ErshouyingyindingdanEntity ershouyingyindingdan, HttpServletRequest request){
        EntityWrapper<ErshouyingyindingdanEntity> ew = new EntityWrapper<ErshouyingyindingdanEntity>();
		PageUtils page = ershouyingyindingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ershouyingyindingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ErshouyingyindingdanEntity ershouyingyindingdan){
       	EntityWrapper<ErshouyingyindingdanEntity> ew = new EntityWrapper<ErshouyingyindingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ershouyingyindingdan, "ershouyingyindingdan")); 
        return R.ok().put("data", ershouyingyindingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ErshouyingyindingdanEntity ershouyingyindingdan){
        EntityWrapper< ErshouyingyindingdanEntity> ew = new EntityWrapper< ErshouyingyindingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ershouyingyindingdan, "ershouyingyindingdan")); 
		ErshouyingyindingdanView ershouyingyindingdanView =  ershouyingyindingdanService.selectView(ew);
		return R.ok("查询二手影音订单成功").put("data", ershouyingyindingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ErshouyingyindingdanEntity ershouyingyindingdan = ershouyingyindingdanService.selectById(id);
        return R.ok().put("data", ershouyingyindingdan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        ErshouyingyindingdanEntity ershouyingyindingdan = ershouyingyindingdanService.selectById(id);
        return R.ok().put("data", ershouyingyindingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ErshouyingyindingdanEntity ershouyingyindingdan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ershouyingyindingdan);
        ershouyingyindingdanService.insert(ershouyingyindingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ErshouyingyindingdanEntity ershouyingyindingdan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ershouyingyindingdan);
        ershouyingyindingdanService.insert(ershouyingyindingdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ErshouyingyindingdanEntity ershouyingyindingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ershouyingyindingdan);
        ershouyingyindingdanService.updateById(ershouyingyindingdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ershouyingyindingdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ErshouyingyindingdanEntity> wrapper = new EntityWrapper<ErshouyingyindingdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("maijia")) {
			wrapper.eq("maijiahao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = ershouyingyindingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}

}
