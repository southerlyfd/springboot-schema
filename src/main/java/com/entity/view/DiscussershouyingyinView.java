package com.entity.view;

import com.entity.DiscussershouyingyinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 二手影音评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
@TableName("discussershouyingyin")
public class DiscussershouyingyinView  extends DiscussershouyingyinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussershouyingyinView(){
	}
 
 	public DiscussershouyingyinView(DiscussershouyingyinEntity discussershouyingyinEntity){
 	try {
			BeanUtils.copyProperties(this, discussershouyingyinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
