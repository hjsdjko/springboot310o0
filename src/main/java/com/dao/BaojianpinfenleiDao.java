package com.dao;

import com.entity.BaojianpinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaojianpinfenleiVO;
import com.entity.view.BaojianpinfenleiView;


/**
 * 保健品分类
 * 
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public interface BaojianpinfenleiDao extends BaseMapper<BaojianpinfenleiEntity> {
	
	List<BaojianpinfenleiVO> selectListVO(@Param("ew") Wrapper<BaojianpinfenleiEntity> wrapper);
	
	BaojianpinfenleiVO selectVO(@Param("ew") Wrapper<BaojianpinfenleiEntity> wrapper);
	
	List<BaojianpinfenleiView> selectListView(@Param("ew") Wrapper<BaojianpinfenleiEntity> wrapper);

	List<BaojianpinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<BaojianpinfenleiEntity> wrapper);
	
	BaojianpinfenleiView selectView(@Param("ew") Wrapper<BaojianpinfenleiEntity> wrapper);
	

}
