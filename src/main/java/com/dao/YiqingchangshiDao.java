package com.dao;

import com.entity.YiqingchangshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqingchangshiVO;
import com.entity.view.YiqingchangshiView;


/**
 * 疫情常识
 * 
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public interface YiqingchangshiDao extends BaseMapper<YiqingchangshiEntity> {
	
	List<YiqingchangshiVO> selectListVO(@Param("ew") Wrapper<YiqingchangshiEntity> wrapper);
	
	YiqingchangshiVO selectVO(@Param("ew") Wrapper<YiqingchangshiEntity> wrapper);
	
	List<YiqingchangshiView> selectListView(@Param("ew") Wrapper<YiqingchangshiEntity> wrapper);

	List<YiqingchangshiView> selectListView(Pagination page,@Param("ew") Wrapper<YiqingchangshiEntity> wrapper);
	
	YiqingchangshiView selectView(@Param("ew") Wrapper<YiqingchangshiEntity> wrapper);
	

}
