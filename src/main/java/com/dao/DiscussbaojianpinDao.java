package com.dao;

import com.entity.DiscussbaojianpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbaojianpinVO;
import com.entity.view.DiscussbaojianpinView;


/**
 * 保健品评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public interface DiscussbaojianpinDao extends BaseMapper<DiscussbaojianpinEntity> {
	
	List<DiscussbaojianpinVO> selectListVO(@Param("ew") Wrapper<DiscussbaojianpinEntity> wrapper);
	
	DiscussbaojianpinVO selectVO(@Param("ew") Wrapper<DiscussbaojianpinEntity> wrapper);
	
	List<DiscussbaojianpinView> selectListView(@Param("ew") Wrapper<DiscussbaojianpinEntity> wrapper);

	List<DiscussbaojianpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbaojianpinEntity> wrapper);
	
	DiscussbaojianpinView selectView(@Param("ew") Wrapper<DiscussbaojianpinEntity> wrapper);
	

}
