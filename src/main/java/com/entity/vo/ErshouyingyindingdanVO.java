package com.entity.vo;

import com.entity.ErshouyingyindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 二手影音订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public class ErshouyingyindingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 影音名称
	 */
	
	private String yingyinmingcheng;
		
	/**
	 * 影音类别
	 */
	
	private String yingyinleibie;
		
	/**
	 * 二手价格
	 */
	
	private String ershoujiage;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 收货地址
	 */
	
	private String shouhuodizhi;
		
	/**
	 * 收货人
	 */
	
	private String shouhuoren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 订单备注
	 */
	
	private String dingdanbeizhu;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：影音名称
	 */
	 
	public void setYingyinmingcheng(String yingyinmingcheng) {
		this.yingyinmingcheng = yingyinmingcheng;
	}
	
	/**
	 * 获取：影音名称
	 */
	public String getYingyinmingcheng() {
		return yingyinmingcheng;
	}
				
	
	/**
	 * 设置：影音类别
	 */
	 
	public void setYingyinleibie(String yingyinleibie) {
		this.yingyinleibie = yingyinleibie;
	}
	
	/**
	 * 获取：影音类别
	 */
	public String getYingyinleibie() {
		return yingyinleibie;
	}
				
	
	/**
	 * 设置：二手价格
	 */
	 
	public void setErshoujiage(String ershoujiage) {
		this.ershoujiage = ershoujiage;
	}
	
	/**
	 * 获取：二手价格
	 */
	public String getErshoujiage() {
		return ershoujiage;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：收货地址
	 */
	 
	public void setShouhuodizhi(String shouhuodizhi) {
		this.shouhuodizhi = shouhuodizhi;
	}
	
	/**
	 * 获取：收货地址
	 */
	public String getShouhuodizhi() {
		return shouhuodizhi;
	}
				
	
	/**
	 * 设置：收货人
	 */
	 
	public void setShouhuoren(String shouhuoren) {
		this.shouhuoren = shouhuoren;
	}
	
	/**
	 * 获取：收货人
	 */
	public String getShouhuoren() {
		return shouhuoren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：订单备注
	 */
	 
	public void setDingdanbeizhu(String dingdanbeizhu) {
		this.dingdanbeizhu = dingdanbeizhu;
	}
	
	/**
	 * 获取：订单备注
	 */
	public String getDingdanbeizhu() {
		return dingdanbeizhu;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
