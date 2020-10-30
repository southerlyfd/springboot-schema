package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 二手影音订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
@TableName("ershouyingyindingdan")
public class ErshouyingyindingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ErshouyingyindingdanEntity() {
		
	}
	
	public ErshouyingyindingdanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 卖家号
	 */
					
	private String maijiahao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：卖家号
	 */
	public void setMaijiahao(String maijiahao) {
		this.maijiahao = maijiahao;
	}
	/**
	 * 获取：卖家号
	 */
	public String getMaijiahao() {
		return maijiahao;
	}
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
