package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqingchangshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqingchangshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingchangshiView;


/**
 * 疫情常识
 *
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public interface YiqingchangshiService extends IService<YiqingchangshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqingchangshiVO> selectListVO(Wrapper<YiqingchangshiEntity> wrapper);
   	
   	YiqingchangshiVO selectVO(@Param("ew") Wrapper<YiqingchangshiEntity> wrapper);
   	
   	List<YiqingchangshiView> selectListView(Wrapper<YiqingchangshiEntity> wrapper);
   	
   	YiqingchangshiView selectView(@Param("ew") Wrapper<YiqingchangshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqingchangshiEntity> wrapper);
   	

}

