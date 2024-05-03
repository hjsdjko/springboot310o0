package com.entity.model;

import com.entity.YiqingchangshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 疫情常识
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public class YiqingchangshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 传染源
	 */
	
	private String chuanranyuan;
		
	/**
	 * 传播途径
	 */
	
	private String chuanbotujing;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 防疫与控制
	 */
	
	private String fangyiyukongzhi;
				
	
	/**
	 * 设置：传染源
	 */
	 
	public void setChuanranyuan(String chuanranyuan) {
		this.chuanranyuan = chuanranyuan;
	}
	
	/**
	 * 获取：传染源
	 */
	public String getChuanranyuan() {
		return chuanranyuan;
	}
				
	
	/**
	 * 设置：传播途径
	 */
	 
	public void setChuanbotujing(String chuanbotujing) {
		this.chuanbotujing = chuanbotujing;
	}
	
	/**
	 * 获取：传播途径
	 */
	public String getChuanbotujing() {
		return chuanbotujing;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：防疫与控制
	 */
	 
	public void setFangyiyukongzhi(String fangyiyukongzhi) {
		this.fangyiyukongzhi = fangyiyukongzhi;
	}
	
	/**
	 * 获取：防疫与控制
	 */
	public String getFangyiyukongzhi() {
		return fangyiyukongzhi;
	}
			
}
