package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YiqingchangshiDao;
import com.entity.YiqingchangshiEntity;
import com.service.YiqingchangshiService;
import com.entity.vo.YiqingchangshiVO;
import com.entity.view.YiqingchangshiView;

@Service("yiqingchangshiService")
public class YiqingchangshiServiceImpl extends ServiceImpl<YiqingchangshiDao, YiqingchangshiEntity> implements YiqingchangshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqingchangshiEntity> page = this.selectPage(
                new Query<YiqingchangshiEntity>(params).getPage(),
                new EntityWrapper<YiqingchangshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqingchangshiEntity> wrapper) {
		  Page<YiqingchangshiView> page =new Query<YiqingchangshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqingchangshiVO> selectListVO(Wrapper<YiqingchangshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqingchangshiVO selectVO(Wrapper<YiqingchangshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqingchangshiView> selectListView(Wrapper<YiqingchangshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqingchangshiView selectView(Wrapper<YiqingchangshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
