package com.dao;

import com.entity.BaojianpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaojianpinVO;
import com.entity.view.BaojianpinView;


/**
 * 保健品
 * 
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public interface BaojianpinDao extends BaseMapper<BaojianpinEntity> {
	
	List<BaojianpinVO> selectListVO(@Param("ew") Wrapper<BaojianpinEntity> wrapper);
	
	BaojianpinVO selectVO(@Param("ew") Wrapper<BaojianpinEntity> wrapper);
	
	List<BaojianpinView> selectListView(@Param("ew") Wrapper<BaojianpinEntity> wrapper);

	List<BaojianpinView> selectListView(Pagination page,@Param("ew") Wrapper<BaojianpinEntity> wrapper);
	
	BaojianpinView selectView(@Param("ew") Wrapper<BaojianpinEntity> wrapper);
	

}
