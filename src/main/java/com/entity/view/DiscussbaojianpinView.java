package com.entity.view;

import com.entity.DiscussbaojianpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 保健品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
@TableName("discussbaojianpin")
public class DiscussbaojianpinView  extends DiscussbaojianpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbaojianpinView(){
	}
 
 	public DiscussbaojianpinView(DiscussbaojianpinEntity discussbaojianpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussbaojianpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
